/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Controller.Controller;

/**
 *
 * @author isard
 */
public class AdminSelect extends javax.swing.JFrame {

    /**
     * Creates new form AdminSelect
     */
    private int posX, posY;
    
    public AdminSelect() {
        initComponents();
        LabelCompleteName.setText(Controller.getUserName());
        setLocationRelativeTo(null);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBackground = new javax.swing.JPanel();
        Content = new javax.swing.JPanel();
        BtnReturn = new javax.swing.JButton();
        LabelAdminPanel = new javax.swing.JLabel();
        PanelContent = new javax.swing.JPanel();
        LabelCourts = new javax.swing.JLabel();
        LabelCourtsImage = new javax.swing.JLabel();
        BtnCourts = new javax.swing.JButton();
        LabelUsers = new javax.swing.JLabel();
        LabelUsersImage = new javax.swing.JLabel();
        BtnUsers = new javax.swing.JButton();
        BtnAdd = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        LabelLogo = new javax.swing.JLabel();
        LabelCompleteName = new javax.swing.JLabel();
        LabelTitle = new javax.swing.JLabel();
        BtnClose = new javax.swing.JButton();
        BtnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1192, 582));
        setMinimumSize(new java.awt.Dimension(1192, 582));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1192, 582));

        PanelBackground.setBackground(new java.awt.Color(0, 56, 64));
        PanelBackground.setMaximumSize(new java.awt.Dimension(1192, 582));
        PanelBackground.setMinimumSize(new java.awt.Dimension(1192, 582));
        PanelBackground.setPreferredSize(new java.awt.Dimension(1192, 582));
        PanelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Content.setBackground(new java.awt.Color(0, 56, 64));
        Content.setMaximumSize(new java.awt.Dimension(1198, 482));
        Content.setMinimumSize(new java.awt.Dimension(1198, 482));
        Content.setPreferredSize(new java.awt.Dimension(1198, 482));
        Content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReturn.setBackground(new java.awt.Color(0, 56, 64));
        BtnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/return.png"))); // NOI18N
        BtnReturn.setBorder(null);
        Content.add(BtnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 30, -1, -1));

        LabelAdminPanel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        LabelAdminPanel.setForeground(new java.awt.Color(255, 255, 255));
        LabelAdminPanel.setText("Administrator Panel");
        Content.add(LabelAdminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        PanelContent.setBackground(new java.awt.Color(0, 90, 91));
        PanelContent.setMaximumSize(new java.awt.Dimension(934, 362));
        PanelContent.setMinimumSize(new java.awt.Dimension(934, 362));
        PanelContent.setPreferredSize(new java.awt.Dimension(934, 362));
        PanelContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelCourts.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        LabelCourts.setForeground(new java.awt.Color(255, 255, 255));
        LabelCourts.setText("Courts");
        PanelContent.add(LabelCourts, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 70, -1, -1));

        LabelCourtsImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/courts.png"))); // NOI18N
        PanelContent.add(LabelCourtsImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        BtnCourts.setBackground(new java.awt.Color(0, 115, 105));
        BtnCourts.setBorder(null);
        BtnCourts.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnCourts.setMaximumSize(new java.awt.Dimension(350, 311));
        BtnCourts.setMinimumSize(new java.awt.Dimension(350, 311));
        BtnCourts.setPreferredSize(new java.awt.Dimension(350, 311));
        PanelContent.add(BtnCourts, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 25, -1, -1));

        LabelUsers.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        LabelUsers.setForeground(new java.awt.Color(255, 255, 255));
        LabelUsers.setText("Users");
        PanelContent.add(LabelUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 70, -1, -1));

        LabelUsersImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/users.png"))); // NOI18N
        PanelContent.add(LabelUsersImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 150, -1, -1));

        BtnUsers.setBackground(new java.awt.Color(0, 115, 105));
        BtnUsers.setBorder(null);
        BtnUsers.setMaximumSize(new java.awt.Dimension(350, 311));
        BtnUsers.setMinimumSize(new java.awt.Dimension(350, 311));
        BtnUsers.setPreferredSize(new java.awt.Dimension(350, 311));
        PanelContent.add(BtnUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 25, -1, -1));

        Content.add(PanelContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        BtnAdd.setBackground(new java.awt.Color(0, 56, 64));
        BtnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        BtnAdd.setBorder(null);
        Content.add(BtnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, -1, -1));

        PanelBackground.add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        Header.setBackground(new java.awt.Color(0, 56, 64));
        Header.setMaximumSize(new java.awt.Dimension(1192, 100));
        Header.setMinimumSize(new java.awt.Dimension(1192, 100));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        LabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/headerLogo.png"))); // NOI18N

        LabelCompleteName.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        LabelCompleteName.setForeground(new java.awt.Color(255, 255, 255));
        LabelCompleteName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelCompleteName.setMaximumSize(new java.awt.Dimension(280, 28));
        LabelCompleteName.setMinimumSize(new java.awt.Dimension(280, 28));
        LabelCompleteName.setPreferredSize(new java.awt.Dimension(280, 28));

        LabelTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitle.setText("Booking of Padel Courts");

        BtnClose.setBackground(new java.awt.Color(0, 56, 64));
        BtnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        BtnClose.setBorder(null);
        BtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCloseActionPerformed(evt);
            }
        });

        BtnLogout.setBackground(new java.awt.Color(0, 56, 64));
        BtnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        BtnLogout.setBorder(null);

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1192, Short.MAX_VALUE)
            .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(HeaderLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HeaderLayout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(LabelTitle))
                        .addComponent(LabelLogo))
                    .addGap(401, 401, 401)
                    .addComponent(LabelCompleteName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(23, 23, 23)
                    .addComponent(BtnLogout)
                    .addGap(23, 23, 23)
                    .addComponent(BtnClose)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(HeaderLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LabelLogo)
                        .addGroup(HeaderLayout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LabelTitle)
                                .addComponent(LabelCompleteName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnLogout)
                                .addComponent(BtnClose))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        LabelCompleteName.setText(Controller.currentUser.getName() + Controller.currentUser.getSurname());

        PanelBackground.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void BtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnCloseActionPerformed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int newX = evt.getXOnScreen() - posX;
        int newY = evt.getYOnScreen() - posY;

        setLocation(newX, newY);
    }//GEN-LAST:event_HeaderMouseDragged

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        posX = evt.getXOnScreen() - getX();
        posY = evt.getYOnScreen() - getY();
    }//GEN-LAST:event_HeaderMousePressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnClose;
    private javax.swing.JButton BtnCourts;
    private javax.swing.JButton BtnLogout;
    private javax.swing.JButton BtnReturn;
    private javax.swing.JButton BtnUsers;
    private javax.swing.JPanel Content;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel LabelAdminPanel;
    private javax.swing.JLabel LabelCompleteName;
    private javax.swing.JLabel LabelCourts;
    private javax.swing.JLabel LabelCourtsImage;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JLabel LabelUsers;
    private javax.swing.JLabel LabelUsersImage;
    private javax.swing.JPanel PanelBackground;
    private javax.swing.JPanel PanelContent;
    // End of variables declaration//GEN-END:variables
}
