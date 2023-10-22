package Controller;

import View.*;
import Model.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import javax.swing.JOptionPane;
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
                        
                        if(isAdmin) {
                            String userName = queryResult.getString("name");
                            String userSurname = "";
                            String userdni = "";
                            //String userSurname = queryResult.getString("surname");
                            
                            currentUser = new User(email, userName, userSurname, userdni, isActive, isAdmin);
                            
                            ButtonActions.logIn(true);
                            
                        } else {
                            String userName = queryResult.getString("name");
                            String userSurname = queryResult.getString("surname");
                            String userDni = queryResult.getString("dni");
                            
                            currentUser = new User(email, userName, userSurname, userDni, isActive, isAdmin);
                            
                            ButtonActions.logIn(false);
                        }
                    } else {
                        loginMenu.TxtboxEmail.setText("");
                        loginMenu.TxtboxPassword.setText("");
                        loginMenu.LabelIncorrectCredentials.setText("User is inactive");
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

   public static boolean checkEmail(String email) {
       
       if (email == null || email.trim().isEmpty() || isTooLong(email)) {
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
        if (password == null || "".equals(password) || isTooLong(password)) {
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
	return !(name == null || name.trim().isEmpty() || isTooLong(name));
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
    
    public static boolean isTooLong(String s) {
        return (s.length() > 255);
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
