package View;

import Controller.*;
import Model.*;
import static View.UserView.calendar;
import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.plaf.basic.ComboPopup;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.imageio.ImageIO;

public class AdminView extends javax.swing.JFrame {
    private int posX, posY, defaultId;
    public AdminView() {
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBackground = new javax.swing.JPanel();
        Content = new javax.swing.JPanel();
        LabelAdminPanel = new javax.swing.JLabel();
        Courts = new javax.swing.JPanel();
        BtnReturn = new javax.swing.JButton();
        BtnAdd = new javax.swing.JButton();
        CourtsContent = new javax.swing.JPanel();
        CourtButtonsScrollPane = new javax.swing.JScrollPane();
        CourtButtons = new javax.swing.JPanel();
        CourtSample = new javax.swing.JPanel();
        LabelCourtName = new javax.swing.JLabel();
        LabelCourtImage = new javax.swing.JLabel();
        LabelCourtState = new javax.swing.JLabel();
        BtnCourt = new javax.swing.JButton();
        Selector = new javax.swing.JPanel();
        PanelBtnCourts = new javax.swing.JPanel();
        LabelCourts = new javax.swing.JLabel();
        LabelCourtsImage = new javax.swing.JLabel();
        PanelBtnUsers = new javax.swing.JPanel();
        LabelUsersImage = new javax.swing.JLabel();
        LabelUsers = new javax.swing.JLabel();
        CreateCourts = new javax.swing.JPanel();
        BtnReturn1 = new javax.swing.JButton();
        CreateCourtsContent = new javax.swing.JPanel();
        CreateCourtPanel = new javax.swing.JPanel();
        CreateCourtLabel = new javax.swing.JLabel();
        NotesScrollPane = new javax.swing.JScrollPane();
        CourtNotes = new javax.swing.JTextArea();
        CourtNotesLabel = new javax.swing.JLabel();
        CourtStateLabel = new javax.swing.JLabel();
        CourtIdLabel = new javax.swing.JLabel();
        CourtID = new javax.swing.JLabel();
        AddCourtButton = new javax.swing.JButton();
        CourtState = new javax.swing.JComboBox<>();
        CourtInfo = new javax.swing.JPanel();
        BtnReturn5 = new javax.swing.JButton();
        CourtInfoContent = new javax.swing.JPanel();
        CourtInfoPanel = new javax.swing.JPanel();
        CourtInfoIDLabel = new javax.swing.JLabel();
        CourtInfoNotesScrollPane = new javax.swing.JScrollPane();
        CourtInfoNotes = new javax.swing.JTextArea();
        CourtInfoNotesLabel = new javax.swing.JLabel();
        CourtInfoStateLabel = new javax.swing.JLabel();
        SaveCourtButton = new javax.swing.JButton();
        CourtInfoState = new javax.swing.JComboBox<>();
        CourtBookingsInfo = new javax.swing.JPanel();
        CourtBookingLabel = new javax.swing.JLabel();
        CourtBookingDate = new com.toedter.calendar.JDateChooser();
        CourtBookingDateLabel = new javax.swing.JLabel();
        CourtBookings = new javax.swing.JScrollPane();
        CourtBookingsJTable = new javax.swing.JTable();
        CourtBookingsDefault = new javax.swing.JPanel();
        CourtBookingsDefaultLabel = new javax.swing.JLabel();
        CourtInfoIncorrectNotesLabel = new javax.swing.JLabel();
        CreateUsers = new javax.swing.JPanel();
        BtnReturn2 = new javax.swing.JButton();
        CreateUserContent = new javax.swing.JPanel();
        CreateUserPanel = new javax.swing.JPanel();
        UserImageCreateUser = new javax.swing.JLabel();
        CreateUserLabel = new javax.swing.JLabel();
        CreateUserNameLabel = new javax.swing.JLabel();
        TxtboxNameCreateUser = new javax.swing.JTextField();
        CreateUserLastnamesLabel = new javax.swing.JLabel();
        TxtboxLastnamesCreateUser = new javax.swing.JTextField();
        CreateUserDniLabel = new javax.swing.JLabel();
        TxtboxDniCreateUser = new javax.swing.JTextField();
        CreateUserEmailLabel = new javax.swing.JLabel();
        TxtboxEmailCreateUser = new javax.swing.JTextField();
        CreateUserPasswordLabel = new javax.swing.JLabel();
        TxtboxPasswordCreateUser = new javax.swing.JPasswordField();
        CreateUserBtnSave = new javax.swing.JButton();
        CreateUserNameErrorLabel = new javax.swing.JLabel();
        CreateUserLastnamesErrorLabel = new javax.swing.JLabel();
        CreateUserDniErrorLabel = new javax.swing.JLabel();
        CreateUserEmailErrorLabel = new javax.swing.JLabel();
        CreateUserPasswordErrorLabel = new javax.swing.JLabel();
        CreateUserPasswordRequirementLabel = new javax.swing.JLabel();
        Users = new javax.swing.JPanel();
        BtnReturn3 = new javax.swing.JButton();
        BtnAdd3 = new javax.swing.JButton();
        UsersContent = new javax.swing.JPanel();
        UsersTableScrollPane = new javax.swing.JScrollPane();
        UsersTable = new javax.swing.JTable();
        UserInfo = new javax.swing.JPanel();
        BtnReturn4 = new javax.swing.JButton();
        UserInfoContent = new javax.swing.JPanel();
        UserInfoImage = new javax.swing.JLabel();
        UserInfoName = new javax.swing.JLabel();
        UserInfoNameLabel = new javax.swing.JLabel();
        UserInfoNameErrorLabel = new javax.swing.JLabel();
        UserInfoEmailLabel = new javax.swing.JLabel();
        UserInfoEmailContent = new javax.swing.JLabel();
        TxtboxNameUserInfo = new javax.swing.JTextField();
        UserInfoLastnamesLabel = new javax.swing.JLabel();
        UserInfoLastnamesErrorLabel = new javax.swing.JLabel();
        UserInfoPasswordErrorLabel = new javax.swing.JLabel();
        UserInfoDniErrorLabel = new javax.swing.JLabel();
        TxtboxDniUserInfo = new javax.swing.JTextField();
        TxtboxLastnamesUserInfo = new javax.swing.JTextField();
        TxtboxPasswordUserInfo = new javax.swing.JPasswordField();
        UserInfoPasswordRequirementLabel = new javax.swing.JLabel();
        UserInfoBtnSave = new javax.swing.JButton();
        UserBookingsLabel = new javax.swing.JLabel();
        UserBookingsPanel = new javax.swing.JPanel();
        UserBookings = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        ChangePasswordToggle = new javax.swing.JCheckBox();
        ChangeDniToggle = new javax.swing.JCheckBox();
        Header = new javax.swing.JPanel();
        LabelLogo = new javax.swing.JLabel();
        LabelCompleteName = new javax.swing.JLabel();
        LabelTitle = new javax.swing.JLabel();
        BtnClose = new javax.swing.JButton();
        BtnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1192, 582));
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

        LabelAdminPanel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        LabelAdminPanel.setForeground(new java.awt.Color(255, 255, 255));
        LabelAdminPanel.setText("Administrator Panel");
        Content.add(LabelAdminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        Courts.setVisible(false);
        Courts.setBackground(new java.awt.Color(0, 56, 64));
        Courts.setMaximumSize(new java.awt.Dimension(934, 403));
        Courts.setMinimumSize(new java.awt.Dimension(934, 403));
        Courts.setName(""); // NOI18N
        Courts.setPreferredSize(new java.awt.Dimension(934, 403));
        Courts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReturn.setBackground(new java.awt.Color(0, 56, 64));
        BtnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/return.png"))); // NOI18N
        BtnReturn.setBorder(null);
        BtnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturnActionPerformed(evt);
            }
        });
        Courts.add(BtnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 0, -1, -1));

        BtnAdd.setBackground(new java.awt.Color(0, 56, 64));
        BtnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        BtnAdd.setBorder(null);
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });
        Courts.add(BtnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(861, 0, -1, -1));

        CourtsContent.setBackground(new java.awt.Color(0, 90, 91));
        CourtsContent.setMaximumSize(new java.awt.Dimension(934, 362));
        CourtsContent.setMinimumSize(new java.awt.Dimension(934, 362));
        CourtsContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CourtButtonsScrollPane.setBorder(null);
        CourtButtonsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        CourtButtonsScrollPane.setMaximumSize(new java.awt.Dimension(850, 310));
        CourtButtonsScrollPane.setMinimumSize(new java.awt.Dimension(850, 310));
        CourtButtonsScrollPane.setPreferredSize(new java.awt.Dimension(850, 310));

        CourtButtons.setBackground(new java.awt.Color(0, 90, 91));
        CourtButtons.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CourtButtons.setDoubleBuffered(false);
        CourtButtons.setMaximumSize(new java.awt.Dimension(850, 310));
        CourtButtons.setMinimumSize(new java.awt.Dimension(850, 310));
        CourtButtons.setRequestFocusEnabled(false);
        CourtButtons.setVerifyInputWhenFocusTarget(false);
        CourtButtons.setLayout(new java.awt.GridLayout(2, 5, 50, 10));
        CourtButtonsScrollPane.setViewportView(CourtButtons);
        ArrayList<Court> courtList = Court.getCourts(false);
        generateCourtButtons(courtList);

        CourtsContent.add(CourtButtonsScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        CourtSample.setBackground(new java.awt.Color(0, 115, 105));
        CourtSample.setMaximumSize(new java.awt.Dimension(134, 152));
        CourtSample.setMinimumSize(new java.awt.Dimension(134, 152));
        CourtSample.setPreferredSize(new java.awt.Dimension(134, 152));
        CourtSample.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelCourtName.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LabelCourtName.setForeground(new java.awt.Color(255, 255, 255));
        LabelCourtName.setText("Court 1");
        CourtSample.add(LabelCourtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 12, -1, -1));

        LabelCourtImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/court.png"))); // NOI18N
        CourtSample.add(LabelCourtImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        LabelCourtState.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LabelCourtState.setForeground(new java.awt.Color(255, 255, 255));
        LabelCourtState.setText("Active");
        CourtSample.add(LabelCourtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 123, -1, -1));

        BtnCourt.setBackground(new java.awt.Color(0, 115, 105));
        BtnCourt.setBorder(null);
        BtnCourt.setBorderPainted(false);
        BtnCourt.setMaximumSize(new java.awt.Dimension(134, 152));
        BtnCourt.setMinimumSize(new java.awt.Dimension(134, 152));
        BtnCourt.setPreferredSize(new java.awt.Dimension(134, 152));
        CourtSample.add(BtnCourt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        CourtsContent.add(CourtSample, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, -1, -1));

        Courts.add(CourtsContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 940, 360));

        Content.add(Courts, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        Selector.setBackground(new java.awt.Color(0, 90, 91));
        Selector.setMaximumSize(new java.awt.Dimension(934, 362));
        Selector.setMinimumSize(new java.awt.Dimension(934, 362));
        Selector.setPreferredSize(new java.awt.Dimension(934, 362));
        Selector.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelBtnCourts.setBackground(new java.awt.Color(0, 115, 105));
        PanelBtnCourts.setMaximumSize(new java.awt.Dimension(350, 311));
        PanelBtnCourts.setMinimumSize(new java.awt.Dimension(350, 311));
        PanelBtnCourts.setPreferredSize(new java.awt.Dimension(350, 311));
        PanelBtnCourts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PanelBtnCourtsFocusGained(evt);
            }
        });
        PanelBtnCourts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelBtnCourtsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelBtnCourtsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelBtnCourtsMouseExited(evt);
            }
        });
        PanelBtnCourts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelCourts.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        LabelCourts.setForeground(new java.awt.Color(255, 255, 255));
        LabelCourts.setText("Courts");
        PanelBtnCourts.add(LabelCourts, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 45, -1, -1));

        LabelCourtsImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/courts.png"))); // NOI18N
        LabelCourtsImage.setFocusable(false);
        PanelBtnCourts.add(LabelCourtsImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 125, -1, -1));

        Selector.add(PanelBtnCourts, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 25, -1, -1));

        PanelBtnUsers.setBackground(new java.awt.Color(0, 115, 105));
        PanelBtnUsers.setFocusable(false);
        PanelBtnUsers.setMaximumSize(new java.awt.Dimension(350, 311));
        PanelBtnUsers.setMinimumSize(new java.awt.Dimension(350, 311));
        PanelBtnUsers.setPreferredSize(new java.awt.Dimension(350, 311));
        PanelBtnUsers.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PanelBtnUsersFocusGained(evt);
            }
        });
        PanelBtnUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelBtnUsersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelBtnUsersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelBtnUsersMouseExited(evt);
            }
        });
        PanelBtnUsers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelUsersImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/users.png"))); // NOI18N
        PanelBtnUsers.add(LabelUsersImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 125, -1, -1));

        LabelUsers.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        LabelUsers.setForeground(new java.awt.Color(255, 255, 255));
        LabelUsers.setText("Users");
        PanelBtnUsers.add(LabelUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 46, -1, -1));

        Selector.add(PanelBtnUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 25, -1, -1));

        Content.add(Selector, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        CreateCourts.setVisible(false);
        CreateCourts.setBackground(new java.awt.Color(0, 56, 64));
        CreateCourts.setMaximumSize(new java.awt.Dimension(934, 403));
        CreateCourts.setMinimumSize(new java.awt.Dimension(934, 403));
        CreateCourts.setName(""); // NOI18N
        CreateCourts.setPreferredSize(new java.awt.Dimension(934, 403));
        CreateCourts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReturn1.setBackground(new java.awt.Color(0, 56, 64));
        BtnReturn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/return.png"))); // NOI18N
        BtnReturn1.setBorder(null);
        BtnReturn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturn1ActionPerformed(evt);
            }
        });
        CreateCourts.add(BtnReturn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 0, -1, -1));

        CreateCourtsContent.setBackground(new java.awt.Color(0, 90, 91));
        CreateCourtsContent.setMaximumSize(new java.awt.Dimension(934, 362));
        CreateCourtsContent.setMinimumSize(new java.awt.Dimension(934, 362));
        CreateCourtsContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CreateCourtPanel.setBackground(new java.awt.Color(0, 115, 105));
        CreateCourtPanel.setMaximumSize(new java.awt.Dimension(528, 315));
        CreateCourtPanel.setMinimumSize(new java.awt.Dimension(528, 315));
        CreateCourtPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CreateCourtLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        CreateCourtLabel.setForeground(new java.awt.Color(255, 255, 255));
        CreateCourtLabel.setText("Creating court");
        CreateCourtPanel.add(CreateCourtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 34, -1, -1));

        NotesScrollPane.setHorizontalScrollBar(null);
        NotesScrollPane.setMaximumSize(new java.awt.Dimension(254, 180));
        NotesScrollPane.setMinimumSize(new java.awt.Dimension(254, 180));
        NotesScrollPane.setPreferredSize(new java.awt.Dimension(254, 180));

        CourtNotes.setBackground(new java.awt.Color(0, 90, 91));
        CourtNotes.setColumns(20);
        CourtNotes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CourtNotes.setForeground(new java.awt.Color(255, 255, 255));
        CourtNotes.setLineWrap(true);
        CourtNotes.setRows(5);
        CourtNotes.setWrapStyleWord(true);
        CourtNotes.setBorder(null);
        CourtNotes.setMaximumSize(new java.awt.Dimension(254, 180));
        CourtNotes.setMinimumSize(new java.awt.Dimension(254, 180));
        CourtNotes.setPreferredSize(new java.awt.Dimension(254, 180));
        NotesScrollPane.setViewportView(CourtNotes);

        CreateCourtPanel.add(NotesScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        CourtNotesLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CourtNotesLabel.setForeground(new java.awt.Color(255, 255, 255));
        CourtNotesLabel.setText("Notes");
        CreateCourtPanel.add(CourtNotesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        CourtStateLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CourtStateLabel.setForeground(new java.awt.Color(255, 255, 255));
        CourtStateLabel.setText("State");
        CreateCourtPanel.add(CourtStateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        CourtIdLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CourtIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        CourtIdLabel.setText("Default Court ID:");
        CreateCourtPanel.add(CourtIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        CourtID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CourtID.setForeground(new java.awt.Color(255, 255, 255));
        CourtID.setText("XXX");
        defaultId = Controller.getDefId();
        CourtID.setText(Integer.toString(defaultId));
        CreateCourtPanel.add(CourtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        AddCourtButton.setBackground(new java.awt.Color(2, 166, 118));
        AddCourtButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        AddCourtButton.setForeground(new java.awt.Color(255, 255, 255));
        AddCourtButton.setText("Save");
        AddCourtButton.setMaximumSize(new java.awt.Dimension(220, 34));
        AddCourtButton.setMinimumSize(new java.awt.Dimension(220, 34));
        AddCourtButton.setPreferredSize(new java.awt.Dimension(220, 34));
        AddCourtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCourtButtonActionPerformed(evt);
            }
        });
        CreateCourtPanel.add(AddCourtButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 180, -1));

        CourtState.setBackground(new java.awt.Color(0, 90, 91));
        CourtState.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CourtState.setForeground(new java.awt.Color(255, 255, 255));
        CourtState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blocked", "Available" }));
        CourtState.setSelectedIndex(1);
        CourtState.setBorder(null);
        CourtState.setFocusable(false);
        CourtState.setLightWeightPopupEnabled(false);
        CourtState.setVerifyInputWhenFocusTarget(false);
        CourtState.setBorder(BorderFactory.createEmptyBorder());
        CourtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourtStateActionPerformed(evt);
            }
        });
        CourtState.setUI(new BasicComboBoxUI() {
            @Override
            protected ComboPopup createPopup() {
                return new BasicComboPopup(comboBox);
            }
        });;
        CreateCourtPanel.add(CourtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 180, 40));

        CreateCourtsContent.add(CreateCourtPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 23, 528, 315));

        CreateCourts.add(CreateCourtsContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 940, 360));

        Content.add(CreateCourts, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        CourtInfo.setVisible(false);
        CourtInfo.setBackground(new java.awt.Color(0, 56, 64));
        CourtInfo.setMaximumSize(new java.awt.Dimension(934, 403));
        CourtInfo.setMinimumSize(new java.awt.Dimension(934, 403));
        CourtInfo.setName(""); // NOI18N
        CourtInfo.setPreferredSize(new java.awt.Dimension(934, 403));
        CourtInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReturn5.setBackground(new java.awt.Color(0, 56, 64));
        BtnReturn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/return.png"))); // NOI18N
        BtnReturn5.setBorder(null);
        BtnReturn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturn5ActionPerformed(evt);
            }
        });
        CourtInfo.add(BtnReturn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 0, -1, -1));

        CourtInfoContent.setBackground(new java.awt.Color(0, 90, 91));
        CourtInfoContent.setMaximumSize(new java.awt.Dimension(934, 362));
        CourtInfoContent.setMinimumSize(new java.awt.Dimension(934, 362));
        CourtInfoContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CourtInfoPanel.setBackground(new java.awt.Color(0, 115, 105));
        CourtInfoPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        CourtInfoPanel.setMaximumSize(new java.awt.Dimension(861, 314));
        CourtInfoPanel.setMinimumSize(new java.awt.Dimension(861, 314));
        CourtInfoPanel.setPreferredSize(new java.awt.Dimension(861, 314));
        CourtInfoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CourtInfoIDLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        CourtInfoIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        CourtInfoIDLabel.setText("Court X");
        CourtInfoPanel.add(CourtInfoIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 17, -1, -1));

        CourtInfoNotesScrollPane.setHorizontalScrollBar(null);
        CourtInfoNotesScrollPane.setMaximumSize(new java.awt.Dimension(231, 92));
        CourtInfoNotesScrollPane.setMinimumSize(new java.awt.Dimension(231, 92));
        CourtInfoNotesScrollPane.setPreferredSize(new java.awt.Dimension(231, 92));

        CourtInfoNotes.setBackground(new java.awt.Color(0, 90, 91));
        CourtInfoNotes.setColumns(20);
        CourtInfoNotes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CourtInfoNotes.setForeground(new java.awt.Color(255, 255, 255));
        CourtInfoNotes.setLineWrap(true);
        CourtInfoNotes.setRows(5);
        CourtInfoNotes.setWrapStyleWord(true);
        CourtInfoNotes.setBorder(null);
        CourtInfoNotes.setMaximumSize(new java.awt.Dimension(231, 92));
        CourtInfoNotes.setMinimumSize(new java.awt.Dimension(231, 92));
        CourtInfoNotes.setPreferredSize(new java.awt.Dimension(231, 92));
        CourtInfoNotesScrollPane.setViewportView(CourtInfoNotes);

        CourtInfoPanel.add(CourtInfoNotesScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 148, -1, -1));

        CourtInfoNotesLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        CourtInfoNotesLabel.setForeground(new java.awt.Color(255, 255, 255));
        CourtInfoNotesLabel.setText("Notes");
        CourtInfoPanel.add(CourtInfoNotesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 119, -1, -1));

        CourtInfoStateLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        CourtInfoStateLabel.setForeground(new java.awt.Color(255, 255, 255));
        CourtInfoStateLabel.setText("State");
        CourtInfoPanel.add(CourtInfoStateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 52, -1, -1));

        SaveCourtButton.setBackground(new java.awt.Color(2, 166, 118));
        SaveCourtButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SaveCourtButton.setForeground(new java.awt.Color(255, 255, 255));
        SaveCourtButton.setText("Save");
        SaveCourtButton.setBorder(null);
        SaveCourtButton.setMaximumSize(new java.awt.Dimension(231, 41));
        SaveCourtButton.setMinimumSize(new java.awt.Dimension(231, 41));
        SaveCourtButton.setPreferredSize(new java.awt.Dimension(231, 41));
        SaveCourtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveCourtButtonActionPerformed(evt);
            }
        });
        CourtInfoPanel.add(SaveCourtButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 256, -1, -1));

        CourtInfoState.setBackground(new java.awt.Color(0, 90, 91));
        CourtInfoState.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CourtInfoState.setForeground(new java.awt.Color(255, 255, 255));
        CourtInfoState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blocked", "Available" }));
        CourtInfoState.setSelectedIndex(1);
        CourtInfoState.setBorder(null);
        CourtInfoState.setFocusable(false);
        CourtInfoState.setLightWeightPopupEnabled(false);
        CourtInfoState.setMaximumSize(new java.awt.Dimension(231, 29));
        CourtInfoState.setMinimumSize(new java.awt.Dimension(231, 29));
        CourtInfoState.setPreferredSize(new java.awt.Dimension(231, 29));
        CourtInfoState.setVerifyInputWhenFocusTarget(false);
        CourtState.setBorder(BorderFactory.createEmptyBorder());
        CourtInfoState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourtInfoStateActionPerformed(evt);
            }
        });
        CourtState.setUI(new BasicComboBoxUI() {
            @Override
            protected ComboPopup createPopup() {
                return new BasicComboPopup(comboBox);
            }
        });;
        CourtInfoPanel.add(CourtInfoState, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 81, -1, -1));

        CourtBookingsInfo.setBackground(new java.awt.Color(2, 166, 118));
        CourtBookingsInfo.setMaximumSize(new java.awt.Dimension(514, 246));
        CourtBookingsInfo.setMinimumSize(new java.awt.Dimension(514, 246));
        CourtBookingsInfo.setPreferredSize(new java.awt.Dimension(514, 246));
        CourtBookingsInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CourtBookingLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        CourtBookingLabel.setForeground(new java.awt.Color(255, 255, 255));
        CourtBookingLabel.setText("Booking Calendar");
        CourtBookingsInfo.add(CourtBookingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        CourtBookingDate.setBackground(new java.awt.Color(0, 90, 91));
        CourtBookingDate.setForeground(new java.awt.Color(255, 255, 255));
        CourtBookingDate.setDateFormatString("dd/MM/yyyy");
        CourtBookingDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CourtBookingDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                CourtBookingDatePropertyChange(evt);
            }
        });
        CourtBookingsInfo.add(CourtBookingDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, -1));

        CourtBookingDateLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        CourtBookingDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        CourtBookingDateLabel.setText("Date:");
        CourtBookingsInfo.add(CourtBookingDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        CourtBookings.setBackground(new java.awt.Color(0, 144, 102));
        CourtBookings.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        CourtBookings.setToolTipText("");
        CourtBookings.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        CourtBookings.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CourtBookings.getViewport().setBackground(new java.awt.Color(0, 144, 102));
        CourtBookings.setBorder(BorderFactory.createEmptyBorder());

        CourtBookingsJTable.setAutoCreateRowSorter(true);
        CourtBookingsJTable.setBackground(new java.awt.Color(0, 144, 102));
        CourtBookingsJTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        CourtBookingsJTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CourtBookingsJTable.setForeground(new java.awt.Color(255, 255, 255));
        CourtBookingsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Booking ID", "Name", "Hour", "Status", "Cancel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CourtBookingsJTable.setToolTipText("");
        CourtBookingsJTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        CourtBookingsJTable.setAutoscrolls(false);
        CourtBookingsJTable.setFocusable(false);
        CourtBookingsJTable.setGridColor(new java.awt.Color(0, 144, 102));
        CourtBookingsJTable.setMaximumSize(new java.awt.Dimension(525, 0));
        CourtBookingsJTable.setMinimumSize(new java.awt.Dimension(525, 0));
        CourtBookingsJTable.setRequestFocusEnabled(false);
        CourtBookingsJTable.setRowHeight(40);
        CourtBookingsJTable.setSelectionBackground(new java.awt.Color(0, 144, 102));
        CourtBookingsJTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        javax.swing.table.JTableHeader cb_header = CourtBookingsJTable.getTableHeader();
        javax.swing.table.DefaultTableCellRenderer cb_newRenderer = new javax.swing.table.DefaultTableCellRenderer();
        cb_newRenderer.setBackground(new Color(0,144,102));
        cb_newRenderer.setHorizontalAlignment(JLabel.CENTER);
        cb_newRenderer.setFont(new Font("Arial", 0, 14));
        cb_newRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        cb_newRenderer.setForeground(Color.WHITE);
        cb_header.setDefaultRenderer(cb_newRenderer);
        cb_header.setResizingAllowed(false);
        cb_header.setReorderingAllowed(false);
        CourtBookingsJTable.setTableHeader(cb_header);
        CourtBookingsJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CourtBookingsJTableMouseClicked(evt);
            }
        });
        CourtBookings.setViewportView(CourtBookingsJTable);

        CourtBookingsInfo.add(CourtBookings, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 480, 150));
        CourtBookings.setVisible(false);

        CourtBookingsDefault.setBackground(new java.awt.Color(0, 144, 102));
        CourtBookingsDefault.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CourtBookingsDefaultLabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        CourtBookingsDefaultLabel.setForeground(new java.awt.Color(255, 255, 255));
        CourtBookingsDefaultLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconImage.png"))); // NOI18N
        CourtBookingsDefaultLabel.setText("Select a date");
        CourtBookingsDefault.add(CourtBookingsDefaultLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        CourtBookingsInfo.add(CourtBookingsDefault, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 480, 150));

        CourtInfoPanel.add(CourtBookingsInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 17, -1, 280));

        CourtInfoIncorrectNotesLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CourtInfoIncorrectNotesLabel.setForeground(new java.awt.Color(255, 51, 51));
        CourtInfoIncorrectNotesLabel.setToolTipText("");
        CourtInfoPanel.add(CourtInfoIncorrectNotesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 127, 119, 14));

        CourtInfoContent.add(CourtInfoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 24, -1, -1));

        CourtInfo.add(CourtInfoContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 940, 360));

        Content.add(CourtInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        CreateUsers.setVisible(false);
        CreateUsers.setBackground(new java.awt.Color(0, 56, 64));
        CreateUsers.setMaximumSize(new java.awt.Dimension(934, 403));
        CreateUsers.setMinimumSize(new java.awt.Dimension(934, 403));
        CreateUsers.setName(""); // NOI18N
        CreateUsers.setPreferredSize(new java.awt.Dimension(934, 403));
        CreateUsers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReturn2.setBackground(new java.awt.Color(0, 56, 64));
        BtnReturn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/return.png"))); // NOI18N
        BtnReturn2.setBorder(null);
        BtnReturn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturn2ActionPerformed(evt);
            }
        });
        CreateUsers.add(BtnReturn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 0, -1, -1));

        CreateUserContent.setBackground(new java.awt.Color(0, 90, 91));
        CreateUserContent.setMaximumSize(new java.awt.Dimension(934, 362));
        CreateUserContent.setMinimumSize(new java.awt.Dimension(934, 362));
        CreateUserContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CreateUserPanel.setBackground(new java.awt.Color(0, 115, 105));
        CreateUserPanel.setMaximumSize(new java.awt.Dimension(528, 315));
        CreateUserPanel.setMinimumSize(new java.awt.Dimension(528, 315));
        CreateUserPanel.setPreferredSize(new java.awt.Dimension(528, 315));
        CreateUserPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserImageCreateUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/userinfo.png"))); // NOI18N
        CreateUserPanel.add(UserImageCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 16, -1, -1));

        CreateUserLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        CreateUserLabel.setForeground(new java.awt.Color(255, 255, 255));
        CreateUserLabel.setText("Create user");
        CreateUserPanel.add(CreateUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 33, -1, -1));

        CreateUserNameLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        CreateUserNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        CreateUserNameLabel.setText("Email");
        CreateUserPanel.add(CreateUserNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 93, -1, -1));

        TxtboxNameCreateUser.setBackground(new java.awt.Color(0, 90, 91));
        TxtboxNameCreateUser.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        TxtboxNameCreateUser.setForeground(new java.awt.Color(255, 255, 255));
        TxtboxNameCreateUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 15));
        TxtboxNameCreateUser.setMaximumSize(new java.awt.Dimension(220, 34));
        TxtboxNameCreateUser.setMinimumSize(new java.awt.Dimension(220, 34));
        TxtboxNameCreateUser.setPreferredSize(new java.awt.Dimension(220, 34));
        TxtboxNameCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtboxNameCreateUserActionPerformed(evt);
            }
        });
        CreateUserPanel.add(TxtboxNameCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 123, -1, -1));

        CreateUserLastnamesLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        CreateUserLastnamesLabel.setForeground(new java.awt.Color(255, 255, 255));
        CreateUserLastnamesLabel.setText("Last Names");
        CreateUserPanel.add(CreateUserLastnamesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 165, -1, -1));

        TxtboxLastnamesCreateUser.setBackground(new java.awt.Color(0, 90, 91));
        TxtboxLastnamesCreateUser.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        TxtboxLastnamesCreateUser.setForeground(new java.awt.Color(255, 255, 255));
        TxtboxLastnamesCreateUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 15));
        TxtboxLastnamesCreateUser.setMaximumSize(new java.awt.Dimension(220, 34));
        TxtboxLastnamesCreateUser.setMinimumSize(new java.awt.Dimension(220, 34));
        TxtboxLastnamesCreateUser.setPreferredSize(new java.awt.Dimension(220, 34));
        TxtboxLastnamesCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtboxLastnamesCreateUserActionPerformed(evt);
            }
        });
        CreateUserPanel.add(TxtboxLastnamesCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 195, -1, -1));

        CreateUserDniLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        CreateUserDniLabel.setForeground(new java.awt.Color(255, 255, 255));
        CreateUserDniLabel.setText("DNI");
        CreateUserPanel.add(CreateUserDniLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 237, -1, -1));

        TxtboxDniCreateUser.setBackground(new java.awt.Color(0, 90, 91));
        TxtboxDniCreateUser.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        TxtboxDniCreateUser.setForeground(new java.awt.Color(255, 255, 255));
        TxtboxDniCreateUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 15));
        TxtboxDniCreateUser.setMaximumSize(new java.awt.Dimension(220, 34));
        TxtboxDniCreateUser.setMinimumSize(new java.awt.Dimension(220, 34));
        TxtboxDniCreateUser.setPreferredSize(new java.awt.Dimension(220, 34));
        TxtboxDniCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtboxDniCreateUserActionPerformed(evt);
            }
        });
        CreateUserPanel.add(TxtboxDniCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 265, -1, -1));

        CreateUserEmailLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        CreateUserEmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        CreateUserEmailLabel.setText("Name");
        CreateUserPanel.add(CreateUserEmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 93, -1, -1));

        TxtboxEmailCreateUser.setBackground(new java.awt.Color(0, 90, 91));
        TxtboxEmailCreateUser.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        TxtboxEmailCreateUser.setForeground(new java.awt.Color(255, 255, 255));
        TxtboxEmailCreateUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 15));
        TxtboxEmailCreateUser.setMaximumSize(new java.awt.Dimension(220, 34));
        TxtboxEmailCreateUser.setMinimumSize(new java.awt.Dimension(220, 34));
        TxtboxEmailCreateUser.setName(""); // NOI18N
        TxtboxEmailCreateUser.setPreferredSize(new java.awt.Dimension(220, 34));
        TxtboxEmailCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtboxEmailCreateUserActionPerformed(evt);
            }
        });
        CreateUserPanel.add(TxtboxEmailCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 123, -1, -1));

        CreateUserPasswordLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        CreateUserPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        CreateUserPasswordLabel.setText("Password");
        CreateUserPanel.add(CreateUserPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 165, -1, -1));

        TxtboxPasswordCreateUser.setBackground(new java.awt.Color(0, 90, 91));
        TxtboxPasswordCreateUser.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        TxtboxPasswordCreateUser.setForeground(new java.awt.Color(255, 255, 255));
        TxtboxPasswordCreateUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 15));
        TxtboxPasswordCreateUser.setMaximumSize(new java.awt.Dimension(220, 34));
        TxtboxPasswordCreateUser.setMinimumSize(new java.awt.Dimension(220, 34));
        TxtboxPasswordCreateUser.setPreferredSize(new java.awt.Dimension(220, 34));
        TxtboxPasswordCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtboxPasswordCreateUserActionPerformed(evt);
            }
        });
        CreateUserPanel.add(TxtboxPasswordCreateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 195, -1, -1));

        CreateUserBtnSave.setBackground(new java.awt.Color(2, 166, 118));
        CreateUserBtnSave.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        CreateUserBtnSave.setForeground(new java.awt.Color(255, 255, 255));
        CreateUserBtnSave.setText("Save");
        CreateUserBtnSave.setBorder(null);
        CreateUserBtnSave.setFocusable(false);
        CreateUserBtnSave.setMaximumSize(new java.awt.Dimension(220, 34));
        CreateUserBtnSave.setMinimumSize(new java.awt.Dimension(220, 34));
        CreateUserBtnSave.setPreferredSize(new java.awt.Dimension(220, 34));
        CreateUserBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateUserBtnSaveActionPerformed(evt);
            }
        });
        CreateUserPanel.add(CreateUserBtnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 265, -1, -1));

        CreateUserNameErrorLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CreateUserNameErrorLabel.setForeground(new java.awt.Color(255, 51, 51));
        CreateUserNameErrorLabel.setText("Name not valid");
        CreateUserPanel.add(CreateUserNameErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 96, -1, -1));

        CreateUserLastnamesErrorLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CreateUserLastnamesErrorLabel.setForeground(new java.awt.Color(255, 51, 51));
        CreateUserLastnamesErrorLabel.setText("Invalid field");
        CreateUserPanel.add(CreateUserLastnamesErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 168, -1, -1));

        CreateUserDniErrorLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CreateUserDniErrorLabel.setForeground(new java.awt.Color(255, 51, 51));
        CreateUserDniErrorLabel.setText("DNI not valid");
        CreateUserPanel.add(CreateUserDniErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 241, -1, -1));

        CreateUserEmailErrorLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CreateUserEmailErrorLabel.setForeground(new java.awt.Color(255, 51, 51));
        CreateUserEmailErrorLabel.setText("Email not valid");
        CreateUserPanel.add(CreateUserEmailErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 96, -1, -1));

        CreateUserPasswordErrorLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CreateUserPasswordErrorLabel.setForeground(new java.awt.Color(255, 51, 51));
        CreateUserPasswordErrorLabel.setText("Password not valid");
        CreateUserPanel.add(CreateUserPasswordErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 168, -1, -1));

        CreateUserPasswordRequirementLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CreateUserPasswordRequirementLabel.setForeground(new java.awt.Color(255, 51, 51));
        CreateUserPasswordRequirementLabel.setText("Password can't contain spaces.");
        CreateUserPanel.add(CreateUserPasswordRequirementLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 229, -1, -1));

        CreateUserContent.add(CreateUserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 23, -1, -1));

        CreateUsers.add(CreateUserContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 940, 360));

        Content.add(CreateUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        Users.setVisible(false);
        Users.setBackground(new java.awt.Color(0, 56, 64));
        Users.setMaximumSize(new java.awt.Dimension(934, 403));
        Users.setMinimumSize(new java.awt.Dimension(934, 403));
        Users.setName(""); // NOI18N
        Users.setPreferredSize(new java.awt.Dimension(934, 403));
        Users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReturn3.setBackground(new java.awt.Color(0, 56, 64));
        BtnReturn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/return.png"))); // NOI18N
        BtnReturn3.setBorder(null);
        BtnReturn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturn3ActionPerformed(evt);
            }
        });
        Users.add(BtnReturn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 0, -1, -1));

        BtnAdd3.setBackground(new java.awt.Color(0, 56, 64));
        BtnAdd3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        BtnAdd3.setBorder(null);
        BtnAdd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdd3ActionPerformed(evt);
            }
        });
        Users.add(BtnAdd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(861, 0, -1, -1));

        UsersContent.setBackground(new java.awt.Color(0, 90, 91));
        UsersContent.setMaximumSize(new java.awt.Dimension(934, 362));
        UsersContent.setMinimumSize(new java.awt.Dimension(934, 362));
        UsersContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsersTableScrollPane.setBackground(new java.awt.Color(0, 90, 91));
        UsersTableScrollPane.setForeground(new java.awt.Color(0, 90, 91));
        UsersTableScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        UsersTableScrollPane.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        UsersTableScrollPane.setMaximumSize(new java.awt.Dimension(850, 310));
        UsersTableScrollPane.setMinimumSize(new java.awt.Dimension(850, 310));
        UsersTableScrollPane.setOpaque(false);
        UsersTableScrollPane.setPreferredSize(new java.awt.Dimension(850, 310));
        UsersTableScrollPane.getViewport().setBackground(new java.awt.Color(0, 90, 91));
        UsersTableScrollPane.setBorder(BorderFactory.createEmptyBorder());

        UsersTable.setAutoCreateRowSorter(true);
        UsersTable.setBackground(new java.awt.Color(0, 90, 91));
        UsersTable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        UsersTable.setForeground(new java.awt.Color(255, 255, 255));
        UsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Name", "Last names", "DNI", "Email", "Active", "Edit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        javax.swing.table.DefaultTableModel model = (DefaultTableModel) UsersTable.getModel();
        UsersTable.getColumnModel().getColumn(0).setCellRenderer(new ImageRenderer());
        UsersTable.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer());
        UsersTable.getColumnModel().getColumn(6).setCellRenderer(new ImageRenderer());

        ArrayList<User> userList = User.getUsers(false);
        updateTableContent(userList);
        UsersTable.setToolTipText("");
        UsersTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        UsersTable.setAutoscrolls(false);
        UsersTable.setFocusable(false);
        UsersTable.setGridColor(new java.awt.Color(0, 90, 91));
        UsersTable.setMaximumSize(new java.awt.Dimension(525, 0));
        UsersTable.setMinimumSize(new java.awt.Dimension(525, 0));
        UsersTable.setRequestFocusEnabled(false);
        UsersTable.setRowHeight(40);
        UsersTable.setSelectionBackground(new java.awt.Color(0, 90, 91));
        UsersTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        javax.swing.table.JTableHeader header = UsersTable.getTableHeader();
        javax.swing.table.DefaultTableCellRenderer newRenderer = new javax.swing.table.DefaultTableCellRenderer();
        newRenderer.setBackground(new Color(0,90,91));
        newRenderer.setHorizontalAlignment(JLabel.CENTER);
        newRenderer.setFont(new Font("Arial", 0, 14));
        newRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        newRenderer.setForeground(Color.WHITE);
        header.setDefaultRenderer(newRenderer);
        header.setResizingAllowed(false);
        header.setReorderingAllowed(false);
        UsersTable.setTableHeader(header);
        UsersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersTableMouseClicked(evt);
            }
        });
        UsersTableScrollPane.setViewportView(UsersTable);
        UsersTable.setBorder(null);

        UsersContent.add(UsersTableScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        Users.add(UsersContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 940, 360));

        Content.add(Users, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        UserInfo.setVisible(false);
        UserInfo.setBackground(new java.awt.Color(0, 56, 64));
        UserInfo.setMaximumSize(new java.awt.Dimension(934, 403));
        UserInfo.setMinimumSize(new java.awt.Dimension(934, 403));
        UserInfo.setName(""); // NOI18N
        UserInfo.setPreferredSize(new java.awt.Dimension(934, 403));
        UserInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnReturn4.setBackground(new java.awt.Color(0, 56, 64));
        BtnReturn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/return.png"))); // NOI18N
        BtnReturn4.setBorder(null);
        BtnReturn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturn4ActionPerformed(evt);
            }
        });
        UserInfo.add(BtnReturn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 0, -1, -1));

        UserInfoContent.setBackground(new java.awt.Color(0, 90, 91));
        UserInfoContent.setMaximumSize(new java.awt.Dimension(934, 362));
        UserInfoContent.setMinimumSize(new java.awt.Dimension(934, 362));
        UserInfoContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserInfoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/userinfo.png"))); // NOI18N
        UserInfoContent.add(UserInfoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 21, -1, -1));

        UserInfoName.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        UserInfoName.setForeground(new java.awt.Color(255, 255, 255));
        UserInfoName.setText("<Complete user name>");
        UserInfoContent.add(UserInfoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 41, -1, -1));

        UserInfoNameLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        UserInfoNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserInfoNameLabel.setText("Name");
        UserInfoContent.add(UserInfoNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        UserInfoNameErrorLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        UserInfoNameErrorLabel.setForeground(new java.awt.Color(255, 51, 51));
        UserInfoNameErrorLabel.setText("Name not valid");
        UserInfoContent.add(UserInfoNameErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        UserInfoEmailLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        UserInfoEmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserInfoEmailLabel.setText("Email");
        UserInfoContent.add(UserInfoEmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        UserInfoEmailContent.setBackground(new java.awt.Color(0, 115, 105));
        UserInfoEmailContent.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        UserInfoEmailContent.setForeground(new java.awt.Color(255, 255, 255));
        UserInfoEmailContent.setText("LabelForEmail");
        UserInfoEmailContent.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 15));
        UserInfoEmailContent.setMaximumSize(new java.awt.Dimension(220, 34));
        UserInfoEmailContent.setMinimumSize(new java.awt.Dimension(220, 34));
        UserInfoEmailContent.setOpaque(true);
        UserInfoEmailContent.setPreferredSize(new java.awt.Dimension(220, 34));
        UserInfoContent.add(UserInfoEmailContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        TxtboxNameUserInfo.setBackground(new java.awt.Color(0, 115, 105));
        TxtboxNameUserInfo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        TxtboxNameUserInfo.setForeground(new java.awt.Color(255, 255, 255));
        TxtboxNameUserInfo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 15));
        TxtboxNameUserInfo.setMaximumSize(new java.awt.Dimension(220, 34));
        TxtboxNameUserInfo.setMinimumSize(new java.awt.Dimension(220, 34));
        TxtboxNameUserInfo.setPreferredSize(new java.awt.Dimension(220, 34));
        TxtboxNameUserInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtboxNameUserInfoActionPerformed(evt);
            }
        });
        UserInfoContent.add(TxtboxNameUserInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        UserInfoLastnamesLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        UserInfoLastnamesLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserInfoLastnamesLabel.setText("Last Names");
        UserInfoContent.add(UserInfoLastnamesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        UserInfoLastnamesErrorLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        UserInfoLastnamesErrorLabel.setForeground(new java.awt.Color(255, 51, 51));
        UserInfoLastnamesErrorLabel.setText("Invalid field");
        UserInfoContent.add(UserInfoLastnamesErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        UserInfoPasswordErrorLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        UserInfoPasswordErrorLabel.setForeground(new java.awt.Color(255, 51, 51));
        UserInfoPasswordErrorLabel.setText("Password not valid");
        UserInfoContent.add(UserInfoPasswordErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        UserInfoDniErrorLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        UserInfoDniErrorLabel.setForeground(new java.awt.Color(255, 51, 51));
        UserInfoDniErrorLabel.setText("DNI not valid");
        UserInfoContent.add(UserInfoDniErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        TxtboxDniUserInfo.setBackground(new java.awt.Color(0, 115, 105));
        TxtboxDniUserInfo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        TxtboxDniUserInfo.setForeground(new java.awt.Color(255, 255, 255));
        TxtboxDniUserInfo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 15));
        TxtboxDniUserInfo.setMaximumSize(new java.awt.Dimension(220, 34));
        TxtboxDniUserInfo.setMinimumSize(new java.awt.Dimension(220, 34));
        TxtboxDniUserInfo.setPreferredSize(new java.awt.Dimension(220, 34));
        TxtboxDniUserInfo.setVisible(false);
        TxtboxDniUserInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtboxDniUserInfoActionPerformed(evt);
            }
        });
        UserInfoContent.add(TxtboxDniUserInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        TxtboxLastnamesUserInfo.setBackground(new java.awt.Color(0, 115, 105));
        TxtboxLastnamesUserInfo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        TxtboxLastnamesUserInfo.setForeground(new java.awt.Color(255, 255, 255));
        TxtboxLastnamesUserInfo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 15));
        TxtboxLastnamesUserInfo.setMaximumSize(new java.awt.Dimension(220, 34));
        TxtboxLastnamesUserInfo.setMinimumSize(new java.awt.Dimension(220, 34));
        TxtboxLastnamesUserInfo.setPreferredSize(new java.awt.Dimension(220, 34));
        TxtboxLastnamesUserInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtboxLastnamesUserInfoActionPerformed(evt);
            }
        });
        UserInfoContent.add(TxtboxLastnamesUserInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        TxtboxPasswordUserInfo.setBackground(new java.awt.Color(0, 115, 105));
        TxtboxPasswordUserInfo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        TxtboxPasswordUserInfo.setForeground(new java.awt.Color(255, 255, 255));
        TxtboxPasswordUserInfo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 15));
        TxtboxPasswordUserInfo.setMaximumSize(new java.awt.Dimension(220, 34));
        TxtboxPasswordUserInfo.setMinimumSize(new java.awt.Dimension(220, 34));
        TxtboxPasswordUserInfo.setPreferredSize(new java.awt.Dimension(220, 34));
        TxtboxPasswordUserInfo.setVisible(false);
        TxtboxPasswordUserInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtboxPasswordUserInfoActionPerformed(evt);
            }
        });
        UserInfoContent.add(TxtboxPasswordUserInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        UserInfoPasswordRequirementLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        UserInfoPasswordRequirementLabel.setForeground(new java.awt.Color(255, 51, 51));
        UserInfoPasswordRequirementLabel.setText("Password can't contain spaces.");
        UserInfoContent.add(UserInfoPasswordRequirementLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        UserInfoBtnSave.setBackground(new java.awt.Color(2, 166, 118));
        UserInfoBtnSave.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        UserInfoBtnSave.setForeground(new java.awt.Color(255, 255, 255));
        UserInfoBtnSave.setText("Save");
        UserInfoBtnSave.setBorder(null);
        UserInfoBtnSave.setFocusable(false);
        UserInfoBtnSave.setMaximumSize(new java.awt.Dimension(220, 34));
        UserInfoBtnSave.setMinimumSize(new java.awt.Dimension(220, 34));
        UserInfoBtnSave.setPreferredSize(new java.awt.Dimension(220, 34));
        UserInfoBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserInfoBtnSaveActionPerformed(evt);
            }
        });
        UserInfoContent.add(UserInfoBtnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        UserBookingsLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        UserBookingsLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserBookingsLabel.setText("User Bookings");
        UserInfoContent.add(UserBookingsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 41, -1, -1));

        UserBookingsPanel.setBackground(new java.awt.Color(0, 115, 105));
        UserBookingsPanel.setForeground(new java.awt.Color(255, 255, 255));
        UserBookingsPanel.setMaximumSize(new java.awt.Dimension(341, 230));
        UserBookingsPanel.setMinimumSize(new java.awt.Dimension(341, 230));
        UserBookingsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserBookings.setBackground(new java.awt.Color(0, 144, 102));
        UserBookings.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        UserBookings.setToolTipText("");
        UserBookings.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        UserBookings.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CourtBookings.getViewport().setBackground(new java.awt.Color(0, 144, 102));
        CourtBookings.setBorder(BorderFactory.createEmptyBorder());

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setBackground(new java.awt.Color(0, 144, 102));
        jTable2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jTable2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Day", "Hour", "Court"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setToolTipText("");
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable2.setAutoscrolls(false);
        jTable2.setFocusable(false);
        jTable2.setGridColor(new java.awt.Color(0, 144, 102));
        jTable2.setMaximumSize(new java.awt.Dimension(525, 0));
        jTable2.setMinimumSize(new java.awt.Dimension(525, 0));
        jTable2.setRequestFocusEnabled(false);
        jTable2.setRowHeight(40);
        jTable2.setSelectionBackground(new java.awt.Color(0, 144, 102));
        jTable2.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        UserBookings.setViewportView(jTable2);

        UserBookingsPanel.add(UserBookings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 230));
        CourtBookings.setVisible(false);

        UserInfoContent.add(UserBookingsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 330, 225));

        ChangePasswordToggle.setBackground(new java.awt.Color(0, 90, 91));
        ChangePasswordToggle.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ChangePasswordToggle.setForeground(new java.awt.Color(255, 255, 255));
        ChangePasswordToggle.setText("Change Password");
        ChangePasswordToggle.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ChangePasswordToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePasswordToggleActionPerformed(evt);
            }
        });
        UserInfoContent.add(ChangePasswordToggle, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        ChangeDniToggle.setBackground(new java.awt.Color(0, 90, 91));
        ChangeDniToggle.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ChangeDniToggle.setForeground(new java.awt.Color(255, 255, 255));
        ChangeDniToggle.setText("Change DNI");
        ChangeDniToggle.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ChangeDniToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeDniToggleActionPerformed(evt);
            }
        });
        UserInfoContent.add(ChangeDniToggle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        UserInfo.add(UserInfoContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 940, 360));

        Content.add(UserInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

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

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int newX = evt.getXOnScreen() - posX;
        int newY = evt.getYOnScreen() - posY;

        setLocation(newX, newY);
    }//GEN-LAST:event_HeaderMouseDragged

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        posX = evt.getXOnScreen() - getX();
        posY = evt.getYOnScreen() - getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void BtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogoutActionPerformed
        ButtonActions.logOut(true);
    }//GEN-LAST:event_BtnLogoutActionPerformed

    private void BtnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturnActionPerformed
        Selector.setVisible(true);
        Courts.setVisible(false);
    }//GEN-LAST:event_BtnReturnActionPerformed

    private void PanelBtnCourtsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBtnCourtsMouseClicked
        PanelBtnCourts.setBackground(new java.awt.Color(0,115,105));
        Selector.setVisible(false);
        Courts.setVisible(true);
        ArrayList<Court> courtList = CourtController.getCourts(false);
        generateCourtButtons(courtList);
    }//GEN-LAST:event_PanelBtnCourtsMouseClicked

    private void PanelBtnUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBtnUsersMouseClicked
        PanelBtnUsers.setBackground(new java.awt.Color(0,115,105));
        
        
        ArrayList<User> userList = UserController.getUsers(false);
        updateTableContent(userList);
        Selector.setVisible(false);
        Users.setVisible(true);
    }//GEN-LAST:event_PanelBtnUsersMouseClicked

    private void BtnReturn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturn1ActionPerformed
        Courts.setVisible(true);
        CreateCourts.setVisible(false);
        ArrayList<Court> courtList = CourtController.getCourts(false);
        generateCourtButtons(courtList);
    }//GEN-LAST:event_BtnReturn1ActionPerformed

    private void BtnReturn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturn2ActionPerformed
        
        ArrayList<User> userList = UserController.getUsers(false);
        updateTableContent(userList);
        Users.setVisible(true);
        CreateUsers.setVisible(false);
    }//GEN-LAST:event_BtnReturn2ActionPerformed

    private void BtnReturn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturn3ActionPerformed
        Selector.setVisible(true);
        Users.setVisible(false);
    }//GEN-LAST:event_BtnReturn3ActionPerformed

    private void BtnReturn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturn4ActionPerformed
        ArrayList<User> userList = UserController.getUsers(false);
        updateTableContent(userList);
        Users.setVisible(true);
        UserInfo.setVisible(false);
    }//GEN-LAST:event_BtnReturn4ActionPerformed

    private void BtnReturn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturn5ActionPerformed
        CourtInfo.setVisible(false);
        Courts.setVisible(true);
    }//GEN-LAST:event_BtnReturn5ActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        CreateCourts.setVisible(true);
        Courts.setVisible(false);
    }//GEN-LAST:event_BtnAddActionPerformed

    private void BtnAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdd3ActionPerformed

        ArrayList<User> userList = UserController.getUsers(false);
        updateTableContent(userList);
        CreateUsers.setVisible(true);
        Users.setVisible(false);
        CreateUserNameErrorLabel.setVisible(false);
        CreateUserLastnamesErrorLabel.setVisible(false);
        CreateUserDniErrorLabel.setVisible(false);
        CreateUserEmailErrorLabel.setVisible(false);
        CreateUserPasswordErrorLabel.setVisible(false);
        CreateUserPasswordRequirementLabel.setVisible(false);
        
    }//GEN-LAST:event_BtnAdd3ActionPerformed
    private void PanelBtnCourtsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PanelBtnCourtsFocusGained
        
    }//GEN-LAST:event_PanelBtnCourtsFocusGained

    private void PanelBtnUsersFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PanelBtnUsersFocusGained

    }//GEN-LAST:event_PanelBtnUsersFocusGained

    private void PanelBtnCourtsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBtnCourtsMouseEntered
        PanelBtnCourts.setBackground(new java.awt.Color(0,140,129));
    }//GEN-LAST:event_PanelBtnCourtsMouseEntered

    private void PanelBtnCourtsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBtnCourtsMouseExited
        PanelBtnCourts.setBackground(new java.awt.Color(0,115,105));
    }//GEN-LAST:event_PanelBtnCourtsMouseExited

    private void PanelBtnUsersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBtnUsersMouseEntered
        PanelBtnUsers.setBackground(new java.awt.Color(0,140,129));
    }//GEN-LAST:event_PanelBtnUsersMouseEntered

    private void PanelBtnUsersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBtnUsersMouseExited
        PanelBtnUsers.setBackground(new java.awt.Color(0,115,105));
    }//GEN-LAST:event_PanelBtnUsersMouseExited

    private void TxtboxLastnamesCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtboxLastnamesCreateUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtboxLastnamesCreateUserActionPerformed

    private void TxtboxDniCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtboxDniCreateUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtboxDniCreateUserActionPerformed

    private void TxtboxEmailCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtboxEmailCreateUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtboxEmailCreateUserActionPerformed

    private void TxtboxPasswordCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtboxPasswordCreateUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtboxPasswordCreateUserActionPerformed

    private void CreateUserBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateUserBtnSaveActionPerformed
        String password = String.valueOf(TxtboxPasswordCreateUser.getPassword());
        if(UserController.createUser(TxtboxEmailCreateUser.getText(), password, TxtboxNameCreateUser.getText(), TxtboxLastnamesCreateUser.getText(), TxtboxDniCreateUser.getText())){
            ArrayList<User> userList = UserController.getUsers(false);
            updateTableContent(userList);
            CreateUsers.setVisible(false);
            Users.setVisible(true);
        }
        
    }//GEN-LAST:event_CreateUserBtnSaveActionPerformed

    private void AddCourtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCourtButtonActionPerformed
        CourtController.createCourt(CourtNotes.getText(), CourtState.getSelectedIndex());
        ArrayList<Court> courtList = CourtController.getCourts(false);
        generateCourtButtons(courtList);
        CreateCourts.setVisible(false);
        Courts.setVisible(true);
        defaultId = Controller.getDefId();
        CourtID.setText(Integer.toString(defaultId));
        CourtState.setSelectedIndex(0);
        CourtNotes.setText("");
    }//GEN-LAST:event_AddCourtButtonActionPerformed

    private void CourtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourtStateActionPerformed

    private void UsersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersTableMouseClicked
        int row = UsersTable.rowAtPoint(evt.getPoint());
        int column = UsersTable.columnAtPoint(evt.getPoint());
        
        if(column == 5){
            ArrayList<User> userList = UserController.getUsers(false);
            Object dni = UsersTable.getValueAt(row, 3);
            String stringDni = dni.toString();
            for (User user : userList) {
                if (user.getDni().equals(stringDni)) {
                    UserController.updateUserIsActive(user);
                    ArrayList<User> newUserList = UserController.getUsers(false);
                    updateTableContent(newUserList);
                }
            }
        }
        
        if(column == 6){
            ArrayList<User> userList = UserController.getUsers(false);
            Object dni = UsersTable.getValueAt(row, 3);
            String stringDni = dni.toString();
            System.out.println(stringDni);
            for (User user : userList) {
                if (user.getDni().equals(stringDni)) {
                    userInfoByDni(user);
                }
            }
            UserInfo.setVisible(true);
            Users.setVisible(false);
        }
        
        if (row >= 0 && column >= 0) {
            // Esto sirve para printar el valor de la celda clicada
            
            //Object value = UsersTable.getValueAt(row, column);
            //System.out.println("Clicked on cell: " + value);
            System.out.println("Row: "+row+" Col: "+column);
        }
    }//GEN-LAST:event_UsersTableMouseClicked

    private void TxtboxNameUserInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtboxNameUserInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtboxNameUserInfoActionPerformed

    private void TxtboxDniUserInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtboxDniUserInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtboxDniUserInfoActionPerformed

    private void TxtboxLastnamesUserInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtboxLastnamesUserInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtboxLastnamesUserInfoActionPerformed

    private void TxtboxPasswordUserInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtboxPasswordUserInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtboxPasswordUserInfoActionPerformed

    private void UserInfoBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserInfoBtnSaveActionPerformed
        String password = String.valueOf(TxtboxPasswordUserInfo.getPassword());
        if(User.checkUpdateUser(UserInfoEmailContent.getText(), password, TxtboxNameUserInfo.getText(), TxtboxLastnamesUserInfo.getText(), TxtboxDniUserInfo.getText())){
            ArrayList<User> userList = UserController.getUsers(false);
            updateTableContent(userList);
            UserInfo.setVisible(false);
            Users.setVisible(true);
            TxtboxDniUserInfo.setText("");
            TxtboxDniUserInfo.setVisible(false);
            TxtboxPasswordUserInfo.setText("");
            TxtboxPasswordUserInfo.setVisible(false);
            ChangeDniToggle.setSelected(false);
            ChangePasswordToggle.setSelected(false);
        }
        
    }//GEN-LAST:event_UserInfoBtnSaveActionPerformed

    private void ChangePasswordToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePasswordToggleActionPerformed
        if(TxtboxPasswordUserInfo.isVisible()) TxtboxPasswordUserInfo.setVisible(false);
        else TxtboxPasswordUserInfo.setVisible(true);
    }//GEN-LAST:event_ChangePasswordToggleActionPerformed

    private void TxtboxNameCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtboxNameCreateUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtboxNameCreateUserActionPerformed

    private void ChangeDniToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeDniToggleActionPerformed
        if(TxtboxDniUserInfo.isVisible()) TxtboxDniUserInfo.setVisible(false);
        else TxtboxDniUserInfo.setVisible(true);
    }//GEN-LAST:event_ChangeDniToggleActionPerformed

    private void SaveCourtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveCourtButtonActionPerformed
        String notes = CourtInfoNotes.getText();
        int state = CourtInfoState.getSelectedIndex();
        String id = CourtInfoIDLabel.getText();
        if(!Controller.isTooLong(notes)) {
           Court.updateCourt(state, notes, id);
            CourtButtons.removeAll();
            ArrayList<Court>  courtList = CourtController.getCourts(false);
            generateCourtButtons(courtList);
            CourtInfo.setVisible(false);
            Courts.setVisible(true);
        } else {
            CourtInfoIncorrectNotesLabel.setText("Max of 250 characters");
        }
    }//GEN-LAST:event_SaveCourtButtonActionPerformed

    private void CourtInfoStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourtInfoStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourtInfoStateActionPerformed
