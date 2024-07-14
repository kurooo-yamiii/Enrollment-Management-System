
package enrollment;


public class Profile extends javax.swing.JFrame {

    
    public Profile() {
        initComponents();
    }
    
    public void View (String Name, String Age, String Sex, String Birthday, String Address, String Number, String Civil, String Elem, String ESY, String High, String HSY, String LRN, String Strand, String Form137, String Form138, String GoodMoral) {
        NameF.setText(Name);
            AgeF.setText(Age);
                SexF.setText(Sex);
                    BdayF.setText(Birthday);
                        AddF.setText(Address);
                            NumF.setText(Number);
                                CivilF.setText(Civil);
                                    PrimF.setText(Elem);
                                        PrimSY.setText(ESY);
                                            SecF.setText(High);
                                                SecSY.setText(HSY);
                                                    LRNF.setText(LRN);
                                                        StrandF.setText(Strand);
                                                            if(Form137.equals("Passed")){
                                                                R1.setSelected(true);
                                                            }else{
                                                                R1.setSelected(false);
                                                            }
                                                            if(Form138.equals("Passed")){
                                                                R2.setSelected(true);
                                                            }else{
                                                                R2.setSelected(false);
                                                            }
                                                            if(GoodMoral.equals("Passed")){
                                                                R3.setSelected(true);
                                                            }else{
                                                                R3.setSelected(false);
                                                            }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NameF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AgeF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SexF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        BdayF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        NumF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        AddF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        PrimF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        PrimSY = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        SecF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        SecSY = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        LRNF = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        StrandF = new javax.swing.JTextField();
        R1 = new javax.swing.JCheckBox();
        R3 = new javax.swing.JCheckBox();
        R2 = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        CivilF = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 51, 0), 3));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setName("LOGIN"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameF.setEditable(false);
        NameF.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel1.add(NameF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 390, 50));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel2.setText("Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel3.setText("Age:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        AgeF.setEditable(false);
        AgeF.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel1.add(AgeF, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 120, 50));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel6.setText("Sex:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        SexF.setEditable(false);
        SexF.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel1.add(SexF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 90, 50));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel7.setText("Birthdate:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        BdayF.setEditable(false);
        BdayF.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BdayF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdayFActionPerformed(evt);
            }
        });
        jPanel1.add(BdayF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 150, 50));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel8.setText("No:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        NumF.setEditable(false);
        NumF.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        NumF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumFActionPerformed(evt);
            }
        });
        jPanel1.add(NumF, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 180, 50));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel9.setText("Address:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        AddF.setEditable(false);
        AddF.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel1.add(AddF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 550, 50));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel10.setText("Primary:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        PrimF.setEditable(false);
        PrimF.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel1.add(PrimF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 380, 50));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel11.setText("S.Y:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, -1));

        PrimSY.setEditable(false);
        PrimSY.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel1.add(PrimSY, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 110, 50));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel12.setText("Secondary:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        SecF.setEditable(false);
        SecF.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel1.add(SecF, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 350, 50));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel13.setText("S.Y:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, -1));

        SecSY.setEditable(false);
        SecSY.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel1.add(SecSY, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 110, 50));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel14.setText("Requirements:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        LRNF.setEditable(false);
        LRNF.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel1.add(LRNF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 370, 50));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel15.setText("Strand:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, -1, -1));

        StrandF.setEditable(false);
        StrandF.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel1.add(StrandF, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 130, 50));

        R1.setBackground(new java.awt.Color(255, 255, 255));
        R1.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        R1.setText("Form 137");
        R1.setEnabled(false);
        jPanel1.add(R1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, -1, -1));

        R3.setBackground(new java.awt.Color(255, 255, 255));
        R3.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        R3.setText("Good Moral");
        R3.setEnabled(false);
        jPanel1.add(R3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, -1, -1));

        R2.setBackground(new java.awt.Color(255, 255, 255));
        R2.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        R2.setText("Form 138");
        R2.setEnabled(false);
        jPanel1.add(R2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, -1, -1));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel16.setText("LRN:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel17.setText("Civil Status:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        CivilF.setEditable(false);
        CivilF.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel1.add(CivilF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 200, 50));

        jPanel2.setBackground(new java.awt.Color(102, 51, 0));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ADMISSION SYSTEM CENTER");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("RIZAL HIGH SCHOOL");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rhslogo (3).png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("ENROLLEE STUDENT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel18)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BdayFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdayFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BdayFActionPerformed

    private void NumFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumFActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddF;
    private javax.swing.JTextField AgeF;
    private javax.swing.JTextField BdayF;
    private javax.swing.JTextField CivilF;
    private javax.swing.JTextField LRNF;
    private javax.swing.JTextField NameF;
    private javax.swing.JTextField NumF;
    private javax.swing.JTextField PrimF;
    private javax.swing.JTextField PrimSY;
    private javax.swing.JCheckBox R1;
    private javax.swing.JCheckBox R2;
    private javax.swing.JCheckBox R3;
    private javax.swing.JTextField SecF;
    private javax.swing.JTextField SecSY;
    private javax.swing.JTextField SexF;
    private javax.swing.JTextField StrandF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
