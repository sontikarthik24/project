/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controller.Doctor;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Database;

/**
 *
 * @author karthiksonti
 */
public class DoctorAddNotesJPanel extends javax.swing.JPanel {
    JPanel layoutContainer;
    String id;
    String patient;
    String doctor;
    String hospital;
    
    /**
     * Creates new form DoctorAddNotesJPanel
     */
    public DoctorAddNotesJPanel(JPanel layoutContainer, String id, String patient, String doctor, String hospital) {
        initComponents();
        this.layoutContainer = layoutContainer;
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.hospital = hospital;
        
        ((DefaultTableModel)drugsData.getModel()).setRowCount(0);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        temp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pulse = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        drugsData = new javax.swing.JTable();
        addDrugsButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        extraNotes = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        drugName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        bp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel1.setText("BP");

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel2.setText("Temp");

        temp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel3.setText("Pulse");

        pulse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel4.setText("Notes");

        drugsData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Drug", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(drugsData);

        addDrugsButton.setBackground(new java.awt.Color(255, 204, 51));
        addDrugsButton.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        addDrugsButton.setText("Add Drugs");
        addDrugsButton.setBorder(new javax.swing.border.MatteBorder(null));
        addDrugsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDrugsButtonActionPerformed(evt);
            }
        });

        extraNotes.setColumns(20);
        extraNotes.setRows(5);
        extraNotes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(extraNotes);

        jLabel5.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel5.setText("Drug Name");

        drugName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel6.setText("Quantity");

        quantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        submitButton.setBackground(new java.awt.Color(255, 204, 51));
        submitButton.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.setBorder(new javax.swing.border.MatteBorder(null));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(255, 204, 51));
        backButton.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Patient's Record Maintained by Doctor");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Images/patients.png"))); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bp, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(pulse)
                            .addComponent(temp)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(218, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(drugName, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addDrugsButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backButton)
                            .addComponent(jButton1))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(drugName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addDrugsButton))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(temp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(jLabel4))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitButton)
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addDrugsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDrugsButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) drugsData.getModel();
        model.addRow(new Object[]{drugName.getText(), quantity.getText()});
        drugName.setText("");
        quantity.setText("");
    }//GEN-LAST:event_addDrugsButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        HashMap<String, Integer> drugMap = new HashMap<String, Integer>();
        
        DefaultTableModel model = (DefaultTableModel) drugsData.getModel();
        for (int count = 0; count < model.getRowCount(); count++){
            drugMap.put(model.getValueAt(count, 0).toString(), Integer.valueOf(model.getValueAt(count, 1).toString()));
        }
        boolean saveFlag = true;
        String temperatureDataInput = temp.getText();
        String pulseInput = pulse.getText();
        String bloodPressureInput= bp.getText();
        if(temperatureDataInput.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please input Temperature");
            saveFlag = false;
        }
        else if(pulseInput.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please input Pulse");
            saveFlag = false;
        }
        else if(bloodPressureInput.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please input Blood Pressure");
            saveFlag = false;
        }
        try
        {
            double temp = Double.parseDouble(temperatureDataInput);
            int pul = Integer.parseInt(pulseInput);
            double bp = Double.parseDouble(bloodPressureInput);
            
            if(temp >105 || temp <95)
            {
                JOptionPane.showMessageDialog(this, "Please input correct temperature between 95 to 105");
                saveFlag = false;
            }
            if(pul >100 || pul <60)
            {
                JOptionPane.showMessageDialog(this, "Please input correct pulse between 60 to 100");
                saveFlag = false;
            }
            if(bp >180 || bp <120)
            {
                JOptionPane.showMessageDialog(this, "Please input correct blood pressure between 120 to 180");
                saveFlag = false;
            }
            
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Please check the values");
            saveFlag = false;
        }
        
        if(saveFlag == true)
        {
            Database db = new Database();

            try {
                Connection conn = db.connect();
                String sql = "insert into patienthistory (bookingid, patient, doctor, pulse, bp, temp, drugs, notes) values(?,?,?,?,?,?,?,?)";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, id);
                statement.setString(2, patient);
                statement.setString(3, doctor);
                statement.setInt(4, Integer.valueOf(pulse.getText()));
                statement.setInt(5, Integer.valueOf(bp.getText()));
                statement.setInt(6, Integer.valueOf(temp.getText()));
                statement.setString(7, drugMap.toString());
                statement.setString(8, extraNotes.getText());
                statement.executeUpdate();


                String sql1 = "update doctortask set status=? where bookingid=?";
                PreparedStatement statement1 = conn.prepareStatement(sql1);
                statement1.setString(1, "done");
                statement1.setString(2, id);
                statement1.executeUpdate();

                String sql2 = "insert into pharmaorders (bookingid, patient, doctor, hospital, drugs, status) values(?,?,?,?,?,?)";
                PreparedStatement statement2 = conn.prepareStatement(sql2);
                statement2.setString(1, id);
                statement2.setString(2, patient);
                statement2.setString(3, doctor);
                statement2.setString(4, hospital);
                statement2.setString(5, drugMap.toString());
                statement2.setString(6, "Not Delivered");
                statement2.executeUpdate();

                JOptionPane.showMessageDialog(this, "Notes Saved", "Success", JOptionPane.INFORMATION_MESSAGE);


            } catch (Exception ex) {
                Logger.getLogger(DoctorAddNotesJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

            db.disconnect();
            bp.setText("");
            temp.setText("");
            pulse.setText("");
            extraNotes.setText("");
            drugName.setText("");
            quantity.setText("");
            model.setRowCount(0);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

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
    private javax.swing.JButton addDrugsButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField bp;
    private javax.swing.JTextField drugName;
    private javax.swing.JTable drugsData;
    private javax.swing.JTextArea extraNotes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField pulse;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField temp;
    // End of variables declaration//GEN-END:variables
}
