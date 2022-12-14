/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controller.Network;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author karthiksonti
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {
    JPanel layoutContainer;
    /**
     * Creates new form ManageNetworkJPanel
     */
    public ManageNetworkJPanel(JPanel layoutContainer) {
        initComponents();
        this.layoutContainer = layoutContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addNetwork = new javax.swing.JButton();
        viewNetwork = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        addNetwork.setBackground(new java.awt.Color(255, 204, 51));
        addNetwork.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        addNetwork.setText("Add Network");
        addNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNetworkActionPerformed(evt);
            }
        });

        viewNetwork.setBackground(new java.awt.Color(255, 204, 51));
        viewNetwork.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        viewNetwork.setText("View Network");
        viewNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewNetworkActionPerformed(evt);
            }
        });

        backButton1.setBackground(new java.awt.Color(255, 204, 51));
        backButton1.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        backButton1.setText("<<BACK");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Manage Network Related Operations");

        jButton1.setBackground(new java.awt.Color(255, 204, 51));
        jButton1.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(backButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(backButton1))))
                .addGap(52, 52, 52)
                .addComponent(addNetwork)
                .addGap(32, 32, 32)
                .addComponent(viewNetwork)
                .addContainerGap(334, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNetworkActionPerformed
        // TODO add your handling code here:
        AddNetworkJPanel anjp = new AddNetworkJPanel(layoutContainer);
        layoutContainer.add("AddNetworkJPanel", anjp);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.next(layoutContainer);
        
    }//GEN-LAST:event_addNetworkActionPerformed

    private void viewNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewNetworkActionPerformed
        // TODO add your handling code here:
        ViewNetworkJPanel vnjp = new ViewNetworkJPanel(layoutContainer);
        layoutContainer.add("ViewNetworkJPanel", vnjp);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.next(layoutContainer);
    }//GEN-LAST:event_viewNetworkActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.previous(layoutContainer);
    }//GEN-LAST:event_backButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.first(layoutContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNetwork;
    private javax.swing.JButton backButton1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton viewNetwork;
    // End of variables declaration//GEN-END:variables
}
