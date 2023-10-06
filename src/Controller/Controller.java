package Controller;

import static Controller.ButtonActions.adminView;
import View.*;
import Model.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

            // Convertir el hash en una representaci�n hexadecimal
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
        boolean insert = true;
        if(!checkEmail(email)) {
           insert = false;
           adminView.CreateUserEmailErrorLabel.setVisible(true);
           adminView.TxtboxEmailCreateUser.setText("");
        }
        if(!checkPassword(password)) {
           insert = false;
           adminView.CreateUserPasswordErrorLabel.setVisible(true);
           adminView.CreateUserPasswordRequirementLabel.setVisible(true);
           adminView.TxtboxPasswordCreateUser.setText("");
           
        }
        if(!checkName(name)) {
            insert = false;
            adminView.CreateUserNameErrorLabel.setVisible(true);
            adminView.TxtboxNameCreateUser.setText("");
        }
        if(!checkName(surnames)) {
            insert = false;
            adminView.CreateUserLastnamesErrorLabel.setVisible(true);
            adminView.TxtboxLastnamesCreateUser.setText("");
        }
        if(!checkDNI(dni)) {
            insert = false;
            adminView.CreateUserDniErrorLabel.setVisible(true);
            adminView.TxtboxDniCreateUser.setText("");
        }
        if(insert) {
            insertUser(email, password, name, surnames, dni);
        }
    }
    
    public static void insertUser(String email, String password, String name, String surnames, String dni) {
	try {
    	// Obtener una instancia del objeto MessageDigest con el algoritmo MD5
    	MessageDigest md = MessageDigest.getInstance("MD5");

    	// Calcular el hash de la cadena de texto
    	md.update(password.getBytes());
    	byte[] digest = md.digest();

    	// Convertir el hash en una representaci�n hexadecimal
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
   
   public static boolean checkEmail(String email) {
        // Expresi�n regular para validar el formato de un correo electr�nico
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        // Verifica si el correo electr�nico tiene el formato correcto
        if (!matcher.matches()) {
            System.out.print("No matchea");
            return false;
        }
        String sql = "SELECT COUNT(*) FROM user WHERE email = ?";
        try (PreparedStatement prepareQuery = statement.getConnection().prepareStatement(sql)) {
            prepareQuery.setString(1, email);
            ResultSet resultSet = prepareQuery.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                System.out.print("Llega al count:" + count);
                return !(count > 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print("Algun error");
        return false;
    }
   
   public static boolean checkPassword(String password) {
        if (password == null || password == "") {
            return false;
        }
        return !password.contains(" ");
    }
   
   public static boolean checkName(String name) {
        if (name == null || name.isEmpty()) {
            return false; // El nombre no puede ser nulo ni estar vac�o
        }

        // Utiliza una expresi�n regular para verificar si el nombre contiene solo letras y espacios
        return name.matches("^[a-zA-Z\\s]+$");
    }


 
   
   public static boolean checkDNI(String dni) {
	// Verifica que el DNI tiene exactamente 9 caracteres (8 d�gitos + 1 letra)
	if (dni == null || dni.length() != 9) {
            return false;
	}

	// Extrae los d�gitos y la letra de control
	String digits = dni.substring(0, 8);
	char controlLetter = dni.charAt(8);

	try {
            // Convierte los 8 d�gitos a un n�mero entero
            int dniNumber = Integer.parseInt(digits);

            // Calcula el �ndice de la letra de control en la cadena "TRWAGMYFPDXBNJZSQVHLCKE"
            int index = dniNumber % 23;

            // Obtiene la letra de control correspondiente al �ndice calculado
            char expectedLetter = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(index);

            // Compara la letra de control esperada con la proporcionada
            return controlLetter == expectedLetter;
	} catch (NumberFormatException e) {
            // Error al convertir los d�gitos a n�mero
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
                String name = queryResult.getString("notes");
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
