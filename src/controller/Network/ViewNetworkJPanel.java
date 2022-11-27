/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controller.Network;

import controller.Admin.AdminJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Database;
import model.Network;

/**
 *
 * @author karthiksonti
 */
public class ViewNetworkJPanel extends javax.swing.JPanel {
    JPanel layoutContainer;
    Connection conn;
    /**
     * Creates new form ViewNetworkJPanel
     */
    public ViewNetworkJPanel(JPanel layoutContainer) {
        initComponents();
        this.layoutContainer = layoutContainer;
        addNetworkData();
    }
    
    private ArrayList<Network> networkList() {
        ArrayList<Network> networkList = new ArrayList<>();
        
        Database db = new Database();
        
        try {
            conn = db.connect();
            String sql = "select * from networks";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet a = statement.executeQuery();
            Network nw;
            while(a.next()) {
                networkList.add(new Network(a.getInt("id"),a.getString("network")));
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewNetworkJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return networkList;
    }
    private void addNetworkData(){
        ArrayList<Network> networkList = networkList();
        DefaultTableModel model = (DefaultTableModel) networkData.getModel();
        model.setRowCount(0);
        for(Network nw: networkList()){
            Object[] row = new Object[2];
            
            row[0] = nw.getNetworkId();
            row[1] = nw.getNetworkName();
            
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
        networkData = new javax.swing.JTable();
        backButton2 = new javax.swing.JButton();

        networkData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Network"
            }
        ));
        jScrollPane1.setViewportView(networkData);

        backButton2.setText("<<BACK");
        backButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton2)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(backButton2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton2ActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.previous(layoutContainer);
    }//GEN-LAST:event_backButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JButton backButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable networkData;
    // End of variables declaration//GEN-END:variables
}
