package Controller;

import View.AdminSelect;
import View.LoginMenu;
import View.LoginError;
import Model.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Controller {
    private static Statement statement = connectToDatabase();
    public static LoginMenu loginMenu = new LoginMenu();
    public static AdminSelect adminMenu = new AdminSelect();
    public static LoginError loginError = new LoginError();

    public static void startApp(){
        if(checkStatement()) {
            loginMenu.setTitle("Log in");
            loginMenu.setVisible(true);
        } else {
            loginError.setTitle("Connection Error");
            loginError.setVisible(true);
        }
    }
    
    public static boolean checkStatement() {
        if(statement == null) {
            return false;
        }
        return true;
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
                System.out.print("ErrorMySQL");
                ex.printStackTrace();
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            System.out.print("ErrorFatal");
        }
    }
    
    public static ArrayList getCourts(boolean available) {
        String consultaSQL = "SELECT * FROM court WHERE isAvailable = ?";
        int isAvailable = available ? 1 : 0;
        ArrayList<Court> courtList = new ArrayList<>();
        try(PreparedStatement prepareQuery = statement.getConnection().prepareStatement(consultaSQL)){
            prepareQuery.setInt(1, isAvailable);
            ResultSet queryResult = prepareQuery.executeQuery();
            while(queryResult.next()){ 
                int id = queryResult.getInt("courtId");
                String name = queryResult.getString("name");
                boolean isActive = queryResult.getInt("isAvailable") == 1 ? true : false;
                Court newCourt = new Court(id, name, isActive);
                courtList.add(newCourt);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            return courtList;
        }
    }
    
    public static void mostrarError(String error) {
        JOptionPane.showMessageDialog(null, error);
    }
    
    private static void abrirPista() {                                             
        System.out.println("Hola");
    } 
}
