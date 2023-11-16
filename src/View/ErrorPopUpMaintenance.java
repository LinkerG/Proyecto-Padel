package View;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ErrorPopUpMaintenance extends javax.swing.JFrame {
    private String messageString;
    public ErrorPopUpMaintenance(String message) {
        this.messageString = message;
        initComponents();
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ConfirmBookingLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(335, 202));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 140, 129));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(335, 202));
        jPanel1.setMinimumSize(new java.awt.Dimension(335, 202));
        jPanel1.setPreferredSize(new java.awt.Dimension(335, 202));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ConfirmBookingLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ConfirmBookingLabel.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmBookingLabel.setText("Error Message");
        jPanel1.add(ConfirmBookingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Exit");
        jButton1.setBorder(null);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 230, 40));

        ErrorLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ErrorLabel.setForeground(new java.awt.Color(255, 255, 255));
        ErrorLabel.setText("Lorem ipsum dolor sit amet");
        ErrorLabel.setText(messageString);
        jPanel1.add(ErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel ConfirmBookingLabel;
    public static javax.swing.JLabel ErrorLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
