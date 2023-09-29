package View;

import Controller.Controller;
import java.awt.Color;

public class LoginMenu extends javax.swing.JFrame {

    public LoginMenu() {
        initComponents();
        getContentPane().setBackground(new Color(0, 56, 64));
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 56, 64));
        setMinimumSize(new java.awt.Dimension(417, 582));
        setResizable(false);
        setSize(new java.awt.Dimension(417, 582));

        PanelBackground.setBackground(new java.awt.Color(0, 56, 64));
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
        BtnLogin.setMaximumSize(new java.awt.Dimension(236, 50));
        BtnLogin.setMinimumSize(new java.awt.Dimension(236, 50));
        BtnLogin.setPreferredSize(new java.awt.Dimension(236, 50));
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });
        PanelBackground.add(BtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 486, -1, -1));

        LabelLogo.setText("jLabel1");
        PanelBackground.add(LabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnLogin;
    public javax.swing.JLabel LabelLogo;
    public javax.swing.JLabel LabelPassword;
    public javax.swing.JPanel PanelBackground;
    public javax.swing.JTextField TxtboxEmail;
    public javax.swing.JPasswordField TxtboxPassword;
    public javax.swing.JLabel jLabelEmail;
    // End of variables declaration//GEN-END:variables
}
