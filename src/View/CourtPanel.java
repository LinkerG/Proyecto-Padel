package View;

import Model.Court;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JLabel;

public class CourtPanel extends javax.swing.JPanel {

    public CourtPanel(Court court) {
        // Agrega un MouseListener al JPanel
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // Llama a la funci�n que desees cuando se hace clic en el JPanel
                Court.getSelectedCourt(court);
                AdminView.Courts.setVisible(false);
                AdminView.CourtInfo.setVisible(true);
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
    
    public CourtPanel(Court court, Boolean user) {
        // Agrega un MouseListener al JPanel
        /*addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // Llama a la funci�n que desees cuando se hace clic en el JPanel
                Court.getSelectedCourt(court);
                AdminView.Courts.setVisible(false);
                AdminView.CourtInfo.setVisible(true);
            }
        });*/
            this.setBackground(new java.awt.Color(0, 115, 105));
            this.setMaximumSize(new java.awt.Dimension(50, 70));
            this.setMinimumSize(new java.awt.Dimension(50, 70));
            this.setPreferredSize(new java.awt.Dimension(50, 70));
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