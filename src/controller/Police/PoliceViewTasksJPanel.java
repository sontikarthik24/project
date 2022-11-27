/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controller.Police;

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
import model.Task;

/**
 *
 * @author karthiksonti
 */
public class PoliceViewTasksJPanel extends javax.swing.JPanel {
    JPanel layoutContainer;
    String police;
    /**
     * Creates new form PoliceViewTasksJPanel
     */
    public PoliceViewTasksJPanel(JPanel layoutContainer, String police) {
        initComponents();
        this.layoutContainer = layoutContainer;
        this.police = police;
        
        addTasksData();
    }
    
    private ArrayList<Task> taskList() {
        ArrayList<Task> taskList = new ArrayList<>();
        
        Database db = new Database();
        
        try {
            Connection conn = db.connect();
            String sql = "select * from passporttask where police=? and status=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, police);
            statement.setString(2, "Assigned");
            ResultSet a = statement.executeQuery();
            Task t;
            while(a.next()) {
                taskList.add(new Task(a.getString("fileno"), a.getString("status")));
            }
            db.disconnect();
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(PoliceViewTasksJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
                
        return taskList;
    }
    
    private void addTasksData(){
        ArrayList<Task> taskList = taskList();
        DefaultTableModel model = (DefaultTableModel) taskData.getModel();
        model.setRowCount(0);
        for(Task t : taskList()){
            Object[] row = new Object[2];
            
            row[0] = t.getId();
            row[1] = t.getStatus();
            
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

        backButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taskData = new javax.swing.JTable();
        passButton = new javax.swing.JButton();
        failButton = new javax.swing.JButton();

        backButton7.setText("<<BACK");
        backButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton7ActionPerformed(evt);
            }
        });

        taskData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "fileno"
            }
        ));
        jScrollPane1.setViewportView(taskData);

        passButton.setText("Pass Verification");
        passButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passButtonActionPerformed(evt);
            }
        });

        failButton.setText("Fail Verification");
        failButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                failButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton7)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(passButton)
                        .addGap(43, 43, 43)
                        .addComponent(failButton)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(backButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passButton)
                    .addComponent(failButton))
                .addContainerGap(133, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton7ActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.previous(layoutContainer);
    }//GEN-LAST:event_backButton7ActionPerformed

    private void passButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passButtonActionPerformed
        // TODO add your handling code here:
        int rowIndex = taskData.getSelectedRow();
        if (rowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row for passing the police check", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Database db = new Database();
        
        try {
            Connection conn = db.connect();
            String sql = "update passportdata set status=? where fileno=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "verification passed");
            statement.setString(2, taskData.getValueAt(rowIndex, 0).toString());
            statement.executeUpdate();
            
            String sql1 = "update passporttask set status=? where fileno=?";
            PreparedStatement statement1 = conn.prepareStatement(sql1);
            statement1.setString(1, "done");
            statement1.setString(2, taskData.getValueAt(rowIndex, 0).toString());
            int a = statement1.executeUpdate();
            
            db.disconnect();
            addTasksData();
                    
        } catch (Exception ex) {
            Logger.getLogger(PoliceViewTasksJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_passButtonActionPerformed

    private void failButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_failButtonActionPerformed
        // TODO add your handling code here:
        int rowIndex = taskData.getSelectedRow();
        if (rowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row for passing the police check", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Database db = new Database();
        
        try {
            Connection conn = db.connect();
            String sql = "update passportdata set status=? where fileno=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "verification failed");
            statement.setString(2, taskData.getValueAt(rowIndex, 0).toString());
            statement.executeUpdate();
            
            String sql1 = "update passporttask set status=? where fileno=?";
            PreparedStatement statement1 = conn.prepareStatement(sql1);
            statement1.setString(1, "done");
            statement1.setString(2, taskData.getValueAt(rowIndex, 0).toString());
            int a = statement1.executeUpdate();
            
            db.disconnect();
            addTasksData();
                    
        } catch (Exception ex) {
            Logger.getLogger(PoliceViewTasksJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_failButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton7;
    private javax.swing.JButton failButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton passButton;
    private javax.swing.JTable taskData;
    // End of variables declaration//GEN-END:variables
}