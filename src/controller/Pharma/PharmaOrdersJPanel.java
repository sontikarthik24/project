/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controller.Pharma;

import controller.Organisation.ViewOrganisationJPanel;
import controller.Police.PoliceViewTasksJPanel;
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
import model.Order;
import model.Organisation;

/**
 *
 * @author karthiksonti
 */
public class PharmaOrdersJPanel extends javax.swing.JPanel {
    JPanel layoutContainer;
    String hospital;
    
    /**
     * Creates new form PharmaOrdersJPanel
     */
    public PharmaOrdersJPanel(JPanel layoutContainer, String hospital) {
        initComponents();
        this.layoutContainer = layoutContainer;
        this.hospital = hospital;
        
        addOrdersData();
    }
    
    private ArrayList<Order> ordersList() {
        ArrayList<Order> ordersList = new ArrayList<>();
        
        Database db = new Database();
        
        try {
            Connection conn = db.connect();
            String sql = "select * from pharmaorders where status = ? and hospital = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,"Not Delivered");
            statement.setString(2,hospital);
            ResultSet a = statement.executeQuery();
            Order o;
            while(a.next()) {
                ordersList.add(new Order(a.getString("bookingid"),a.getString("patient"),a.getString("doctor"),a.getString("drugs")));
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewOrganisationJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ordersList;
    }
    private void addOrdersData(){
        ArrayList<Order> orderList = ordersList();
        DefaultTableModel model = (DefaultTableModel) orderData.getModel();
        model.setRowCount(0);
        for(Order o: ordersList()){
            Object[] row = new Object[4];
            
            row[0] = o.getId();
            row[1] = o.getPatient();
            row[2] = o.getDoctor();
            row[3] = o.getDrugs();
            
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
        orderData = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        orderData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "patient", "doctor", "drugs"
            }
        ));
        jScrollPane1.setViewportView(orderData);

        jButton1.setText("Mark as Delivered");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backButton)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.previous(layoutContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int rowIndex = orderData.getSelectedRow();
        if (rowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row for delivering drugs", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Database db = new Database();
        
        try {
            Connection conn = db.connect();
            String sql = "update pharmaorders set status=? where bookingid=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "Pending");
            statement.setString(2, orderData.getValueAt(rowIndex, 0).toString());
            statement.executeUpdate();
            
            db.disconnect();
            addOrdersData();
                    
        } catch (Exception ex) {
            Logger.getLogger(PharmaOrdersJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderData;
    // End of variables declaration//GEN-END:variables
}
