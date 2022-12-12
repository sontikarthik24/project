/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controller.Adhar;

import java.awt.CardLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.System.Logger.Level;
import javax.swing.JPanel;
import model.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author karthiksonti
 */
public class AddAdharJPanel extends javax.swing.JPanel {
    JPanel layoutContainer;
    String username;
    public static int count = 0;
    String path;
    /**
     * Creates new form AddAdharJPanel
     */
    public AddAdharJPanel(JPanel layoutContainer, String username) {
        initComponents();
        this.layoutContainer = layoutContainer;
        this.username = username;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        address = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        dob = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        uploadButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 153));

        jLabel4.setText("Address");

        jLabel1.setText("Name");

        jLabel8.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Aadhar Portal");

        jLabel2.setText("Date of Birth");

        jLabel5.setText("Phone");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Gender");

        jLabel6.setText("Email");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        male.setText("Male");

        female.setText("Female");

        jLabel7.setText("Picture");

        uploadButton.setText("Upload");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(uploadButton)
                    .addComponent(male)
                    .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(name)
                    .addComponent(address)
                    .addComponent(phone)
                    .addComponent(email))
                .addGap(160, 160, 160))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(backButton)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(153, 153, 153)
                                .addComponent(female))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(submitButton)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(male)
                    .addComponent(female)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uploadButton)
                    .addComponent(jLabel7))
                .addGap(27, 27, 27)
                .addComponent(submitButton)
                .addGap(102, 102, 102))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.previous(layoutContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        Database db = new Database();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT);
        String gender = null;
        
        boolean saveFlag = true;
        String namee = name.getText();
        String addresss = address.getText();
        String phonee = phone.getText();
        String emaill = email.getText();
        if( saveFlag == true)
        {
            if(name.getText().isEmpty() || name.getText().matches("[A-Z a-z]*\\s*?") == false)
            {
                JOptionPane.showMessageDialog(this, "Enter a valid name");
                saveFlag = false;
            }  
            else if(male.isSelected() == false && female.isSelected()== false)
            {
                JOptionPane.showMessageDialog(this, "Please select Person Gender ");
                saveFlag = false;
            }
            else if(addresss.isEmpty() || addresss.matches("[A-Z a-z]*\\s*?") == false)
            {
                JOptionPane.showMessageDialog(this, "Enter valid person House");
                saveFlag = false;
            }
            else if(phonee.isEmpty() || phonee.matches("[0-9]+") ==  false)
            {
                JOptionPane.showMessageDialog(this, "Enter valid person Phone number");
                saveFlag = false;
            }
            else if(emaill.isEmpty() || emaill.matches("[A-Z a-z]*\\s*?") == false)
            {
                JOptionPane.showMessageDialog(this, "Enter valid person email");
                saveFlag = false;
            }
        }
        if(saveFlag == true)
        {
            try {
                InputStream is = new FileInputStream(new File(path));
                Connection conn = db.connect();
                String sql = "insert into adharapplications(id, name, dob, gender, address, phone, email, status, username, picture) values(?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setInt(1, count++);
                statement.setString(2, name.getText());
                statement.setString(3, dateFormat.format(dob.getDate()));
                if(male.isSelected()) {
                    gender = "male";
                    male.setSelected(false);
                }
                if(female.isSelected()) {
                    gender = "female";
                    female.setSelected(false);
                }
                statement.setString(4, gender);
                statement.setString(5, address.getText());
                statement.setString(6, phone.getText());
                statement.setString(7, email.getText());
                statement.setString(8, "Submitted");
                statement.setString(9, username);
                statement.setBlob(10, is);
                int a = statement.executeUpdate();

                JOptionPane.showMessageDialog(this, "Registration Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                java.util.logging.Logger.getLogger(AddAdharJPanel.class.getName());
            }
        }

        db.disconnect();

        name.setText("");
        address.setText("");
        phone.setText("");
        email.setText("");
        dob.cleanup();
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        File f = fileChooser.getSelectedFile();
        path=f.getAbsolutePath();
        JOptionPane.showMessageDialog(this, "Picture Uploaded Successfully");
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton backButton;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}
