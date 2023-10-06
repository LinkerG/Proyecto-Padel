package View;
import Controller.*;
import java.util.ArrayList;
import Model.*;

public class AdminView extends javax.swing.JFrame {
    private int posX, posY, defaultId;
    
    public AdminView() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
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
        TxtboxEmailCreateUser1 = new javax.swing.JTextField();
        TxtboxPassword = new javax.swing.JPasswordField();
        CreateUserBtnSave = new javax.swing.JButton();
        Users = new javax.swing.JPanel();
        BtnReturn3 = new javax.swing.JButton();
        BtnAdd3 = new javax.swing.JButton();
        UsersContent = new javax.swing.JPanel();
        UserInfo = new javax.swing.JPanel();
        BtnReturn4 = new javax.swing.JButton();
        UserInfoContent = new javax.swing.JPanel();
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
        CourtButtons.setLayout(new java.awt.GridLayout(0, 5, 50, 10));
        CourtButtonsScrollPane.setViewportView(CourtButtons);
        ArrayList<Court> courtList = Controller.getCourts(true);
        for (Court court : courtList) {
            javax.swing.JLabel courtLabelAdd = new javax.swing.JLabel(String.valueOf(court.getID()));
            CourtButtons.add(courtLabelAdd);
        }

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

        jPanel1.setBackground(new java.awt.Color(0, 115, 105));
        jPanel1.setMaximumSize(new java.awt.Dimension(528, 315));
        jPanel1.setMinimumSize(new java.awt.Dimension(528, 315));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Creating court");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 34, -1, -1));

        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(254, 180));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(254, 180));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(254, 180));

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
        jScrollPane1.setViewportView(CourtNotes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        CourtNotesLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CourtNotesLabel.setForeground(new java.awt.Color(255, 255, 255));
        CourtNotesLabel.setText("Notes");
        jPanel1.add(CourtNotesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        CourtStateLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CourtStateLabel.setForeground(new java.awt.Color(255, 255, 255));
        CourtStateLabel.setText("State");
        jPanel1.add(CourtStateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        CourtIdLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CourtIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        CourtIdLabel.setText("Default Court ID:");
        jPanel1.add(CourtIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        CourtID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CourtID.setForeground(new java.awt.Color(255, 255, 255));
        CourtID.setText("XXX");
        defaultId = Controller.getDefId();
        CourtID.setText(Integer.toString(defaultId));
        jPanel1.add(CourtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        AddCourtButton.setBackground(new java.awt.Color(2, 166, 118));
        AddCourtButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AddCourtButton.setForeground(new java.awt.Color(255, 255, 255));
        AddCourtButton.setText("Add");
        AddCourtButton.setMaximumSize(new java.awt.Dimension(220, 34));
        AddCourtButton.setMinimumSize(new java.awt.Dimension(220, 34));
        AddCourtButton.setPreferredSize(new java.awt.Dimension(220, 34));
        AddCourtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCourtButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddCourtButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 180, -1));

        CourtState.setBackground(new java.awt.Color(0, 90, 91));
        CourtState.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CourtState.setForeground(new java.awt.Color(255, 255, 255));
        CourtState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blocked", "Available" }));
        CourtState.setSelectedIndex(1);
        CourtState.setBorder(null);
        CourtState.setFocusable(false);
        CourtState.setLightWeightPopupEnabled(false);
        CourtState.setRequestFocusEnabled(false);
        CourtState.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(CourtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 180, 40));

        CreateCourtsContent.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 23, 528, 315));

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

        TxtboxEmailCreateUser1.setBackground(new java.awt.Color(0, 90, 91));
        TxtboxEmailCreateUser1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        TxtboxEmailCreateUser1.setForeground(new java.awt.Color(255, 255, 255));
        TxtboxEmailCreateUser1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 15));
        TxtboxEmailCreateUser1.setMaximumSize(new java.awt.Dimension(220, 34));
        TxtboxEmailCreateUser1.setMinimumSize(new java.awt.Dimension(220, 34));
        TxtboxEmailCreateUser1.setPreferredSize(new java.awt.Dimension(220, 34));
        TxtboxEmailCreateUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtboxEmailCreateUser1ActionPerformed(evt);
            }
        });
        CreateUserPanel.add(TxtboxEmailCreateUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 123, -1, -1));

        TxtboxPassword.setBackground(new java.awt.Color(0, 90, 91));
        TxtboxPassword.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        TxtboxPassword.setForeground(new java.awt.Color(255, 255, 255));
        TxtboxPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 15));
        TxtboxPassword.setMaximumSize(new java.awt.Dimension(220, 34));
        TxtboxPassword.setMinimumSize(new java.awt.Dimension(220, 34));
        TxtboxPassword.setPreferredSize(new java.awt.Dimension(220, 34));
        TxtboxPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtboxPasswordActionPerformed(evt);
            }
        });
        CreateUserPanel.add(TxtboxPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 195, -1, -1));

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
        CourtButtons.removeAll();
        ArrayList<Court> courtList = Controller.getCourts(true);
        for (Court court : courtList) {
            javax.swing.JLabel courtLabelAdd = new javax.swing.JLabel(String.valueOf(court.getID()));
            CourtButtons.add(courtLabelAdd);
        }
    }//GEN-LAST:event_PanelBtnCourtsMouseClicked

    private void PanelBtnUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBtnUsersMouseClicked
        PanelBtnUsers.setBackground(new java.awt.Color(0,115,105));
        Selector.setVisible(false);
        Users.setVisible(true);
    }//GEN-LAST:event_PanelBtnUsersMouseClicked

    private void BtnReturn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturn1ActionPerformed
        Courts.setVisible(true);
        CreateCourts.setVisible(false);
        ArrayList<Court> courtList = Controller.getCourts(true);
        CourtButtons.removeAll();
        for (Court court : courtList) {
            javax.swing.JLabel courtLabelAdd = new javax.swing.JLabel(String.valueOf(court.getID()));
            CourtButtons.add(courtLabelAdd);
        }

    }//GEN-LAST:event_BtnReturn1ActionPerformed

    private void BtnReturn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturn2ActionPerformed
        Users.setVisible(true);
        CreateUsers.setVisible(false);
    }//GEN-LAST:event_BtnReturn2ActionPerformed

    private void BtnReturn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturn3ActionPerformed
        Selector.setVisible(true);
        Users.setVisible(false);
    }//GEN-LAST:event_BtnReturn3ActionPerformed

    private void BtnReturn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnReturn4ActionPerformed

    private void BtnReturn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnReturn5ActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        CreateCourts.setVisible(true);
        Courts.setVisible(false);
    }//GEN-LAST:event_BtnAddActionPerformed

    private void BtnAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdd3ActionPerformed
        CreateUsers.setVisible(true);
        Users.setVisible(false);
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

    private void TxtboxNameCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtboxNameCreateUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtboxNameCreateUserActionPerformed

    private void TxtboxLastnamesCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtboxLastnamesCreateUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtboxLastnamesCreateUserActionPerformed

    private void TxtboxDniCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtboxDniCreateUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtboxDniCreateUserActionPerformed

    private void TxtboxEmailCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtboxEmailCreateUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtboxEmailCreateUserActionPerformed

    private void TxtboxEmailCreateUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtboxEmailCreateUser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtboxEmailCreateUser1ActionPerformed

    private void TxtboxPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtboxPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtboxPasswordActionPerformed

    private void CreateUserBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateUserBtnSaveActionPerformed
        String password = String.valueOf(TxtboxPassword.getPassword());
        Controller.createUser(TxtboxEmailCreateUser.getText(), password, TxtboxNameCreateUser.getText(), TxtboxLastnamesCreateUser.getText(), TxtboxDniCreateUser.getText());
    }//GEN-LAST:event_CreateUserBtnSaveActionPerformed

    private void AddCourtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCourtButtonActionPerformed
        Controller.createCourt(CourtNotes.getText(), CourtState.getSelectedIndex());
        ArrayList<Court> courtList = Controller.getCourts(true);
        CourtButtons.removeAll();
        for (Court court : courtList) {
            javax.swing.JLabel courtLabelAdd = new javax.swing.JLabel(String.valueOf(court.getID()));
            CourtButtons.add(courtLabelAdd);
        }
        CreateCourts.setVisible(false);
        Courts.setVisible(true);
        defaultId = Controller.getDefId();
        CourtID.setText(Integer.toString(defaultId));
        CourtState.setSelectedIndex(0);
        CourtNotes.setText("");
    }//GEN-LAST:event_AddCourtButtonActionPerformed

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
    public javax.swing.JPanel Content;
    private javax.swing.JPanel CourtButtons;
    private javax.swing.JScrollPane CourtButtonsScrollPane;
    private javax.swing.JLabel CourtID;
    private javax.swing.JLabel CourtIdLabel;
    private javax.swing.JPanel CourtInfo;
    private javax.swing.JPanel CourtInfoContent;
    private javax.swing.JTextArea CourtNotes;
    private javax.swing.JLabel CourtNotesLabel;
    private javax.swing.JPanel CourtSample;
    private javax.swing.JComboBox<String> CourtState;
    private javax.swing.JLabel CourtStateLabel;
    private javax.swing.JPanel Courts;
    private javax.swing.JPanel CourtsContent;
    private javax.swing.JPanel CreateCourts;
    private javax.swing.JPanel CreateCourtsContent;
    private javax.swing.JButton CreateUserBtnSave;
    private javax.swing.JPanel CreateUserContent;
    private javax.swing.JLabel CreateUserDniLabel;
    private javax.swing.JLabel CreateUserEmailLabel;
    private javax.swing.JLabel CreateUserLabel;
    private javax.swing.JLabel CreateUserLastnamesLabel;
    private javax.swing.JLabel CreateUserNameLabel;
    private javax.swing.JPanel CreateUserPanel;
    private javax.swing.JLabel CreateUserPasswordLabel;
    private javax.swing.JPanel CreateUsers;
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
    public javax.swing.JPanel PanelBackground;
    private javax.swing.JPanel PanelBtnCourts;
    private javax.swing.JPanel PanelBtnUsers;
    public javax.swing.JPanel Selector;
    private javax.swing.JTextField TxtboxDniCreateUser;
    private javax.swing.JTextField TxtboxEmailCreateUser;
    private javax.swing.JTextField TxtboxEmailCreateUser1;
    private javax.swing.JTextField TxtboxLastnamesCreateUser;
    private javax.swing.JTextField TxtboxNameCreateUser;
    private javax.swing.JPasswordField TxtboxPassword;
    private javax.swing.JLabel UserImageCreateUser;
    private javax.swing.JPanel UserInfo;
    private javax.swing.JPanel UserInfoContent;
    private javax.swing.JPanel Users;
    private javax.swing.JPanel UsersContent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
