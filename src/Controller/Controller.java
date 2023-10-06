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
        // Validates user in DB and creates static User currentUser
        
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
            return currentUser.getName() + " " + currentUser.getSurnames();
        }
        return "";
    }
    
    public static void createCourt(String notes, int isAvailable) {
        // Use a PreparedStatement to safely insert data into the database
    	String sql = "INSERT INTO court (notes, isAvailable) VALUES (? , ?)";
    	try (PreparedStatement prepareQuery = statement.getConnection().prepareStatement(sql)) {
        	prepareQuery.setString(1, notes);
        	prepareQuery.setInt(2, isAvailable);

        	// Execute the query
        	int rowsInserted = prepareQuery.executeUpdate();

        	if (rowsInserted > 0) {
            	// Successfully inserted
                    System.out.print("Fila insertada");
        	} else {
            	// Error in database
                    System.out.print("Fila NO insertada");
        	}
    	} catch (Exception e) {
        	e.printStackTrace(); // Print the exception for debugging
    	}
    }
    
    public static void createUser(String email, String password, String name, String surnames, String dni) {
	try {
    	// Obtener una instancia del objeto MessageDigest con el algoritmo MD5
    	MessageDigest md = MessageDigest.getInstance("MD5");

    	// Calcular el hash de la cadena de texto
    	md.update(password.getBytes());
    	byte[] digest = md.digest();

    	// Convertir el hash en una representación hexadecimal
    	StringBuilder hexString = new StringBuilder();
    	for (byte b : digest) {
        	hexString.append(String.format("%02x", b));
    	}

    	// Use a PreparedStatement to safely insert data into the database
    	String sql = "INSERT INTO user (email, password, name, surname, DNI, isActive, isAdmin) VALUES (?, ?, ?, ?, ?, true, false)";
    	try (PreparedStatement prepareQuery = statement.getConnection().prepareStatement(sql)) {
        	prepareQuery.setString(1, email);
        	prepareQuery.setString(2, hexString.toString());
        	prepareQuery.setString(3, name);
        	prepareQuery.setString(4, surnames);
        	prepareQuery.setString(5, dni);

        	// Execute the query
        	int rowsInserted = prepareQuery.executeUpdate();

        	if (rowsInserted > 0) {
            	// Successfully inserted
                    System.out.print("Fila insertada");
        	} else {
            	// Error in database
                    System.out.print("Fila NO insertada");
        	}
    	} catch (Exception e) {
        	e.printStackTrace(); // Print the exception for debugging
    	}
	} catch (Exception e) {
    	e.printStackTrace(); // Print the exception for debugging
	}
    }
   
   public static boolean checkDNI(String dni) {
	// Verifica que el DNI tiene exactamente 9 caracteres (8 dígitos + 1 letra)
	if (dni == null || dni.length() != 9) {
            return false;
	}

	// Extrae los dígitos y la letra de control
	String digits = dni.substring(0, 8);
	char controlLetter = dni.charAt(8);

	try {
            // Convierte los 8 dígitos a un número entero
            int dniNumber = Integer.parseInt(digits);

            // Calcula el índice de la letra de control en la cadena "TRWAGMYFPDXBNJZSQVHLCKE"
            int index = dniNumber % 23;

            // Obtiene la letra de control correspondiente al índice calculado
            char expectedLetter = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(index);

            // Compara la letra de control esperada con la proporcionada
            return controlLetter == expectedLetter;
	} catch (NumberFormatException e) {
            // Error al convertir los dígitos a número
            return false;
	}
    }



    
    public static ArrayList getCourts(boolean available) {
        // FUNCTION returns all courts in DB as object Court in a list
        
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
    
    public static ArrayList getUsers(boolean available) {
        // FUNCTION returns all users in DB as object User in a list
        
        String consultaSQL = "SELECT * FROM users WHERE isAdmin = 0 AND isActive = ?";
        int isAvailable = available ? 1 : 0;
        ArrayList<User> userList = new ArrayList<>();
        try(PreparedStatement prepareQuery = statement.getConnection().prepareStatement(consultaSQL)){
            prepareQuery.setInt(1, isAvailable);
            ResultSet queryResult = prepareQuery.executeQuery();
            while(queryResult.next()){ 
                String email = queryResult.getString("email");
                String name = queryResult.getString("name");
                String surname = queryResult.getString("surname");
                User newUser = new User(email, name, surname, false);
                userList.add(newUser);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            return userList;
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
    
    public static int getDefId(){
        String consultaSQL = "SELECT MAX(courtId) as 'lastId' FROM court;";
        int defId = 1;
        try(PreparedStatement prepareQuery = statement.getConnection().prepareStatement(consultaSQL)){
            ResultSet queryResult = prepareQuery.executeQuery();
            while(queryResult.next()){ 
                defId = queryResult.getInt("lastId") + 1;
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            return defId;
        }
    }
    
    public static void mostrarError(String error) {
        JOptionPane.showMessageDialog(null, error);
    }
    
    private static void abrirPista() {                                             
        System.out.println("Hola");
    } 
}
