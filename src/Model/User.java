package Model;

import Controller.*;
import static Controller.ButtonActions.adminView;
import static Controller.Controller.checkDNI;
import static Controller.Controller.checkEmail;
import static Controller.Controller.checkName;
import static Controller.Controller.checkPassword;
import static Controller.Controller.modifyName;
import static Controller.Controller.statement;
import java.security.MessageDigest;
import java.sql.*;
import java.util.ArrayList;

public class User {
    //Attributes
    private String email = "";
    private String name = "";
    private String surnames = "";
    private String dni = "";
    private boolean isActive = true;
    private boolean admin = false;
    
    //Constructor
    public User(String email, String name, String surname, String dni, boolean isActive, boolean admin){
        this.email = email;
        this.name = name;
        this.surnames = surname;
        this.dni = dni;
        this.isActive = isActive;
        this.admin = admin;
    }
    
    public User() {}
    
    //Setters & Getters
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }
    public void setSurnames(String surname) {
        this.surnames = surname;
    }

    public boolean isAdmin() {
        return admin;
    }
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    
    
    //Methods
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
    
    public void updateUserIsActive() {
        String update = this.isActive ? "UPDATE USER SET isActive = 0 WHERE DNI = '" + this.dni + "';" : "UPDATE USER SET isActive = 1 WHERE DNI = '" + this.dni + "';";
        try(PreparedStatement prepareQuery = Controller.statement.getConnection().prepareStatement(update)){
            // Execute the query
        	int rowsInserted = prepareQuery.executeUpdate();

        	if (rowsInserted > 0) {
            	// Successfully inserted
                    System.out.print("updated");
        	} else {
            	// Error in database
                    System.out.print("not updated");
        	}
        } catch(SQLException ex) {
            ex.printStackTrace();
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

            // Convertir el hash en una representaci�n hexadecimal
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

            // Convertir el hash en una representaci�n hexadecimal
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
}
