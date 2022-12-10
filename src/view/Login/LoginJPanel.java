/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.Login;

import controller.Admin.AdminJPanel;
import controller.Doctor.ManageDoctorJPanel;
import controller.Hospital.ManageHospitalJPanel;
import controller.Passport.PasportAdminJPanel;
import controller.Person.ManagePersonJPanel;
import controller.Police.PoliceAdminJPanel;
import controller.Police.PoliceJPanel;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Database;

/**
 *
 * @author karthiksonti
 */
public class LoginJPanel extends javax.swing.JPanel {
    JPanel layoutContainer;
    Connection conn;
    /**
     * Creates new form LoginJPanel
     */
    public LoginJPanel(JPanel layoutContainer) {
        initComponents();
        this.layoutContainer = layoutContainer;
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
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Register/Images/login.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(loginButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(40, 40, 40)
                .addComponent(loginButton)
                .addContainerGap(235, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        Database db = new Database();
        
        try {
            conn = db.connect();
            String sql = "select * from userdata where username=? and password=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username.getText());
            statement.setString(2, password.getText());
            ResultSet a = statement.executeQuery();
        
            if(a.next()) {
                JOptionPane.showMessageDialog(this, "Login Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
                if(a.getString("role").equals("Person")){
                    ManagePersonJPanel mpjp = new ManagePersonJPanel(layoutContainer);
                    layoutContainer.add("ManagePersonJPanel", mpjp);
                    CardLayout layout = (CardLayout) layoutContainer.getLayout();
                    layout.next(layoutContainer);
                }
                else if(a.getString("role").equals("Passport")){
                    PasportAdminJPanel pajp = new PasportAdminJPanel(layoutContainer);
                    layoutContainer.add("PassportAdminJPanel", pajp);
                    CardLayout layout = (CardLayout) layoutContainer.getLayout();
                    layout.next(layoutContainer);
                }
                else if(a.getString("role").equals("Policeadmin")){
                    PoliceAdminJPanel pajp = new PoliceAdminJPanel(layoutContainer);
                    layoutContainer.add("PoliceAdminJPanel", pajp);
                    CardLayout layout = (CardLayout) layoutContainer.getLayout();
                    layout.next(layoutContainer);
                }
                else if(a.getString("role").equals("Police")){
                    PoliceJPanel pjp = new PoliceJPanel(layoutContainer, username.getText());
                    layoutContainer.add("PoliceJPanel", pjp);
                    CardLayout layout = (CardLayout) layoutContainer.getLayout();
                    layout.next(layoutContainer);
                }
                else if(a.getString("role").equals("Hospitaladmin")){
                    ManageHospitalJPanel mhjp = new ManageHospitalJPanel(layoutContainer);
                    layoutContainer.add("ManageHospitalJPanel", mhjp);
                    CardLayout layout = (CardLayout) layoutContainer.getLayout();
                    layout.next(layoutContainer);
                }
                else if(a.getString("role").equals("Doctoradmin")){
                    ManageDoctorJPanel mdjp = new ManageDoctorJPanel(layoutContainer);
                    layoutContainer.add("ManageDoctorJPanel", mdjp);
                    CardLayout layout = (CardLayout) layoutContainer.getLayout();
                    layout.next(layoutContainer);
                }
                else {
                    AdminJPanel ajp = new AdminJPanel(layoutContainer);
                    layoutContainer.add("AdminJPanel", ajp);
                    CardLayout layout = (CardLayout) layoutContainer.getLayout();
                    layout.next(layoutContainer);
                }
            } else{
                JOptionPane.showMessageDialog(this, "Login Failed !!!!!!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(LoginJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        db.disconnect();
        username.setText("");
        password.setText("");
    }//GEN-LAST:event_loginButtonActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
