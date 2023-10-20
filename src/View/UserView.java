package View;
import Controller.*;
import Model.*;
import com.toedter.calendar.JDayChooser;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.util.Calendar;
import java.awt.Component;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.Set;
import javax.swing.border.*;


public class UserView extends javax.swing.JFrame {
    private int posX, posY;
    
    String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };
    Calendar calendar = Calendar.getInstance();
    private int month = calendar.get(Calendar.MONTH);
    private int year = calendar.get(Calendar.YEAR);
    
    public UserView() {
        initComponents();
        BufferedImage toolBarImg = null;
        try {
            toolBarImg = ImageIO.read(new File("src/img/iconImage.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Establece la imagen como ícono de la ventana
        if (toolBarImg != null) {
            setIconImage(toolBarImg);
        }
        LabelCompleteName.setText(Controller.getUserName());
        setLocationRelativeTo(null); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBackground = new javax.swing.JPanel();
        Content = new javax.swing.JPanel();
        LabelUserPanel = new javax.swing.JLabel();
        Main = new javax.swing.JPanel();
        CalendarPanel = new javax.swing.JPanel();
        BookingCalendar = new com.toedter.calendar.JDayChooser();
        MonthChooser = new javax.swing.JPanel();
        MonthLabel = new javax.swing.JLabel();
        PrevMonthBtn = new javax.swing.JButton();
        NextMonthBtn = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        LabelLogo = new javax.swing.JLabel();
        LabelCompleteName = new javax.swing.JLabel();
        LabelTitle = new javax.swing.JLabel();
        BtnClose = new javax.swing.JButton();
        BtnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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

        LabelUserPanel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        LabelUserPanel.setForeground(new java.awt.Color(255, 255, 255));
        LabelUserPanel.setText("Select a date and start booking");
        Content.add(LabelUserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        Main.setBackground(new java.awt.Color(0, 90, 91));
        Main.setMaximumSize(new java.awt.Dimension(934, 362));
        Main.setMinimumSize(new java.awt.Dimension(934, 362));
        Main.setPreferredSize(new java.awt.Dimension(934, 362));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CalendarPanel.setBackground(new java.awt.Color(0, 90, 91));
        CalendarPanel.setMaximumSize(new java.awt.Dimension(300, 300));
        CalendarPanel.setMinimumSize(new java.awt.Dimension(300, 300));
        CalendarPanel.setPreferredSize(new java.awt.Dimension(300, 300));
        CalendarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BookingCalendar.setBackground(new java.awt.Color(0, 90, 91));
        BookingCalendar.setAlwaysFireDayProperty(false);
        BookingCalendar.setDayBordersVisible(false);
        BookingCalendar.setDecorationBackgroundColor(new java.awt.Color(0, 90, 91));
        BookingCalendar.setOpaque(false);
        BookingCalendar.setSundayForeground(new java.awt.Color(255, 255, 255));
        BookingCalendar.setWeekdayForeground(new java.awt.Color(255, 255, 255));
        javax.swing.JPanel day = BookingCalendar.getDayPanel();
        day.setBackground(new java.awt.Color(0,90,91));
        refreshCalendar(day);
        BookingCalendar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                BookingCalendarPropertyChange(evt);
            }
        });
        CalendarPanel.add(BookingCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 370, 260));

        MonthChooser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MonthLabel.setText("month");
        MonthLabel.setText(months[month]);
        MonthChooser.add(MonthLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 12, -1, -1));

        PrevMonthBtn.setText("<");
        PrevMonthBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevMonthBtnActionPerformed(evt);
            }
        });
        MonthChooser.add(PrevMonthBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        NextMonthBtn.setText(">");
        NextMonthBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextMonthBtnActionPerformed(evt);
            }
        });
        MonthChooser.add(NextMonthBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        CalendarPanel.add(MonthChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 190, 40));

        Main.add(CalendarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 360));

        Content.add(Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

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
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/headerLogo.png"))); // NOI18N
        Header.add(LabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        LabelCompleteName.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        LabelCompleteName.setForeground(new java.awt.Color(255, 255, 255));
        LabelCompleteName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelCompleteName.setText("xx");
        LabelCompleteName.setMaximumSize(new java.awt.Dimension(280, 28));
        LabelCompleteName.setMinimumSize(new java.awt.Dimension(280, 28));
        LabelCompleteName.setPreferredSize(new java.awt.Dimension(280, 28));
        Header.add(LabelCompleteName, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 36, -1, -1));
        LabelCompleteName.setText(Controller.currentUser.getName() + Controller.currentUser.getSurnames());

        LabelTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitle.setText("Booking of Padel Courts");
        Header.add(LabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 36, -1, -1));

        BtnClose.setBackground(new java.awt.Color(0, 56, 64));
        BtnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        BtnClose.setBorder(null);
        BtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCloseActionPerformed(evt);
            }
        });
        Header.add(BtnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 36, -1, -1));

        BtnLogout.setBackground(new java.awt.Color(0, 56, 64));
        BtnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        BtnLogout.setBorder(null);
        BtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogoutActionPerformed(evt);
            }
        });
        Header.add(BtnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1075, 36, -1, -1));

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

    private void BtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogoutActionPerformed
        ButtonActions.logOut(true);
    }//GEN-LAST:event_BtnLogoutActionPerformed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int newX = evt.getXOnScreen() - posX;
        int newY = evt.getYOnScreen() - posY;

        setLocation(newX, newY);
    }//GEN-LAST:event_HeaderMouseDragged

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        posX = evt.getXOnScreen() - getX();
        posY = evt.getYOnScreen() - getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void PrevMonthBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevMonthBtnActionPerformed
        if(month > 0) month-=1;
        else {
            month = 11;
            year -=1;
        }
        MonthLabel.setText(months[month]);
        BookingCalendar.setMonth(month);
        BookingCalendar.setYear(year);
        JPanel day = BookingCalendar.getDayPanel();
        refreshCalendar(day);
    }//GEN-LAST:event_PrevMonthBtnActionPerformed

    private void NextMonthBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextMonthBtnActionPerformed
        if(month < 11) month+=1;
        else {
            month=0;
            year +=1;
        }
        MonthLabel.setText(months[month]);
        BookingCalendar.setMonth(month);
        BookingCalendar.setYear(year);
        JPanel day = BookingCalendar.getDayPanel();
        refreshCalendar(day);
    }//GEN-LAST:event_NextMonthBtnActionPerformed
    
    int loop = 0;
    int lastDay = -1;
    private void BookingCalendarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_BookingCalendarPropertyChange
        loop++;
        if(loop>2){
            int diaSeleccionado = BookingCalendar.getDay();
            JPanel dayPanel = BookingCalendar.getDayPanel();
            Component component[] = dayPanel.getComponents();
            if(lastDay!=-1){
                component[lastDay].setBackground(new java.awt.Color(0,115,105));
            }
            //System.out.println(component[diaSeleccionado].());
            System.out.println(diaSeleccionado + "/" + (month+1) + "/" + year);
            Calendar diaInici = new GregorianCalendar(year, month, 1);
            int valorDia = (diaInici.get(Calendar.DAY_OF_WEEK) + 5) % 7;
            System.out.println(valorDia);
            lastDay = (diaSeleccionado+valorDia+6);
            component[diaSeleccionado+valorDia+6].setBackground(new java.awt.Color(0,115,105));
            // Esto fufa
            //component[1+valorDia+6].setBackground(new java.awt.Color(255,0,0));
        }        
    }//GEN-LAST:event_BookingCalendarPropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDayChooser BookingCalendar;
    private javax.swing.JButton BtnClose;
    private javax.swing.JButton BtnLogout;
    private javax.swing.JPanel CalendarPanel;
    public javax.swing.JPanel Content;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel LabelCompleteName;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JLabel LabelUserPanel;
    public javax.swing.JPanel Main;
    private javax.swing.JPanel MonthChooser;
    private javax.swing.JLabel MonthLabel;
    private javax.swing.JButton NextMonthBtn;
    public javax.swing.JPanel PanelBackground;
    private javax.swing.JButton PrevMonthBtn;
    // End of variables declaration//GEN-END:variables
    private void refreshCalendar(JPanel dayPanel){
        Component component[] = dayPanel.getComponents();
        for (int i = 7; i < 49; i++) {
            component[i].setBackground(new java.awt.Color(0,115,105));
        }
    }
}
