/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import connection.ConnectionProvider;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UpdateUser extends javax.swing.JFrame {
    
    private String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    private String mobieNumberPattern = "^[0-9]+&";
    /**
     * Creates new form UpdateUser
     */
    public UpdateUser() {
        initComponents();
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtSearchEmail = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dobChooser = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        roleSelector = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        iconValidator = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Update User");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 6, 218, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1000, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("User's email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 101, -1, -1));

        txtSearchEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtSearchEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 98, 304, -1));

        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 98, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 179, 145, -1));

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 210, 300, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Mobile Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 269, 145, -1));

        txtMobileNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 300, 300, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 358, 145, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 389, 300, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Date of Birth");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 179, 136, -1));

        dobChooser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(dobChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 210, 300, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Role");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 269, 145, -1));

        roleSelector.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        roleSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Pharmacist" }));
        getContentPane().add(roleSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 300, 300, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 358, 145, -1));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 389, 300, -1));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, -1, -1));

        iconValidator.setText("jLabel9");
        getContentPane().add(iconValidator, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1000, 10));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased

        String email = txtEmail.getText();
        if(!email.equals("")){
            iconValidator.setVisible(true);
            iconValidator.setIcon(new ImageIcon("src\\images\\yes.png"));
            iconValidator.setText("");
            

            try{
                Connection con = ConnectionProvider.getConnection();
                Statement statement = con.createStatement();
                ResultSet result = statement.executeQuery("select * from appUser where email='"+email+"'");
                while(result.next()){
                    iconValidator.setIcon(new ImageIcon("src\\images\\no.png"));
                    iconValidator.setText("");
                }
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);}
        }
        else{
            iconValidator.setVisible(false);
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
         int checkUserExist = 0;
         String searchEmail = txtSearchEmail.getText();
         if(searchEmail.equals("")){
             JOptionPane.showMessageDialog(null,"Enter email of the user!");
         }
         else{
             SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
             try{
                 Connection con = ConnectionProvider.getConnection();
                 Statement statement = con.createStatement();
                 ResultSet result = statement.executeQuery("select * from appuser where email='"+searchEmail+"'");
                 while(result.next()){
                     txtSearchEmail.setEditable(false);
                     checkUserExist = 1;
                    txtName.setText(result.getString("name"));
                    txtMobileNumber.setText(result.getString("mobileNumber"));
                    txtEmail.setText(result.getString("email"));
                    txtPassword.setText(result.getString("password"));
                     String dob = result.getString("dob");
                     if(dob != null){
                         try{
                             dobChooser.setDate(dFormat.parse(dob));
                         }
                         catch(Exception ex){}
                     }
                     if(result.getString("userRole").equals("Admin")){
                         roleSelector.removeAllItems();
                         roleSelector.addItem("Admin");
                         roleSelector.addItem("Pharmacist");
                         
                     }
                     else{
                         roleSelector.removeAllItems();
                         roleSelector.addItem("Pharmacist");
                         roleSelector.addItem("Admin");
                     }
                 }
                 
             }
             catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
             }
             
             if(checkUserExist==0){
                 JOptionPane.showMessageDialog(null, "User does not exist!");
             }
         }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String name = txtName.getText();
        SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dobChooser.getDate();
        System.out.println(date);
        String dob = "";
        if(date != null){
            dob = dFormat.format(dobChooser.getDate());
        }
        System.out.println(dob);
        String mobileNumber = txtMobileNumber.getText();
        String role = (String) roleSelector.getSelectedItem();
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        
        if(name.equals("") || dob.equals("") 
                || role.equals("") || email.equals("") || password.equals("")){
            JOptionPane.showMessageDialog(null, "All feilds are required!");
        }
        else if(mobileNumber.matches(mobieNumberPattern) || mobileNumber.length() != 10){
            JOptionPane.showMessageDialog(null, "Mobile number is invalid!");
        }
        else if(mobileNumber.matches(emailPattern)){
            JOptionPane.showMessageDialog(null, "Email address is invalid!");
        }
        else{
            try{
                Connection con = ConnectionProvider.getConnection();
                String searchEmail = txtSearchEmail.getText();
                PreparedStatement pst = con.prepareStatement("update appUser set userRole=?,name=?,dob=?,mobileNumber=?,email=?,password=? where email='"+searchEmail+"' ");
                pst.setString(1, role);
                pst.setString(2, name);
                pst.setString(3, dob);
                pst.setString(4, mobileNumber);
                pst.setString(5, email);
                pst.setString(6, password);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"User updated successfully!");
                setVisible(false);
                new UpdateUser().setVisible(true);
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JDateChooser dobChooser;
    private javax.swing.JLabel iconValidator;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> roleSelector;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSearchEmail;
    // End of variables declaration//GEN-END:variables
}
