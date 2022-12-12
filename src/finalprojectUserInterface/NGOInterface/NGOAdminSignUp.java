/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.NGOInterface;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.NGO.NGOClass;
import finalprojectUserInterface.MainJFrameForm;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author sneha
 */
public class NGOAdminSignUp extends javax.swing.JPanel {

    /**
     * Creates new form NGOAdminSignUp
     */
    
    boolean ValidationStatus = true;
    boolean validationCheck = true;
    
    MainJFrameForm MainLoginPage;
    //FirebaseHelper firebaseHelper;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    public NGOAdminSignUp(MainJFrameForm MainLPage, DB4OUtility operatingSystem, OperatingSystem dB4OUtility) {
        initComponents();
        this.MainLoginPage = MainLPage;
        this.dB4OUtility = operatingSystem;
        this.operatingSystem = dB4OUtility;
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
        ngoadmin_lbl = new javax.swing.JLabel();
        name_lbl = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        unmae_lbl = new javax.swing.JLabel();
        uname_txt = new javax.swing.JTextField();
        pswd_lbl = new javax.swing.JLabel();
        pswd_txt = new javax.swing.JPasswordField();
        addr_lbl = new javax.swing.JLabel();
        addr_txt = new javax.swing.JTextField();
        signup_btn = new javax.swing.JButton();
        reg_lbl = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        reg_txt = new javax.swing.JTextField();
        city_txt = new javax.swing.JLabel();
        cityname_txt = new javax.swing.JTextField();
        state_lbl = new javax.swing.JLabel();
        state_txt = new javax.swing.JTextField();
        zipcode_lbl = new javax.swing.JLabel();
        zip_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ngoadmin_lbl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ngoadmin_lbl.setText("Create Admin Profile");
        jPanel1.add(ngoadmin_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        name_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name_lbl.setText("Name:");
        jPanel1.add(name_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));
        jPanel1.add(name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 210, -1));

        unmae_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        unmae_lbl.setText("Username:");
        jPanel1.add(unmae_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));
        jPanel1.add(uname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 210, -1));

        pswd_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pswd_lbl.setText("Password:");
        jPanel1.add(pswd_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));
        jPanel1.add(pswd_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 210, -1));

        addr_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addr_lbl.setText("Address:");
        jPanel1.add(addr_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));
        jPanel1.add(addr_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 210, -1));

        signup_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signup_btn.setText("Sign Up");
        signup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_btnActionPerformed(evt);
            }
        });
        jPanel1.add(signup_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 87, -1));

        reg_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reg_lbl.setText("Registered No.:");
        jPanel1.add(reg_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 110, -1));

        back_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 87, -1));
        jPanel1.add(reg_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 210, -1));

        city_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        city_txt.setText("City:");
        jPanel1.add(city_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));
        jPanel1.add(cityname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 210, -1));

        state_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        state_lbl.setText("State:");
        jPanel1.add(state_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));
        jPanel1.add(state_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 210, -1));

        zipcode_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        zipcode_lbl.setText("Zip Code:");
        jPanel1.add(zipcode_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, -1));
        jPanel1.add(zip_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 210, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1052, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1052, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void signup_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_btnActionPerformed
        // TODO add your handling code here:
        try {
            if(EmpytyFieldValidation())
            {
                if(RegexValidation())
                {
                    String address = addr_txt.getText() + ", " + cityname_txt.getText() + ", " + state_txt.getText() + ", " + zip_txt.getText();
                    NGOClass hosp = new NGOClass(address,  uname_txt.getText(),pswd_txt.getText(), name_txt.getText(), reg_txt.getText());
                    System.out.println("NGO"+hosp.getpName());

                    operatingSystem.addNGO(hosp);
                    for(NGOClass h: operatingSystem.getNGODirectory().getListOfNGO()){
                        System.out.println("ngo: "+ h.getNameEnterprise());
                    }
                    dB4OUtility.storeSystem(operatingSystem);

                    MainJFrameForm suc = new MainJFrameForm();
                    ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
                    suc.setVisible(true);

                }
                else
                    {
                        JOptionPane.showMessageDialog(this,"Some Error in entered data.Please check over the red fields to know more.");
                        validationCheck=true;
                    }
            }
            else{
                    JOptionPane.showMessageDialog(this,"Data Cant be empty. Please check over the red fields to know more.");
                    ValidationStatus=true;
                }
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(this,"Receiver not registered, Try again");
             ValidationStatus=true;
        }
        
        
       
    }//GEN-LAST:event_signup_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed

        MainJFrameForm suc = new MainJFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);

    }//GEN-LAST:event_back_btnActionPerformed

    
    
    private boolean RegexValidation() {
    if(!name_txt.getText().matches("^[a-zA-Z ]+$"))
        {
            name_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            name_txt.setToolTipText("Please enter only characters and space.");
            validationCheck=false;
        }
        
        if(!reg_txt.getText().matches("^[0-9]{10}$"))
        {
            reg_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            reg_txt.setToolTipText("Please enter a 10 digit number");
            validationCheck=false;
        }


        if(!zip_txt.getText().matches("^[0-9]{5}$"))
        {
            zip_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            zip_txt.setToolTipText("Please enter a 5 digit number");
            validationCheck=false;
        }
        return validationCheck;
    }   


    private boolean EmpytyFieldValidation() {
        if(addr_txt.getText().equals(null) || addr_txt.getText().trim().isEmpty() )
        {
            addr_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            addr_txt.setToolTipText("This Field Cannot be empty");
            ValidationStatus= false;
        }
        if(!addr_txt.getText().equals(null) && !addr_txt.getText().trim().isEmpty() )
        {
            addr_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(cityname_txt.getText().equals(null) || cityname_txt.getText().trim().isEmpty() )
        {
            cityname_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            cityname_txt.setToolTipText("This Field Cannot be empty");
            ValidationStatus= false;
        }
        if(!cityname_txt.getText().equals(null) && !cityname_txt.getText().trim().isEmpty() )
        {
            cityname_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(name_txt.getText().equals(null) || name_txt.getText().trim().isEmpty() )
        {
            name_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            name_txt.setToolTipText("This Field Cannot be empty");
            ValidationStatus= false;
        }
        if(!name_txt.getText().equals(null) && !name_txt.getText().trim().isEmpty() )
        {
            name_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(pswd_txt.getText().equals(null) || pswd_txt.getText().trim().isEmpty() )
        {
            pswd_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            pswd_txt.setToolTipText("This Field Cannot be empty");
            ValidationStatus= false;
        }
        if(!pswd_txt.getText().equals(null) && !pswd_txt.getText().trim().isEmpty() )
        {
            pswd_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(state_txt.getText().equals(null) || state_txt.getText().trim().isEmpty() )
        {
            state_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            state_txt.setToolTipText("This Field Cannot be empty");
            ValidationStatus= false;
        }
        if(!state_txt.getText().equals(null) && !state_txt.getText().trim().isEmpty() )
        {
            state_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(uname_txt.getText().equals(null) || uname_txt.getText().trim().isEmpty() )
            {
                uname_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                uname_txt.setToolTipText("This Field Cannot be empty");
                ValidationStatus= false;
            }
        if(!uname_txt.getText().equals(null) && !uname_txt.getText().trim().isEmpty() )
        {
            uname_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(zip_txt.getText().equals(null) || zip_txt.getText().trim().isEmpty() )
            {
                zip_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                zip_txt.setToolTipText("This Field Cannot be empty");
                ValidationStatus= false;
            }
        if(!zip_txt.getText().equals(null) && !zip_txt.getText().trim().isEmpty() )
        {
            zip_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        if(reg_txt.getText().equals(null) || reg_txt.getText().trim().isEmpty() )
            {
                reg_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                reg_txt.setToolTipText("This Field Cannot be empty");
                ValidationStatus= false;
            }
        if(!reg_txt.getText().equals(null) && !reg_txt.getText().trim().isEmpty() )
        {
            reg_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        

        return ValidationStatus;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addr_lbl;
    private javax.swing.JTextField addr_txt;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel city_txt;
    private javax.swing.JTextField cityname_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name_lbl;
    private javax.swing.JTextField name_txt;
    private javax.swing.JLabel ngoadmin_lbl;
    private javax.swing.JLabel pswd_lbl;
    private javax.swing.JPasswordField pswd_txt;
    private javax.swing.JLabel reg_lbl;
    private javax.swing.JTextField reg_txt;
    private javax.swing.JButton signup_btn;
    private javax.swing.JLabel state_lbl;
    private javax.swing.JTextField state_txt;
    private javax.swing.JTextField uname_txt;
    private javax.swing.JLabel unmae_lbl;
    private javax.swing.JTextField zip_txt;
    private javax.swing.JLabel zipcode_lbl;
    // End of variables declaration//GEN-END:variables
}
