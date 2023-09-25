package Controlador;

import Modelo.*;
import Vista.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;

public class Controller {
    public static LoginMenu loginMenu = new LoginMenu();
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
    public static void checkUser(String username, char[] password){
        String stringPassw = String.valueOf(password);
        System.out.println(password);
        String consultaSQL = "SELECT * FROM user WHERE name = ? AND password = ?";
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
                prepareQuery.setString(1, username);
                prepareQuery.setString(2, stringPassw);
                ResultSet queryResult = prepareQuery.executeQuery();
                while(queryResult.next()){
                    System.out.println("hola");
                    System.out.println(queryResult.getInt("isActive"));
                    System.out.println(queryResult.getInt("isAdmin"));
                }
            } catch(SQLException ex){
                ex.printStackTrace();
            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
