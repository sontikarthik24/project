/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controller.Organisation;

import controller.Enterprise.AddEnterpriseJPanel;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Database;

/**
 *
 * @author karthiksonti
 */
public class AddOrganisationJPanel extends javax.swing.JPanel {
    JPanel layoutContainer;
    Connection conn;
    public static int count = 0;
    /**
     * Creates new form AddOrganisationJPanel
     */
    public AddOrganisationJPanel(JPanel layoutContainer) {
        initComponents();
        this.layoutContainer = layoutContainer;
        
        networkChoice.removeAllItems();
        
        for(String s : getNetworks()){
            networkChoice.addItem(s);
        }
        
        enterpriseChoice.removeAllItems();
        
        for(String s : getEnterprises()){
            enterpriseChoice.addItem(s);
        }
        
        
    }
    
    public ArrayList<String> getNetworks() {
        ArrayList<String> networkList = new ArrayList();
        Database db = new Database();
        try {
            conn = db.connect();
            String sql = "select network from networks";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet a = statement.executeQuery();
            while(a.next()){
                networkList.add(a.getString("network"));
            }
        } catch (Exception ex) {
            Logger.getLogger(AddEnterpriseJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return networkList;
    }
    
    public ArrayList<String> getEnterprises() {
        ArrayList<String> enterpriseList = new ArrayList();
        Database db = new Database();
        try {
            conn = db.connect();
            String sql = "select enterprise from enterprises";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet a = statement.executeQuery();
            while(a.next()){
                enterpriseList.add(a.getString("enterprise"));
            }
        } catch (Exception ex) {
            Logger.getLogger(AddEnterpriseJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return enterpriseList;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        networkChoice = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        orgnaisationName = new javax.swing.JTextField();
        addOrgnaisation = new javax.swing.JButton();
        networkName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        enterpriseChoice = new javax.swing.JComboBox<>();
        backButton = new javax.swing.JButton();

        jLabel1.setText("Organisation Name");

        addOrgnaisation.setText("Add Orgnaisation");
        addOrgnaisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrgnaisationActionPerformed(evt);
            }
        });

        networkName.setText("Network Name");

        jLabel2.setText("Enterprise Name");

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(addOrgnaisation))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(networkName)
                            .addComponent(jLabel2))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orgnaisationName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(networkChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterpriseChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(backButton)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(orgnaisationName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(networkName))
                .addGap(18, 18, 18)
                .addComponent(addOrgnaisation)
                .addContainerGap(139, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addOrgnaisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrgnaisationActionPerformed
        // TODO add your handling code here:
        Database db = new Database();
        count++;
        try {
            conn = db.connect();
            String sql = "insert into organisations (id, organisation, enterprise, network) values(?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, count);
            statement.setString(2, orgnaisationName.getText());
            statement.setString(3, enterpriseChoice.getSelectedItem().toString());
            statement.setString(4, networkChoice.getSelectedItem().toString());
            int a = statement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Enterprise Created Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            Logger.getLogger(AddEnterpriseJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addOrgnaisationActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.previous(layoutContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrgnaisation;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> enterpriseChoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> networkChoice;
    private javax.swing.JLabel networkName;
    private javax.swing.JTextField orgnaisationName;
    // End of variables declaration//GEN-END:variables
}
