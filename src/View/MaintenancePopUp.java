package View;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import Controller.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class MaintenancePopUp extends javax.swing.JFrame {
    private String startDay="", endDay = "", startHour = "", endHour = "";
    private int posX, posY;

    public MaintenancePopUp() {
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
        CourtIdLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        EndDateChooser = new com.toedter.calendar.JDateChooser();
        EndDateLabel = new javax.swing.JLabel();
        StartDateLabel = new javax.swing.JLabel();
        StartDateChooser = new com.toedter.calendar.JDateChooser();
        EndHourChooser = new javax.swing.JComboBox<>();
        StartHourChooser = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        ConfirmBookingLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ConfirmBookingLabel.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmBookingLabel.setText("Select maintenance date");
        jPanel1.add(ConfirmBookingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        CourtIdLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        CourtIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        CourtIdLabel.setText("Court: XX");
        CourtIdLabel.setText("Court: " + Controller.courtId);
        jPanel1.add(CourtIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        EndDateChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                EndDateChooserPropertyChange(evt);
            }
        });
        jPanel1.add(EndDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 120, -1));

        EndDateLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        EndDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        EndDateLabel.setText("End date and hour:");
        jPanel1.add(EndDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        StartDateLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        StartDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        StartDateLabel.setText("Start date and hour:");
        jPanel1.add(StartDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        StartDateChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                StartDateChooserPropertyChange(evt);
            }
        });
        jPanel1.add(StartDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 120, -1));

        EndHourChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XX:XX - XX:XX", "8:00 - 9:30", "9:30 - 11:00", "11:00 - 12:30", "12:30 - 14:00", "15:00 - 16:30", "16:30 - 18:00", "18:00 - 19:30", "19:30 - 21:00" }));
        EndHourChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndHourChooserActionPerformed(evt);
            }
        });
        jPanel1.add(EndHourChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        StartHourChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XX:XX - XX:XX", "8:00 - 9:30", "9:30 - 11:00", "11:00 - 12:30", "12:30 - 14:00", "15:00 - 16:30", "16:30 - 18:00", "18:00 - 19:30", "19:30 - 21:00" }));
        StartHourChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartHourChooserActionPerformed(evt);
            }
        });
        jPanel1.add(StartHourChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

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

        if(startDay.equals("") || endDay.equals("")){
            javax.swing.JFrame error = new ErrorPopUpMaintenance("Select both dates");
            error.setVisible(true);
        } else{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
            LocalDate startDate = LocalDate.parse(startDay, formatter);
            LocalDate endDate = LocalDate.parse(endDay, formatter);
            LocalDate today = LocalDate.now();
            
            if (startDate.isBefore(today)){
                javax.swing.JFrame error = new ErrorPopUpMaintenance("Start date cant be in past");
                error.setVisible(true);
            }
            else if(startDate.isAfter(endDate)){
                javax.swing.JFrame error = new ErrorPopUpMaintenance("Start date cant be after end date");
                error.setVisible(true);
            } else if(endDate.isBefore(startDate)){
                javax.swing.JFrame error = new ErrorPopUpMaintenance("End date cant be before end date");
                error.setVisible(true);
            } else if(startDate.equals(endDate)){
                javax.swing.JFrame error = new ErrorPopUpMaintenance("Both dates must be different");
                error.setVisible(true);
            } else if (startHour.equals("") || endHour.equals("")) {
                javax.swing.JFrame error = new ErrorPopUpMaintenance("Select both hours");
                error.setVisible(true);
            } else {
                javax.swing.JFrame confirm = new ConfirmMaintenance(Controller.courtId, startDay, startHour, endDay, endHour);
                confirm.setVisible(true);
                dispose();
            }
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EndHourChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndHourChooserActionPerformed
        endHour = switch (EndHourChooser.getSelectedIndex()) {
                    case 0 -> "";
                    case 1 -> "08:00";
                    case 2 -> "09:30";
                    case 3 -> "11:00";
                    case 4 -> "12:30";
                    case 5 -> "15:00";
                    case 6 -> "16:30";
                    case 7 -> "18:00";
                    case 8 -> "19:30";
                    default -> "";
                };        
    }//GEN-LAST:event_EndHourChooserActionPerformed

    private void StartHourChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartHourChooserActionPerformed
        startHour = switch (StartHourChooser.getSelectedIndex()) {
            case 0 -> "";
            case 1 -> "08:00";
            case 2 -> "09:30";
            case 3 -> "11:00";
            case 4 -> "12:30";
            case 5 -> "15:00";
            case 6 -> "16:30";
            case 7 -> "18:00";
            case 8 -> "19:30";
            default -> "";
        };
    }//GEN-LAST:event_StartHourChooserActionPerformed
int a = 0;
    private void StartDateChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_StartDateChooserPropertyChange
        if(a>1){
            Date selectedDate = StartDateChooser.getDate();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(selectedDate);
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            int month = calendar.get(Calendar.MONTH) + 1;
            int year = calendar.get(Calendar.YEAR);
            
            startDay = String.valueOf(year)+"-"+String.valueOf(month)+"-"+String.valueOf(day);
        } else {
            a++;
        }
    }//GEN-LAST:event_StartDateChooserPropertyChange
int b = 0;
    private void EndDateChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_EndDateChooserPropertyChange
        if(b>1){
            Date selectedDate = EndDateChooser.getDate();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(selectedDate);
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            int month = calendar.get(Calendar.MONTH) + 1;
            int year = calendar.get(Calendar.YEAR);
            
            endDay = String.valueOf(year)+"-"+String.valueOf(month)+"-"+String.valueOf(day);
        } else {
            b++;
        }
    }//GEN-LAST:event_EndDateChooserPropertyChange

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
    private javax.swing.JLabel ConfirmBookingLabel;
    private javax.swing.JLabel CourtIdLabel;
    private com.toedter.calendar.JDateChooser EndDateChooser;
    private javax.swing.JLabel EndDateLabel;
    private javax.swing.JComboBox<String> EndHourChooser;
    private com.toedter.calendar.JDateChooser StartDateChooser;
    private javax.swing.JLabel StartDateLabel;
    private javax.swing.JComboBox<String> StartHourChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
