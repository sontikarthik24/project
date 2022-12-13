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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Database;
import model.DoctorTask;

/**
 *
 * @author karthiksonti
 */
public class DoctorTaskJPanel extends javax.swing.JPanel {
    String doctor;
    String hospital;
    JPanel layoutContainer;
    /**
     * Creates new form DoctorTaskJPanel
     */
    public DoctorTaskJPanel(JPanel layoutContainer, String doctor) {
        initComponents();
        this.layoutContainer = layoutContainer;
        this.doctor = doctor;
        
        addDoctorTasks();
        
    }
    
    private ArrayList<DoctorTask> doctorTaskList() {
        ArrayList<DoctorTask> doctorTaskList = new ArrayList<>();
        
        Database db = new Database();
        
        try {
            Connection conn = db.connect();
            
            String hospitalName = "select hospitalname from doctordata where doctor=?";
            PreparedStatement hstatement = conn.prepareStatement(hospitalName);
            hstatement.setString(1, doctor);
            ResultSet h = hstatement.executeQuery();
            while(h.next()) {
                hospital = h.getString("hospitalname");
            }
            
            String sql = "select * from doctortask where doctor=? and status=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, doctor);
            statement.setString(2, "booked");
            ResultSet a = statement.executeQuery();
            DoctorTask d;
            while(a.next()) {
                doctorTaskList.add(new DoctorTask(a.getString("bookingid"), a.getString("patient"), a.getString("reason")));
            }
            
            db.disconnect();
        } catch (Exception ex) {
            Logger.getLogger(ViewNetworkJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return doctorTaskList;
    }
    
    public void addDoctorTasks(){
        ArrayList<DoctorTask> hospitalList = doctorTaskList();
        DefaultTableModel model = (DefaultTableModel) doctorTask.getModel();
        model.setRowCount(0);
        for(DoctorTask d: doctorTaskList()){
            Object[] row = new Object[3];
            
            row[0] = d.getBookingId();
            row[1] = d.getPatient();
            row[2] = d.getReason();

            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        doctorTask = new javax.swing.JTable();
        BackButton = new javax.swing.JButton();
        addNotes = new javax.swing.JButton();
        viewPatientHistory = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        doctorTask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Booking Id", "Patient", "Reason"
            }
        ));
        jScrollPane1.setViewportView(doctorTask);

        BackButton.setBackground(new java.awt.Color(255, 204, 51));
        BackButton.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        BackButton.setText("<<BACK");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        addNotes.setBackground(new java.awt.Color(255, 204, 51));
        addNotes.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        addNotes.setText("Add Notes");
        addNotes.setBorder(new javax.swing.border.MatteBorder(null));
        addNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNotesActionPerformed(evt);
            }
        });

        viewPatientHistory.setBackground(new java.awt.Color(255, 204, 51));
        viewPatientHistory.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        viewPatientHistory.setText("View Patient History");
        viewPatientHistory.setBorder(new javax.swing.border.MatteBorder(null));
        viewPatientHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientHistoryActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Doctor's Tasks");

        jButton1.setBackground(new java.awt.Color(255, 204, 51));
        jButton1.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(addNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(viewPatientHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(BackButton)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(BackButton))))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNotes)
                    .addComponent(viewPatientHistory))
                .addContainerGap(244, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.previous(layoutContainer);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void addNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNotesActionPerformed
        // TODO add your handling code here:
        int rowIndex = doctorTask.getSelectedRow();
        if (rowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row for adding data to patient", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        DoctorAddNotesJPanel danjp = new DoctorAddNotesJPanel(layoutContainer, doctorTask.getValueAt(rowIndex,0).toString(), doctorTask.getValueAt(rowIndex,1).toString(), doctor, hospital);
        layoutContainer.add("DoctorAddNotesJPanel", danjp);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.next(layoutContainer);
        addDoctorTasks();
        DefaultTableModel model = (DefaultTableModel) doctorTask.getModel();
        model.removeRow(rowIndex);
    }//GEN-LAST:event_addNotesActionPerformed

    private void viewPatientHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientHistoryActionPerformed
        // TODO add your handling code here:
        int rowIndex = doctorTask.getSelectedRow();
        if (rowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row for view patient history", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Database db = new Database();
        
        try {
            Connection conn = db.connect();
            String sql = "select * from patienthistory where patient=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, doctorTask.getValueAt(rowIndex,1).toString());
            ResultSet a = statement.executeQuery();
            if(a.next()) {
                DoctorViewHistoryJPanel dvhjp = new DoctorViewHistoryJPanel(layoutContainer, doctorTask.getValueAt(rowIndex,1).toString());
                layoutContainer.add("DoctorViewHistoryJPanel", dvhjp);
                CardLayout layout = (CardLayout) layoutContainer.getLayout();
                layout.next(layoutContainer);
            }
            else {
                JOptionPane.showMessageDialog(this, "No history", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            Logger.getLogger(DoctorTaskJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewPatientHistoryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.first(layoutContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton addNotes;
    private javax.swing.JTable doctorTask;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewPatientHistory;
    // End of variables declaration//GEN-END:variables
}
