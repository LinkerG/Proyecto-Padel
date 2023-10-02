package Controller;

import View.*;
import Model.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Controller {
    private static Statement statement = connectToDatabase();
    public static LoginMenu loginMenu = new LoginMenu();
    
    public static LoginError loginError = new LoginError();
    public static User currentUser;
    
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
        return statement != null;
    }
    public static Statement connectToDatabase(){
        Connection connection;
        Statement estado = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://localhost/padel";
        String userDB = "root";
        String passw = "";

        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(connectionUrl, userDB, passw);
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
                    boolean isActive = queryResult.getInt("isActive") == 1;
                    boolean isAdmin = queryResult.getInt("isAdmin") == 1;
                    
                    if(isActive) {
                        String name = queryResult.getString("name");
                        String surname = queryResult.getString("surname");
                        currentUser = new User(email, name, surname, isAdmin);
                        
                        if(isAdmin) {
                            String userName = queryResult.getString("name");
                            String userSurname = "";
                            //String userSurname = queryResult.getString("surname");
                            
                            currentUser = new User(email, userName, userSurname, isAdmin);
                            
                            ButtonActions.logIn(true);
                            
                        } else {
                            System.out.println("Normal user");
                        }
                    } else {
                        mostrarError("The user you tried to log in is currently inactive");
                    }
                }
                if(!exists) {
                    loginMenu.TxtboxEmail.setText("");
                    loginMenu.TxtboxPassword.setText("");
                    loginMenu.LabelIncorrectCredentials.setText("Incorrect credentials");
                }
            } catch(SQLException ex){
                System.out.print("ErrorMySQL");
            }
        } catch (NoSuchAlgorithmException e) {
            System.out.print("ErrorFatal");
        }
    }
    
    public static String getUserName() {
        if(currentUser != null) {
            return currentUser.getName() + " " + currentUser.getSurname();
        }
        return "";
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
    
    public static void mostrarCourts() {
        ArrayList<Court> courtList = getCourts(false);
        for(int i = 0; i < courtList.size(); i++) {
            Court court = courtList.get(i);
            int id = court.getID();
            boolean isActive = court.isIsActive();
            String componentName = "Court" + id;
            String courtName = "Court " + id;
            String status = "";
            if(isActive) {
                status = "Active";
                // Add function to check if someone is playing at this moment
            } else {
                status = "In maintenance";
            }
            // Añadir crear boton
        }
    }
    
    public static void mostrarError(String error) {
        JOptionPane.showMessageDialog(null, error);
    }
    
    private static void abrirPista() {                                             
        System.out.println("Hola");
    } 
}
