/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.DonationCentreInterface.DonarLoginPages.DonarAdminBankLoginPages;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.DonationCentre.UserDonor;
import finalprojectBackend.Enterprise.DonationCentre.BankDonor;
import finalprojectBackend.Organization.AssignmentDonation;
import finalprojectUserInterface.MainJFrameForm;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author sneha
 */
public class DonationCentreAdminItemDonate extends javax.swing.JPanel {

    /**
     * Creates new form DonationCentreAdminItemDonate
     */
    
    MainJFrameForm MainLoginPage;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    BankDonor donorBank;
    
    public DonationCentreAdminItemDonate(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem, BankDonor donarbank) {
        initComponents();
        this.MainLoginPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        this.donorBank = donarbank;
        
        for(UserDonor pa : operatingSystem.getUserDonorDirectory() ){
            System.out.println("DonorAdminDonateOrgan"+pa.getBankDonorName());
            if( pa.getBankDonorName().equals(donarbank.getNameEnterprise())){
                donar_txt.addItem(pa.getpName());
            }
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

        title_lbl = new javax.swing.JLabel();
        donar_lbl = new javax.swing.JLabel();
        item_lbl = new javax.swing.JLabel();
        itemname_txt = new javax.swing.JTextField();
        itemtype_cmb = new javax.swing.JComboBox<>();
        itemname_lbl = new javax.swing.JLabel();
        cat_lbl = new javax.swing.JLabel();
        cat_txt = new javax.swing.JTextField();
        status_lbl = new javax.swing.JLabel();
        status_cmb = new javax.swing.JComboBox<>();
        btn_save = new javax.swing.JButton();
        donar_txt = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 204, 204));

        title_lbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title_lbl.setText("Add Entity Details");

        donar_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        donar_lbl.setText("Donor Name:");

        item_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        item_lbl.setText("Item Type:");

        itemtype_cmb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        itemtype_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blood", "Organ" }));

        itemname_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        itemname_lbl.setText("Item Name:");

        cat_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cat_lbl.setText("Category:");

        status_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        status_lbl.setText("Status:");

        status_cmb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        status_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Not Available" }));

        btn_save.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        donar_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        donar_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donar_txtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(cat_lbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(title_lbl)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(donar_lbl)
                                    .addComponent(item_lbl)
                                    .addComponent(itemname_lbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(itemname_txt)
                                    .addComponent(itemtype_cmb, 0, 156, Short.MAX_VALUE)
                                    .addComponent(donar_txt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(status_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_save)
                            .addComponent(status_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(title_lbl)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(donar_lbl)
                    .addComponent(donar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item_lbl)
                    .addComponent(itemtype_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemname_lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cat_lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(status_lbl)
                    .addComponent(status_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(btn_save)
                .addContainerGap(87, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:

        AssignmentDonation de = new AssignmentDonation();
        de.setEntityName(itemname_txt.getText().toString());
        de.setDonEnterpriseClass(donorBank);
        Random rand = new Random();
        de.setUserId( String.format("%04d", rand.nextInt(10000)));
        de.setCategory(cat_txt.getText().toString());
        de.setItem(itemtype_cmb.getSelectedItem().toString());
        //de.setDonorDoctor(ecoSystem.findDoctorByUserName(doctorList.getSelectedItem().toString()));
        de.setDonRecepient(operatingSystem.getReceiverByUserName(donar_txt.getSelectedItem().toString()));
        de.setStatusDonation(status_cmb.getSelectedItem().toString());
        //        System.out.println("dede: "+de.getDonorDoctor().getName());
        operatingSystem.addDonationAssignment(de);

        dB4OUtility.storeSystem(operatingSystem);

        JOptionPane.showMessageDialog(this, "Entity details added.");
    }//GEN-LAST:event_btn_saveActionPerformed

    private void donar_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donar_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_donar_txtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel cat_lbl;
    private javax.swing.JTextField cat_txt;
    private javax.swing.JLabel donar_lbl;
    private javax.swing.JComboBox<String> donar_txt;
    private javax.swing.JLabel item_lbl;
    private javax.swing.JLabel itemname_lbl;
    private javax.swing.JTextField itemname_txt;
    private javax.swing.JComboBox<String> itemtype_cmb;
    private javax.swing.JComboBox<String> status_cmb;
    private javax.swing.JLabel status_lbl;
    private javax.swing.JLabel title_lbl;
    // End of variables declaration//GEN-END:variables
}
