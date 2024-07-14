
package userswitch;

import enrollment.Login;
import enrollment.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Enroll extends javax.swing.JPanel {

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
    public Enroll() {
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

        NameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AgeField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SexField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BirthdateField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AddressField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        NumberField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CivilField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ElemField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ESYField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        HighField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        HSYField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        LRNField = new javax.swing.JTextField();
        StrandField = new javax.swing.JComboBox<>();
        Form137Box = new javax.swing.JCheckBox();
        GoodMoralBox = new javax.swing.JCheckBox();
        Enroll = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Form138Box = new javax.swing.JCheckBox();
        UPID = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 51, 0), 3));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 500, 50));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel1.setText("Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel2.setText("Age");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        AgeField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(AgeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 160, 50));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel3.setText("Sex");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, -1));

        SexField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(SexField, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 200, 50));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel4.setText("Birthdate");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 30, -1, -1));

        BirthdateField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(BirthdateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 60, 280, 50));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel5.setText("Address");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        AddressField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(AddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 600, 50));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel6.setText("Phone Number");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, -1, -1));

        NumberField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(NumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 280, 50));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel7.setText("Civil Status");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 120, -1, -1));

        CivilField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(CivilField, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 150, 280, 50));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel8.setText("Eelementary School");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        ElemField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(ElemField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 900, 50));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel9.setText("School Year");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 220, -1, -1));

        ESYField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(ESYField, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 250, 280, 50));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel10.setText("Junior High School");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        HighField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(HighField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 900, 50));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel11.setText("School Year");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 320, -1, -1));

        HSYField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        add(HSYField, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 350, 280, 50));

        jPanel1.setBackground(new java.awt.Color(255, 252, 221));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel12.setText("LRN");

        LRNField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        StrandField.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        StrandField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ICT", "HUMMS", "ABM", "STEM", "GAS", " " }));

        Form137Box.setBackground(new java.awt.Color(255, 252, 221));
        Form137Box.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Form137Box.setText(" FORM 137");

        GoodMoralBox.setBackground(new java.awt.Color(255, 252, 221));
        GoodMoralBox.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        GoodMoralBox.setText("GOOD MORAL");

        Enroll.setBackground(new java.awt.Color(153, 102, 0));
        Enroll.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Enroll.setForeground(new java.awt.Color(255, 255, 255));
        Enroll.setText("ENROLL");
        Enroll.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Enroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnrollActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel13.setText("Strand");

        Form138Box.setBackground(new java.awt.Color(255, 252, 221));
        Form138Box.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Form138Box.setText(" FORM 138");

        UPID.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        UPID.setText("LRN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(UPID)
                        .addGap(413, 413, 413)
                        .addComponent(Enroll, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LRNField, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addContainerGap(515, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(StrandField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Form137Box, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(GoodMoralBox, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Form138Box, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Form137Box)
                            .addComponent(GoodMoralBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Form138Box)
                        .addContainerGap(101, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(StrandField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LRNField))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Enroll, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UPID)
                                .addGap(23, 23, 23))))))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 1200, 240));
    }// </editor-fold>//GEN-END:initComponents

    private void EnrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnrollActionPerformed
        String Name, Age, Sex, Birthdate, Address, Number, Civil, Elem, ESY, High, HSY, LRN, Strand, Form137, Form138, Goodmoral;
        Name = NameField.getText();
           Age = AgeField.getText();
              Sex = SexField.getText();
                Birthdate = BirthdateField.getText();
                    Address = AddressField.getText();
                        Number = NumberField.getText();
                            Civil = CivilField.getText();
                                Elem = ElemField.getText();
                                    ESY = ESYField.getText();
                                        High = HighField.getText();
                                            HSY = HSYField.getText();
                                                LRN = LRNField.getText();
                                                    Strand = (String) StrandField.getSelectedItem();
                                                         if (Form137Box.isSelected()) {
                                                                Form137 = "Passed";
                                                            } else {
                                                                Form137 = "To be Followed";
                                                            }
                                                          if (GoodMoralBox.isSelected()) {
                                                                Goodmoral = "Passed";
                                                            } else {
                                                                Goodmoral = "To be Followed";
                                                            }
                                                          if (Form138Box.isSelected()) {
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
                  NameField.setText("");
                AgeField.setText("");
                    SexField.setText("");
                        BirthdateField.setText("");
                            AddressField.setText("");
                                NumberField.setText("");
                                    CivilField.setText("");
                                        ElemField.setText("");
                                            ESYField.setText("");
                                                 HighField.setText("");
                                                    HSYField.setText("");
                                                        LRNField.setText("");
                                                            StrandField.setSelectedItem(0);
                                                                Form137Box.setSelected(false);
                                                                   Form138Box.setSelected(false);
                                                                        GoodMoralBox.setSelected(false);
             }else{
                 if (NameField.getText().equals("") || AgeField.getText().equals("") || SexField.getText().equals("") || BirthdateField.getText().equals("") || AddressField.getText().equals("") || NumberField.getText().equals("") || CivilField.getText().equals("") || ElemField.getText().equals("") || ESYField.getText().equals("") || HighField.getText().equals("") || HSYField.getText().equals("")|| LRNField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Fill up all the information needed");
        }else{
            try{
            String enroll = "INSERT INTO enrollment (Name, Age, Sex, Birthday, Address, Number, Civil, Elem, ElemSY, High, HighSY, LRN, Strand, Form137, Form138, GoodMoral, Status) VALUES('" +Name+ "','" +Age+ "','" +Sex+ "','" +Birthdate+ "','" +Address+ "','" +Number+ "','" +Civil+ "','" +Elem+ "','" +ESY+ "','" +High+ "','" +HSY+ "','" +LRN+ "','" +Strand+ "','" +Form137+ "','" +Form138+ "','" +Goodmoral+ "','" +""+ "')";
             pst = con.prepareStatement(enroll);
             int update = pst.executeUpdate();
             if (update == 1){
               
                 
                 try{
                     String UpLRN = "UPDATE login SET LRN = '"+ LRN  +"' WHERE ID = '"+ UPID.getText() +"'";
                     pst4 = con.prepareStatement(UpLRN);
                     pst4.executeUpdate();
                     JOptionPane.showMessageDialog(this, "Successfully Enrolled");
                     
                 }catch (SQLException e){
                       JOptionPane.showMessageDialog(this, "Unknown Error Occured" + e);
                 }
           
             
             }else{
             JOptionPane.showMessageDialog(this, "Enrollment Process Failed");
             }
             
             NameField.setText("");
                AgeField.setText("");
                    SexField.setText("");
                        BirthdateField.setText("");
                            AddressField.setText("");
                                NumberField.setText("");
                                    CivilField.setText("");
                                        ElemField.setText("");
                                            ESYField.setText("");
                                                 HighField.setText("");
                                                    HSYField.setText("");
                                                        LRNField.setText("");
                                                            StrandField.setSelectedItem(0);
                                                                Form137Box.setSelected(false);
                                                                   Form138Box.setSelected(false);
                                                                        GoodMoralBox.setSelected(false);
           
            }catch (SQLException e){
             JOptionPane.showMessageDialog(this, "Unknown Error Occured"); 
            }
        }
             }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(this, "Unknown Error Occured"); 
        }
    }//GEN-LAST:event_EnrollActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressField;
    private javax.swing.JTextField AgeField;
    private javax.swing.JTextField BirthdateField;
    private javax.swing.JTextField CivilField;
    private javax.swing.JTextField ESYField;
    private javax.swing.JTextField ElemField;
    private javax.swing.JButton Enroll;
    private javax.swing.JCheckBox Form137Box;
    private javax.swing.JCheckBox Form138Box;
    private javax.swing.JCheckBox GoodMoralBox;
    private javax.swing.JTextField HSYField;
    private javax.swing.JTextField HighField;
    private javax.swing.JTextField LRNField;
    private javax.swing.JTextField NameField;
    private javax.swing.JTextField NumberField;
    private javax.swing.JTextField SexField;
    private javax.swing.JComboBox<String> StrandField;
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
    // End of variables declaration//GEN-END:variables
}
