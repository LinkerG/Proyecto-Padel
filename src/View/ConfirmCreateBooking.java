package View;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import Controller.*;
import Model.*;

public class ConfirmCreateBooking extends javax.swing.JFrame {
    private int posX, posY;
    
    public ConfirmCreateBooking() {
        initComponents();
        setLocationRelativeTo(null);
        BufferedImage iconImage = null;
        try {
            iconImage = ImageIO.read(new File("src/img/iconImage.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Establece la imagen como �cono de la ventana
        if (iconImage != null) {
            setIconImage(iconImage);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DateLabel = new javax.swing.JLabel();
        ConfirmBookingLabel = new javax.swing.JLabel();
        CourtIdLabel = new javax.swing.JLabel();
        DateLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ErrorLabel = new javax.swing.JLabel();
        ErrorLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(335, 300));
        setMinimumSize(new java.awt.Dimension(335, 300));
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
        jPanel1.setMaximumSize(new java.awt.Dimension(335, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(335, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(335, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DateLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        DateLabel.setForeground(new java.awt.Color(255, 255, 255));
        DateLabel.setText("Hour: XX:XX");
        DateLabel.setText("Hour: " + Controller.hour);
        DateLabel.setToolTipText("");
        jPanel1.add(DateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 179, -1, -1));

        ConfirmBookingLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ConfirmBookingLabel.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmBookingLabel.setText("Confirm Booking");
        jPanel1.add(ConfirmBookingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 31, -1, -1));

        CourtIdLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        CourtIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        CourtIdLabel.setText("Court: XX");
        CourtIdLabel.setText("Court: " + Controller.courtId);
        jPanel1.add(CourtIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 88, -1, -1));

        DateLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        DateLabel1.setForeground(new java.awt.Color(255, 255, 255));
        DateLabel1.setText("Date: XX/XX/XXXX");
        DateLabel1.setText("Date: "+ Controller.day);
        jPanel1.add(DateLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 136, -1, -1));

        jButton1.setBackground(new java.awt.Color(2, 166, 118));
        jButton1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Confirm");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        jButton2.setBackground(new java.awt.Color(119, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        ErrorLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ErrorLabel.setForeground(new java.awt.Color(255, 255, 255));
        ErrorLabel.setText("while booking your court");
        ErrorLabel.setVisible(false);
        jPanel1.add(ErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        ErrorLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ErrorLabel1.setForeground(new java.awt.Color(255, 255, 255));
        ErrorLabel1.setText("There was en error");
        ErrorLabel1.setVisible(false);
        jPanel1.add(ErrorLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jButton3.setBackground(new java.awt.Color(119, 0, 0));
        jButton3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Exit");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setVisible(false);
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(BookingController.createBooking(Controller.currentUser.getEmail(), Controller.courtId, Controller.day, Controller.hour) == true){
            UserView.refreshCalendar();
            dispose();
        } else {
            CourtIdLabel.setVisible(false);
            DateLabel.setVisible(false);
            DateLabel1.setVisible(false);
            jButton1.setVisible(false);
            jButton2.setVisible(false);
            ErrorLabel.setVisible(true);
            ErrorLabel1.setVisible(true);
            jButton3.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        posX = evt.getXOnScreen() - getX();
        posY = evt.getYOnScreen() - getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int newX = evt.getXOnScreen() - posX;
        int newY = evt.getYOnScreen() - posY;

        setLocation(newX, newY);
    }//GEN-LAST:event_formMouseDragged
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConfirmBookingLabel;
    private javax.swing.JLabel CourtIdLabel;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JLabel DateLabel1;
    private javax.swing.JLabel ErrorLabel;
    private javax.swing.JLabel ErrorLabel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
