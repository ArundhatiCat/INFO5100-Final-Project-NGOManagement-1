/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.NGOInterface.LoginPage.ManagerLoginPages;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.NGO.Manager;
import finalprojectBackend.Enterprise.NGO.Recepient;
import finalprojectBackend.Organization.AssignmentDonation;
import finalprojectUserInterface.MainJFrameForm;


/**
 *
 * @author sneha
 */
public class ManagerLogin extends javax.swing.JPanel {

    /**
     * Creates new form ManagerLogin
     */
    MainJFrameForm MainLoginPage;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    Manager manager;

    public ManagerLogin(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem, Manager d) {
        initComponents();
        this.MainLoginPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        this.manager = d;
        populateTable(manager.getpName());
        populateRecieverTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tab1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_1 = new javax.swing.JTable();
        addremarks_btn = new javax.swing.JButton();
        addremarks_txt = new javax.swing.JTextField();
        logout_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        searchbtn = new javax.swing.JButton();
        searchname_txt = new javax.swing.JTextField();
        logbtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_2 = new javax.swing.JTable();
        name_lbl = new javax.swing.JLabel();
        status_lbl = new javax.swing.JLabel();
        status_txt = new javax.swing.JTextField();
        addstatusbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Receiver Name", "User Name", "Remark"
            }
        ));
        jScrollPane1.setViewportView(table_1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 990, 220));

        addremarks_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addremarks_btn.setText("Add Remarks");
        addremarks_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addremarks_btnActionPerformed(evt);
            }
        });
        jPanel2.add(addremarks_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, 50));

        addremarks_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addremarks_txtActionPerformed(evt);
            }
        });
        jPanel2.add(addremarks_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 274, 30));

        logout_btn.setBackground(new java.awt.Color(255, 204, 204));
        logout_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        logout_btn.setText("Logout");
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });
        jPanel2.add(logout_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 170, 40));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-15, -34, -1, -1));

        tab1.addTab("Patient List", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        jPanel3.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, -1, -1));

        searchname_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchname_txtActionPerformed(evt);
            }
        });
        jPanel3.add(searchname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 248, -1));

        logbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        logbtn.setText("Logout");
        logbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logbtnActionPerformed(evt);
            }
        });
        jPanel3.add(logbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 100, 40));

        table_2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Type", "Category", "Item name", "Status", "Donor Enterprise", "Receiver Enterprise", "Recipent Name", "Donor name", "Remark", "ID"
            }
        ));
        jScrollPane3.setViewportView(table_2);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 815, 190));

        name_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        name_lbl.setText("Search by Name:");
        jPanel3.add(name_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        status_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        status_lbl.setText("Status:");
        jPanel3.add(status_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        status_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                status_txtActionPerformed(evt);
            }
        });
        jPanel3.add(status_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 248, -1));

        addstatusbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addstatusbtn.setText("Add Status");
        addstatusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstatusbtnActionPerformed(evt);
            }
        });
        jPanel3.add(addstatusbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, -1, -1));
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-15, -34, -1, -1));

        tab1.addTab("Donation History", jPanel3);

        jPanel1.add(tab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1452, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 953, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addremarks_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addremarks_btnActionPerformed
        // TODO add your handling code here:
        int selectedRow = table_1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to add status");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) table_1.getModel();
        String id = model.getValueAt(selectedRow, 1).toString();
        //System.out.println("column count " + selectedRow);

        for (Recepient p : operatingSystem.getRecepientDirectory()) {
            try {
                if (p.getpName().equals(id)) {
                    p.setRemarks(addremarks_txt.getText().toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        dB4OUtility.storeSystem(operatingSystem);
        populateRecieverTable();
    }//GEN-LAST:event_addremarks_btnActionPerformed

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        // TODO add your handling code here:
        MainJFrameForm suc = new MainJFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
    }//GEN-LAST:event_logout_btnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        populateTableName(searchname_txt.getText().toLowerCase().toString());
    }//GEN-LAST:event_searchbtnActionPerformed

    private void logbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logbtnActionPerformed
        // TODO add your handling code here:
        MainJFrameForm suc = new MainJFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
    }//GEN-LAST:event_logbtnActionPerformed

    private void addstatusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstatusbtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = table_2.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to add status");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) table_2.getModel();
        String id = model.getValueAt(selectedRow, 9).toString();
        //System.out.println("column count " + selectedRow);

        for (AssignmentDonation c : operatingSystem.getAssignmentDonationList()) {
            try {
                if (c.getUserId().equals(id)) {
                    c.setStatusDonation(status_txt.getText().toString());
                }
            } catch (Exception e) {

            }
        }

        dB4OUtility.storeSystem(operatingSystem);
        populateTable(manager.getpName());
    }//GEN-LAST:event_addstatusbtnActionPerformed

    private void addremarks_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addremarks_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addremarks_txtActionPerformed

    private void status_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_status_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_status_txtActionPerformed

    private void searchname_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchname_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchname_txtActionPerformed

    private void populateRecieverTable() {
        DefaultTableModel model = (DefaultTableModel) table_1.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (Recepient p : operatingSystem.getRecepientDirectory()) {
            System.out.println("receiver " + p.getpName());
            try {
                if (p.getNGOName().equals(manager.getNGOName())) {
                    Object[] row = new Object[10];
                    row[0] = p.getNamePerson();
                    row[1] = p.getpName();
                    row[2] = p.getRemarks();
                    model.addRow(row);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
    
    private void populateTable(String name) {
        DefaultTableModel model = (DefaultTableModel) table_2.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (AssignmentDonation d : operatingSystem.getAssignmentDonationList()) {

            try {
                if (d.getRecManager().getpName().matches(name)) {
                    Object[] row = new Object[11];
                    row[0] = d.getItem();
                    row[1] = d.getCategory();
                    row[2] = d.getEntityName();
                    row[3] = d.getStatusDonation();
                    try {
                        row[4] = d.getDonEnterpriseClass().getNameEnterprise();
                    } catch (Exception e) {

                    }

                    try {
                        row[5] = d.getRecEnterpriseClass().getNameEnterprise();
                    } catch (Exception e) {

                    }
                    try {
                        row[6] = d.getRecRecepient().getNamePerson();
                    } catch (Exception e) {

                    }
                    try {
                        row[7] = d.getDonRecepient().getNamePerson();
                    } catch (Exception e) {

                    }
                    row[8] = d.getReportDonation();
                    row[9] = d.getUserId();
                    

                    model.addRow(row);
                }
            } catch (Exception e) {

            }


        }

    }
    
    private void populateTableName(String name) {
        DefaultTableModel model = (DefaultTableModel) table_2.getModel();
        model.setRowCount(0);
        System.out.println("populatetable");
        for (AssignmentDonation d : operatingSystem.getAssignmentDonationList()) {

            if (d.getDonManager().getpName().equals(name)) {
                Object[] row = new Object[10];
                row[0] = d.getItem();
                row[1] = d.getCategory();
                row[2] = d.getEntityName();
                row[3] = d.getStatusDonation();
                try {
                    row[4] = d.getDonEnterpriseClass().getNameEnterprise();
                } catch (Exception e) {

                }

                try {
                    row[5] = d.getRecEnterpriseClass().getNameEnterprise();
                } catch (Exception e) {

                }
                try {
                    row[6] = d.getRecRecepient().getNamePerson();
                } catch (Exception e) {

                }
                try {
                    row[7] = d.getDonRecepient().getNamePerson();
                } catch (Exception e) {

                }

                row[8] = d.getReportDonation();
                row[9] = d.getUserId();
                model.addRow(row);
            }

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addremarks_btn;
    private javax.swing.JTextField addremarks_txt;
    private javax.swing.JButton addstatusbtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton logbtn;
    private javax.swing.JButton logout_btn;
    private javax.swing.JLabel name_lbl;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField searchname_txt;
    private javax.swing.JLabel status_lbl;
    private javax.swing.JTextField status_txt;
    private javax.swing.JTabbedPane tab1;
    private javax.swing.JTable table_1;
    private javax.swing.JTable table_2;
    // End of variables declaration//GEN-END:variables
}