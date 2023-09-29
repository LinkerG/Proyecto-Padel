package View;

import Controller.Controller;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class LoginMenu extends javax.swing.JFrame {
    
    private int posX, posY;
    
    public LoginMenu() {
        initComponents();
        getContentPane().setBackground(new Color(0, 56, 64));
        setLocationRelativeTo(null);
        
        BufferedImage iconImage = null;
        try {
            iconImage = ImageIO.read(new File("src/img/iconImage.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Establece la imagen como ícono de la ventana
        if (iconImage != null) {
            setIconImage(iconImage);
        }
        
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                posX = e.getX();
                posY = e.getY();
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen() - posX;
                int y = e.getYOnScreen() - posY;
                setLocation(x, y);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBackground = new javax.swing.JPanel();
        jLabelEmail = new javax.swing.JLabel();
        TxtboxEmail = new javax.swing.JTextField();
        LabelPassword = new javax.swing.JLabel();
        TxtboxPassword = new javax.swing.JPasswordField();
        BtnLogin = new javax.swing.JButton();
        LabelLogo = new javax.swing.JLabel();
        BtnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 56, 64));
        setMaximumSize(new java.awt.Dimension(417, 582));
        setMinimumSize(new java.awt.Dimension(417, 582));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(417, 582));

        PanelBackground.setBackground(new java.awt.Color(0, 56, 64));
        PanelBackground.setMaximumSize(new java.awt.Dimension(417, 582));
        PanelBackground.setMinimumSize(new java.awt.Dimension(417, 582));
        PanelBackground.setPreferredSize(new java.awt.Dimension(417, 582));
        PanelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEmail.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("Email:");
        PanelBackground.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 276, 50, -1));

        TxtboxEmail.setBackground(new java.awt.Color(0, 90, 91));
        TxtboxEmail.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        TxtboxEmail.setForeground(new java.awt.Color(255, 255, 255));
        TxtboxEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 15));
        TxtboxEmail.setPreferredSize(new java.awt.Dimension(236, 50));
        TxtboxEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtboxEmailActionPerformed(evt);
            }
        });
        PanelBackground.add(TxtboxEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        LabelPassword.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        LabelPassword.setText("Password:");
        PanelBackground.add(LabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 369, 75, -1));

        TxtboxPassword.setBackground(new java.awt.Color(0, 90, 91));
        TxtboxPassword.setForeground(new java.awt.Color(255, 255, 255));
        TxtboxPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 15));
        TxtboxPassword.setPreferredSize(new java.awt.Dimension(236, 50));
        TxtboxPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtboxPasswordActionPerformed(evt);
            }
        });
        PanelBackground.add(TxtboxPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 393, 236, -1));

        BtnLogin.setBackground(new java.awt.Color(0, 115, 105));
        BtnLogin.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        BtnLogin.setForeground(new java.awt.Color(255, 255, 255));
        BtnLogin.setText("Login");
        BtnLogin.setBorder(null);
        BtnLogin.setMaximumSize(new java.awt.Dimension(236, 50));
        BtnLogin.setMinimumSize(new java.awt.Dimension(236, 50));
        BtnLogin.setPreferredSize(new java.awt.Dimension(236, 50));
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });
        PanelBackground.add(BtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 486, -1, -1));

        LabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        LabelLogo.setText("jLabel1");
        LabelLogo.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        LabelLogo.setMaximumSize(new java.awt.Dimension(265, 257));
        LabelLogo.setMinimumSize(new java.awt.Dimension(265, 257));
        LabelLogo.setPreferredSize(new java.awt.Dimension(265, 257));
        PanelBackground.add(LabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 14, -1, 257));

        BtnClose.setBackground(new java.awt.Color(0, 56, 64));
        BtnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        BtnClose.setBorder(null);
        BtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCloseActionPerformed(evt);
            }
        });
        PanelBackground.add(BtnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 14, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        Controller.checkUser(TxtboxEmail.getText(), TxtboxPassword.getPassword());
    }//GEN-LAST:event_BtnLoginActionPerformed

    private void TxtboxEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtboxEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtboxEmailActionPerformed

    private void TxtboxPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtboxPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtboxPasswordActionPerformed

    private void BtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnCloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnClose;
    public javax.swing.JButton BtnLogin;
    public javax.swing.JLabel LabelLogo;
    public javax.swing.JLabel LabelPassword;
    public javax.swing.JPanel PanelBackground;
    public javax.swing.JTextField TxtboxEmail;
    public javax.swing.JPasswordField TxtboxPassword;
    public javax.swing.JLabel jLabelEmail;
    // End of variables declaration//GEN-END:variables
}
