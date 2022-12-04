/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controller.Medical;

import controller.Doctor.ManageDoctorJPanel;
import controller.Hospital.ManageHospitalJPanel;
import controller.Pharma.ManagePharmaJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author karthiksonti
 */
public class ManageMedicalJPanel extends javax.swing.JPanel {
    JPanel layoutContainer;
    
    /**
     * Creates new form ManageIdentityJPanel
     */
    public ManageMedicalJPanel(JPanel layoutContainer) {
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

        backButton = new javax.swing.JButton();
        hospitalButton = new javax.swing.JButton();
        doctorButton = new javax.swing.JButton();
        pharmaButton = new javax.swing.JButton();

        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        hospitalButton.setText("Hospital");
        hospitalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalButtonActionPerformed(evt);
            }
        });

        doctorButton.setText("Doctor");
        doctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorButtonActionPerformed(evt);
            }
        });

        pharmaButton.setText("Pharma");
        pharmaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(hospitalButton)
                .addGap(18, 18, 18)
                .addComponent(doctorButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pharmaButton)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backButton)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospitalButton)
                    .addComponent(doctorButton)
                    .addComponent(pharmaButton))
                .addContainerGap(182, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.previous(layoutContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void doctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorButtonActionPerformed
        // TODO add your handling code here:
        ManageDoctorJPanel mdjp = new ManageDoctorJPanel(layoutContainer);
        layoutContainer.add("ManageDoctorJPanel", mdjp);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.next(layoutContainer);
    }//GEN-LAST:event_doctorButtonActionPerformed

    private void hospitalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalButtonActionPerformed
        // TODO add your handling code here:
        ManageHospitalJPanel mhjp = new ManageHospitalJPanel(layoutContainer);
        layoutContainer.add("ManageHospitalJPanel", mhjp);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.next(layoutContainer);
    }//GEN-LAST:event_hospitalButtonActionPerformed

    private void pharmaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmaButtonActionPerformed
        // TODO add your handling code here:
        ManagePharmaJPanel mpjp = new ManagePharmaJPanel(layoutContainer);
        layoutContainer.add("ManagePharmaJPanel", mpjp);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.next(layoutContainer);
    }//GEN-LAST:event_pharmaButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton doctorButton;
    private javax.swing.JButton hospitalButton;
    private javax.swing.JButton pharmaButton;
    // End of variables declaration//GEN-END:variables
}