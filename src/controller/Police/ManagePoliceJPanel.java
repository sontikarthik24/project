/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controller.Police;

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
import model.Person;

/**
 *
 * @author karthiksonti
 */
public class ManagePoliceJPanel extends javax.swing.JPanel {
    JPanel layoutContainer;
    /**
     * Creates new form ManagePoliceJPanel
     */
    public ManagePoliceJPanel(JPanel layoutContainer) {
        initComponents();
        this.layoutContainer = layoutContainer;
        
        addPoliceData();
    }
    
        private ArrayList<Person> policeList() {
        ArrayList<Person> policeList = new ArrayList<>();
        
        Database db = new Database();
        
        try {
            Connection conn = db.connect();
            String sql = "select * from userdata where role=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "Police");
            ResultSet a = statement.executeQuery();
            Person p;
            while(a.next()) {
                policeList.add(new Person(a.getString("name"), a.getString("username"), a.getString("dob"), a.getString("gender"), a.getString("address"), a.getInt("phone"), a.getString("email")));
            }
        } catch (Exception ex) {
            Logger.getLogger(ManagePoliceJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return policeList;
    }
    private void addPoliceData(){
        ArrayList<Person> policeList = policeList();
        DefaultTableModel model = (DefaultTableModel) policeData.getModel();
        model.setRowCount(0);
        for(Person p: policeList()){
            Object[] row = new Object[7];
            
            row[0] = p.getName();
            row[1] = p.getUserName();
            row[2] = p.getDob();
            row[3] = p.getGender();
            row[4] = p.getPhone();
            row[5] = p.getEmail();
            row[6] = p.getAddress();
            
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
        policeData = new javax.swing.JTable();

        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        policeData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "name", "username", "dob", "gender", "phone", "email", "Address"
            }
        ));
        jScrollPane1.setViewportView(policeData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(backButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
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
    private javax.swing.JTable policeData;
    // End of variables declaration//GEN-END:variables
}
