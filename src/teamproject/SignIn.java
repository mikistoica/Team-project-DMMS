/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import teamproject.app.MyDBApp;

/**
 *
 * @author Mihaela
 */
public class SignIn extends javax.swing.JFrame {

    /**
     * Creates new form SignIn
     */
    public SignIn() {
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

        lblsignin = new javax.swing.JLabel();
        siusername = new javax.swing.JLabel();
        txtsiusername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtsipassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        loginbtn = new javax.swing.JButton();
        txtfirstname = new javax.swing.JTextField();
        txtsurname = new javax.swing.JTextField();
        txtcausername = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtcapassword = new javax.swing.JPasswordField();
        txtconfirmpassword = new javax.swing.JPasswordField();
        forgottenpasbtn = new javax.swing.JButton();
        signinbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        lblsignin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblsignin.setForeground(new java.awt.Color(0, 51, 0));
        lblsignin.setText("Log in to your account");

        siusername.setForeground(new java.awt.Color(0, 51, 0));
        siusername.setText("Username:");

        txtsiusername.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtsiusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsiusernameActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 51, 0));
        jLabel1.setText("Password: ");

        txtsipassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 0));
        jLabel3.setText("Create an account");

        loginbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(0, 51, 0));
        loginbtn.setText("Log in");
        loginbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0)));
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        txtfirstname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Firstname", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 0))); // NOI18N

        txtsurname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Surname", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 0))); // NOI18N

        txtcausername.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create a username", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 0))); // NOI18N

        txtphone.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Phone number", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 0))); // NOI18N

        txtcapassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create a password", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 0))); // NOI18N

        txtconfirmpassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Confirm password", 0, 0, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 0))); // NOI18N

        forgottenpasbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        forgottenpasbtn.setForeground(new java.awt.Color(0, 51, 0));
        forgottenpasbtn.setText("Forgotten your password?");
        forgottenpasbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0)));
        forgottenpasbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgottenpasbtnActionPerformed(evt);
            }
        });

        signinbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signinbtn.setForeground(new java.awt.Color(0, 51, 0));
        signinbtn.setText("Sign in");
        signinbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0)));
        signinbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtsipassword, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(siusername)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtsiusername, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(forgottenpasbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtcapassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txtcausername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfirstname, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtsurname, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(txtphone)
                            .addComponent(txtconfirmpassword)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(lblsignin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(signinbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblsignin)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siusername)
                    .addComponent(txtsiusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtsipassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(forgottenpasbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfirstname)
                    .addComponent(txtsurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcausername)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcapassword)
                    .addComponent(txtconfirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signinbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsiusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsiusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsiusernameActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginbtnActionPerformed

    private void signinbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinbtnActionPerformed
        // TODO add your handling code here:
        try {
            
            String sql = "insert into CUSTOMERS (id, firstname, surname, username, phone, password) values (?, ?, ?, ?, ?, ?)";
            String firstname, surname, username, password;
            int phone = 0;
            
            firstname = txtfirstname.getText();
            surname = txtsurname.getText();
            username = txtcausername.getText();
            password = txtcapassword.getText();
            
            try {
                phone = Integer.parseInt(txtphone.getText());
            } catch (Exception e) {
                txtphone.setText("Enter a number please");
                txtfirstname.setText("Enter firstname please");
                txtsurname.setText("Enter surname please");
                txtcausername.setText("Enter username please");
            }
            
            if(phone!=0) {
                MyDBApp con = new MyDBApp();
                con.makeDbConnection();
                Statement statement = con.dbConnection.createStatement();
                
                //Generate a random id for each customer
                //The customer does not have access to the id, it s just for administration purposes
                Random rand = new Random();
                int id = rand.nextInt(50) + 1;
                statement.executeUpdate("INSERT INTO CUSTOMERS VALUES (" + id + ",'" + firstname +"','" +surname
                        + "','" +username+ "','" +phone+"'," +password+ ")");
                
                JOptionPane.showMessageDialog(null, "WELCOME! \n Your details have been saved!"
                        + " \n \n You can now log into your account using your username and password!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_signinbtnActionPerformed

    private void forgottenpasbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgottenpasbtnActionPerformed
        // TODO add your handling code here:
        forgottenpasbtn.addActionListener(new ActionListener() { //dont click more than once
            @Override
            public void actionPerformed(ActionEvent e) {
                new ForgottenPassword().setVisible(true);
                new SignIn().setVisible(false);
            }
        });
    }//GEN-LAST:event_forgottenpasbtnActionPerformed

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton forgottenpasbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblsignin;
    private javax.swing.JButton loginbtn;
    private javax.swing.JButton signinbtn;
    private javax.swing.JLabel siusername;
    private javax.swing.JPasswordField txtcapassword;
    private javax.swing.JTextField txtcausername;
    private javax.swing.JPasswordField txtconfirmpassword;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtphone;
    private javax.swing.JPasswordField txtsipassword;
    private javax.swing.JTextField txtsiusername;
    private javax.swing.JTextField txtsurname;
    // End of variables declaration//GEN-END:variables
}
