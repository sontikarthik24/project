/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controller.Doctor;

import controller.Network.ViewNetworkJPanel;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Database;
import model.Doctor;

/**
 *
 * @author karthiksonti
 */
public class BookDoctorJPanel extends javax.swing.JPanel {
    JPanel layoutContainer;
    String username;
    /**
     * Creates new form BookDoctorJPanel
     */
    public BookDoctorJPanel(JPanel layoutContainer, String username) {
        initComponents();
        this.layoutContainer = layoutContainer;
        this.username = username;
        
        addDoctorData();
    }
    
    private ArrayList<Doctor> doctorList() {
        ArrayList<Doctor> doctorList = new ArrayList<>();
        
        Database db = new Database();
        
        try {
            Connection conn = db.connect();
            String sql = "select * from doctordata";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet a = statement.executeQuery();
            Doctor d;
            while(a.next()) {
                doctorList.add(new Doctor(a.getInt("id"), a.getString("doctor"), a.getString("hospitalname")));
            }
            
            db.disconnect();
        } catch (Exception ex) {
            Logger.getLogger(ViewNetworkJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return doctorList;
    }
    private void addDoctorData(){
        ArrayList<Doctor> hospitalList = doctorList();
        DefaultTableModel model = (DefaultTableModel) doctorData.getModel();
        model.setRowCount(0);
        for(Doctor d: doctorList()){
            Object[] row = new Object[3];
            
            row[0] = d.getDoctorId();
            row[1] = d.getDoctorName();
            row[2] = d.getHospitalName();

            
            model.addRow(row);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        reason = new javax.swing.JTextField();
        appointmentButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 153));

        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        doctorData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Doctor ", "Hospital"
            }
        ));
        jScrollPane1.setViewportView(doctorData);

        jLabel1.setText("Reason for visit");

        appointmentButton.setText("Book Appointment");
        appointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Book Doctor's Appointment");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(reason, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(appointmentButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(backButton)
                .addGap(98, 98, 98)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backButton)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(reason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addComponent(appointmentButton)
                .addContainerGap(224, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.previous(layoutContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void appointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentButtonActionPerformed
        // TODO add your handling code here:
        int rowIndex = doctorData.getSelectedRow();
        if (rowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row for selecting a doctor", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Database db = new Database();
        try {
            Connection conn = db.connect();
            String sql = "insert into doctortask (bookingid, patient, doctor, hospital, reason, status) values(?,?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, getFileNo());
            statement.setString(2, username);
            statement.setString(3, doctorData.getValueAt(rowIndex, 1).toString());
            statement.setString(4, doctorData.getValueAt(rowIndex, 2).toString());
            statement.setString(5, reason.getText());
            statement.setString(6, "Booked");
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Successfully booked", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(BookDoctorJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.disconnect();
        
        reason.setText("");
    }//GEN-LAST:event_appointmentButtonActionPerformed

    public String getFileNo() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 8;
        for(int i = 0; i < length; i++) {
          int index = random.nextInt(alphabet.length());
          char randomChar = alphabet.charAt(index);
          sb.append(randomChar);
        }
        return sb.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appointmentButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTable doctorData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField reason;
    // End of variables declaration//GEN-END:variables
}
