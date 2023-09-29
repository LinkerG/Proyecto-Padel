package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminSelect extends JFrame{
    public AdminSelect(){
        setUndecorated(true);
        Header header = new Header(this);
        add(header, BorderLayout.NORTH);
        setSize(1200,600);
        
        JPanel options = new JPanel();
        JButton courts = new JButton("Courts");
        JButton users = new JButton("Users");
    }
}
