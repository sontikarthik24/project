/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controller.Person;

import controller.Doctor.BookDoctorJPanel;
import controller.Passport.ApplyPassportJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author karthiksonti
 */
public class ManagePersonJPanel extends javax.swing.JPanel {
    JPanel layoutContainer;
    /**
     * Creates new form ManagePersonJPanel
     */
    public ManagePersonJPanel(JPanel layoutContainer) {
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

        applyPassport = new javax.swing.JButton();
        viewBank = new javax.swing.JButton();
        bookDoctor = new javax.swing.JButton();
        viewPassport = new javax.swing.JButton();

        applyPassport.setText("Apply for Passport");
        applyPassport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyPassportActionPerformed(evt);
            }
        });

        viewBank.setText("Apply for Bank Account");

        bookDoctor.setText("Book Doctor Appointment");
        bookDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookDoctorActionPerformed(evt);
            }
        });

        viewPassport.setText("View Passport Applications");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(applyPassport)
                .addGap(44, 44, 44)
                .addComponent(viewBank)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(bookDoctor)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(viewPassport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(applyPassport)
                    .addComponent(viewBank)
                    .addComponent(bookDoctor))
                .addGap(46, 46, 46)
                .addComponent(viewPassport)
                .addContainerGap(209, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookDoctorActionPerformed
        // TODO add your handling code here:
        BookDoctorJPanel bdjp = new BookDoctorJPanel(layoutContainer);
        layoutContainer.add("ApplyPassportJPanel", bdjp);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.next(layoutContainer);
    }//GEN-LAST:event_bookDoctorActionPerformed

    private void applyPassportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyPassportActionPerformed
        // TODO add your handling code here:
        ApplyPassportJPanel apjp = new ApplyPassportJPanel(layoutContainer);
        layoutContainer.add("ApplyPassportJPanel", apjp);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.next(layoutContainer);
    }//GEN-LAST:event_applyPassportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyPassport;
    private javax.swing.JButton bookDoctor;
    private javax.swing.JButton viewBank;
    private javax.swing.JButton viewPassport;
    // End of variables declaration//GEN-END:variables
}
