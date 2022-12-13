/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controller.Doctor;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author karthiksonti
 */
public class ManageDoctorJPanel extends javax.swing.JPanel {
    JPanel layoutContainer;
            
    /**
     * Creates new form DoctorAdminJPanel
     */
    public ManageDoctorJPanel(JPanel layoutContainer) {
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
        addDoctor = new javax.swing.JButton();
        viewDoctor = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        backButton.setBackground(new java.awt.Color(255, 204, 51));
        backButton.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        addDoctor.setBackground(new java.awt.Color(255, 204, 51));
        addDoctor.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        addDoctor.setText("Add Doctors");
        addDoctor.setBorder(new javax.swing.border.MatteBorder(null));
        addDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDoctorActionPerformed(evt);
            }
        });

        viewDoctor.setBackground(new java.awt.Color(255, 204, 51));
        viewDoctor.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        viewDoctor.setText("View Doctors");
        viewDoctor.setBorder(new javax.swing.border.MatteBorder(null));
        viewDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDoctorActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Manage Doctor's in a Hospital");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Images/manage.png"))); // NOI18N

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
                .addGap(26, 26, 26)
                .addComponent(backButton)
                .addGap(421, 421, 421)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(viewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)))
                .addComponent(jLabel10)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addComponent(jButton1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(addDoctor))
                    .addComponent(jLabel10))
                .addGap(33, 33, 33)
                .addComponent(viewDoctor)
                .addContainerGap(308, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.previous(layoutContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoctorActionPerformed
        // TODO add your handling code here:
        AddDoctorJPanel adjp = new AddDoctorJPanel(layoutContainer);
        layoutContainer.add("AddDoctorJPanel", adjp);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.next(layoutContainer);
    }//GEN-LAST:event_addDoctorActionPerformed

    private void viewDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDoctorActionPerformed
        // TODO add your handling code here:
        ViewDoctorJPanel vdjp = new ViewDoctorJPanel(layoutContainer);
        layoutContainer.add("ViewDoctorJPanel", vdjp);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.next(layoutContainer);
    }//GEN-LAST:event_viewDoctorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.first(layoutContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDoctor;
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton viewDoctor;
    // End of variables declaration//GEN-END:variables
}
