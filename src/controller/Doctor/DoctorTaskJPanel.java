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

        setBackground(new java.awt.Color(255, 153, 153));

        doctorTask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Booking Id", "patient", "reason"
            }
        ));
        jScrollPane1.setViewportView(doctorTask);

        BackButton.setText("<<BACK");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        addNotes.setText("Add Notes");
        addNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNotesActionPerformed(evt);
            }
        });

        viewPatientHistory.setText("View Patient History");
        viewPatientHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientHistoryActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Doctor's Tasks");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(BackButton)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(addNotes)
                        .addGap(49, 49, 49)
                        .addComponent(viewPatientHistory))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNotes)
                    .addComponent(viewPatientHistory))
                .addContainerGap(247, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton addNotes;
    private javax.swing.JTable doctorTask;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewPatientHistory;
    // End of variables declaration//GEN-END:variables
}
