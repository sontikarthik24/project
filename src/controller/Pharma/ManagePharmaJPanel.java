/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controller.Pharma;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author karthiksonti
 */
public class ManagePharmaJPanel extends javax.swing.JPanel {
    JPanel layoutContainer;
    /**
     * Creates new form ManagePJPanel
     */
    public ManagePharmaJPanel(JPanel layoutContainer) {
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

        back = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        addP = new javax.swing.JButton();
        viewP = new javax.swing.JButton();
        loadI = new javax.swing.JButton();
        viewI = new javax.swing.JButton();

        back.setText("<<BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        addP.setText("Add Pharma");
        addP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPActionPerformed(evt);
            }
        });

        viewP.setText("View Pharma");
        viewP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPActionPerformed(evt);
            }
        });

        loadI.setText("Load Inventory");
        loadI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadIActionPerformed(evt);
            }
        });

        viewI.setText("View Inventory");
        viewI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logout)
                    .addComponent(back))
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewI)
                    .addComponent(loadI)
                    .addComponent(viewP)
                    .addComponent(addP))
                .addContainerGap(352, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addP)
                .addGap(41, 41, 41)
                .addComponent(viewP)
                .addGap(40, 40, 40)
                .addComponent(loadI)
                .addGap(37, 37, 37)
                .addComponent(viewI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPActionPerformed
        // TODO add your handling code here:
        AddPharmaJPanel apjp = new AddPharmaJPanel(layoutContainer);
        layoutContainer.add("AddPharmaJPanel", apjp);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.next(layoutContainer);
    }//GEN-LAST:event_addPActionPerformed

    private void viewPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPActionPerformed
        // TODO add your handling code here:
        ViewPharmaJPanel vpjp = new ViewPharmaJPanel(layoutContainer);
        layoutContainer.add("ViewPharmaJPanel", vpjp);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.next(layoutContainer);
    }//GEN-LAST:event_viewPActionPerformed

    private void loadIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadIActionPerformed
        // TODO add your handling code here:
        LoadPharmaJPanel vpjp = new LoadPharmaJPanel(layoutContainer);
        layoutContainer.add("LoadPharmaJPanel", vpjp);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.next(layoutContainer);
    }//GEN-LAST:event_loadIActionPerformed

    private void viewIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewIActionPerformed
        // TODO add your handling code here:
        ViewPharmaIJPanel vpjp = new ViewPharmaIJPanel(layoutContainer);
        layoutContainer.add("ViewPharmaIJPanel", vpjp);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.next(layoutContainer);
    }//GEN-LAST:event_viewIActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.previous(layoutContainer);
    }//GEN-LAST:event_backActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.first(layoutContainer);
    }//GEN-LAST:event_logoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addP;
    private javax.swing.JButton back;
    private javax.swing.JButton loadI;
    private javax.swing.JButton logout;
    private javax.swing.JButton viewI;
    private javax.swing.JButton viewP;
    // End of variables declaration//GEN-END:variables
}
