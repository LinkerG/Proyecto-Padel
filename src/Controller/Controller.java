package Controller;

import View.AdminMenu;
import View.LoginMenu;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import javax.swing.JOptionPane;

public class Controller {
    public static LoginMenu loginMenu = new LoginMenu();
    public static AdminMenu adminMenu = new AdminMenu();
    private static Statement statement = connectToDatabase();

    public static void startApp(){
        loginMenu.setTitle("Log in");
        loginMenu.setVisible(true);
    }
    public static Statement connectToDatabase(){
        Connection connection;
        Statement estado = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://localhost/padel";
        String user = "root";
        String passw = "";

        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(connectionUrl, user, passw);
            if(connection != null){
                estado = connection.createStatement();
            }
        } catch (SQLException | ClassNotFoundException e ) {
            System.out.println("Error " + e.getMessage());
        }
        return estado;
    }
    public static void checkUser(String email, char[] password){
        String stringPassw = String.valueOf(password);
        String consultaSQL = "SELECT * FROM user WHERE email = ? AND password = ?";
        try {
            // Obtener una instancia del objeto MessageDigest con el algoritmo MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Calcular el hash de la cadena de texto
            md.update(stringPassw.getBytes());
            byte[] digest = md.digest();

            // Convertir el hash en una representación hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : digest) {
                hexString.append(String.format("%02x", b));
            }

            try(PreparedStatement prepareQuery = statement.getConnection().prepareStatement(consultaSQL)){
                prepareQuery.setString(1, email);
                prepareQuery.setString(2, hexString.toString());
                ResultSet queryResult = prepareQuery.executeQuery();
                boolean exists = false;
                while(queryResult.next()){
                    exists = true;
                    if(queryResult.getInt("isActive") == 1 && queryResult.getInt("isAdmin") == 1){
                        adminMenu.setTitle("Admin menu");
                        adminMenu.setVisible(true);
                        loginMenu.setVisible(false);
                    } else if(queryResult.getInt("isActive") == 1 && queryResult.getInt("isAdmin") == 0) {
                        System.out.println("Normal user");
                    } else if(queryResult.getInt("isActive") == 1 && queryResult.getInt("isAdmin") == 0) {
                        mostrarError("The user you tried to log in is currently inactive");
                    }
                }
                if(!exists) {
                    mostrarError("Email or password incorrect");
                }
            } catch(SQLException ex){
                ex.printStackTrace();
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
    
    public static void printCourts(boolean available, javax.swing.JPanel parent) {
        String consultaSQL = "SELECT * FROM court WHERE isAvailable = ?";
        String isAvailable = available ? "1" : "0";
        try(PreparedStatement prepareQuery = statement.getConnection().prepareStatement(consultaSQL)){
            prepareQuery.setString(1, isAvailable);
            ResultSet queryResult = prepareQuery.executeQuery();
            while(queryResult.next()){
                javax.swing.JButton boton = new javax.swing.JButton(queryResult.getString("name"));
                
                boton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        abrirPista(evt);
                    }
                });
                parent.add(boton);
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void mostrarError(String error) {
        JOptionPane.showMessageDialog(null, error);
    }
    
    private static void abrirPista(java.awt.event.ActionEvent evt) {                                             
        System.out.println("Hola");
    } 
}
