
package enrollment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Signin extends javax.swing.JFrame {

  Connection con; // Use for connection Java -> SQL
  PreparedStatement pst, pst2 = null; // Structure for prepared statement
  ResultSet rs = null; // Result after executing prepared statement
  
  
  public void Connect() {
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost/enrollment","root","");
    } catch (ClassNotFoundException | SQLException ex){
    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
  
    public Signin() {
        initComponents();
        Connect();
    }
    
    private int toggle1 = 1;
    private int retoggle1 = 1;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        toggle = new javax.swing.JButton();
        retoggle = new javax.swing.JButton();
        txt_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_sign = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        txt_repassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 51, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ADMISSION SYSTEM CENTER");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("RIZAL HIGH SCHOOL");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 51, 0), 3));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setName("LOGIN"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        toggle.setBackground(new java.awt.Color(255, 255, 255));
        toggle.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        toggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/visibility.png"))); // NOI18N
        toggle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toggleMouseClicked(evt);
            }
        });
        toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleActionPerformed(evt);
            }
        });
        jPanel1.add(toggle, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 408, 50, 40));

        retoggle.setBackground(new java.awt.Color(255, 255, 255));
        retoggle.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        retoggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/visibility.png"))); // NOI18N
        retoggle.setPreferredSize(new java.awt.Dimension(84, 62));
        retoggle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retoggleMouseClicked(evt);
            }
        });
        retoggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retoggleActionPerformed(evt);
            }
        });
        jPanel1.add(retoggle, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 503, 50, 40));

        txt_name.setFont(new java.awt.Font("Dialog", 0, 19)); // NOI18N
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 223, 358, 43));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("PASSWORD");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 373, -1, -1));

        btn_sign.setBackground(new java.awt.Color(102, 51, 0));
        btn_sign.setFont(new java.awt.Font("Trebuchet MS", 0, 21)); // NOI18N
        btn_sign.setForeground(new java.awt.Color(255, 255, 255));
        btn_sign.setText("BACK");
        btn_sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sign, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 600, 169, 43));

        btn_login.setBackground(new java.awt.Color(102, 51, 0));
        btn_login.setFont(new java.awt.Font("Trebuchet MS", 0, 21)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("SIGN UP");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 600, 173, 43));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 182, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rhslogo (3).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 15, -1, 161));

        txt_password.setFont(new java.awt.Font("Trebuchet MS", 0, 19)); // NOI18N
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 408, 360, 42));

        txt_repassword.setFont(new java.awt.Font("Trebuchet MS", 0, 19)); // NOI18N
        jPanel1.add(txt_repassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 503, 360, 43));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("RE-TYPE PASSWORD");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 468, -1, -1));

        txt_username.setFont(new java.awt.Font("Dialog", 0, 19)); // NOI18N
        jPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 319, 358, 42));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("USERNAME");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 278, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 89, 529, 701));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        String name = txt_name.getText();
        String pass = txt_password.getText();
        String repass = txt_repassword.getText();
        String user = txt_username.getText();
        
        if (!pass.equals(repass)){
        JOptionPane.showMessageDialog(this, "Password and Re-Type Password Doesn't Match");
        }else{
        
        try{
            String querylogin = "SELECT * FROM login WHERE Username = '" +user+ "'";
            pst = con.prepareStatement(querylogin); 
            rs = pst.executeQuery();
            
            if(rs.next()){
                
                JOptionPane.showMessageDialog(this, "Sorry, the email address you've entered " + user + " is already in use. Please try another email address.");
            }else{
                String signin = "INSERT INTO login (Name, Username, Password, LRN, Status) VALUES('" +name+ "', '" +user+ "', '" +pass+ "', '" +""+ "', '" +"user"+ "')";
             pst2 = con.prepareStatement(signin);
             int update = pst2.executeUpdate();
             if(update > 0){
                 txt_name.setText("");
                  txt_username.setText("");
                   txt_password.setText("");
                    txt_repassword.setText("");
                 JOptionPane.showMessageDialog(this, "Signed In Successfully!!!");
                    Login log = new Login();
                    log.show();
                    dispose();
             }else{
                 txt_name.setText("");
                  txt_username.setText("");
                   txt_password.setText("");
                    txt_repassword.setText("");
                 JOptionPane.showMessageDialog(this, "Connection Lost, Please try again!!");
             }
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void toggleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toggleMouseClicked

        if (toggle1 == 1){
            toggle1 = 0;
            txt_password.setEchoChar((char) 0);

        }else{
            toggle1 = 1;
            txt_password.setEchoChar('*');

        }
    }//GEN-LAST:event_toggleMouseClicked

    private void toggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleActionPerformed

    }//GEN-LAST:event_toggleActionPerformed

    private void btn_signActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signActionPerformed
        Login log = new Login();
        log.show();
        dispose();
    }//GEN-LAST:event_btn_signActionPerformed

    private void retoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retoggleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retoggleActionPerformed

    private void retoggleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retoggleMouseClicked
        if (retoggle1 == 1){
            retoggle1 = 0;
            txt_repassword.setEchoChar((char) 0);

        }else{
            retoggle1 = 1;
            txt_repassword.setEchoChar('*');

        }
    }//GEN-LAST:event_retoggleMouseClicked

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
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_sign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton retoggle;
    private javax.swing.JButton toggle;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JPasswordField txt_repassword;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
