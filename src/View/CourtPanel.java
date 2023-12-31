package View;

import Model.Booking;
import Model.Court;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JLabel;
import Controller.*;
import Model.BookingStatus;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class CourtPanel extends javax.swing.JPanel {

    public CourtPanel(Court court) {
        // Agrega un MouseListener al JPanel
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // Llama a la funci�n que desees cuando se hace clic en el JPanel
                Court.getSelectedCourt(court);
                AdminView.Courts.setVisible(false);
                AdminView.CourtBookingsDefault.setVisible(true);
                AdminView.CourtBookings.setVisible(false);
                AdminView.CourtInfo.setVisible(true);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {                                            
                CourtPanel.this.setBackground(new java.awt.Color(0,140,129));
            }                                           

            public void mouseExited(java.awt.event.MouseEvent evt) {                                           
                CourtPanel.this.setBackground(new java.awt.Color(0,115,105));
            }   
        });
            this.setBackground(new java.awt.Color(0, 115, 105));
            this.setMaximumSize(new java.awt.Dimension(134, 152));
            this.setMinimumSize(new java.awt.Dimension(134, 152));
            this.setPreferredSize(new java.awt.Dimension(134, 152));
            //this.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            // Add image
            JLabel LabelCourtImage = new javax.swing.JLabel();
            LabelCourtImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/court.png"))); // NOI18N
            this.add(LabelCourtImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
            // Add ID
            JLabel LabelCourtName = new javax.swing.JLabel();
            LabelCourtName.setText("Court " + court.getID());
            LabelCourtName.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
            LabelCourtName.getText();

            LabelCourtName.setForeground(new java.awt.Color(255, 255, 255));

            this.add(LabelCourtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 12, -1, -1));
            // Add State
            String active = "";
            if(court.isIsActive()) {
                active = "Active";
            } else {
                active = "In maintenance";
            }
            JLabel courtState = new javax.swing.JLabel(active);
            this.add(courtState);
    }
    
    public CourtPanel(Court court, ArrayList<Booking> bookingListByDay, String hour, String day) {
            this.setBackground(new java.awt.Color(0, 115, 105));
            this.setMaximumSize(new java.awt.Dimension(50, 70));
            this.setMinimumSize(new java.awt.Dimension(50, 70));
            this.setPreferredSize(new java.awt.Dimension(50, 70));
            
            // Add ID
            JLabel LabelCourtName = new javax.swing.JLabel();
            LabelCourtName.setText("Court " + court.getID());
            LabelCourtName.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
            LabelCourtName.getText();

            LabelCourtName.setForeground(new java.awt.Color(255, 255, 255));
            LabelCourtName.setHorizontalAlignment(SwingConstants.CENTER);
            LabelCourtName.setVerticalAlignment(SwingConstants.CENTER);
            this.add(LabelCourtName);
            
            // Add image
            JLabel LabelCourtImage = new javax.swing.JLabel();
            Boolean isFromUser = false, isFull = false;
            Booking[] bookingHolder = { new Booking() };
            for(Booking booking : bookingListByDay){
                if(booking.getHour().getTimeString().equals(hour)) {
                    if(court.getID() == booking.getCourtId() && booking.getUserEmail().equals(Controller.currentUser.getEmail())) {
                        if (booking.getStatus() != BookingStatus.CANCELLED){
                            isFromUser = true;
                            bookingHolder[0] = booking;
                        }
                    } else if(court.getID() == booking.getCourtId()) {
                        isFull = true;
                    }
                }
            }
            addMouseListener(new MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {                                            
                    CourtPanel.this.setBackground(new java.awt.Color(0,88,81));
                }                                           

                public void mouseExited(java.awt.event.MouseEvent evt) {                                           
                    CourtPanel.this.setBackground(new java.awt.Color(0,115,105));
                }  
            });
            
            String imageRoute = "";
            String courtText = "";
            if(isFromUser) {
                imageRoute = "/img/cancelBooking.png";
                courtText = "Cancel";
                addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        javax.swing.JFrame confirm = new ConfirmDeleteBooking(bookingHolder[0]);
                        confirm.setVisible(true);
                        System.out.println("Intenta cancelar");
                    }
                    
                });
            }
            else if(isFull) {
                imageRoute = "/img/bookingNotAvailable.png";
                courtText = "Booked";
                addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        // Llama a la funci�n que desees cuando se hace clic en el JPanel
                        System.out.println("Error ya reservado");
                    }
                });
            }
            else {
                imageRoute = "/img/bookingAvailable.png";
                courtText = "Book";
                addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        if(Controller.isOnDate(day)) {
                            Controller.createBookingReference(court.getID(), day, hour);
                            javax.swing.JFrame confirm = new ConfirmCreateBooking();
                            confirm.setVisible(true);
                        } else {
                            javax.swing.JFrame error = new ErrorPopUp();
                            error.setVisible(true);
                        }
                    }
                });
            }
            
            LabelCourtImage.setIcon(new javax.swing.ImageIcon(getClass().getResource(imageRoute))); // NOI18N
            LabelCourtImage.setHorizontalAlignment(SwingConstants.CENTER);
            LabelCourtImage.setVerticalAlignment(SwingConstants.CENTER);
            this.add(LabelCourtImage);
            
            // Add State
            
            JLabel courtState = new javax.swing.JLabel(courtText);
            courtState.setHorizontalAlignment(SwingConstants.CENTER);
            courtState.setVerticalAlignment(SwingConstants.CENTER);
            courtState.setForeground(Color.white);
            this.add(courtState);
            
            setLayout(new GridLayout(3, 1));
    }
}
/*   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}*/
