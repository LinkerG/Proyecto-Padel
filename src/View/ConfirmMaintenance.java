package View;

import Controller.BookingController;
import Controller.Controller;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ConfirmMaintenance extends javax.swing.JFrame {
    private int courtId, posX, posY;
    private String startDay, endDay, startHour, endHour;
    public ConfirmMaintenance(int courtId, String startDay, String endDay, String startHour, String endHour) {
        this.courtId = courtId;
        this.startDay = startDay;
        this.endDay = endDay;
        this.startHour = startHour;
        this.endHour = endHour;
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
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(335, 202));
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 140, 129));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(335, 202));
        jPanel1.setMinimumSize(new java.awt.Dimension(335, 202));
        jPanel1.setPreferredSize(new java.awt.Dimension(335, 202));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ConfirmBookingLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ConfirmBookingLabel.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmBookingLabel.setText("WARNING");
        jPanel1.add(ConfirmBookingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jButton1.setBackground(new java.awt.Color(2, 166, 118));
        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("No");
        jButton1.setBorder(null);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 80, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<html><p>By performing this action, all bookings in this range of dates and hours will be cancelled, are you sure you want to proceed?</p></html>");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 240, 120));

        jButton2.setBackground(new java.awt.Color(102, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Yes");
        jButton2.setBorder(null);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 80, 40));

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(BookingController.blockCourt(courtId, startDay, endDay, startHour, endHour)){
            dispose();
        } else {
            javax.swing.JFrame error = new ErrorPopUpMaintenance("Error on blocking");
            error.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int newX = evt.getXOnScreen() - posX;
        int newY = evt.getYOnScreen() - posY;

        setLocation(newX, newY);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        posX = evt.getXOnScreen() - getX();
        posY = evt.getYOnScreen() - getY();
    }//GEN-LAST:event_formMousePressed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel ConfirmBookingLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
