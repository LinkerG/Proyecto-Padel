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
    public static Statement statement = connectToDatabase();
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

            // Convertir el hash en una representaciï¿½n hexadecimal
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
                        String dni = queryResult.getString("dni");
                        currentUser = new User(email, name, surname, dni, isActive, isAdmin);
                        
                        if(isAdmin) {
                            String userName = queryResult.getString("name");
                            String userSurname = "";
                            String userdni = "";
                            //String userSurname = queryResult.getString("surname");
                            
                            currentUser = new User(email, userName, userSurname, userdni, isActive, isAdmin);
                            
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
    
    public static boolean createUser(String email, String password, String name, String surnames, String dni) {
        boolean insert = true;
        adminView.CreateUserEmailErrorLabel.setVisible(false);
        adminView.CreateUserPasswordErrorLabel.setVisible(false);
        adminView.CreateUserPasswordRequirementLabel.setVisible(false);
        adminView.CreateUserNameErrorLabel.setVisible(false);
        adminView.CreateUserLastnamesErrorLabel.setVisible(false);
        adminView.CreateUserDniErrorLabel.setVisible(false);
        
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
        String formattedName = modifyName(name);
        if(!checkName(name)) {
            insert = false;
            adminView.CreateUserNameErrorLabel.setVisible(true);
            adminView.TxtboxNameCreateUser.setText("");
        }
        String formattedSurnames = modifyName(surnames);
        if(!checkName(surnames)) {
            insert = false;
            adminView.CreateUserLastnamesErrorLabel.setVisible(true);
            adminView.TxtboxLastnamesCreateUser.setText("");
        }
        String formattedDNI = dni.toUpperCase();
        if(!checkDNI(formattedDNI)) {
            insert = false;
            adminView.CreateUserDniErrorLabel.setVisible(true);
            adminView.TxtboxDniCreateUser.setText("");
        }
        System.out.println("Nombre post proceso: " + formattedName + " " + formattedSurnames + " DNI: " + formattedDNI);
        if(insert) {
            insertUser(email, password, formattedName, formattedSurnames, formattedDNI);
            return true;
        } else {
            return false;
        }
    }
    
    public static void insertUser(String email, String password, String name, String surnames, String dni) {
	try {
    	// Obtener una instancia del objeto MessageDigest con el algoritmo MD5
    	MessageDigest md = MessageDigest.getInstance("MD5");

    	// Calcular el hash de la cadena de texto
    	md.update(password.getBytes());
    	byte[] digest = md.digest();

    	// Convertir el hash en una representaciï¿½n hexadecimal
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
    
    public static boolean checkUpdateUser(String email, String password, String name, String surnames, String dni) {
        boolean insert = true;
        adminView.UserInfoPasswordErrorLabel.setVisible(false);
        adminView.UserInfoPasswordRequirementLabel.setVisible(false);
        adminView.UserInfoNameErrorLabel.setVisible(false);
        adminView.UserInfoLastnamesErrorLabel.setVisible(false);
        adminView.UserInfoDniErrorLabel.setVisible(false);
        
        
        if(adminView.ChangePasswordToggle.isSelected()) {
            if(!checkPassword(password)) {
                insert = false;
                adminView.UserInfoPasswordErrorLabel.setVisible(true);
                adminView.UserInfoPasswordRequirementLabel.setVisible(true);
                adminView.TxtboxPasswordUserInfo.setText("");
            }
        }
        
        String formattedName = modifyName(name);
        if(!checkName(name)) {
            insert = false;
            adminView.UserInfoNameErrorLabel.setVisible(true);
            adminView.TxtboxNameUserInfo.setText("");
        }
        String formattedSurnames = modifyName(surnames);
        if(!checkName(surnames)) {
            insert = false;
            adminView.UserInfoLastnamesErrorLabel.setVisible(true);
            adminView.TxtboxLastnamesUserInfo.setText("");
        }
        String formattedDNI = dni.toUpperCase();
        if(adminView.ChangeDniToggle.isSelected()) {
            System.out.println(formattedDNI);
            if(!checkDNI(formattedDNI)) {
                insert = false;
                adminView.UserInfoDniErrorLabel.setVisible(true);
                adminView.TxtboxDniUserInfo.setText("");
            }
        }
        
        System.out.println("Nombre post proceso: " + formattedName + " " + formattedSurnames + " DNI: " + formattedDNI);
        if(insert) {
            if(adminView.ChangeDniToggle.isSelected() && adminView.ChangePasswordToggle.isSelected()) {
                updateUser(email, password, formattedName, formattedSurnames, dni);
                return true;
            } else if(adminView.ChangePasswordToggle.isSelected()) {
                updateUser(email, password, formattedName, formattedSurnames, "");
                return true;
            } else if(adminView.ChangeDniToggle.isSelected()) {
                updateUser(email, "", formattedName, formattedSurnames, formattedDNI);
                return true;
            } else {
                updateUser(email, "", formattedName, formattedSurnames, "");
                return true;
            }
        } else {
            return false;
        }
    }
    
    public static void updateUser(String email, String password, String name, String surnames, String dni) {
        if(password.equals("") && dni.equals("")){
            try {
                System.out.println("NO CAMBIA");
            // como no se cambia el password no se hace lo de md5
            // Use a PreparedStatement to safely insert data into the database
            String sql = "UPDATE user SET name = ?, surname = ? WHERE email = ?";
            try (PreparedStatement prepareQuery = statement.getConnection().prepareStatement(sql)) {
                    prepareQuery.setString(1, name);
                    prepareQuery.setString(2, surnames);
                    prepareQuery.setString(3, email);

                    // Execute the query
                    int rowsInserted = prepareQuery.executeUpdate();

                    if (rowsInserted > 0) {
                    // Successfully inserted
                        System.out.print("Updated");
                    } else {
                    // Error in database
                        System.out.print("Not updated");
                    }
            } catch (Exception e) {
                    e.printStackTrace(); // Print the exception for debugging
            }
            } catch (Exception e) {
            e.printStackTrace(); // Print the exception for debugging
            }
        } else if(dni.equals("")){
            System.out.println("CAMBIA PASS");
            try {
            // Obtener una instancia del objeto MessageDigest con el algoritmo MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Calcular el hash de la cadena de texto
            md.update(password.getBytes());
            byte[] digest = md.digest();

            // Convertir el hash en una representaciï¿½n hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : digest) {
                    hexString.append(String.format("%02x", b));
            }
            
            // Use a PreparedStatement to safely insert data into the database
            String sql = "UPDATE user SET name = ?, surname = ?, password = ? WHERE email = ?";
            try (PreparedStatement prepareQuery = statement.getConnection().prepareStatement(sql)) {
                    prepareQuery.setString(1, name);
                    prepareQuery.setString(2, surnames);
                    prepareQuery.setString(3, hexString.toString());
                    prepareQuery.setString(4, email);

                    // Execute the query
                    int rowsInserted = prepareQuery.executeUpdate();

                    if (rowsInserted > 0) {
                    // Successfully inserted
                        System.out.print("Updated");
                    } else {
                    // Error in database
                        System.out.print("Not updated");
                    }
            } catch (Exception e) {
                    e.printStackTrace(); // Print the exception for debugging
            }
            } catch (Exception e) {
            e.printStackTrace(); // Print the exception for debugging
            }
        } else if(password.equals("")){
            System.out.println("Cambia DNI");
            try {
            // como no se cambia el password no se hace lo de md5
            // Use a PreparedStatement to safely insert data into the database
            String sql = "UPDATE user SET name = ?, surname = ?, DNI = ? WHERE email = ?";
            try (PreparedStatement prepareQuery = statement.getConnection().prepareStatement(sql)) {
                    prepareQuery.setString(1, name);
                    prepareQuery.setString(2, surnames);
                    prepareQuery.setString(3, dni);
                    prepareQuery.setString(4, email);

                    // Execute the query
                    int rowsInserted = prepareQuery.executeUpdate();

                    if (rowsInserted > 0) {
                    // Successfully inserted
                        System.out.print("Updated");
                    } else {
                    // Error in database
                        System.out.print("Not updated");
                    }
            } catch (Exception e) {
                    e.printStackTrace(); // Print the exception for debugging
            }
            } catch (Exception e) {
            e.printStackTrace(); // Print the exception for debugging
            }
        } else {
            System.out.println("CAMBIA LOS DOS");
            try {
            // Obtener una instancia del objeto MessageDigest con el algoritmo MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Calcular el hash de la cadena de texto
            md.update(password.getBytes());
            byte[] digest = md.digest();

            // Convertir el hash en una representaciï¿½n hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : digest) {
                    hexString.append(String.format("%02x", b));
            }

            // Use a PreparedStatement to safely insert data into the database
            String sql = "UPDATE user SET name = ?, surname = ?,password = ?, DNI = ? WHERE email = ?";
            try (PreparedStatement prepareQuery = statement.getConnection().prepareStatement(sql)) {
                    prepareQuery.setString(1, name);
                    prepareQuery.setString(2, surnames);
                    prepareQuery.setString(3, hexString.toString());
                    prepareQuery.setString(4, dni);
                    prepareQuery.setString(5, email);

                    // Execute the query
                    int rowsInserted = prepareQuery.executeUpdate();

                    if (rowsInserted > 0) {
                    // Successfully inserted
                        System.out.print("Updated");
                    } else {
                    // Error in database
                        System.out.print("Not updated");
                    }
            } catch (Exception e) {
                    e.printStackTrace(); // Print the exception for debugging
            }
            } catch (Exception e) {
            e.printStackTrace(); // Print the exception for debugging
            }
        }
    }
   
   public static boolean checkEmail(String email) {
       
       if (email == null || email.trim().isEmpty()) {
            return false;
        }

        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        
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
        if (password == null || "".equals(password)) {
            return false;
        }
        return !password.contains(" ");
    }
   
    public static String modifyName(String name) {
        
        // Elimina espacios en blanco adicionales al principio y al final del nombre
        name = name.trim();

        // Divide el nombre en palabras usando espacios como separadores
        String[] words = name.split("\\s+");

        // Formatea cada palabra: convierte a minúsculas todas las letras excepto la primera
        StringBuilder formattedName = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) { // Ignora espacios en blanco adicionales
                String firstLetter = word.substring(0, 1).toUpperCase();
                String restOfWord = word.substring(1).toLowerCase();
                formattedName.append(firstLetter).append(restOfWord).append(" ");
            }
        }
        System.out.println("FName: " + formattedName);
        // Verifica si el nombre después del formato es nulo o está vacío
        if (formattedName.toString().trim().isEmpty()) {
            System.out.println("El nombre después del formato está vacío o en blanco.");
            return "";
        }
        name = formattedName.toString().trim();
        // El nombre es válido después de aplicar el formato
        System.out.println("Nombre válido: " + formattedName.toString().trim());
        return formattedName.toString().trim(); 
        
    }
    
    public static boolean checkName(String name) {
	if (name == null || name.trim().isEmpty()) {
            System.out.println("El nombre está vacío o en blanco.");
            return false;
	}
	return true;
    }
   
   public static boolean checkDNI(String dni) {
	// Verifica que el DNI tiene exactamente 9 caracteres (8 dï¿½gitos + 1 letra)
	if (dni == null || dni.length() != 9) {
            return false;
	}

	// Extrae los dï¿½gitos y la letra de control
	String digits = dni.substring(0, 8);
	char controlLetter = dni.charAt(8);
        String sql = "SELECT COUNT(*) FROM user WHERE dni = ?";
        try (PreparedStatement prepareQuery = statement.getConnection().prepareStatement(sql)) {
            prepareQuery.setString(1, dni);
            ResultSet resultSet = prepareQuery.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                System.out.print("Llega al count:" + count);
                if(count > 0) return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	try {
            // Convierte los 8 dï¿½gitos a un nï¿½mero entero
            int dniNumber = Integer.parseInt(digits);

            // Calcula el ï¿½ndice de la letra de control en la cadena "TRWAGMYFPDXBNJZSQVHLCKE"
            int index = dniNumber % 23;

            // Obtiene la letra de control correspondiente al ï¿½ndice calculado
            char expectedLetter = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(index);

            // Compara la letra de control esperada con la proporcionada
            return controlLetter == expectedLetter;
	} catch (NumberFormatException e) {
            // Error al convertir los dï¿½gitos a nï¿½mero
            return false;
	}
    }

    public static ArrayList getCourts(boolean available) {
        // FUNCTION returns all courts in DB as object Court in a list
        
        String consultaSQL;
        if(available) {
            consultaSQL = "SELECT * FROM court WHERE isAvailable = 1";
        } else {
            consultaSQL = "SELECT * FROM court";
        }
        
        ArrayList<Court> courtList = new ArrayList<>();
        try(PreparedStatement prepareQuery = statement.getConnection().prepareStatement(consultaSQL)){
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
    
    public static void getSelectedCourt(Court court) {
        AdminView.CourtInfoIDLabel.setText("Court " + court.getID());
        AdminView.CourtInfoNotes.setText(court.getNotes());
        if(court.isIsActive()) {
            AdminView.CourtInfoState.setSelectedItem(0);
        } else {
            AdminView.CourtInfoState.setSelectedItem(1);
        }
    }
    
    public static void updateCourt(int state, String notes, String court) {
        
        // Dividimos la cadena en función de un espacio en blanco
        String[] parts = court.split(" ");
        int number = 0;
        // La primera parte es "Court" y la segunda parte es el número
        if (parts.length == 2 && parts[0].equals("Court")) {
            // Convertimos la segunda parte a un valor int
            number = Integer.parseInt(parts[1]);
        } else {
            System.out.println("El formato de la cadena no es válido.");
        }
        
        state = (state == 1) ? 1 : 0;

        String sql = "UPDATE court SET notes = ?, isAvailable = ? WHERE courtId = ?";
            try (PreparedStatement prepareQuery = statement.getConnection().prepareStatement(sql)) {
                    prepareQuery.setString(1, notes);
                    prepareQuery.setInt(2, state);
                    prepareQuery.setInt(3, number);

                    // Execute the query
                    int rowsInserted = prepareQuery.executeUpdate();

                    if (rowsInserted > 0) {
                    // Successfully inserted
                        System.out.print("Updated");
                    } else {
                    // Error in database
                        System.out.print("Not updated");
                    }
            } catch (Exception e) {
                    e.printStackTrace(); // Print the exception for debugging
            }
    }
    /* Codigo antiguo, puede ser util
    public static Court getCourtById(int courtId, boolean available) {
        ArrayList<Court> courtList = getCourts(available);

        for (Court court : courtList) {
            if (court.getID() == courtId) {
                return court;
            }
        }
        return null; 
    }
    */
    
    public static ArrayList getUsers(boolean available) {
        // FUNCTION returns all users in DB as object User in a list
        String consultaSQL;
        if(available){
            consultaSQL = "SELECT * FROM user WHERE isAdmin = 0 AND isActive = 1";
        } else {
            consultaSQL = "SELECT * FROM user WHERE isAdmin = 0";
        }
        ArrayList<User> userList = new ArrayList<>();
        try(PreparedStatement prepareQuery = statement.getConnection().prepareStatement(consultaSQL)){
            ResultSet queryResult = prepareQuery.executeQuery();
            while(queryResult.next()){ 
                String email = queryResult.getString("email");
                String name = queryResult.getString("name");
                String surname = queryResult.getString("surname");
                String dni = queryResult.getString("dni");
                boolean isActive = queryResult.getInt("isActive") == 1 ? true : false;
                User newUser = new User(email, name, surname, dni, isActive, false);
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
            // AÃ±adir crear boton
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
    
}
