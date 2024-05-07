/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package empoyee;

import java.sql.*;
import javax.swing.JOptionPane;
public class payslip extends javax.swing.JFrame {


    public payslip() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 213, 174));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(212, 163, 115), 2));

        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("EMP id");

        jPanel2.setBackground(new java.awt.Color(250, 237, 205));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        t1.setColumns(20);
        t1.setRows(5);
        t1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(212, 163, 115), 3));
        jScrollPane1.setViewportView(t1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(212, 163, 115));
        jButton1.setText("Genrate Slip");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back-button.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, 0, 235, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jButton1))
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private boolean isComboBoxPopulated = false;
    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked

        if (!isComboBoxPopulated) {
            try {
                // Load the JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Establish the database connection
                try (Connection con = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "Suyash@261$");
                    Statement stm = con.createStatement();
                    ResultSet rs = stm.executeQuery("select * from employee")) {

                    // Clear existing items in choice1
                    jComboBox1.removeAllItems();

                    // Populate employee IDs into choice1
                    while (rs.next()) {
                        jComboBox1.addItem(rs.getString("empId"));
                    }

                    isComboBoxPopulated = true; // Set flag to true to indicate combo box is populated
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try {
    // Load the JDBC driver
    Class.forName("com.mysql.cj.jdbc.Driver");

    // Establish the database connection
    try (Connection con = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "Suyash@261$");
         Statement stm = con.createStatement()) {

        // Query to fetch employee details
        ResultSet rs = stm.executeQuery("select * from employee where empId=" + jComboBox1.getSelectedItem());
        if (rs.next()) {
            String name = rs.getString("name");
            rs.close();

            // Query to fetch employee salary details
           rs = stm.executeQuery("select * from empsalary where emp_id='" + jComboBox1.getSelectedItem() + "'");
            if (rs.next()) {
                double gross = 0;
                double net = 0;

                java.util.Date d1 = new java.util.Date();
                int month = d1.getMonth();
                int year = d1.getYear();

                // Set up text for pay slip
                t1.setText(" ----------------   PAY SLIP FOR THE MONTH OF " + month + " , " + year + "  ------------------------");
                t1.append("\n");
                t1.append("\n     Employee ID " + rs.getString("emp_id"));
                t1.append("\n     Employee Name " + name);
                t1.append("\n----------------------------------------------------------------");
                t1.append("\n");

                // Calculate salary components
                double hra = rs.getDouble("hra");
                t1.append("\n                  HRA         : " + hra);
                double da = rs.getDouble("da");
                t1.append("\n                  DA          : " + da);
                double med = rs.getDouble("ma");
                t1.append("\n                  MED         : " + med);
                double pf = rs.getDouble("pf");
                t1.append("\n                  PF          : " + pf);
                double basic = rs.getDouble("basic_salary");
                gross = hra + da + med + pf + basic;
                net = gross - pf;
                t1.append("\n                  BASIC SALARY : " + basic);

                t1.append("\n-------------------------------------------------------");
                t1.append("\n");

                t1.append("\n       GROSS SALARY :" + gross + "    \n       NET SALARY : " + net);
                t1.append("\n       Tax   :   2.1% of gross " + (gross * 2.1 / 100));
                t1.append("\n -------------------------------------------------");
                t1.append("\n");
                t1.append("\n");
                t1.append("\n");
                t1.append("   (  Signature  )      ");
            }
        }
    }
} catch (Exception ee) {
    ee.printStackTrace();
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new adminsalarybox().show();
       dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(payslip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payslip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payslip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payslip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payslip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea t1;
    // End of variables declaration//GEN-END:variables
}
