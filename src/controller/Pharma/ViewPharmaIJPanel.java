/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controller.Pharma;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Database;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author karthiksonti
 */
public class ViewPharmaIJPanel extends javax.swing.JPanel {
    JPanel layoutContainer;
    /**
     * Creates new form ViewPharmaIJPanel
     */
    public ViewPharmaIJPanel(JPanel layoutContainer) {
        initComponents();
        this.layoutContainer = layoutContainer;
        pharma.removeAllItems();
        for(String s : getPharma()){
            pharma.addItem(s);
        }
        DefaultTableModel model = (DefaultTableModel) drugs.getModel();
        model.setRowCount(0);
    }
    
    public ArrayList<String> getPharma() {
        ArrayList<String> pList = new ArrayList();
        Database db = new Database();
        try {
            Connection conn = db.connect();
            String sql = "select pharma from pharmadata";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet a = statement.executeQuery();
            while(a.next()){
                pList.add(a.getString("pharma"));
            }
        } catch (Exception ex) {
            Logger.getLogger(LoadPharmaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        drugs = new javax.swing.JTable();
        pharma = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 204, 51));
        jButton1.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jButton1.setText("<<BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel1.setText("Select pharma");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 260, 108, -1));

        drugs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Drug", "Qty"
            }
        ));
        jScrollPane1.setViewportView(drugs);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 104, -1, 109));

        pharma.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        pharma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(pharma, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 257, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 204, 51));
        jButton2.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jButton2.setText("Submit");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 304, 80, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 231, 123, -1));

        jLabel4.setText("Search");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 234, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 204, 51));
        jButton3.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.previous(layoutContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Database db = new Database();
        DefaultTableModel model = (DefaultTableModel) drugs.getModel();
        HashMap<String, Integer> drugMap = new HashMap<String, Integer>();
        model.setRowCount(0);
        try {
            Connection conn = db.connect();
            
            String sql = "select * from inventorydata where pharma=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, pharma.getSelectedItem().toString());
            ResultSet a = statement.executeQuery();

            while(a.next()) {
               drugMap.put(a.getString("drug"), a.getInt("qty")); 
            }  
            
        } catch (Exception ex) {
            Logger.getLogger(ViewPharmaIJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        db.disconnect();
        
        for(Entry <String,Integer> e : drugMap.entrySet()){
            Object[] row = new Object[2];
            
            row[0] = e.getKey();
            row[1] = e.getValue();

            
            model.addRow(row);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) drugs.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        drugs.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jTextField2.getText().trim()));
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.first(layoutContainer);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable drugs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox<String> pharma;
    // End of variables declaration//GEN-END:variables
}
