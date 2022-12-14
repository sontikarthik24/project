/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controller.Adhar;

import java.awt.CardLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JPanel;
import model.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DateFormat;
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

        setBackground(new java.awt.Color(0, 102, 102));

        address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        phone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel4.setText("Address");

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel1.setText("Name");

        jLabel8.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Aadhar Portal");

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel2.setText("Date of Birth");

        jLabel5.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel5.setText("Phone");

        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(255, 204, 51));
        backButton.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel3.setText("Gender");

        jLabel6.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel6.setText("Email");

        submitButton.setBackground(new java.awt.Color(255, 204, 51));
        submitButton.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.setBorder(new javax.swing.border.MatteBorder(null));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        male.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        male.setText("Male");

        female.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        female.setText("Female");

        dob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel7.setText("Picture");

        uploadButton.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(male)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(female)
                                .addGap(8, 8, 8))
                            .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(name)
                            .addComponent(address)
                            .addComponent(phone)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uploadButton))))
                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(male)
                            .addComponent(female))
                        .addGap(18, 18, 18)
                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(uploadButton)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)))
                .addComponent(submitButton)
                .addContainerGap(125, Short.MAX_VALUE))
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
            if(name.getText().isEmpty() || name.getText().matches("^[A-Za-z]{1,}[\\\\s]{0,1}[A-Za-z]{0,}$") == false)
            {
                JOptionPane.showMessageDialog(this, "Enter a valid name");
                saveFlag = false;
            }  
            else if(male.isSelected() == false && female.isSelected()== false)
            {
                JOptionPane.showMessageDialog(this, "Please select Person Gender ");
                saveFlag = false;
            }
            else if(addresss.isEmpty() || addresss.matches("^[A-Za-z0-9 _]*[A-Za-z0-9][A-Za-z0-9 _]*$") == false)
            {
                JOptionPane.showMessageDialog(this, "Enter valid person House");
                saveFlag = false;
            }
            else if(phonee.isEmpty() || phonee.matches("[0-9]{10}$") ==  false)
            {
                JOptionPane.showMessageDialog(this, "Enter valid person Phone number");
                saveFlag = false;
            }
            else if(emaill.isEmpty() || emaill.matches("^(.+)@(.+)$") == false)
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

            db.disconnect();

            name.setText("");
            address.setText("");
            phone.setText("");
            email.setText("");
            dob.cleanup();
        }
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
