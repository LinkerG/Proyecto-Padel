package View;

import Controller.*;
import Model.Booking;
import Model.Court;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.util.Calendar;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class UserView extends javax.swing.JFrame {
    private int posX, posY;
    
    String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };
    String[] days = {
            "Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday"
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
        NextMonthBtn = new javax.swing.JButton();
        MonthLabel = new javax.swing.JLabel();
        PrevMonthBtn = new javax.swing.JButton();
        BookingsContainer = new javax.swing.JPanel();
        BookingsPanel = new javax.swing.JPanel();
        BookingCourtsScrollPanel = new javax.swing.JScrollPane();
        BookingCourtsPanel = new javax.swing.JPanel();
        WeekdayLabel = new javax.swing.JLabel();
        MonthDayLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        influxLabel = new javax.swing.JLabel();
        DefaultPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        CalendarPanel.add(BookingCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 340, 230));

        NextMonthBtn.setBackground(new java.awt.Color(0, 90, 91));
        NextMonthBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NextMonthBtn.setForeground(new java.awt.Color(255, 255, 255));
        NextMonthBtn.setText(">");
        NextMonthBtn.setBorder(null);
        NextMonthBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextMonthBtnActionPerformed(evt);
            }
        });
        CalendarPanel.add(NextMonthBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 35, -1, -1));

        MonthLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MonthLabel.setForeground(new java.awt.Color(255, 255, 255));
        MonthLabel.setText("February, 2023");
        MonthLabel.setText(months[month] + ", " + year);
        CalendarPanel.add(MonthLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 35, -1, -1));

        PrevMonthBtn.setBackground(new java.awt.Color(0, 90, 91));
        PrevMonthBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PrevMonthBtn.setForeground(new java.awt.Color(255, 255, 255));
        PrevMonthBtn.setText("<");
        PrevMonthBtn.setBorder(null);
        PrevMonthBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevMonthBtnActionPerformed(evt);
            }
        });
        CalendarPanel.add(PrevMonthBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 35, -1, -1));

        Main.add(CalendarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 360));

        BookingsContainer.setBackground(new java.awt.Color(0, 115, 105));
        BookingsContainer.setForeground(new java.awt.Color(255, 255, 255));
        BookingsContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BookingsPanel.setBackground(new java.awt.Color(0, 115, 105));
        BookingsPanel.setForeground(new java.awt.Color(255, 255, 255));
        BookingsPanel.setVisible(false);
        BookingsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BookingCourtsScrollPanel.setBorder(null);
        BookingCourtsScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        BookingCourtsScrollPanel.setMaximumSize(new java.awt.Dimension(250, 250));
        BookingCourtsScrollPanel.setMinimumSize(new java.awt.Dimension(250, 250));
        BookingCourtsScrollPanel.setPreferredSize(new java.awt.Dimension(250, 250));

        BookingCourtsPanel.setBackground(new java.awt.Color(0, 140, 129));
        BookingCourtsPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        BookingCourtsPanel.setForeground(new java.awt.Color(255, 255, 255));
        BookingCourtsPanel.setToolTipText("");
        BookingCourtsPanel.setMaximumSize(new java.awt.Dimension(250, 250));
        BookingCourtsPanel.setMinimumSize(new java.awt.Dimension(250, 250));
        BookingCourtsPanel.setPreferredSize(new java.awt.Dimension(250, 250));
        BookingCourtsPanel.setLayout(new java.awt.GridLayout(0, 2, 10, 10));
        BookingCourtsScrollPanel.setViewportView(BookingCourtsPanel);

        BookingsPanel.add(BookingCourtsScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 22, 250, 250));

        WeekdayLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        WeekdayLabel.setForeground(new java.awt.Color(255, 255, 255));
        WeekdayLabel.setText("Weekday");
        BookingsPanel.add(WeekdayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        MonthDayLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        MonthDayLabel.setForeground(new java.awt.Color(255, 255, 255));
        MonthDayLabel.setText("February 10");
        BookingsPanel.add(MonthDayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(0, 115, 105));
        jComboBox1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XX:XX - XX:XX", "8:00 - 9:30", "9:30 - 11:00", "11:00 - 12:30", "12:30 - 14:00", "15:00 - 16:30", "16:30 - 18:00", "18:00 - 20:30", "20:30 - 22:00", " " }));
        jComboBox1.setBorder(null);
        BookingsPanel.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, -1));

        influxLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        influxLabel.setForeground(new java.awt.Color(255, 255, 255));
        influxLabel.setText("0% inf");
        BookingsPanel.add(influxLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        BookingsContainer.add(BookingsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 290));

        DefaultPanel.setBackground(new java.awt.Color(0, 115, 105));
        DefaultPanel.setForeground(new java.awt.Color(255, 255, 255));
        DefaultPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconImage.png"))); // NOI18N
        DefaultPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 160, 130));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select a date to manage your bookings");
        DefaultPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        BookingsContainer.add(DefaultPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 290));

        Main.add(BookingsContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 35, 450, 290));

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
        ButtonActions.logOut(false);
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
    
    
    int loop = 0;
    int lastDay = -1;
    private void BookingCalendarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_BookingCalendarPropertyChange
        loop++;
        if(loop>2){
            int selectedDay = BookingCalendar.getDay();
            JPanel dayPanel = BookingCalendar.getDayPanel();
            Component component[] = dayPanel.getComponents();
            if(lastDay!=-1){
                component[lastDay].setBackground(new java.awt.Color(0,115,105));
            }
            System.out.println(selectedDay + "/" + (month+1) + "/" + year);
            Calendar startDay = new GregorianCalendar(year, month, 1);
            int dayValue = (startDay.get(Calendar.DAY_OF_WEEK) + 5) % 7;
            lastDay = (selectedDay+dayValue+6);
            component[selectedDay+dayValue+6].setBackground(new java.awt.Color(0,115,105));
            
            openBookings(selectedDay, month, year);
        }        
    }//GEN-LAST:event_BookingCalendarPropertyChange

    private void NextMonthBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextMonthBtnActionPerformed
        if(month < 11) month+=1;
        else {
            month=0;
            year +=1;
        }
        MonthLabel.setText(months[month] + ", " + year);
        BookingCalendar.setMonth(month);
        BookingCalendar.setYear(year);
        JPanel day = BookingCalendar.getDayPanel();
        refreshCalendar(day);
    }//GEN-LAST:event_NextMonthBtnActionPerformed

    private void PrevMonthBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevMonthBtnActionPerformed
        if(month > 0) month-=1;
        else {
            month = 11;
            year -=1;
        }
        MonthLabel.setText(months[month] + ", " + year);
        BookingCalendar.setMonth(month);
        BookingCalendar.setYear(year);
        JPanel day = BookingCalendar.getDayPanel();
        refreshCalendar(day);
    }//GEN-LAST:event_PrevMonthBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDayChooser BookingCalendar;
    private javax.swing.JPanel BookingCourtsPanel;
    private javax.swing.JScrollPane BookingCourtsScrollPanel;
    private javax.swing.JPanel BookingsContainer;
    private javax.swing.JPanel BookingsPanel;
    private javax.swing.JButton BtnClose;
    private javax.swing.JButton BtnLogout;
    private javax.swing.JPanel CalendarPanel;
    public javax.swing.JPanel Content;
    private javax.swing.JPanel DefaultPanel;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel LabelCompleteName;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JLabel LabelUserPanel;
    public javax.swing.JPanel Main;
    private javax.swing.JLabel MonthDayLabel;
    private javax.swing.JLabel MonthLabel;
    private javax.swing.JButton NextMonthBtn;
    public javax.swing.JPanel PanelBackground;
    private javax.swing.JButton PrevMonthBtn;
    private javax.swing.JLabel WeekdayLabel;
    private javax.swing.JLabel influxLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
    
    // functions
    private void refreshCalendar(JPanel dayPanel){
        Component component[] = dayPanel.getComponents();
        Calendar startDay = new GregorianCalendar(year, month, 1);
        int dayValue = (startDay.get(Calendar.DAY_OF_WEEK) + 5) % 7;
        
        ArrayList<Booking> bookingList = Booking.getBookingsByMonth(String.valueOf(month+1));
        for(Booking booking : bookingList){
            String date = booking.getDay();
            String[] dateArr = date.split("-");
            System.out.println(date);
            int day = Integer.valueOf(dateArr[2]);
            if(booking.getUserEmail().equals(Controller.currentUser.getEmail())){
                // BOOKING IS FROM USER
                component[day + dayValue + 6].setBackground(new java.awt.Color(0,0,255));
            } else {
                // BOOKING IS FROM OTHER USER
                component[day + dayValue + 6].setBackground(new java.awt.Color(255,0,0));
                System.out.println(day);
            }
        }
        
        for (int i = 7; i < 49; i++) {
            component[i].setBackground(new java.awt.Color(0,115,105));
        }
    }
    
    private void openBookings(int _day, int _month, int _year){
        Calendar weekday = new GregorianCalendar(_year, _month, _day);
        int dayValue = (weekday.get(Calendar.DAY_OF_WEEK) - 2);
        if(dayValue == -1) {
            dayValue = 6;
        }
        
        WeekdayLabel.setText(days[dayValue]);
        MonthDayLabel.setText(months[_month] + " " + _day);
        
        String day = _year + "/" + (_month+1) + "/" + _day;
        int influx = Controller.getInflux(day);
        influxLabel.setText(influx + " % Influx");
        
        ArrayList<Court> courtList = Court.getCourts(true);
        generateCourtButtons(courtList, day);
        
        DefaultPanel.setVisible(false);
        BookingsPanel.setVisible(true);
    }

    private void generateCourtButtons(ArrayList<Court> courtList, String _date) {
        ArrayList<Booking> bookingList = Booking.getBookingsByDay(_date);
        BookingCourtsPanel.removeAll();
        for (Court court : courtList) {
            CourtPanel courtPanel = new CourtPanel(court, bookingList);
            BookingCourtsPanel.add(courtPanel);
        }
    }
}
