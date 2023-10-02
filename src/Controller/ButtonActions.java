package Controller;
import static Controller.Controller.loginMenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.*;

public class ButtonActions {
    public static AdminView adminView;
    
    public static void logIn(Boolean admin){
        adminView = new AdminView();
        adminView.setTitle("Administrator Panel");
        adminView.setVisible(true);
        loginMenu.setVisible(false);
    }
    
    public static void logOut(Boolean admin) {
        Controller.currentUser = null;
        if(admin){
            adminView.setVisible(false);
        }
        loginMenu.setVisible(true);
    }    
}
