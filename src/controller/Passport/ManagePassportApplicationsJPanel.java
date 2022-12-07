/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package controller.Passport;

import controller.Network.ViewNetworkJPanel;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Database;
import model.Organisation;
import model.Passport;

/**
 *
 * @author karthiksonti
 */
public class ManagePassportApplicationsJPanel extends javax.swing.JPanel {
    JPanel layoutContainer;
    String username;
    
    /** Creates new form ViewPassportJPanel */
    public ManagePassportApplicationsJPanel(JPanel layoutContainer, String username) {
        initComponents();
        this.layoutContainer = layoutContainer;
        this.username = username;
        
        addPassportData();
    }
    
    private ArrayList<Passport> passportList() {
        ArrayList<Passport> PassportList = new ArrayList<>();
        
        Database db = new Database();
        
        try {
            Connection conn = db.connect();
            String sql = "select * from passportdata where username=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);
            ResultSet a = statement.executeQuery();
            Passport p;
            while(a.next()) {
                PassportList.add(new Passport(a.getString("name"),a.getString("dob"), a.getString("gender"), a.getString("address"), a.getInt("phone"), a.getString("email"), a.getString("fileno"), a.getString("status")));
            }
        } catch (Exception ex) {
            Logger.getLogger(ManagePassportApplicationsJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return PassportList;
    }
    private void addPassportData(){
        ArrayList<Passport> passportList = passportList();
        DefaultTableModel model = (DefaultTableModel) passportData.getModel();
        model.setRowCount(0);
        for(Passport p: passportList()){
            Object[] row = new Object[5];
            
            row[0] = p.getApplicationId();
            row[1] = p.getName();
            row[2] = p.getDob();
            row[3] = p.getGender();
            row[4] = p.getStaus();
            
            model.addRow(row);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        passportData = new javax.swing.JTable();

        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        passportData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "File No", "Name", "DOB", "Gender", "Status"
            }
        ));
        jScrollPane1.setViewportView(passportData);

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
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(backButton)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable passportData;
    // End of variables declaration//GEN-END:variables

}
