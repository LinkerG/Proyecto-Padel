package Controller;
import static Controller.Controller.loginMenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.*;

public class ButtonActions {
    public static AdminUsers adminUsers;
    public static AdminView adminView;
    
    public static void logIn(Boolean admin){
        adminView = new AdminView();
        adminView.setTitle("Administrator Panel");
        adminView.setVisible(true);
        loginMenu.setVisible(false);
    }
    
    public static void logOut(JFrame frame) {
        Controller.currentUser = null;
        frame.setVisible(false);
        loginMenu.setVisible(true);
    }
    
    public static void SelectToUser(){
        Point location = adminView.getLocationOnScreen();
        
        adminUsers = new AdminUsers();
        adminView.setVisible(false);
        adminUsers.setLocation(location);
        adminUsers.setVisible(true);
    }
    
    
}
