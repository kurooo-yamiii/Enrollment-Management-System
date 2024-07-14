package enrollment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

  Connection con; 
  PreparedStatement pst = null; 
  ResultSet rs = null; 
    
  public void Connect() {
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost/enrollment","root","");
    } catch (ClassNotFoundException | SQLException ex){
    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
  
    public Login() {
        initComponents();
        Connect();
      
      
    }
    private int toggle = 1;
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logtoggle = new javax.swing.JButton();
        txt_username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_sign = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 51, 0), 3));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setName("LOGIN"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logtoggle.setBackground(new java.awt.Color(255, 255, 255));
        logtoggle.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        logtoggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/visibility.png"))); // NOI18N
        logtoggle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logtoggleMouseClicked(evt);
            }
        });
        logtoggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logtoggleActionPerformed(evt);
            }
        });
        jPanel1.add(logtoggle, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 365, 60, 44));

        txt_username.setFont(new java.awt.Font("Dialog", 0, 19)); // NOI18N
        jPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 250, 356, 45));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("PASSWORD");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 324, -1, -1));

        btn_sign.setBackground(new java.awt.Color(102, 51, 0));
        btn_sign.setFont(new java.awt.Font("Trebuchet MS", 0, 21)); // NOI18N
        btn_sign.setForeground(new java.awt.Color(255, 255, 255));
        btn_sign.setText("SIGN UP");
        btn_sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sign, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 532, 252, 43));

        btn_login.setBackground(new java.awt.Color(102, 51, 0));
        btn_login.setFont(new java.awt.Font("Trebuchet MS", 0, 21)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("LOGIN");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 471, 252, 43));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("USERNAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 209, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rhslogo (3).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 15, -1, 161));

        txt_password.setFont(new java.awt.Font("Trebuchet MS", 0, 19)); // NOI18N
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 365, 350, 44));

        jPanel2.setBackground(new java.awt.Color(102, 51, 0));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ADMISSION SYSTEM CENTER");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("RIZAL HIGH SCHOOL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(36, 36, 36))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
    
        String pass = txt_password.getText();
        String user = txt_username.getText();
       
        try{
            String querylogin = "SELECT * FROM login WHERE Username = '" +user+ "'"; 
            pst = con.prepareStatement(querylogin); 
            rs = pst.executeQuery();
            
            if(!rs.next()){
                JOptionPane.showMessageDialog(this, "Incorrect Password, Please make sure you input correct credentials");
                   txt_username.setText("");
                   txt_password.setText("");
            }
            do {
            String Username = rs.getString("Username");
            String Password = rs.getString("Password");
            String Status = rs.getString("Status");
            String Name = rs.getString("Name");
            String ID = rs.getString("ID");
            String LRN = rs.getString("LRN");
            
            if (user.equals(Username) && pass.equals(Password) && Status.equals("admin")) {
                JOptionPane.showMessageDialog(this, "Login Successfully!!! Welcome Back " + Name);
                Admin showAdmin = new Admin();
                showAdmin.show();
                showAdmin.fetchLogName(Name);
                dispose();
                break;
            } else if (user.equals(Username) && pass.equals(Password) && Status.equals("user")) {
                JOptionPane.showMessageDialog(this, "Login Successfully!!! Welcome Back " + Name);
                User showUser = new User();
                showUser.show();
                showUser.fetchLogName(Name, ID, LRN);
                dispose();
                break;
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect Password");
                txt_username.setText("");
                txt_password.setText("");
                break;
            }
        } while (rs.next());
             
        }catch(SQLException e){ 
            
        }
            
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_signActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signActionPerformed
        Signin sign = new Signin();
        sign.show();
        dispose();
    }//GEN-LAST:event_btn_signActionPerformed

    private void logtoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logtoggleActionPerformed

      
               
    }//GEN-LAST:event_logtoggleActionPerformed

    private void logtoggleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logtoggleMouseClicked
      
   if (toggle == 1){
           toggle = 0;
            txt_password.setEchoChar((char) 0);
            
       }else{
           toggle = 1;
           txt_password.setEchoChar('*');
           
       }
    }//GEN-LAST:event_logtoggleMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logtoggle;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
