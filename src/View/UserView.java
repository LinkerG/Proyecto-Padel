package View;

import Controller.*;
import Model.Booking;
import Model.BookingStatus;
import Model.Court;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.util.Calendar;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class UserView extends javax.swing.JFrame {
    private int posX, posY;
    private String selectedDate;
    public static ArrayList<Booking> bookingListMonth;
    
    String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };
    String[] days = {
            "Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday"
        };
    
    public static Calendar calendar = Calendar.getInstance();
    public static int month = calendar.get(Calendar.MONTH);
    public static int year = calendar.get(Calendar.YEAR);
    
    public UserView() {
        initComponents();
        BufferedImage toolBarImg = null;
        try {
            toolBarImg = ImageIO.read(new File("src/img/iconImage.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Establece la imagen como �cono de la ventana
        if (toolBarImg != null) {
            setIconImage(toolBarImg);
        }
        LabelCompleteName.setText(Controller.getUserName());
        setLocationRelativeTo(null);
        TodayDateLabel.setText("");
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        TodayDateLabel.setText(formatter.format(new Date()));

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
        LegendBlue = new javax.swing.JPanel();
        LegendBlueLabel = new javax.swing.JLabel();
        LegendYellowLabel = new javax.swing.JLabel();
        LegendYellow = new javax.swing.JPanel();
        TodayDateIcon = new javax.swing.JLabel();
        LegendRed = new javax.swing.JPanel();
        LegendRedLabel1 = new javax.swing.JLabel();
        TodayDateLabel = new javax.swing.JLabel();
        BookingsContainer = new javax.swing.JPanel();
        BookingsPanel = new javax.swing.JPanel();
        ChooseHourPanel = new javax.swing.JPanel();
        HourPanelIcon = new javax.swing.JLabel();
        HourPanelLabel = new javax.swing.JLabel();
        BookingCourtsScrollPanel = new javax.swing.JScrollPane();
        BookingCourtsPanel = new javax.swing.JPanel();
        WeekdayLabel = new javax.swing.JLabel();
        MonthDayLabel = new javax.swing.JLabel();
        HourChooser = new javax.swing.JComboBox<>();
        influxLabel = new javax.swing.JLabel();
        HourIcon = new javax.swing.JLabel();
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
        BookingCalendar.setForeground(new java.awt.Color(255, 255, 255));
        BookingCalendar.setAlwaysFireDayProperty(false);
        BookingCalendar.setDayBordersVisible(false);
        BookingCalendar.setDecorationBackgroundColor(new java.awt.Color(0, 90, 91));
        BookingCalendar.setOpaque(false);
        BookingCalendar.setSundayForeground(new java.awt.Color(255, 255, 255));
        BookingCalendar.setWeekdayForeground(new java.awt.Color(255, 255, 255));
        javax.swing.JPanel day = BookingCalendar.getDayPanel();
        day.setBackground(new java.awt.Color(0,90,91));
        refreshCalendar();
        BookingCalendar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                BookingCalendarPropertyChange(evt);
            }
        });
        CalendarPanel.add(BookingCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 340, 250));

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

        LegendBlue.setBackground(new java.awt.Color(0, 155, 189));
        LegendBlue.setMaximumSize(new java.awt.Dimension(16, 16));
        LegendBlue.setMinimumSize(new java.awt.Dimension(16, 16));
        LegendBlue.setRequestFocusEnabled(false);

        javax.swing.GroupLayout LegendBlueLayout = new javax.swing.GroupLayout(LegendBlue);
        LegendBlue.setLayout(LegendBlueLayout);
        LegendBlueLayout.setHorizontalGroup(
            LegendBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        LegendBlueLayout.setVerticalGroup(
            LegendBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        CalendarPanel.add(LegendBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 16, 16));

        LegendBlueLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LegendBlueLabel.setForeground(new java.awt.Color(255, 255, 255));
        LegendBlueLabel.setText("Your Bookings");
        CalendarPanel.add(LegendBlueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 332, -1, -1));

        LegendYellowLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LegendYellowLabel.setForeground(new java.awt.Color(255, 255, 255));
        LegendYellowLabel.setText("50% Booked");
        CalendarPanel.add(LegendYellowLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 332, -1, -1));

        LegendYellow.setBackground(new java.awt.Color(255, 211, 72));
        LegendYellow.setMaximumSize(new java.awt.Dimension(16, 16));
        LegendYellow.setMinimumSize(new java.awt.Dimension(16, 16));
        LegendYellow.setRequestFocusEnabled(false);

        javax.swing.GroupLayout LegendYellowLayout = new javax.swing.GroupLayout(LegendYellow);
        LegendYellow.setLayout(LegendYellowLayout);
        LegendYellowLayout.setHorizontalGroup(
            LegendYellowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        LegendYellowLayout.setVerticalGroup(
            LegendYellowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        CalendarPanel.add(LegendYellow, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 16, 16));

        TodayDateIcon.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TodayDateIcon.setForeground(new java.awt.Color(255, 255, 255));
        TodayDateIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        CalendarPanel.add(TodayDateIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 35, -1, -1));

        LegendRed.setBackground(new java.awt.Color(119, 0, 0));
        LegendRed.setMaximumSize(new java.awt.Dimension(16, 16));
        LegendRed.setMinimumSize(new java.awt.Dimension(16, 16));
        LegendRed.setRequestFocusEnabled(false);

        javax.swing.GroupLayout LegendRedLayout = new javax.swing.GroupLayout(LegendRed);
        LegendRed.setLayout(LegendRedLayout);
        LegendRedLayout.setHorizontalGroup(
            LegendRedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        LegendRedLayout.setVerticalGroup(
            LegendRedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        CalendarPanel.add(LegendRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 16, 16));

        LegendRedLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LegendRedLabel1.setForeground(new java.awt.Color(255, 255, 255));
        LegendRedLabel1.setText("Can't Book");
        CalendarPanel.add(LegendRedLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 332, -1, -1));

        TodayDateLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TodayDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        TodayDateLabel.setText("XX/XX/XXXX");
        CalendarPanel.add(TodayDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 36, -1, -1));

        Main.add(CalendarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 360));

        BookingsContainer.setBackground(new java.awt.Color(0, 115, 105));
        BookingsContainer.setForeground(new java.awt.Color(255, 255, 255));
        BookingsContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BookingsPanel.setBackground(new java.awt.Color(0, 115, 105));
        BookingsPanel.setForeground(new java.awt.Color(255, 255, 255));
        BookingsPanel.setVisible(false);
        BookingsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ChooseHourPanel.setBackground(new java.awt.Color(0, 140, 129));
        ChooseHourPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        ChooseHourPanel.setForeground(new java.awt.Color(255, 255, 255));
        ChooseHourPanel.setToolTipText("");
        ChooseHourPanel.setMaximumSize(new java.awt.Dimension(250, 250));
        ChooseHourPanel.setMinimumSize(new java.awt.Dimension(250, 250));
        ChooseHourPanel.setPreferredSize(new java.awt.Dimension(250, 250));
        ChooseHourPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HourPanelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HourPanelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconImage.png"))); // NOI18N
        ChooseHourPanel.add(HourPanelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 160, 130));

        HourPanelLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        HourPanelLabel.setForeground(new java.awt.Color(255, 255, 255));
        HourPanelLabel.setText("Select an hour");
        ChooseHourPanel.add(HourPanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        BookingsPanel.add(ChooseHourPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 22, -1, -1));

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
        BookingCourtsPanel.setVisible(false);

        BookingsPanel.add(BookingCourtsScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 22, 250, 250));

        WeekdayLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        WeekdayLabel.setForeground(new java.awt.Color(255, 255, 255));
        WeekdayLabel.setText("Weekday");
        BookingsPanel.add(WeekdayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        MonthDayLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        MonthDayLabel.setForeground(new java.awt.Color(255, 255, 255));
        MonthDayLabel.setText("February 10");
        BookingsPanel.add(MonthDayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        HourChooser.setBackground(new java.awt.Color(0, 115, 105));
        HourChooser.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        HourChooser.setForeground(new java.awt.Color(255, 255, 255));
        HourChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XX:XX - XX:XX", "8:00 - 9:30", "9:30 - 11:00", "11:00 - 12:30", "12:30 - 14:00", "15:00 - 16:30", "16:30 - 18:00", "18:00 - 19:30", "19:30 - 21:00" }));
        HourChooser.setBorder(null);
        HourChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HourChooserActionPerformed(evt);
            }
        });
        BookingsPanel.add(HourChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, -1));

        influxLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        influxLabel.setForeground(new java.awt.Color(255, 255, 255));
        influxLabel.setText("0% inf");
        BookingsPanel.add(influxLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        HourIcon.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        HourIcon.setForeground(new java.awt.Color(255, 255, 255));
        HourIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clock.png"))); // NOI18N
        BookingsPanel.add(HourIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 137, -1, -1));

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
            
            Calendar startDay = new GregorianCalendar(year, month, 1);
            int dayValue = (startDay.get(Calendar.DAY_OF_WEEK) + 5) % 7;
            lastDay = (selectedDay+dayValue+6);
            
            openBookings(selectedDay, month, year);
            
            refreshCalendar();
            
            HourChooser.setSelectedIndex(0);
            
            component[selectedDay+dayValue+6].setBackground(new java.awt.Color(0,180,129));
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
        refreshCalendar();
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
        refreshCalendar();
    }//GEN-LAST:event_PrevMonthBtnActionPerformed

    private void HourChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HourChooserActionPerformed

        String hour = switch (HourChooser.getSelectedIndex()) {
            case 0 -> "no hour";
            case 1 -> "08:00";
            case 2 -> "09:30";
            case 3 -> "11:00";
            case 4 -> "12:30";
            case 5 -> "15:00";
            case 6 -> "16:30";
            case 7 -> "18:00";
            case 8 -> "19:30";
            default -> "no hour";
        };
        
        ArrayList<Court> courtList = CourtController.getCourts(true);
        generateCourtButtons(courtList, selectedDate, hour);
        BookingCourtsPanel.setVisible(false);
        BookingCourtsPanel.setVisible(true);
    }//GEN-LAST:event_HourChooserActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static com.toedter.calendar.JDayChooser BookingCalendar;
    public static javax.swing.JPanel BookingCourtsPanel;
    private javax.swing.JScrollPane BookingCourtsScrollPanel;
    private javax.swing.JPanel BookingsContainer;
    private javax.swing.JPanel BookingsPanel;
    private javax.swing.JButton BtnClose;
    private javax.swing.JButton BtnLogout;
    private javax.swing.JPanel CalendarPanel;
    private javax.swing.JPanel ChooseHourPanel;
    public javax.swing.JPanel Content;
    private javax.swing.JPanel DefaultPanel;
    private javax.swing.JPanel Header;
    private javax.swing.JComboBox<String> HourChooser;
    private javax.swing.JLabel HourIcon;
    private javax.swing.JLabel HourPanelIcon;
    private javax.swing.JLabel HourPanelLabel;
    private javax.swing.JLabel LabelCompleteName;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JLabel LabelUserPanel;
    private javax.swing.JPanel LegendBlue;
    private javax.swing.JLabel LegendBlueLabel;
    private javax.swing.JPanel LegendRed;
    private javax.swing.JLabel LegendRedLabel1;
    private javax.swing.JPanel LegendYellow;
    private javax.swing.JLabel LegendYellowLabel;
    public javax.swing.JPanel Main;
    private javax.swing.JLabel MonthDayLabel;
    private javax.swing.JLabel MonthLabel;
    private javax.swing.JButton NextMonthBtn;
    public javax.swing.JPanel PanelBackground;
    private javax.swing.JButton PrevMonthBtn;
    private javax.swing.JLabel TodayDateIcon;
    private javax.swing.JLabel TodayDateLabel;
    private javax.swing.JLabel WeekdayLabel;
    private javax.swing.JLabel influxLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
    
    // functions
    public static void refreshCalendar(){
        JPanel dayPanel = BookingCalendar.getDayPanel();
        Component component[] = dayPanel.getComponents();
        Calendar startDay;
        startDay = new GregorianCalendar(year, month, 1);
        int dayValue = (startDay.get(Calendar.DAY_OF_WEEK) + 5) % 7;
        
        bookingListMonth = BookingController.getBookings("month",String.valueOf(year)+"/"+String.valueOf(month+1));
        
            
        for (int i = 7; i < 49; i++) {
            Component c = component[i];
            c.setBackground(new java.awt.Color(0,115,105));
            
            c.addMouseListener(new MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {                                            
                    c.setBackground(new java.awt.Color(0,140,129));
                }                                           

                public void mouseExited(java.awt.event.MouseEvent evt) {                                           
                    c.setBackground(new java.awt.Color(0,115,105));
                }   
            });
            
            dayPanel.add(c);
        }
        
        for(Booking booking : bookingListMonth){
            String date = booking.getDay();
            String[] dateArr = date.split("-");
            int day = Integer.valueOf(dateArr[2]);
            
            if(booking.getUserEmail().equals(Controller.currentUser.getEmail())){
                // BOOKING IS FROM USER
                if(booking.getStatus() != BookingStatus.CANCELLED){
                    Component blueComponent = component[day + dayValue + 6];
                    blueComponent.setBackground(new java.awt.Color(0,155,189));
                    blueComponent.addMouseListener(new MouseAdapter() {
                        public void mouseEntered(java.awt.event.MouseEvent evt) {                                            
                            blueComponent.setBackground(new java.awt.Color(0,186,227));
                        }                                           

                        public void mouseExited(java.awt.event.MouseEvent evt) {                                           
                            blueComponent.setBackground(new java.awt.Color(0,155,189));
                        }   
                    });
                }
            } else {
                // BOOKING IS FROM OTHER USER
                int influx = Controller.getInflux(date);
                if(influx == 100){
                    Component redComponent = component[day + dayValue + 6];
                    redComponent.setBackground(new java.awt.Color(119,0,0));
                    redComponent.addMouseListener(new MouseAdapter() {
                        public void mouseEntered(java.awt.event.MouseEvent evt) {                                            
                            redComponent.setBackground(new java.awt.Color(85,0,0));
                        }                                           

                        public void mouseExited(java.awt.event.MouseEvent evt) {                                           
                            redComponent.setBackground(new java.awt.Color(119,0,0));
                        }
                    });
                }else if(influx>=50){
                    Component yellowComponent = component[day + dayValue + 6];
                    yellowComponent.setBackground(new java.awt.Color(237,197,66));
                    yellowComponent.addMouseListener(new MouseAdapter() {
                        public void mouseEntered(java.awt.event.MouseEvent evt) {                                            
                            yellowComponent.setBackground(new java.awt.Color(255,211,72));
                        }                                           

                        public void mouseExited(java.awt.event.MouseEvent evt) {                                           
                            yellowComponent.setBackground(new java.awt.Color(237,197,66));
                        }   
                    });
                } 
            }
        }
        
        if(BookingCourtsPanel.isVisible() == true){
            ArrayList<Court> courtList = CourtController.getCourts(true);
            BookingCourtsPanel.removeAll();
            ArrayList<Booking> bookingList = BookingController.getBookings("day",Controller.day);
            for (Court court : courtList) {
                CourtPanel courtPanel = new CourtPanel(court, bookingList, Controller.hour, Controller.day);
                BookingCourtsPanel.add(courtPanel);
            }
            BookingCourtsPanel.setVisible(false);
            BookingCourtsPanel.setVisible(true);
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
        
        selectedDate = day;
        
        DefaultPanel.setVisible(false);
        BookingsPanel.setVisible(true);
    }

    private void generateCourtButtons(ArrayList<Court> courtList, String _date, String hour) {
        if(hour.equals("no hour")){
            BookingCourtsPanel.setVisible(false);
            ChooseHourPanel.setVisible(true);
        } else {
            ChooseHourPanel.setVisible(false);
            BookingCourtsPanel.setVisible(true);
            BookingCourtsPanel.removeAll();
            ArrayList<Booking> bookingList = BookingController.getBookings("day", _date);
            for (Court court : courtList) {
                CourtPanel courtPanel = new CourtPanel(court, bookingList, hour, _date);
                BookingCourtsPanel.add(courtPanel);
            }
        }
        
    }
}
