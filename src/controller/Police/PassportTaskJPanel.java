/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controller.Police;


import controller.Passport.PasportAdminJPanel;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Database;
import model.Passport;

/**
 *
 * @author karthiksonti
 */
public class PassportTaskJPanel extends javax.swing.JPanel {
    JPanel layoutContainer;
    /**
     * Creates new form PassportTaskJPanel
     */
    public PassportTaskJPanel(JPanel layoutContainer) {
        initComponents();
        this.layoutContainer = layoutContainer;
        
        policeItems.removeAllItems();
        
        for(String s : getPolice()){
            policeItems.addItem(s);
        }
        addPassportData();
    }
    
    public ArrayList<String> getPolice() {
        ArrayList<String> policeList = new ArrayList();
        Database db = new Database();
        try {
            Connection conn = db.connect();
            String sql = "select name from userdata where role=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "Police");
            ResultSet a = statement.executeQuery();
            while(a.next()){
                policeList.add(a.getString("name"));
            }
        } catch (Exception ex) {
            Logger.getLogger(PasportAdminJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return policeList;
    }
    
    private ArrayList<Passport> passportList() {
        ArrayList<Passport> PassportList = new ArrayList<>();
        
        Database db = new Database();
        
        try {
            Connection conn = db.connect();
            String sql = "select * from passportdata where status=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "Sent to police");
            ResultSet a = statement.executeQuery();
            Passport p;
            while(a.next()) {
                PassportList.add(new Passport(a.getString("name"),a.getString("dob"), a.getString("gender"), a.getString("address"), a.getInt("phone"), a.getString("email"), a.getString("fileno"), a.getString("status")));
            }
        } catch (Exception ex) {
            Logger.getLogger(PassportTaskJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return PassportList;
    }
    private void addPassportData(){
        ArrayList<Passport> passportList = passportList();
        DefaultTableModel model = (DefaultTableModel) passportData.getModel();
        model.setRowCount(0);
        for(Passport p: passportList()){
            Object[] row = new Object[5];
            
            row[0] = p.getApplicationId();
            row[1] = p.getName();
            row[2] = p.getDob();
            row[3] = p.getGender();
            row[4] = p.getStaus();
            
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

        backButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        passportData = new javax.swing.JTable();
        policeItems = new javax.swing.JComboBox<>();
        submitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 153));

        backButton3.setText("<<BACK");
        backButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton3ActionPerformed(evt);
            }
        });

        passportData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "File No", "Name", "DOB", "Gender"
            }
        ));
        jScrollPane1.setViewportView(passportData);

        policeItems.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Assgin File to ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addComponent(policeItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(submitButton)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backButton3)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(backButton3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(policeItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addComponent(submitButton)
                .addContainerGap(225, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton3ActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.previous(layoutContainer);
    }//GEN-LAST:event_backButton3ActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        int rowIndex = passportData.getSelectedRow();
        if (rowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row for assiging it to police", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Database db = new Database();
        
        try {
            Connection conn = db.connect();
            String sql = "insert into passporttask (fileno, police, status) values(?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, passportData.getValueAt(rowIndex, 0).toString());
            statement.setString(2, policeItems.getSelectedItem().toString());
            statement.setString(3, "Assigned");
            statement.executeUpdate();
            
            String sql1 = "update passportdata set status=? where fileno=?";
            PreparedStatement statement1 = conn.prepareStatement(sql1);
            statement1.setString(1, "with police");
            statement1.setString(2, passportData.getValueAt(rowIndex, 0).toString());
            statement1.executeUpdate();
            JOptionPane.showMessageDialog(this, "Successfully Assigned to Police for Verification", "Success", JOptionPane.INFORMATION_MESSAGE);
            addPassportData();
                    
        } catch (Exception ex) {
            Logger.getLogger(PassportTaskJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable passportData;
    private javax.swing.JComboBox<String> policeItems;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
