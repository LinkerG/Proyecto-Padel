package Controller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.*;

public class ButtonActions {
    public static AdminUsers adminUsers;
    public static void SelectToUser(){
        adminUsers = new AdminUsers();
        Controller.adminMenu.setVisible(false);
        adminUsers.setVisible(true);
    }
}
