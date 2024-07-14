
package userswitch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Trabsfer extends javax.swing.JPanel {

   Connection con; 
    PreparedStatement pst, pst2, pst3, pst4; 
    ResultSet rs, rs2, rs3;
  
  
  public void Connect() {
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost/enrollment","root","");
    } catch (ClassNotFoundException | SQLException ex){
    Logger.getLogger(Enroll.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    public Trabsfer() {
        initComponents();
        Connect();
    }
    
     public void fetchIDUser (String ID){
        UPID.setText(ID);
        UPID.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSex = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBirth = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAdd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCivil = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtElem = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtESY = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtHigh = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtHSY = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtLRN = new javax.swing.JTextField();
        txtStrand = new javax.swing.JComboBox<>();
        R1 = new javax.swing.JCheckBox();
        R3 = new javax.swing.JCheckBox();
        Transfer = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        R2 = new javax.swing.JCheckBox();
        UPID = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0), 3));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 500, 50));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel1.setText("Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel2.setText("Age");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        txtAge.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 160, 50));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel3.setText("Sex");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, -1));

        txtSex.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(txtSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 200, 50));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel4.setText("Birthdate");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 30, -1, -1));

        txtBirth.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(txtBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 60, 280, 50));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel5.setText("Address");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        txtAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(txtAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 600, 50));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel6.setText("Phone Number");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, -1, -1));

        txtNum.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 280, 50));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel7.setText("Civil Status");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 120, -1, -1));

        txtCivil.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(txtCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 150, 280, 50));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel8.setText("Elementary School");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        txtElem.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(txtElem, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 900, 50));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel9.setText("School Year");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 220, -1, -1));

        txtESY.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(txtESY, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 250, 280, 50));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel10.setText("Junior High School");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        txtHigh.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(txtHigh, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 900, 50));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel11.setText("School Year");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 320, -1, -1));

        txtHSY.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(txtHSY, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 350, 280, 50));

        jPanel1.setBackground(new java.awt.Color(204, 216, 246));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel12.setText("LRN");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        txtLRN.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel1.add(txtLRN, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 630, 50));

        txtStrand.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtStrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ICT", "HUMMS", "ABM", "STEM", "GAS", " " }));
        jPanel1.add(txtStrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 240, 50));

        R1.setBackground(new java.awt.Color(204, 216, 246));
        R1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        R1.setText(" FORM 138");
        jPanel1.add(R1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 50, 148, -1));

        R3.setBackground(new java.awt.Color(204, 216, 246));
        R3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        R3.setText("HONOROBLE DISMISSAL");
        R3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3ActionPerformed(evt);
            }
        });
        jPanel1.add(R3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 110, 220, -1));

        Transfer.setBackground(new java.awt.Color(102, 51, 0));
        Transfer.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Transfer.setForeground(new java.awt.Color(255, 255, 255));
        Transfer.setText("ENROLL");
        Transfer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferActionPerformed(evt);
            }
        });
        jPanel1.add(Transfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 249, 47));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel13.setText("Strand");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        R2.setBackground(new java.awt.Color(204, 216, 246));
        R2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        R2.setText(" FORM 137");
        jPanel1.add(R2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 80, 148, -1));

        UPID.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        UPID.setText("LRN");
        jPanel1.add(UPID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 1200, 240));
    }// </editor-fold>//GEN-END:initComponents

    private void R3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R3ActionPerformed

    private void TransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferActionPerformed
       String Name, Age, Sex, Birthdate, Address, Number, Civil, Elem, ESY, High, HSY, LRN, Strand, Form137, Form138, Dismissal;
        Name = txtName.getText();
           Age = txtAge.getText();
              Sex = txtSex.getText();
                Birthdate = txtBirth.getText();
                    Address = txtAdd.getText();
                        Number = txtNum.getText();
                            Civil = txtCivil.getText();
                                Elem = txtElem.getText();
                                    ESY = txtESY.getText();
                                        High = txtHigh.getText();
                                            HSY = txtHSY.getText();
                                                LRN = txtLRN.getText();
                                                    Strand = (String) txtStrand.getSelectedItem();
                                                         if (R2.isSelected()) {
                                                                Form137 = "Passed";
                                                            } else {
                                                                Form137 = "To be Followed";
                                                            }
                                                          if (R3.isSelected()) {
                                                                Dismissal = "Passed";
                                                            } else {
                                                                Dismissal = "To be Followed";
                                                            }
                                                          if (R2.isSelected()) {
                                                                Form138 = "Passed";
                                                            } else {
                                                                Form138 = "To be Followed";
                                                            }
      try {String check = "SELECT * FROM enrollment WHERE LRN = '" +LRN+ "'";
            String check2 = "SELECT * FROM transferee WHERE LRN = '" +LRN+ "'";
            String IDcheck = "SELECT * FROM login WHERE LRN != '' AND ID = '" + UPID.getText() + "'";
            pst3 = con.prepareStatement (check2);
            pst2 = con.prepareStatement(check); 
            pst4 = con.prepareStatement(IDcheck);
            rs = pst2.executeQuery();
            rs2 = pst3.executeQuery();
            rs3 = pst4.executeQuery();
             if(rs.next() || rs2.next() || rs3.next()){
                 JOptionPane.showMessageDialog(this, "You are already in the waiting list please wait for further announcement");
             txtName.setText("");
                txtAge.setText("");
                    txtSex.setText("");
                        txtBirth.setText("");
                            txtAdd.setText("");
                                txtNum.setText("");
                                    txtCivil.setText("");
                                        txtElem.setText("");
                                            txtESY.setText("");
                                                 txtHigh.setText("");
                                                    txtHSY.setText("");
                                                        txtLRN.setText("");
                                                            txtStrand.setSelectedItem(0);
                                                                R2.setSelected(false);
                                                                   R1.setSelected(false);
                                                                        R3.setSelected(false);
             }else{
                 if (txtName.getText().equals("") || txtAge.getText().equals("") || txtSex.getText().equals("") || txtBirth.getText().equals("") || txtAdd.getText().equals("") || txtNum.getText().equals("") || txtCivil.getText().equals("") || txtElem.getText().equals("") || txtESY.getText().equals("") || txtHigh.getText().equals("") || txtHSY.getText().equals("")|| txtLRN.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Fill up all the information needed");
        }else{
            try{
            String transfer = "INSERT INTO transferee (Name, Age, Sex, Birthday, Address, Number, Civil, Elem, ESY, High, HSY, LRN, Strand, Form138, Form137, Dismissal, Status) VALUES('" +Name+ "','" +Age+ "','" +Sex+ "','" +Birthdate+ "','" +Address+ "','" +Number+ "','" +Civil+ "','" +Elem+ "','" +ESY+ "','" +High+ "','" +HSY+ "','" +LRN+ "','" +Strand+ "','" +Form138+ "','" +Form137+ "','" +Dismissal+ "','" +""+ "')";
             pst = con.prepareStatement(transfer);
             int update = pst.executeUpdate();
             if (update == 1){
            try{
                     String UpLRN = "UPDATE login SET LRN = '"+ LRN  +"' WHERE ID = '"+ UPID.getText() +"'";
                     pst4 = con.prepareStatement(UpLRN);
                     pst4.executeUpdate();
                     JOptionPane.showMessageDialog(this, "Successfully Enrolled");
                     
                 }catch (SQLException e){
                       JOptionPane.showMessageDialog(this, "Unknown Error Occured");
                 }
             }else{
             JOptionPane.showMessageDialog(this, "Application for Transferee Failed");
             }
             
            txtName.setText("");
                txtAge.setText("");
                    txtSex.setText("");
                        txtBirth.setText("");
                            txtAdd.setText("");
                                txtNum.setText("");
                                    txtCivil.setText("");
                                        txtElem.setText("");
                                            txtESY.setText("");
                                                 txtHigh.setText("");
                                                    txtHSY.setText("");
                                                        txtLRN.setText("");
                                                            txtStrand.setSelectedItem(0);
                                                                R2.setSelected(false);
                                                                   R1.setSelected(false);
                                                                        R3.setSelected(false);
           
            }catch (SQLException e){
             JOptionPane.showMessageDialog(this, "Unknown Error Occured" + e); 
            }
        }
             }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(this, "Unknown Error Occured"); 
        }
    }//GEN-LAST:event_TransferActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox R1;
    private javax.swing.JCheckBox R2;
    private javax.swing.JCheckBox R3;
    private javax.swing.JButton Transfer;
    private javax.swing.JLabel UPID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBirth;
    private javax.swing.JTextField txtCivil;
    private javax.swing.JTextField txtESY;
    private javax.swing.JTextField txtElem;
    private javax.swing.JTextField txtHSY;
    private javax.swing.JTextField txtHigh;
    private javax.swing.JTextField txtLRN;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtSex;
    private javax.swing.JComboBox<String> txtStrand;
    // End of variables declaration//GEN-END:variables
}
