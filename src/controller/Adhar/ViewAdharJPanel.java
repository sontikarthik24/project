/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controller.Adhar;

import controller.Bank.BankAdminJPanel;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Bank;
import model.Database;

/**
 *
 * @author karthiksonti
 */
public class ViewAdharJPanel extends javax.swing.JPanel {
    JPanel layoutContainer;
    String username;
    
    /**
     * Creates new form ViewAdharJPanel
     */
    public ViewAdharJPanel(JPanel layoutContainer,String username) {
        initComponents();
        this.layoutContainer = layoutContainer;
        this.username = username;
        
        addBankData();
    }
    
    private ArrayList<Bank> bankList() {
        ArrayList<Bank> bankList = new ArrayList<>();
        
        Database db = new Database();
        
        try {
            Connection conn = db.connect();
            String sql = "select * from adharapplications where username=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);
            ResultSet a = statement.executeQuery();
            Bank b;
            while(a.next()) {
                bankList.add(new Bank(a.getString("name"),a.getString("dob"), a.getString("gender"), a.getString("address"), a.getInt("phone"), a.getString("email"), a.getInt("id"), a.getString("status"),""));
            }
        } catch (Exception ex) {
            Logger.getLogger(BankAdminJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return bankList;
    }
    private void addBankData(){
        ArrayList<Bank> passportList = bankList();
        DefaultTableModel model = (DefaultTableModel) bankData.getModel();
        model.setRowCount(0);
        for(Bank b: bankList()){
            Object[] row = new Object[5];
            
            row[0] = b.getApplicationId();
            row[1] = b.getName();
            row[2] = b.getDob();
            row[3] = b.getGender();
            row[4] = b.getStatus();
            
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
        bankData = new javax.swing.JTable();
        backButton = new javax.swing.JButton();

        bankData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "DOB", "Gender", "Status"
            }
        ));
        jScrollPane1.setViewportView(bankData);

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
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(backButton)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
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
    private javax.swing.JTable bankData;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
