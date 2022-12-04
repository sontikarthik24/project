/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controller.Doctor;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.Database;
import model.History;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author karthiksonti
 */
public class DoctorViewHistoryJPanel extends javax.swing.JPanel {
    JPanel layoutContainer;
    String patient;
    /**
     * Creates new form DoctorViewHistoryJPanel
     */
    public DoctorViewHistoryJPanel (JPanel layoutContainer, String patient) {
        initComponents();
        this.layoutContainer = layoutContainer;
        this.patient = patient;
        
        getHistory();
    }
    
    private ArrayList<History> doctorList() {
        ArrayList<History> doctorList = new ArrayList<>();
        
        Database db = new Database();
        
        try {
            Connection conn = db.connect();
            String sql = "select * from patienthistory where patient=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, patient);
            ResultSet a = statement.executeQuery();
            History h;
            while(a.next()) {
                doctorList.add(new History(a.getString("bookingid"), a.getString("patient"), a.getString("doctor"), a.getInt("pulse"), a.getInt("bp"), a.getInt("temp"), a.getString("drugs"),a.getString("notes")));
            }
            
            db.disconnect();
        } catch (Exception ex) {
            Logger.getLogger(DoctorViewHistoryJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return doctorList;
    }
    private void getHistory(){
        ArrayList<History> hospitalList = doctorList();
        DefaultTableModel model = (DefaultTableModel) historyData.getModel();
        model.setRowCount(0);
        for(History h: doctorList()){
            Object[] row = new Object[7];
            row[0] = h.getBookingId();
            row[1] = h.getDoctor();
            row[2] = h.getPulse();
            row[3] = h.getBp();
            row[4] = h.getTemp();
            row[5] = h.getDrugs();
            row[6] = h.getNotes();
            
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
        historyData = new javax.swing.JTable();
        backButton = new javax.swing.JButton();

        historyData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Bookingid", "Doctor", "Pulse", "BP", "Temp", "drugs", "notes"
            }
        ));
        jScrollPane1.setViewportView(historyData);

        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(backButton)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.previous(layoutContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable historyData;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}