int a = 0;
    private void CourtBookingDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_CourtBookingDatePropertyChange
        if(a>1){
            Date selectedDate = CourtBookingDate.getDate();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(selectedDate);

            int day = calendar.get(Calendar.DAY_OF_MONTH);
            int month = calendar.get(Calendar.MONTH) + 1;
            int year = calendar.get(Calendar.YEAR);
            
            String formattedDate = String.valueOf(year)+"-"+String.valueOf(month)+"-"+String.valueOf(day);
            
            int courtId = Integer.valueOf(CourtInfoIDLabel.getText().split(" ")[1]);
            
            updateCourtBookingTable(formattedDate, courtId);
            
            CourtBookingsDefault.setVisible(false);
            CourtBookings.setVisible(false);
            CourtBookings.setVisible(true);
            
            
        } else {
            a++;
        }
    }//GEN-LAST:event_CourtBookingDatePropertyChange

    private void CourtBookingsJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CourtBookingsJTableMouseClicked
        int row = UsersTable.rowAtPoint(evt.getPoint());
        int column = UsersTable.columnAtPoint(evt.getPoint());
        
        Date selectedDate = CourtBookingDate.getDate();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(selectedDate);

        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);

        String formattedDate = String.valueOf(year)+"-"+String.valueOf(month)+"-"+String.valueOf(day);
        int courtId = Integer.parseInt(CourtInfoIDLabel.getText().split(" ")[1]);
        
        if(column == 2){
            Object objId = CourtBookingsJTable.getValueAt(row, 0);
            int id = Integer.parseInt(objId.toString());
            ArrayList<Booking> bookingList = BookingController.getBookings("day", formattedDate);
            for(Booking booking : bookingList){
                if(booking.getBookingId() == id){
                    BookingController.payBooking(booking);
                } 
            }
            
            updateCourtBookingTable(formattedDate, courtId);
        }
        
        if(column == 3){
            Object objId = CourtBookingsJTable.getValueAt(row, 0);
            int id = Integer.parseInt(objId.toString());
            ArrayList<Booking> bookingList = BookingController.getBookings("day", formattedDate);
            for(Booking booking : bookingList){
                if(booking.getBookingId() == id){
                    BookingController.cancelBooking(booking);
                } 
            }
            
            updateCourtBookingTable(formattedDate, courtId);
        }
        
        if (row >= 0 && column >= 0) {
            // Esto sirve para printar el valor de la celda clicada
            
            //Object value = UsersTable.getValueAt(row, column);
            //System.out.println("Clicked on cell: " + value);
            System.out.println("Row: "+row+" Col: "+column);
        }
    }//GEN-LAST:event_CourtBookingsJTableMouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int row = CourtBookingsJTable.rowAtPoint(evt.getPoint());
        int column = CourtBookingsJTable.columnAtPoint(evt.getPoint());
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);
                    
        String formattedDate = String.valueOf(year)+"-"+String.valueOf(month)+"-"+String.valueOf(day);
        int courtId = Integer.valueOf(CourtInfoIDLabel.getText().split(" ")[1]);
        if (row >= 0 && column >= 0) {
            // Esto sirve para printar el valor de la celda clicada
            
            //Object value = UsersTable.getValueAt(row, column);
            //System.out.println("Clicked on cell: " + value);
            System.out.println("Row: "+row+" Col: "+column);
        }
        
        
        if(column == 3){
            ArrayList<Booking> bookings = Booking.getBookingsByCourtDate(formattedDate, courtId);
            Object bookingId = UsersTable.getValueAt(row, 3);
            String intId = bookingId.toString();
            for (Booking booking : bookings) {
                if (Integer.toString(booking.getBookingId()).equals(intId)) {
                    booking.cancelBooking();
                    updateCourtBookingTable(formattedDate, courtId);
                }
            }
        }
        
        if(column == 4){
            ArrayList<Booking> bookings = Booking.getBookingsByCourtDate(formattedDate, courtId);
            Object bookingId = UsersTable.getValueAt(row, 3);
            String intId = bookingId.toString();
            for (Booking booking : bookings) {
                if (Integer.toString(booking.getBookingId()).equals(intId)) {
                    Booking.deleteBooking(booking.getBookingId());
                    updateCourtBookingTable(formattedDate, courtId);
                }
            }
        }
    }//GEN-LAST:event_jTable2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCourtButton;
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnAdd3;
    private javax.swing.JButton BtnClose;
    private javax.swing.JButton BtnCourt;
    private javax.swing.JButton BtnLogout;
    private javax.swing.JButton BtnReturn;
    private javax.swing.JButton BtnReturn1;
    private javax.swing.JButton BtnReturn2;
    private javax.swing.JButton BtnReturn3;
    private javax.swing.JButton BtnReturn4;
    private javax.swing.JButton BtnReturn5;
    public javax.swing.JCheckBox ChangeDniToggle;
    public javax.swing.JCheckBox ChangePasswordToggle;
    public javax.swing.JPanel Content;
    public static com.toedter.calendar.JDateChooser CourtBookingDate;
    private javax.swing.JLabel CourtBookingDateLabel;
    private javax.swing.JLabel CourtBookingLabel;
    public static javax.swing.JScrollPane CourtBookings;
    public static javax.swing.JPanel CourtBookingsDefault;
    private javax.swing.JLabel CourtBookingsDefaultLabel;
    public static javax.swing.JPanel CourtBookingsInfo;
    private javax.swing.JTable CourtBookingsJTable;
    private javax.swing.JPanel CourtButtons;
    private javax.swing.JScrollPane CourtButtonsScrollPane;
    private javax.swing.JLabel CourtID;
    private javax.swing.JLabel CourtIdLabel;
    public static javax.swing.JPanel CourtInfo;
    public static javax.swing.JPanel CourtInfoContent;
    public static javax.swing.JLabel CourtInfoIDLabel;
    private javax.swing.JLabel CourtInfoIncorrectNotesLabel;
    public static javax.swing.JTextArea CourtInfoNotes;
    private javax.swing.JLabel CourtInfoNotesLabel;
    public static javax.swing.JScrollPane CourtInfoNotesScrollPane;
    private javax.swing.JPanel CourtInfoPanel;
    public static javax.swing.JComboBox<String> CourtInfoState;
    public javax.swing.JLabel CourtInfoStateLabel;
    private javax.swing.JTextArea CourtNotes;
    private javax.swing.JLabel CourtNotesLabel;
    private javax.swing.JPanel CourtSample;
    private javax.swing.JComboBox<String> CourtState;
    private javax.swing.JLabel CourtStateLabel;
    public static javax.swing.JPanel Courts;
    private javax.swing.JPanel CourtsContent;
    private javax.swing.JLabel CreateCourtLabel;
    private javax.swing.JPanel CreateCourtPanel;
    private javax.swing.JPanel CreateCourts;
    private javax.swing.JPanel CreateCourtsContent;
    private javax.swing.JButton CreateUserBtnSave;
    private javax.swing.JPanel CreateUserContent;
    public javax.swing.JLabel CreateUserDniErrorLabel;
    private javax.swing.JLabel CreateUserDniLabel;
    public javax.swing.JLabel CreateUserEmailErrorLabel;
    private javax.swing.JLabel CreateUserEmailLabel;
    private javax.swing.JLabel CreateUserLabel;
    public javax.swing.JLabel CreateUserLastnamesErrorLabel;
    private javax.swing.JLabel CreateUserLastnamesLabel;
    public javax.swing.JLabel CreateUserNameErrorLabel;
    private javax.swing.JLabel CreateUserNameLabel;
    public javax.swing.JPanel CreateUserPanel;
    public javax.swing.JLabel CreateUserPasswordErrorLabel;
    private javax.swing.JLabel CreateUserPasswordLabel;
    public javax.swing.JLabel CreateUserPasswordRequirementLabel;
    public javax.swing.JPanel CreateUsers;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel LabelAdminPanel;
    private javax.swing.JLabel LabelCompleteName;
    private javax.swing.JLabel LabelCourtImage;
    private javax.swing.JLabel LabelCourtName;
    private javax.swing.JLabel LabelCourtState;
    private javax.swing.JLabel LabelCourts;
    private javax.swing.JLabel LabelCourtsImage;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JLabel LabelUsers;
    private javax.swing.JLabel LabelUsersImage;
    private javax.swing.JScrollPane NotesScrollPane;
    public javax.swing.JPanel PanelBackground;
    private javax.swing.JPanel PanelBtnCourts;
    private javax.swing.JPanel PanelBtnUsers;
    private javax.swing.JButton SaveCourtButton;
    public javax.swing.JPanel Selector;
    public javax.swing.JTextField TxtboxDniCreateUser;
    public javax.swing.JTextField TxtboxDniUserInfo;
    public javax.swing.JTextField TxtboxEmailCreateUser;
    public javax.swing.JTextField TxtboxLastnamesCreateUser;
    public javax.swing.JTextField TxtboxLastnamesUserInfo;
    public javax.swing.JTextField TxtboxNameCreateUser;
    public javax.swing.JTextField TxtboxNameUserInfo;
    public javax.swing.JPasswordField TxtboxPasswordCreateUser;
    public javax.swing.JPasswordField TxtboxPasswordUserInfo;
    private javax.swing.JScrollPane UserBookings;
    private javax.swing.JLabel UserBookingsLabel;
    private javax.swing.JPanel UserBookingsPanel;
    private javax.swing.JLabel UserImageCreateUser;
    private javax.swing.JPanel UserInfo;
    private javax.swing.JButton UserInfoBtnSave;
    private javax.swing.JPanel UserInfoContent;
    public javax.swing.JLabel UserInfoDniErrorLabel;
    private javax.swing.JLabel UserInfoEmailContent;
    private javax.swing.JLabel UserInfoEmailLabel;
    private javax.swing.JLabel UserInfoImage;
    public javax.swing.JLabel UserInfoLastnamesErrorLabel;
    private javax.swing.JLabel UserInfoLastnamesLabel;
    private javax.swing.JLabel UserInfoName;
    public javax.swing.JLabel UserInfoNameErrorLabel;
    private javax.swing.JLabel UserInfoNameLabel;
    public javax.swing.JLabel UserInfoPasswordErrorLabel;
    public javax.swing.JLabel UserInfoPasswordRequirementLabel;
    private javax.swing.JPanel Users;
    private javax.swing.JPanel UsersContent;
    private javax.swing.JTable UsersTable;
    private javax.swing.JScrollPane UsersTableScrollPane;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
    private void generateCourtButtons(ArrayList<Court> courtList){
        CourtButtons.removeAll();
        for (Court court : courtList) {
            CourtPanel courtPanel = new CourtPanel(court);
            CourtButtons.add(courtPanel);
        }
    }
    
    private void updateTableContent(ArrayList<User> userList) {
        javax.swing.table.DefaultTableModel model = (DefaultTableModel) UsersTable.getModel();
        model.setRowCount(0);
        for (User user : userList) {
            BufferedImage iconImage = null;
            ImageIcon icon = null;
            try {
                iconImage = ImageIO.read(new File("src/img/user.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (iconImage != null) {
                icon = new ImageIcon(iconImage);
            }

            String activeUrl = user.isIsActive() ? "active" : "inactive";
            BufferedImage activeImage = null;
            ImageIcon activeIcon = null;
            try {
                activeImage = ImageIO.read(new File("src/img/" + activeUrl + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (activeImage != null) {
                activeIcon = new ImageIcon(activeImage);
            }

            BufferedImage editImage = null;
            ImageIcon editIcon = null;
            try{
                editImage = ImageIO.read(new File("src/img/edit.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (editImage != null) {
                editIcon = new ImageIcon(editImage);
            }

            Object[] rowData = {icon, user.getName(), user.getSurnames(), user.getDni(), user.getEmail(), activeIcon, editIcon};
            model.addRow(rowData);
        }
    }
    
    private void updateCourtBookingTable(String date, int courtId){
        javax.swing.table.DefaultTableModel model = (DefaultTableModel) CourtBookingsJTable.getModel();
        CourtBookingsJTable.getColumnModel().getColumn(4).setCellRenderer(new ImageRenderer());
        CourtBookingsJTable.getColumnModel().getColumn(3).setCellRenderer(new ImageRenderer());
        model.setRowCount(0);
        ArrayList<Booking> bookingList = BookingController.getBookings(date, courtId);
        
        for(Booking booking : bookingList) {
            String status = booking.getStatus().getStatus();
            BufferedImage statusImage = null;
            BufferedImage blockImage = null;
            ImageIcon statusIcon = null;
            ImageIcon blockIcon = null;
            String statusImageStr = "";
            if("PAID".equals(status)) statusImageStr = "active";
            else if ("NOTPAID".equals(status)) statusImageStr = "grey-tick";
            else statusImageStr = "inactive";
            try {
                statusImage = ImageIO.read(new File("src/img/" + statusImageStr + ".png"));
                statusIcon = new ImageIcon(statusImage);
                
                blockImage = ImageIO.read(new File("src/img/inactive.png"));
                blockIcon = new ImageIcon(blockImage);
            } catch (IOException e) {
                System.err.println("Error loading image: " + e.getMessage());
            }
            Object[] rowData = {booking.getBookingId(), booking.getUserEmail(), booking.getHour().getTimeString(), statusIcon, blockIcon};
            model.addRow(rowData);
        }
    }
    
    private void userInfoByDni(User user) {
        UserInfoNameErrorLabel.setVisible(false);
        UserInfoLastnamesErrorLabel.setVisible(false);
        UserInfoDniErrorLabel.setVisible(false);
        UserInfoPasswordErrorLabel.setVisible(false);
        UserInfoPasswordRequirementLabel.setVisible(false);
        UserInfoName.setText(user.getName() + " " + user.getSurnames());
        TxtboxNameUserInfo.setText(user.getName());
        TxtboxLastnamesUserInfo.setText(user.getSurnames());
        UserInfoEmailContent.setText(user.getEmail());
    }
}

class ImageRenderer extends DefaultTableCellRenderer {
        @Override
        protected void setValue(Object value) {
            if (value instanceof Icon) {
                setIcon((Icon) value);
                setText(""); // Evitar que se muestre el texto
            } else {
                super.setValue(value);
            }
        }
    }