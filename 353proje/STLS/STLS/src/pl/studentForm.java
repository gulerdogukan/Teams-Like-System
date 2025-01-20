package pl;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;


public class studentForm extends javax.swing.JFrame {
    
    public final int alinacakDersLimiti = 6;
    ArrayList<Person> aliciList = new ArrayList<Person>();
    ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
    baglanti b = new baglanti();
    public loginForm lf;
    public int studentID;
    public String studentEmail;
    public JButton[] coursesBtn;
    public int courseCount = 0;
    public JButton[] assingmentsBtn;
    public int assingmentCount = 0;
    public JTextArea[] posts;
    public int postCount = 0;
    public JLabel[] postedTeacher;
    public JButton[] commentButton;
    public String studentNo;
    public int clickedCourseId = 0;
    public int clickedPostId = 0;
    public String studentName;
    public String studentSurname;
    
    public studentForm() {
        initComponents();
    }
    
    public studentForm(int sID, String stdNo, String studentName, String studentSurname, String stdEmail) { 
        initComponents();
        ogrenciLbl.setText(stdNo + " " + studentName + " " + studentSurname);
        studentID = sID;
        studentEmail = stdEmail;
        studentNo = stdNo;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        messageLbl = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jFrame1 = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblCourseCode = new javax.swing.JLabel();
        lblCourseName = new javax.swing.JLabel();
        lblTeacherName = new javax.swing.JLabel();
        lblTeacherEmail = new javax.swing.JLabel();
        dersIdLbl = new javax.swing.JLabel();
        postPanel = new javax.swing.JPanel();
        jFrame2 = new javax.swing.JFrame();
        basliklbl = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        aciklamaArea = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        myAssngArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        odevidLbl = new javax.swing.JLabel();
        dersAdiLbl = new javax.swing.JLabel();
        odevBaslikLbl = new javax.swing.JLabel();
        commentsFrame = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        yorumTablo = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        sendCommentButton = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        commentTxtArea = new javax.swing.JTextArea();
        idpostLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        duyuruTablo = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        studentsCmbBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        msgTxtArea = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        teacherCmbBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        teacherMsgArea = new javax.swing.JTextArea();
        btnTeacherSend = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inboxTable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        btnAnnouncements = new javax.swing.JButton();
        btnAssingments = new javax.swing.JButton();
        btnCourses = new javax.swing.JButton();
        btnSendMessage = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnInbox = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        ogrenciLbl = new javax.swing.JLabel();
        courseCodetxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        courseJoinBtn = new javax.swing.JButton();

        jDialog1.setBackground(new java.awt.Color(0, 255, 51));
        jDialog1.setLocationByPlatform(true);
        jDialog1.setMinimumSize(new java.awt.Dimension(465, 300));

        messageLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addComponent(messageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(messageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrame1.setBackground(new java.awt.Color(255, 187, 206));
        jFrame1.setMinimumSize(new java.awt.Dimension(800, 800));
        jFrame1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jFrame1WindowActivated(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel3.setText("Course Code:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel4.setText("Course Name:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel5.setText("Teacher Name:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel7.setText("Teacher Email:");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblCourseCode.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N

        lblCourseName.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N

        lblTeacherName.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N

        lblTeacherEmail.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N

        postPanel.setBackground(new java.awt.Color(60, 155, 255));

        javax.swing.GroupLayout postPanelLayout = new javax.swing.GroupLayout(postPanel);
        postPanel.setLayout(postPanelLayout);
        postPanelLayout.setHorizontalGroup(
            postPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        postPanelLayout.setVerticalGroup(
            postPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCourseName, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                    .addComponent(lblCourseCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(45, 45, 45)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jFrame1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblTeacherName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jFrame1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblTeacherEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                                .addComponent(dersIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(postPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(lblTeacherName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCourseCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addComponent(lblTeacherEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dersIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(postPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        jFrame2.setMinimumSize(new java.awt.Dimension(675, 850));
        jFrame2.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jFrame2WindowActivated(evt);
            }
        });

        basliklbl.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N

        aciklamaArea.setEditable(false);
        aciklamaArea.setBackground(new java.awt.Color(187, 187, 187));
        aciklamaArea.setColumns(20);
        aciklamaArea.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        aciklamaArea.setRows(5);
        jScrollPane5.setViewportView(aciklamaArea);

        myAssngArea.setColumns(20);
        myAssngArea.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        myAssngArea.setRows(5);
        jScrollPane6.setViewportView(myAssngArea);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel8.setText("My Assingment");

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame2Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                            .addComponent(basliklbl, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jFrame2Layout.createSequentialGroup()
                                .addComponent(odevidLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dersAdiLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(odevBaslikLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(26, 26, 26))
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(basliklbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(odevidLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dersAdiLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                    .addComponent(odevBaslikLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        commentsFrame.setBackground(new java.awt.Color(0, 102, 102));
        commentsFrame.setMinimumSize(new java.awt.Dimension(562, 500));
        commentsFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                commentsFrameWindowActivated(evt);
            }
        });

        yorumTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Commenter", "Comment", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(yorumTablo);
        if (yorumTablo.getColumnModel().getColumnCount() > 0) {
            yorumTablo.getColumnModel().getColumn(0).setResizable(false);
            yorumTablo.getColumnModel().getColumn(1).setResizable(false);
            yorumTablo.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel6.setText("Comment:");

        sendCommentButton.setText("Send Comment");
        sendCommentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendCommentButtonActionPerformed(evt);
            }
        });

        commentTxtArea.setColumns(20);
        commentTxtArea.setRows(5);
        jScrollPane8.setViewportView(commentTxtArea);

        javax.swing.GroupLayout commentsFrameLayout = new javax.swing.GroupLayout(commentsFrame.getContentPane());
        commentsFrame.getContentPane().setLayout(commentsFrameLayout);
        commentsFrameLayout.setHorizontalGroup(
            commentsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(commentsFrameLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(commentsFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sendCommentButton)
                .addGap(18, 18, 18)
                .addComponent(idpostLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        commentsFrameLayout.setVerticalGroup(
            commentsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(commentsFrameLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(commentsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, commentsFrameLayout.createSequentialGroup()
                        .addGroup(commentsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane8)
                            .addComponent(sendCommentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, commentsFrameLayout.createSequentialGroup()
                        .addComponent(idpostLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Courses", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Assingments", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        duyuruTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Başlık", "Açıklama", "Tarih", "Yayınlayan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(duyuruTablo);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Announcements", jPanel4);

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setText("Receiver");

        studentsCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setText("Message");

        msgTxtArea.setColumns(20);
        msgTxtArea.setRows(5);
        jScrollPane3.setViewportView(msgTxtArea);

        btnSend.setBackground(new java.awt.Color(0, 102, 255));
        btnSend.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnSend.setForeground(new java.awt.Color(255, 255, 255));
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                            .addComponent(studentsCmbBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(299, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentsCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(btnSend)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Send Message(Student)", jPanel9);

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel10.setText("Receiver");

        teacherCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel11.setText("Message");

        teacherMsgArea.setColumns(20);
        teacherMsgArea.setRows(5);
        jScrollPane7.setViewportView(teacherMsgArea);

        btnTeacherSend.setBackground(new java.awt.Color(0, 102, 255));
        btnTeacherSend.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnTeacherSend.setForeground(new java.awt.Color(255, 255, 255));
        btnTeacherSend.setText("Send");
        btnTeacherSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeacherSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                            .addComponent(teacherCmbBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(btnTeacherSend, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(btnTeacherSend)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Send Message (Teacher)", jPanel10);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        inboxTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "Message", "Date"
            }
        ));
        jScrollPane2.setViewportView(inboxTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inbox", jPanel5);

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnAnnouncements.setText("Announcements");
        btnAnnouncements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnouncementsActionPerformed(evt);
            }
        });

        btnAssingments.setText("Assingments");
        btnAssingments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssingmentsActionPerformed(evt);
            }
        });

        btnCourses.setText("Courses");
        btnCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoursesActionPerformed(evt);
            }
        });

        btnSendMessage.setText("Send Message(Student)");
        btnSendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendMessageActionPerformed(evt);
            }
        });

        jButton4.setText("Send Message(Teacher)");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnInbox.setText("Inbox");
        btnInbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAnnouncements, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAssingments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCourses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSendMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnCourses)
                .addGap(26, 26, 26)
                .addComponent(btnAssingments)
                .addGap(26, 26, 26)
                .addComponent(btnAnnouncements)
                .addGap(26, 26, 26)
                .addComponent(btnSendMessage)
                .addGap(26, 26, 26)
                .addComponent(jButton4)
                .addGap(26, 26, 26)
                .addComponent(btnInbox)
                .addGap(26, 26, 26)
                .addComponent(btnLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));

        ogrenciLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        courseCodetxt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        courseCodetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseCodetxtActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Course Code:");

        courseJoinBtn.setBackground(new java.awt.Color(28, 162, 0));
        courseJoinBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        courseJoinBtn.setForeground(new java.awt.Color(255, 255, 255));
        courseJoinBtn.setText("Join");
        courseJoinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseJoinBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ogrenciLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(courseCodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(courseJoinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(courseCodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(courseJoinBtn))
                    .addComponent(ogrenciLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

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
    public void readStudents() {
        try {
            String sorgu = "SELECT * from ogrenci";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            PreparedStatement pst = con.prepareStatement(sorgu);
            ResultSet rs = pst.executeQuery();
            Student student;
            while (rs.next()) {
                student = new Student(rs.getInt("idogrenci"), rs.getString("no"), rs.getString("ad"), rs.getString("soyad"), rs.getString("email"), rs.getString("sifre"));
                aliciList.add(student);
            }
        } catch (SQLException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void readTeachers() {
        try {
            String sorgu = "SELECT * from ogretmen";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            PreparedStatement pst = con.prepareStatement(sorgu);
            ResultSet rs = pst.executeQuery();
            Teacher teacher;
            while (rs.next()) {
                teacher = new Teacher(rs.getInt("idogretmen"), rs.getString("ad"), rs.getString("soyad"), rs.getString("email"), rs.getString("sifre"));
                teacherList.add(teacher);
            }
        } catch (SQLException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        btnCourses();
        btnAssingments();
        readStudents();
        readTeachers();
        addStudentsToCombobox();
        addTeachersToCombobox();
    }//GEN-LAST:event_formWindowOpened
    public void btnCourses() {
        jPanel2.removeAll();
        courseCount = 0;
        try {
            
            String sorgu = "select ders.ad from alinanders, ders where ders.idders=alinanders.ders_idders and alinanders.ogrenci_idogrenci='" + studentID + "'";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            PreparedStatement pst = con.prepareStatement(sorgu);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                courseCount++;
            }
            coursesBtn = new JButton[courseCount];
            courseCount = 0;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con2 = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            PreparedStatement pst2 = con2.prepareStatement(sorgu);
            ResultSet rs2 = pst2.executeQuery();
            int i = 0;
            while (rs2.next()) {
                String courseName = rs2.getString("ders.ad");
                coursesBtn[i] = new JButton();
                coursesBtn[i].setText(courseName);
                coursesBtn[i].setBounds(5, 20 + (i * 50), 300, 50);
                coursesBtn[i].setFont(new Font("Dialog", Font.BOLD, 14));
                coursesBtn[i].setBackground(new Color(0,147,184));
                coursesBtn[i].setForeground(java.awt.Color.WHITE);
                coursesBtn[i].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jFrame1.setVisible(true);
                        try {
                            //kayıtlı olduğu dersin butonlarına tıklayınca açılan pencerenin kodları
                            String sorgu = "select * from ders inner join ogretmen on ders.idogretmen=ogretmen.idogretmen where ders.ad='" + courseName + "'";
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
                            PreparedStatement pst = con.prepareStatement(sorgu);
                            ResultSet rs = pst.executeQuery();
                            
                            while (rs.next()) {
                                lblCourseCode.setText(rs.getString(2));
                                lblCourseName.setText(rs.getString(3));
                                lblTeacherName.setText(rs.getString(6) + " " + rs.getString(7));
                                lblTeacherEmail.setText(rs.getString(8));
                                printPosts(rs.getInt("idders"));

                                //dersIdLbl.setText(String.valueOf(rs.getInt("idders")));
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
                
                jPanel2.add(coursesBtn[i]);
                
                i++;
            }
            i = 0;
        } catch (SQLException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void btnAssingments() {
        jPanel3.removeAll();
        assingmentCount = 0;
        try {
            String sorgu = "select * from odevler where idders IN (SELECT ders_idders FROM alinanders where ogrenci_idogrenci IN (select idogrenci from ogrenci where ogrenci.no='" + studentNo + "'));";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            PreparedStatement pst = con.prepareStatement(sorgu);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                assingmentCount++;
            }
            assingmentsBtn = new JButton[assingmentCount];
            assingmentCount = 0;
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con2 = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            PreparedStatement pst2 = con2.prepareStatement(sorgu);
            ResultSet rs2 = pst2.executeQuery();
            int j = 0;
            while (rs2.next()) {
                String odevid = rs2.getString("idodevler");
                String baslik = rs2.getString("baslik");
                String dersadi = rs2.getString("dersAdi");
                String aciklama = rs2.getString("aciklama");
                
                assingmentsBtn[j] = new JButton();
                assingmentsBtn[j].setText(dersadi + " - " + baslik);
                assingmentsBtn[j].setBounds(5, 20 + (j * 50), 500, 50);
                assingmentsBtn[j].setVisible(true);
                assingmentsBtn[j].setFont(new Font("Dialog", Font.PLAIN, 14));
                assingmentsBtn[j].setBackground(new Color(50,50,50));
                assingmentsBtn[j].setForeground(Color.WHITE);
                assingmentsBtn[j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        basliklbl.setText(baslik);
                        odevidLbl.setText(odevid);
                        dersAdiLbl.setText(dersadi);
                        odevBaslikLbl.setText(baslik);
                        aciklamaArea.setText(aciklama);
                        jFrame2.setVisible(true);
                        
                    }
                });
                jPanel3.add(assingmentsBtn[j]);
                j++;
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void readNotifications(ArrayList notificationList) {
        
        try {
            String sorgu = "SELECT * from duyuru";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            PreparedStatement pst = con.prepareStatement(sorgu);
            ResultSet rs = pst.executeQuery();
            Notification noti;
            while (rs.next()) {
                noti = new Notification(rs.getInt("idduyuru"), rs.getInt("idogretmen"), rs.getString("teacherName"), rs.getString("baslik"), rs.getString("tarih"), rs.getString("aciklama"));
                notificationList.add(noti);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    public void addStudentsToCombobox() {
        studentsCmbBox.removeAllItems();
        try {
            String sorgu = "SELECT * from ogrenci";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            PreparedStatement pst = con.prepareStatement(sorgu);
            ResultSet rs = pst.executeQuery();
            Student student;
            while (rs.next()) {
                student = new Student(rs.getInt("idogrenci"), rs.getString("no"), rs.getString("ad"), rs.getString("soyad"), rs.getString("email"), rs.getString("sifre"));
                studentsCmbBox.addItem(student.getName() + " " + student.getSurname() + " ( " + student.getEmail() + " )");
                aliciList.add(student);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void printPosts(int courseId) {
        postPanel.removeAll();
        dersIdLbl.setVisible(false);
        postCount = 0;
        try {
            String sorgu = "select * from post where dersId='" + courseId + "'";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            PreparedStatement pst = con.prepareStatement(sorgu);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                postCount++;
            }
            posts = new JTextArea[postCount];
            postedTeacher = new JLabel[postCount];
            commentButton = new JButton[postCount];
            
            postCount = 0;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con2 = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            PreparedStatement pst2 = con2.prepareStatement(sorgu);
            ResultSet rs2 = pst2.executeQuery();
            int j = 0;
            while (rs2.next()) {
                
                posts[j] = new JTextArea();
                posts[j].setText(rs2.getString("aciklama"));
                posts[j].setBounds(10, 55 + (j * 200), 500, 100);
                posts[j].setVisible(true);
                posts[j].setFont(new Font("Dialog", Font.PLAIN, 14));
                posts[j].setEditable(false);
                
                postedTeacher[j] = new JLabel();
                postedTeacher[j].setText(rs2.getString("ogretmenAdSoyad") + " - " + rs2.getString("baslik") + " - " + rs2.getString("tarih"));
                postedTeacher[j].setBounds(10, 10 + (j * 200), 500, 50);
                
                int idpost = rs2.getInt("idpost");
                
                commentButton[j] = new JButton();
                commentButton[j].setText("See comments");
                commentButton[j].setBounds(10, 160 + (j * 200), 200, 30);
                commentButton[j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //clickedPostId = rs2.getInt("idpost");
                        idpostLbl.setText(String.valueOf(idpost));
                        commentsFrame.setVisible(true);
                    }
                });
                
                postPanel.add(posts[j]);
                postPanel.add(postedTeacher[j]);
                postPanel.add(commentButton[j]);
                j++;
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jFrame1WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame1WindowActivated

    }//GEN-LAST:event_jFrame1WindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jFrame1.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            
            String sorgu = "INSERT INTO alinanodevler(idodev,dersAdi,odevBaslik,idogrenci,ogrenciNo,odevMetni) VALUES(?,?,?,?,?,?)";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            PreparedStatement pst = con.prepareStatement(sorgu);
            pst.setInt(1, Integer.valueOf(odevidLbl.getText()));
            pst.setString(2, dersAdiLbl.getText());
            pst.setString(3, odevBaslikLbl.getText());
            pst.setInt(4, studentID);
            pst.setString(5, studentNo);
            pst.setString(6, myAssngArea.getText());
            pst.execute();
            messageLbl.setText("You submitted successfully.");
            jDialog1.setVisible(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jFrame2WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame2WindowActivated
        odevidLbl.setVisible(false);
        odevBaslikLbl.setVisible(false);
        dersAdiLbl.setVisible(false);
    }//GEN-LAST:event_jFrame2WindowActivated

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed
    public void addTeachersToCombobox() {
        teacherCmbBox.removeAllItems();
        try {
            String sorgu = "SELECT * from ogretmen";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            PreparedStatement pst = con.prepareStatement(sorgu);
            ResultSet rs = pst.executeQuery();
            Teacher teacher;
            while (rs.next()) {
                teacher = new Teacher(rs.getInt("idogretmen"), rs.getString("ad"), rs.getString("soyad"), rs.getString("email"), rs.getString("sifre"));
                teacherCmbBox.addItem(teacher.getName() + " " + teacher.getSurname()+" ( "+teacher.getEmail()+" ) ");
                teacherList.add(teacher);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertCourse(int dersid, int ogrenciNo) {
        try {
            String sorgu = "INSERT INTO alinanders(ders_idders,ogrenci_idogrenci) VALUES(?,?)";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            PreparedStatement pst = con.prepareStatement(sorgu);
            pst.setInt(1, dersid);
            pst.setInt(2, ogrenciNo);
            pst.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addCourse() {
        try {
            String sorgu = "select idders from ders where ders.kod='" + courseCodetxt.getText() + "'";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            PreparedStatement pst = con.prepareStatement(sorgu);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                insertCourse(rs.getInt("idders"), studentID);
            }
            messageLbl.setText("Successful");
            jDialog1.setVisible(true);
            courseCodetxt.setText("");
            
        } catch (SQLException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void readComments(ArrayList commentList) {
        
        try {
            String sorgu = "SELECT * FROM yorumlar inner join post on yorumlar.idpost=post.idpost where yorumlar.idpost='" + idpostLbl.getText() + "'";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            PreparedStatement pst = con.prepareStatement(sorgu);
            ResultSet rs = pst.executeQuery();
            Comment cmt;
            while (rs.next()) {
                cmt = new Comment(rs.getInt("idyorumlar"), rs.getInt("idpost"), rs.getInt("idyorumcu"), rs.getString("yorumcuAdSoyad"), rs.getString("yorum"), rs.getString("tarih"));
                commentList.add(cmt);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void commentsFrameWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_commentsFrameWindowActivated
        idpostLbl.setVisible(false);
        ArrayList<Comment> commentList = new ArrayList<Comment>();//yorumları tutmak için
        commentList.clear();
        readComments(commentList);
        DefaultTableModel model = (DefaultTableModel) yorumTablo.getModel();
        model.setRowCount(0);
        String[] row = new String[3];
        for (Comment c : commentList) {
            row[0] = c.getYorumcuAdSoyad();
            row[1] = c.getYorum();
            row[2] = c.getTarih();
            model.addRow(row);
        }
    }//GEN-LAST:event_commentsFrameWindowActivated

    private void sendCommentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendCommentButtonActionPerformed
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date time = new Date();
            String tarih = formatter.format(time);
            String sorgu = "INSERT INTO yorumlar(idpost,idyorumcu,yorumcuAdSoyad,yorum,tarih) VALUES(?,?,?,?,?)";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            PreparedStatement pst = con.prepareStatement(sorgu);
            pst.setInt(1, Integer.valueOf(idpostLbl.getText()));
            pst.setInt(2, studentID);
            pst.setString(3, studentName + " " + studentSurname);
            pst.setString(4, commentTxtArea.getText());
            pst.setString(5, tarih);
            pst.execute();
            commentTxtArea.setText("");
            messageLbl.setText("You submitted successfully.");
            jDialog1.setVisible(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sendCommentButtonActionPerformed

    private void btnInboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInboxActionPerformed
        jTabbedPane1.setSelectedIndex(5);
        try {
            String sorgu = "SELECT * from mesaj where aliciid='" + studentID + "'";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            PreparedStatement pst = con.prepareStatement(sorgu);
            ResultSet rs = pst.executeQuery();
            Message msg;
            msgList = new ArrayList<Message>();
            while (rs.next()) {
                msg = new Message(rs.getInt("idmesaj"), rs.getInt("gondericiid"), rs.getString("gondericiEmail"), rs.getString("metin"), rs.getInt("aliciid"), rs.getString("tarih"));
                msgList.add(msg);
            }
            DefaultTableModel model = (DefaultTableModel) inboxTable.getModel();
            model.setRowCount(0);
            String[] msgRow = new String[3];
            for (Message m : msgList) {
                msgRow[0] = m.getSenderEmail();
                msgRow[1] = m.getMessage();
                msgRow[2] = m.getDate();
                model.addRow(msgRow);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnInboxActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTabbedPane1.setSelectedIndex(4);
        addTeachersToCombobox();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnSendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendMessageActionPerformed
        jTabbedPane1.setSelectedIndex(3);
        addStudentsToCombobox();
    }//GEN-LAST:event_btnSendMessageActionPerformed

    private void btnCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoursesActionPerformed
        jTabbedPane1.setSelectedIndex(0);
        btnCourses();
    }//GEN-LAST:event_btnCoursesActionPerformed

    private void btnAssingmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssingmentsActionPerformed
        jTabbedPane1.setSelectedIndex(1);
        btnAssingments();
    }//GEN-LAST:event_btnAssingmentsActionPerformed

    private void btnAnnouncementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnouncementsActionPerformed
        jTabbedPane1.setSelectedIndex(2);
        ArrayList<Notification> notificationList = new ArrayList<Notification>();//duyuruları tutmak için
        notificationList.clear();
        readNotifications(notificationList);
        DefaultTableModel model = (DefaultTableModel) duyuruTablo.getModel();
        model.setRowCount(0);
        String[] row = new String[5];
        for (Notification n : notificationList) {
            row[0] = n.getBaslik();
            row[1] = n.getAciklama();
            row[2] = n.getTarih();
            row[3] = n.getOgretmenAdi();
            model.addRow(row);
        }
    }//GEN-LAST:event_btnAnnouncementsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        ogrenciLbl.setText("");
        setVisible(false);
        new loginForm().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnTeacherSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeacherSendActionPerformed
        String aliciid = (String) teacherCmbBox.getSelectedItem();
        String[] arr = aliciid.split(" ");
        int receiverId = 0;
        for (Teacher t : teacherList) {
            if (t.getName().equals(arr[0]) && t.getSurname().equals(arr[1])) {
                receiverId = t.getID();
            }
        }
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date time = new Date();
            String date = formatter.format(time);
            String sorgu = "INSERT INTO mesaj(aliciid,gondericiid,gondericiEmail,tarih,metin) VALUES(?,?,?,?,?)";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            PreparedStatement pst = con.prepareStatement(sorgu);
            pst.setInt(1, receiverId);
            pst.setInt(2, studentID);
            pst.setString(3, studentEmail);
            pst.setString(4, date);
            pst.setString(5, teacherMsgArea.getText());
            pst.execute();
            messageLbl.setText("Successful");
            jDialog1.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        teacherMsgArea.setText("");
    }//GEN-LAST:event_btnTeacherSendActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String aliciid = (String) studentsCmbBox.getSelectedItem();
        String[] arr = aliciid.split(" ");
        int receiverId = 0;
        for (Person p : aliciList) {
            if (p.getName().equals(arr[0]) && p.getSurname().equals(arr[1])) {
                receiverId = p.getID();
            }
        }
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date time = new Date();
            String date = formatter.format(time);
            String sorgu = "INSERT INTO mesaj(aliciid,gondericiid,gondericiEmail,tarih,metin) VALUES(?,?,?,?,?)";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            PreparedStatement pst = con.prepareStatement(sorgu);
            pst.setInt(1, receiverId);
            pst.setInt(2, studentID);
            pst.setString(3, studentEmail);
            pst.setString(4, date);
            pst.setString(5, msgTxtArea.getText());
            pst.execute();
            messageLbl.setText("Successful");
            jDialog1.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        msgTxtArea.setText("");
    }//GEN-LAST:event_btnSendActionPerformed

    private void courseJoinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseJoinBtnActionPerformed
        int dersCount = 0;
        try {
            String sorgu = "select * from alinanders where ogrenci_idogrenci='" + studentID + "'";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            PreparedStatement pst = con.prepareStatement(sorgu);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                dersCount++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(studentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (dersCount < alinacakDersLimiti) {
            addCourse();
        } else {
            messageLbl.setText("You have maximum course.");
            courseCodetxt.setText("");
            jDialog1.setVisible(true);
        }
    }//GEN-LAST:event_courseJoinBtnActionPerformed

    private void courseCodetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseCodetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseCodetxtActionPerformed
    ArrayList<Message> msgList;

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(studentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentForm().setVisible(true);
            }
        });
    }
    
    void isVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea aciklamaArea;
    private javax.swing.JLabel basliklbl;
    private javax.swing.JButton btnAnnouncements;
    private javax.swing.JButton btnAssingments;
    private javax.swing.JButton btnCourses;
    private javax.swing.JButton btnInbox;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnSendMessage;
    private javax.swing.JButton btnTeacherSend;
    private javax.swing.JTextArea commentTxtArea;
    private javax.swing.JFrame commentsFrame;
    private javax.swing.JTextField courseCodetxt;
    private javax.swing.JButton courseJoinBtn;
    private javax.swing.JLabel dersAdiLbl;
    private javax.swing.JLabel dersIdLbl;
    private javax.swing.JTable duyuruTablo;
    private javax.swing.JLabel idpostLbl;
    private javax.swing.JTable inboxTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCourseCode;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblTeacherEmail;
    private javax.swing.JLabel lblTeacherName;
    private javax.swing.JLabel messageLbl;
    private javax.swing.JTextArea msgTxtArea;
    private javax.swing.JTextArea myAssngArea;
    private javax.swing.JLabel odevBaslikLbl;
    private javax.swing.JLabel odevidLbl;
    private javax.swing.JLabel ogrenciLbl;
    private javax.swing.JPanel postPanel;
    private javax.swing.JButton sendCommentButton;
    private javax.swing.JComboBox<String> studentsCmbBox;
    private javax.swing.JComboBox<String> teacherCmbBox;
    private javax.swing.JTextArea teacherMsgArea;
    private javax.swing.JTable yorumTablo;
    // End of variables declaration//GEN-END:variables
}
