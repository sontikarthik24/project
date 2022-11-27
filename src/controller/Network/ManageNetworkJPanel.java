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

        addNetwork.setText("Create");
        addNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNetworkActionPerformed(evt);
            }
        });

        viewNetwork.setText("View");
        viewNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewNetworkActionPerformed(evt);
            }
        });

        backButton1.setText("<<BACK");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(addNetwork)
                .addGap(101, 101, 101)
                .addComponent(viewNetwork)
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton1)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backButton1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNetwork)
                    .addComponent(viewNetwork))
                .addContainerGap(268, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNetwork;
    private javax.swing.JButton backButton;
    private javax.swing.JButton backButton1;
    private javax.swing.JButton viewNetwork;
    // End of variables declaration//GEN-END:variables
}
