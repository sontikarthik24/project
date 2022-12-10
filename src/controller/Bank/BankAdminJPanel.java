/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controller.Bank;

import static controller.Bank.AddBankJPanel.count;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Bank;
import model.Database;

/**
 *
 * @author karthiksonti
 */
public class BankAdminJPanel extends javax.swing.JPanel {
    JPanel layoutContainer;
            
    /**
     * Creates new form BankAdminJPanel
     */
    public BankAdminJPanel(JPanel layoutContainer) {
        initComponents();
        this.layoutContainer = layoutContainer;
        
        addBankData();
    }
    
    private ArrayList<Bank> bankList() {
        ArrayList<Bank> bankList = new ArrayList<>();
        
        Database db = new Database();
        
        try {
            Connection conn = db.connect();
            String sql = "select * from bankapplications where status=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "Submitted");
            ResultSet a = statement.executeQuery();
            Bank b;
            while(a.next()) {
                bankList.add(new Bank(a.getString("name"),a.getString("dob"), a.getString("gender"), a.getString("address"), a.getInt("phone"), a.getString("email"), a.getInt("id"), a.getString("status"), a.getString("pan")));
            }
        } catch (Exception ex) {
            Logger.getLogger(BankAdminJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return bankList;
    }
    private void addBankData(){
        ArrayList<Bank> passportList = bankList();
        DefaultTableModel model = (DefaultTableModel) bankData.getModel();
        model.setRowCount(0);
        for(Bank b: bankList()){
            Object[] row = new Object[9];
            
            row[0] = b.getApplicationId();
            row[1] = b.getName();
            row[2] = b.getDob();
            row[3] = b.getGender();
            row[4] = b.getAddress();
            row[5] = b.getPhone();
            row[6] = b.getEmail();
            row[7] = b.getPan();
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        bankData = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        accept = new javax.swing.JButton();
        reject = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 153));

        bankData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "DOB", "Gender", "Phone", "Email", "Address", "Pan"
            }
        ));
        jScrollPane1.setViewportView(bankData);

        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        accept.setText("Accept");
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });

        reject.setText("Reject");
        reject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Bank Administrator's Work Area");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Images/person.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(accept)
                        .addGap(101, 101, 101)
                        .addComponent(reject))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)))))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addComponent(backButton)
                            .addGap(48, 48, 48))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel10)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accept)
                    .addComponent(reject))
                .addContainerGap(209, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.previous(layoutContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
        // TODO add your handling code here:
        int rowIndex = bankData.getSelectedRow();
        if (rowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row for Accepting Application", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Database db = new Database();
        
        try {
            Connection conn = db.connect();
            
            String sql = "update bankapplications set status=? where id=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "Appected");
            statement.setString(2, bankData.getValueAt(rowIndex, 0).toString());
            statement.executeUpdate();
            
            String bank = "insert into bankdata(id, name, dob, gender, address, phone, email, pan) values(?,?,?,?,?,?,?,?)";
            PreparedStatement bstatement = conn.prepareStatement(bank);
            bstatement.setString(1, getFileNo());
            bstatement.setString(2, bankData.getValueAt(rowIndex, 1).toString());
            bstatement.setString(3, bankData.getValueAt(rowIndex, 2).toString());
            bstatement.setString(4, bankData.getValueAt(rowIndex, 3).toString());
            bstatement.setString(5, bankData.getValueAt(rowIndex, 4).toString());
            bstatement.setString(6, bankData.getValueAt(rowIndex, 5).toString());
            bstatement.setString(7, bankData.getValueAt(rowIndex, 6).toString());
            bstatement.setString(8, bankData.getValueAt(rowIndex, 7).toString());
            int a = bstatement.executeUpdate();
            
            addBankData();
            
        } catch (Exception ex) {
            Logger.getLogger(BankAdminJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_acceptActionPerformed

    private void rejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectActionPerformed
        // TODO add your handling code here:
        int rowIndex = bankData.getSelectedRow();
        if (rowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row for Rejecting Application", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Database db = new Database();
        
        try {
            Connection conn = db.connect();
            
            String sql = "update bankapplications set status=? where id=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "Rejected");
            statement.setString(2, bankData.getValueAt(rowIndex, 0).toString());
            statement.executeUpdate();
            
            addBankData();
        } catch (Exception ex) {
            Logger.getLogger(BankAdminJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rejectActionPerformed
    
    public String getFileNo() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 8;
        for(int i = 0; i < length; i++) {
          int index = random.nextInt(alphabet.length());
          char randomChar = alphabet.charAt(index);
          sb.append(randomChar);
        }
        return sb.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accept;
    private javax.swing.JButton backButton;
    private javax.swing.JTable bankData;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reject;
    // End of variables declaration//GEN-END:variables
}
