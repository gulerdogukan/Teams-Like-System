
package pl;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class teacherCoursesForm extends javax.swing.JFrame {

    
    baglanti b = new baglanti();
    protected int idd;//ogretmen id almak için
    int dersID;

    public teacherCoursesForm() {
        initComponents();
        addIcons();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnListCourses = new javax.swing.JButton();
        btnAddCourse = new javax.swing.JButton();
        btnDeleteCourse = new javax.swing.JButton();
        btnUpdateCourse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCourseCode = new javax.swing.JTextField();
        txtCourseName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblIconList = new javax.swing.JLabel();
        lblIconAdd = new javax.swing.JLabel();
        lblIconUpdate = new javax.swing.JLabel();
        lblIconDelete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Teacher Courses");

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        btnListCourses.setBackground(new java.awt.Color(204, 204, 204));
        btnListCourses.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnListCourses.setForeground(new java.awt.Color(255, 0, 0));
        btnListCourses.setText("List Courses");
        btnListCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListCoursesActionPerformed(evt);
            }
        });

        btnAddCourse.setBackground(new java.awt.Color(204, 204, 204));
        btnAddCourse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddCourse.setForeground(new java.awt.Color(255, 0, 0));
        btnAddCourse.setText("Add Course");
        btnAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCourseActionPerformed(evt);
            }
        });

        btnDeleteCourse.setBackground(new java.awt.Color(204, 204, 204));
        btnDeleteCourse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDeleteCourse.setForeground(new java.awt.Color(255, 0, 0));
        btnDeleteCourse.setText("Delete Course");
        btnDeleteCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCourseActionPerformed(evt);
            }
        });

        btnUpdateCourse.setBackground(new java.awt.Color(204, 204, 204));
        btnUpdateCourse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdateCourse.setForeground(new java.awt.Color(255, 0, 0));
        btnUpdateCourse.setText("Update Course");
        btnUpdateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCourseActionPerformed(evt);
            }
        });

        jLabel1.setText("Course Code: ");

        jLabel2.setText("Course Name: ");

        txtCourseCode.setBackground(new java.awt.Color(255, 255, 153));

        txtCourseName.setBackground(new java.awt.Color(255, 255, 153));

        jTable1.setBackground(new java.awt.Color(255, 255, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Code", "Name", "Teacher id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblIconList, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIconAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblIconUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateCourse)
                        .addGap(18, 18, 18)
                        .addComponent(lblIconDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(btnDeleteCourse)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblIconList, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblIconAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblIconDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIconUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnUpdateCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDeleteCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAddCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnListCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void addIcons() {
        lblIconList.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/list.png")).getImage().getScaledInstance(38, 38, Image.SCALE_SMOOTH)));
        lblIconAdd.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.jpg")).getImage().getScaledInstance(38, 38, Image.SCALE_SMOOTH)));
        lblIconUpdate.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.jpg")).getImage().getScaledInstance(38, 38, Image.SCALE_SMOOTH)));
        lblIconDelete.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.jpg")).getImage().getScaledInstance(38, 38, Image.SCALE_SMOOTH)));

    }

    private void btnListCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListCoursesActionPerformed
        // TODO add your handling code here:
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            String sorgu = "select * from ders where idogretmen = '" + idd + "'";
            DefaultTableModel tm = new DefaultTableModel();
            PreparedStatement pst = con.prepareStatement(sorgu);
            ResultSet rs = pst.executeQuery();

            String[] columns = {"id", "Code", "Name", "Teacher id"};
            for (int i = 0; i < 4; i++) {
                tm.addColumn(columns[i]);
            }
            while (rs.next()) {
                Object[] row = new Object[4];
                for (int i = 1; i <= 4; i++) {
                    row[i - 1] = rs.getObject(i);
                }

                tm.addRow(row);
            }
            jTable1.setModel(tm);
            con.close();
            txtCourseCode.setText("");
            txtCourseName.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnListCoursesActionPerformed


    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        dersID = Integer.valueOf(String.valueOf(jTable1.getValueAt(row, 0)));
        txtCourseCode.setText(String.valueOf(jTable1.getValueAt(row, 1)));
        txtCourseName.setText(String.valueOf(jTable1.getValueAt(row, 2)));
    }//GEN-LAST:event_jTable1MousePressed

    private void btnAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCourseActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            String sorgu = "insert into ders(kod,ad,idogretmen) values(?,?,?)";
            PreparedStatement pst = con.prepareStatement(sorgu);
            if (!(txtCourseCode.getText().equals("") && txtCourseName.getText().equals("")) && !(txtCourseCode.getText().equals("") || txtCourseName.getText().equals(""))) {
                pst.setString(1, txtCourseCode.getText());
                pst.setString(2, txtCourseName.getText());
                pst.setInt(3, idd);
                pst.execute();
            }
            con.close();
            btnListCoursesActionPerformed(evt);
            txtCourseCode.setText("");
            txtCourseName.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnAddCourseActionPerformed

    private void btnUpdateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCourseActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            if (!(txtCourseCode.getText().equals("") && txtCourseName.getText().equals("")) && !(txtCourseCode.getText().equals("") || txtCourseName.getText().equals(""))) {
                String sorgu = "update ders set kod=?,ad=? where idders = ?";
                PreparedStatement pst = con.prepareStatement(sorgu);
                pst.setString(1, txtCourseCode.getText());
                pst.setString(2, txtCourseName.getText());
                pst.setInt(3, dersID);
                pst.execute();
            }
            con.close();
            btnListCoursesActionPerformed(evt);
            txtCourseCode.setText("");
            txtCourseName.setText("");
            dersID = -1;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnUpdateCourseActionPerformed

    private void btnDeleteCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCourseActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(b.getUrl(), b.getRoot(), b.getSifre());
            String sorgu = "delete from ders where idders = ?";
            PreparedStatement pst = con.prepareStatement(sorgu);
            pst.setInt(1, dersID);
            pst.execute();
            con.close();
            btnListCoursesActionPerformed(evt);
            txtCourseCode.setText("");
            txtCourseName.setText("");
            dersID = -1;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnDeleteCourseActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(teacherCoursesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teacherCoursesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teacherCoursesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teacherCoursesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teacherCoursesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCourse;
    private javax.swing.JButton btnDeleteCourse;
    private javax.swing.JButton btnListCourses;
    private javax.swing.JButton btnUpdateCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblIconAdd;
    private javax.swing.JLabel lblIconDelete;
    private javax.swing.JLabel lblIconList;
    private javax.swing.JLabel lblIconUpdate;
    private javax.swing.JTextField txtCourseCode;
    private javax.swing.JTextField txtCourseName;
    // End of variables declaration//GEN-END:variables
}
