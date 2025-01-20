package pl;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class loginForm extends javax.swing.JFrame {

    
    baglanti b = new baglanti(); 
    public int tID = -1; // teacher id
    public Teacher teacher = new Teacher();//teacher class object

    public loginForm() {
        initComponents();
        lblEmuIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emu.png")).getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        radioTeacher = new javax.swing.JRadioButton();
        radioStudent = new javax.swing.JRadioButton();
        btnReset = new javax.swing.JButton();
        txtEmptyEmail = new javax.swing.JLabel();
        txtEmptyPass = new javax.swing.JLabel();
        txtEmptyRadio = new javax.swing.JLabel();
        lblLoginIcon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblEmuIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel.setBackground(new java.awt.Color(255, 255, 255));

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });

        jLabel2.setText("Password :");

        jLabel1.setText("Email :");

        btnLogin.setForeground(new java.awt.Color(0, 0, 153));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });

        radioTeacher.setBackground(new java.awt.Color(255, 255, 153));
        radioTeacher.setText("Teacher");
        radioTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTeacherActionPerformed(evt);
            }
        });
        radioTeacher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                radioTeacherKeyReleased(evt);
            }
        });

        radioStudent.setBackground(new java.awt.Color(255, 255, 153));
        radioStudent.setText("Student");
        radioStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioStudentActionPerformed(evt);
            }
        });
        radioStudent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                radioStudentKeyReleased(evt);
            }
        });

        btnReset.setForeground(new java.awt.Color(0, 0, 153));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblLoginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login2.jpg"))); // NOI18N
        lblLoginIcon.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 54)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(57, 8, 174));
        jLabel3.setText("S T L S");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblLoginIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(66, 66, 66))
                        .addGroup(jPanelLayout.createSequentialGroup()
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmptyEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLogin)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelLayout.createSequentialGroup()
                                    .addGap(99, 99, 99)
                                    .addComponent(btnReset)))
                            .addContainerGap()))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmptyPass, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(radioTeacher)
                                .addGap(18, 18, 18)
                                .addComponent(radioStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEmptyRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(lblEmuIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10))
                    .addComponent(lblEmuIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmptyEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(txtEmptyPass, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioTeacher)
                            .addComponent(radioStudent))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmptyRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogin)
                            .addComponent(btnReset))
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addComponent(lblLoginIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addIcon() {
        lblEmuIcon.setIcon(new ImageIcon(new ImageIcon("/icons/emu.png").getImage().getScaledInstance(lblEmuIcon.getWidth(), lblEmuIcon.getHeight(), Image.SCALE_DEFAULT)));

    }

    //select button
    private void radioStudentActionPerformed(java.awt.event.ActionEvent evt) { 
        
        if (radioStudent.isSelected()) {
            txtEmptyRadio.setText("");
            radioTeacher.setSelected(false);
        }
    }

    private void radioTeacherActionPerformed(java.awt.event.ActionEvent evt) { 
         
        if (radioTeacher.isSelected()) {
            txtEmptyRadio.setText("");
            radioStudent.setSelected(false);
        }
    } 

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        
        if (txtEmail.getText().trim().isEmpty() && txtPassword.getText().trim().isEmpty() && (!(radioTeacher.isSelected()) && !(radioStudent.isSelected()))) {
            txtEmptyEmail.setText("Email is empty!");
            txtEmptyPass.setText("Password is empty!");
            txtEmptyRadio.setText("The choice is empty!");
        } else if (txtPassword.getText().trim().isEmpty()) {
            txtEmptyPass.setText("Password is empty!");
        } else if (!(radioTeacher.isSelected()) && !(radioStudent.isSelected())) {
            txtEmptyRadio.setText("The choice is empty!");
        } else {
            
            String sorgu = "";
            int radioControl = -1; 
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
                if (radioStudent.isSelected()) { //if selected student
                    sorgu = "select *from ogrenci where email = '" + txtEmail.getText() + "' and sifre = '" + txtPassword.getText() + "'";
                    radioControl = 0;
                } else if (radioTeacher.isSelected()) { //if selected teacher
                    sorgu = "select *from ogretmen where email = '" + txtEmail.getText() + "' and sifre = '" + txtPassword.getText() + "'";
                    radioControl = 1;
                }
                PreparedStatement pst = con.prepareStatement(sorgu);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    
                    switch (radioControl) {
                        case 0:
                            int studentID = rs.getInt("idogrenci");
                            String studentNo = rs.getString("no");
                            String studentName = rs.getString("ad");
                            String studentSurname = rs.getString("soyad");
                            String studentEmail = rs.getString("email");
                            studentForm sf = new studentForm(studentID, studentNo, studentName, studentSurname, studentEmail);
                            setVisible(false);
                            sf.setVisible(true);
                            break;
                        
                        case 1:
                            tID = rs.getInt(1);
                            
                            teacher.setID(rs.getInt(1));
                            teacher.setName(rs.getString(2));
                            teacher.setSurname(rs.getString(3));
                            teacher.setEmail(rs.getString(4));
                            teacher.setPassword(rs.getString(5));
                            teacherMainForm t = new teacherMainForm();
                            t.oturumInfo(teacher.getID(), teacher.getName(), teacher.getSurname());
                            t.id1 = rs.getInt(1);
                            t.nameSurname = teacher.getName() + " " + teacher.getSurname();
                            t.Gemail = teacher.getEmail();
                            t.setVisible(true);
                            setVisible(false);
                            break;
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Email or password is wrong!");
                }

                con.close();
                txtEmail.setText("");
                txtPassword.setText("");
                radioStudent.setSelected(false);
                radioTeacher.setSelected(false);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        txtEmptyEmail.setText("");
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        txtEmptyPass.setText("");
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void radioTeacherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radioTeacherKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_radioTeacherKeyReleased

    private void radioStudentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radioStudentKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_radioStudentKeyReleased

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnLoginKeyPressed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtEmail.setText("");
        txtPassword.setText("");
        radioStudent.setSelected(false);
        radioTeacher.setSelected(false);
    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel lblEmuIcon;
    private javax.swing.JLabel lblLoginIcon;
    private javax.swing.JRadioButton radioStudent;
    private javax.swing.JRadioButton radioTeacher;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtEmptyEmail;
    private javax.swing.JLabel txtEmptyPass;
    private javax.swing.JLabel txtEmptyRadio;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
