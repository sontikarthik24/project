/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package controller.Police;


import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;
import model.Database;
import model.Passport;

/**
 *
 * @author rekha
 */
public class PassportTaskJPanel extends javax.swing.JPanel {
    JPanel layoutContainer;
    /**
     * Creates new form PassportTaskJPanel
     */
    public PassportTaskJPanel(JPanel layoutContainer) {
        initComponents();
        passportData.getTableHeader().setFont(new Font("MV Boli",Font.BOLD,14));
        passportData.getTableHeader().setOpaque(false);
        passportData.getTableHeader().setBackground(Color.red);
        passportData.getTableHeader().setForeground(new Color(255,255,255));
        passportData.setRowHeight(25);
        
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
            Logger.getLogger(PassportTaskJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return policeList;
    }
    public void theader()
    {
        JTableHeader tbl=passportData.getTableHeader();
        tbl.setForeground(Color.YELLOW);
        tbl.setFont(new Font("MV Boli",Font.BOLD,14));
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
            theader();
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
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N

        backButton3.setBackground(new java.awt.Color(255, 204, 51));
        backButton3.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        backButton3.setText("<<BACK");
        backButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton3ActionPerformed(evt);
            }
        });

        passportData.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
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
        passportData.setRowHeight(25);
        passportData.setSelectionBackground(new java.awt.Color(204, 204, 0));
        passportData.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(passportData);

        policeItems.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        submitButton.setBackground(new java.awt.Color(255, 204, 51));
        submitButton.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel1.setText("Assgin File to ");

        jLabel10.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Passport Clearance");

        jButton1.setBackground(new java.awt.Color(255, 204, 51));
        jButton1.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jLabel4.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(backButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(policeItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(submitButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(backButton3))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(policeItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addComponent(submitButton)
                .addContainerGap(134, Short.MAX_VALUE))
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
        boolean saveFlag = true;
        if(policeItems.getItemCount() == 0)
        {
            JOptionPane.showMessageDialog(this, "Please select police");
            saveFlag = false;
            return;
        }
        if(saveFlag == true)
        {
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
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        layoutContainer.remove(this);
        CardLayout layout = (CardLayout) layoutContainer.getLayout();
        layout.first(layoutContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) passportData.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        passportData.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jTextField2.getText().trim()));
    }//GEN-LAST:event_jTextField2KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable passportData;
    private javax.swing.JComboBox<String> policeItems;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
