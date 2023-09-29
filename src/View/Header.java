package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Header extends JPanel {
    private JFrame parentFrame;
    private Point initialClick;

    public Header(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        setLayout(new BorderLayout());

        JLabel iconLabel = new JLabel();
        ImageIcon icon = new ImageIcon("ruta");
        iconLabel.setIcon(icon);

        JLabel title = new JLabel("Booking of paddle courts");
        JLabel userName = new JLabel("<user full name>");

        JButton minimizeButton = new JButton("-");
        minimizeButton.addActionListener(e -> parentFrame.setExtendedState(JFrame.ICONIFIED));

        JButton closeButton = new JButton("X");
        closeButton.addActionListener(e -> {
            int confirm = JOptionPane.showOptionDialog(
                    parentFrame, "¿Estás seguro de que deseas salir?", "Confirmar cierre",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

            if (confirm == JOptionPane.YES_OPTION) {
                parentFrame.dispose();
                System.exit(0);
            }
        });

        // Panel de botones
        JPanel headerPanel = new JPanel();
        headerPanel.add(title);
        headerPanel.add(userName);
        headerPanel.add(minimizeButton);
        headerPanel.add(closeButton);

        // Agregar panel de botones al panel de encabezado
        add(headerPanel, BorderLayout.EAST);

        // Controlador de eventos para el arrastre de la ventana
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
                getComponentAt(initialClick);
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                int thisX = parentFrame.getLocation().x;
                int thisY = parentFrame.getLocation().y;

                // Calcular el nuevo punto de origen de la ventana
                int xMoved = (thisX + e.getX()) - (thisX + initialClick.x);
                int yMoved = (thisY + e.getY()) - (thisY + initialClick.y);

                // Establecer la nueva posición de la ventana
                int X = thisX + xMoved;
                int Y = thisY + yMoved;
                parentFrame.setLocation(X, Y);
            }
        });
    }
}
