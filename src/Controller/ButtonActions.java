package Controller;
import static Controller.Controller.loginMenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.*;

public class ButtonActions {
    public static AdminView adminView;
    public static UserView userView;
    
    public static void logIn(Boolean admin){
        if(admin){
            adminView = new AdminView();
            adminView.setTitle("Administrator Panel");
            adminView.setVisible(true);
            loginMenu.setVisible(false);
        } else {
            userView = new UserView();
            userView.setTitle("User Panel");
            userView.setVisible(true);
            loginMenu.setVisible(false);
        }
        
    }
    
    public static void logOut(Boolean admin) {
        Controller.currentUser = null;
        if(admin){
            adminView.setVisible(false);
        }
        loginMenu.setVisible(true);
    }    
}
