package Controlador;

import Modelo.*;
import Vista.*;
import java.sql.*;

public class Controller {
    public static LoginMenu loginMenu = new LoginMenu();
    
    public static void startApp(){
        loginMenu.setTitle("Log in");
        loginMenu.setVisible(true);
        Statement statement = connectToDatabase();
    }
    public static Statement connectToDatabase(){
        Connection connection;
        Statement statement = null;
        String driver = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://localhost/padel";
        String user = "root";
        String passw = "";

        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(connectionUrl, user, passw);
            if(connection != null){
                statement = connection.createStatement();
            }
        } catch (SQLException | ClassNotFoundException e ) {
            System.out.println("Error " + e.getMessage());
        }
        return statement;
    }
}
