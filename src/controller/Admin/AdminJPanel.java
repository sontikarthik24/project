/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controller.Admin;

import controller.Enterprise.ManageEnterpriseJPanel;
import controller.Network.ManageNetworkJPanel;
import controller.Organisation.ManageOrganisationJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import view.Login.LoginJPanel;

/**
 *
 * @author karthiksonti
 */
public class AdminJPanel extends javax.swing.JPanel {
    JPanel layoutContainer;
    /**
     * Creates new form AdminJPanel
     */
    public AdminJPanel(JPanel layoutContainer) {
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

        manageNetworks = new javax.swing.JButton();
        manageEnterprises = new javax.swing.JButton();
        manageOrganisations = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));

        manageNetworks.setBackground(new java.awt.Color(255, 204, 51));
        manageNetworks.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        manageNetworks.setText("Manage Networks");
        manageNetworks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageNetworksActionPerformed(evt);
            }
        });

        manageEnterprises.setBackground(new java.awt.Color(255, 204, 51));
        manageEnterprises.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        manageEnterprises.setText("Manage Enterprises");
        manageEnterprises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterprisesActionPerformed(evt);
            }
        });

        manageOrganisations.setBackground(new java.awt.Color(255, 204, 51));
        manageOrganisations.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        manageOrganisations.setText("Manage Organisations");
        manageOrganisations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganisationsActionPerformed(evt);
            }
        });

        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 51));
        jButton1.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jButton1.setText("jButton1");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Images/addd.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manageOrganisations)
                            .addComponent(manageEnterprises, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(manageNetworks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(141, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addGap(32, 32, 32))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(backButton)
                        .addGap(34, 34, 34)
                        .addComponent(manageEnterprises)
                        .addGap(39, 39, 39)
                        .addComponent(manageNetworks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(manageOrganisations))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addComponent(jButton1)
                .addContainerGap(213, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageNetworksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageNetworksActionPerformed
        // TODO add your handling code here:
        ManageNetworkJPanel mnjp = new ManageNetworkJPanel(layoutContainer);
        layoutContainer.add("ManageNetworkJPanel", mnjp);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.next(layoutContainer);
    }//GEN-LAST:event_manageNetworksActionPerformed

    private void manageEnterprisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterprisesActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseJPanel mejp = new ManageEnterpriseJPanel(layoutContainer);
        layoutContainer.add("ManageNetworkJPanel", mejp);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.next(layoutContainer);
    }//GEN-LAST:event_manageEnterprisesActionPerformed

    private void manageOrganisationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganisationsActionPerformed
        // TODO add your handling code here:
        ManageOrganisationJPanel mojp = new ManageOrganisationJPanel(layoutContainer);
        layoutContainer.add("ManageNetworkJPanel", mojp);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.next(layoutContainer);
    }//GEN-LAST:event_manageOrganisationsActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.previous(layoutContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.first(layoutContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEnterprises;
    private javax.swing.JButton manageNetworks;
    private javax.swing.JButton manageOrganisations;
    // End of variables declaration//GEN-END:variables
}
