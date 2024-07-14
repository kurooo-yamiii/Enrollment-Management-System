
package userswitch;

import enrollment.Admin;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Schedules extends javax.swing.JPanel {
    
     Connection con; 
     PreparedStatement pst;
     ResultSet rs; 
     
  public void Connect() {
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost/enrollment","root","");
   } catch (ClassNotFoundException | SQLException ex){
    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
   }
 }
    
    public Schedules() {
        initComponents();
        Connect();
        
    }
    
    public String LRN;
    
    public void fetchLRN(String LRN) {
        this.LRN = LRN;
        
        
    }
    
    public void fetchSubjects() {
    try { 
            String querylogin = "SELECT * FROM schedule WHERE LRN = '"+LRN+"'"; 
            pst = con.prepareStatement(querylogin);
            rs = pst.executeQuery();
            
            if(rs.next()){
            String OralCom = rs.getString("OralCom");
            String CPAR = rs.getString("CPAR");
            String MIL = rs.getString("MIL");
            String ComProg = rs.getString("ComProg");
            String HOPE = rs.getString("HOPE");
            String Etrp = rs.getString("Etrp");
            String KOMPAN = rs.getString("KOMPAN");
            
            
            if (OralCom.equals("Taken")) {
                M1.setText("OralCom");
                T3.setText("OralCom");
                W4.setText("OralCom");
                F5.setText("OralCom");
                M1.setBackground(new Color(102,204,255));
                T3.setBackground(new Color(102,204,255));
                W4.setBackground(new Color(102,204,255));
                F5.setBackground(new Color(102,204,255));      
            } else {
               M1.setText("VACANT");
               T3.setText("VACANT");
               W4.setText("VACANT");
               F5.setText("VACANT");
               M1.setBackground(new Color(255,255,255));
               T3.setBackground(new Color(255,255,255));
               W4.setBackground(new Color(255,255,255));
               F5.setBackground(new Color(255,255,255));
            }
            
              if (CPAR.equals("Taken")) {
                M6 .setText("CPAR");
                T2.setText("CPAR");
                U4.setText("CPAR");
                F1.setText("CPAR");
                M6 .setBackground(new Color(255,204,102));
                T2.setBackground(new Color(255,204,102));
                U4.setBackground(new Color(255,204,102));
                F1.setBackground(new Color(255,204,102));      
            } else {
               M6 .setText("VACANT");
               T2.setText("VACANT");
               U4.setText("VACANT");
               F1.setText("VACANT");
               M6 .setBackground(new Color(255,255,255));
               T2.setBackground(new Color(255,255,255));
               U4.setBackground(new Color(255,255,255));
               F1.setBackground(new Color(255,255,255));
            }
              
            if (MIL.equals("Taken")) {
                M2 .setText("MIL");
                T1.setText("MIL");
                U1.setText("MIL");
                F2.setText("MIL");
                M2 .setBackground(new Color(204,255,204));
                T1.setBackground(new Color(204,255,204));
                U1.setBackground(new Color(204,255,204));
                F2.setBackground(new Color(204,255,204));      
            } else {
               M2 .setText("VACANT");
               T1.setText("VACANT");
               U1.setText("VACANT");
               F2.setText("VACANT");
               M2 .setBackground(new Color(255,255,255));
               T1.setBackground(new Color(255,255,255));
               U1.setBackground(new Color(255,255,255));
               F2.setBackground(new Color(255,255,255));
            }
            
              if (ComProg.equals("Taken")) {
                M3.setText("ComProg");
                M4.setText("ComProg");
                T5.setText("ComProg");
                T6.setText("ComProg");
                W5.setText("ComProg");
                W6.setText("ComProg");
                F3.setText("ComProg");
                F4.setText("ComProg");
                
                M3.setBackground(new Color(255,153,153));
                M4.setBackground(new Color(255,153,153));
                T5.setBackground(new Color(255,153,153));
                T6.setBackground(new Color(255,153,153));
                W5.setBackground(new Color(255,153,153));
                W6.setBackground(new Color(255,153,153));
                F3.setBackground(new Color(255,153,153));
                F4.setBackground(new Color(255,153,153));
               
            } else {
             
                M3.setBackground(new Color(255,255,255));
                M4.setBackground(new Color(255,255,255));
                T5.setBackground(new Color(255,255,255));
                T6.setBackground(new Color(255,255,255)); 
                W5.setBackground(new Color(255,255,255));
                W6.setBackground(new Color(255,255,255));
                F3.setBackground(new Color(255,255,255));
                F4.setBackground(new Color(255,255,255));
                
                M3.setText("VACANT");
                M4.setText("VACANT");
                T5.setText("VACANT");
                T6.setText("VACANT");
                W5.setText("VACANT");
                W6.setText("VACANT");
                F3.setText("VACANT");
                F4.setText("VACANT");
               
            }
              
               if (HOPE.equals("Taken")) {
                W1 .setText("HOPE");
                W2.setText("HOPE");
                
                W1.setBackground(new Color(204,204,255));
                W2.setBackground(new Color(204,204,255));      
            } else {
               W1 .setText("VACANT");
               W2.setText("VACANT");
              
               W1.setBackground(new Color(255,255,255));
               W2.setBackground(new Color(255,255,255));
            }
               
           if (Etrp.equals("Taken")) {
                M5 .setText("Entrep");
                T4.setText("Entrep");
                U2.setText("Entrep");
                U3.setText("Entrep");
                M5 .setBackground(new Color(255,255,153));
                T4.setBackground(new Color(255,255,153));
                U2.setBackground(new Color(255,255,153));
                U3.setBackground(new Color(255,255,153));      
            } else {
               M5 .setText("VACANT");
               T4.setText("VACANT");
               U2.setText("VACANT");
               U3.setText("VACANT");
               M5 .setBackground(new Color(255,255,255));
               T4.setBackground(new Color(255,255,255));
               U2.setBackground(new Color(255,255,255));
               U3.setBackground(new Color(255,255,255));
            }
                
            if (KOMPAN.equals("Taken")) {
                W3 .setText("KOMPAN");
                U5.setText("KOMPAN");
                U6.setText("KOMPAN");
                F6.setText("KOMPAN");
                W3 .setBackground(new Color(204,255,255));
                U5.setBackground(new Color(204,255,255));
                U6.setBackground(new Color(204,255,255));
                F6.setBackground(new Color(204,255,255));      
            } else {
               W3 .setText("VACANT");
               U5.setText("VACANT");
               U6.setText("VACANT");
               F6.setText("VACANT");
               W3 .setBackground(new Color(255,255,255));
               U5.setBackground(new Color(255,255,255));
               U6.setBackground(new Color(255,255,255));
               F6.setBackground(new Color(255,255,255));
               Title.setText("SUBJECTS AND SCHEDULE");
            }
            }else{
                Title.setText("UNASIGNED SCHEDULE");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Unknown Error Occured"); 
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearhData1 = new javax.swing.JButton();
        M1 = new javax.swing.JButton();
        M2 = new javax.swing.JButton();
        SearhData5 = new javax.swing.JButton();
        SearhData7 = new javax.swing.JButton();
        M4 = new javax.swing.JButton();
        M3 = new javax.swing.JButton();
        M6 = new javax.swing.JButton();
        M5 = new javax.swing.JButton();
        SearhData10 = new javax.swing.JButton();
        T1 = new javax.swing.JButton();
        T2 = new javax.swing.JButton();
        T3 = new javax.swing.JButton();
        T4 = new javax.swing.JButton();
        T5 = new javax.swing.JButton();
        T6 = new javax.swing.JButton();
        SearhData17 = new javax.swing.JButton();
        W1 = new javax.swing.JButton();
        W2 = new javax.swing.JButton();
        W3 = new javax.swing.JButton();
        W4 = new javax.swing.JButton();
        W5 = new javax.swing.JButton();
        W6 = new javax.swing.JButton();
        SearhData24 = new javax.swing.JButton();
        U1 = new javax.swing.JButton();
        U2 = new javax.swing.JButton();
        U3 = new javax.swing.JButton();
        U4 = new javax.swing.JButton();
        U5 = new javax.swing.JButton();
        U6 = new javax.swing.JButton();
        SearhData31 = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        F2 = new javax.swing.JButton();
        F3 = new javax.swing.JButton();
        F4 = new javax.swing.JButton();
        F6 = new javax.swing.JButton();
        F5 = new javax.swing.JButton();
        Title = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0), 3));

        SearhData1.setBackground(new java.awt.Color(255, 255, 204));
        SearhData1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        SearhData1.setForeground(new java.awt.Color(0, 0, 0));
        SearhData1.setText("MONDAY");
        SearhData1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SearhData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearhData1ActionPerformed(evt);
            }
        });

        M1.setBackground(new java.awt.Color(255, 255, 255));
        M1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        M1.setText("VACANT");
        M1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        M1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1ActionPerformed(evt);
            }
        });

        M2.setBackground(new java.awt.Color(255, 255, 255));
        M2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        M2.setText("VACANT");
        M2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        M2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2ActionPerformed(evt);
            }
        });

        SearhData5.setBackground(new java.awt.Color(255, 255, 255));
        SearhData5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        SearhData5.setText("BREAK");
        SearhData5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SearhData5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearhData5ActionPerformed(evt);
            }
        });

        SearhData7.setBackground(new java.awt.Color(255, 255, 255));
        SearhData7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        SearhData7.setText("BREAK");
        SearhData7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SearhData7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearhData7ActionPerformed(evt);
            }
        });

        M4.setBackground(new java.awt.Color(255, 255, 255));
        M4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        M4.setText("VACANT");
        M4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        M4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M4ActionPerformed(evt);
            }
        });

        M3.setBackground(new java.awt.Color(255, 255, 255));
        M3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        M3.setText("VACANT");
        M3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        M3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M3ActionPerformed(evt);
            }
        });

        M6.setBackground(new java.awt.Color(255, 255, 255));
        M6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        M6.setText("VACANT");
        M6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        M6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M6ActionPerformed(evt);
            }
        });

        M5.setBackground(new java.awt.Color(255, 255, 255));
        M5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        M5.setText("VACANT");
        M5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        M5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M5ActionPerformed(evt);
            }
        });

        SearhData10.setBackground(new java.awt.Color(255, 255, 204));
        SearhData10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        SearhData10.setForeground(new java.awt.Color(0, 0, 0));
        SearhData10.setText("TUESDAY");
        SearhData10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SearhData10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearhData10ActionPerformed(evt);
            }
        });

        T1.setBackground(new java.awt.Color(255, 255, 255));
        T1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        T1.setText("VACANT");
        T1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T1ActionPerformed(evt);
            }
        });

        T2.setBackground(new java.awt.Color(255, 255, 255));
        T2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        T2.setText("VACANT");
        T2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T2ActionPerformed(evt);
            }
        });

        T3.setBackground(new java.awt.Color(255, 255, 255));
        T3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        T3.setText("VACANT");
        T3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T3ActionPerformed(evt);
            }
        });

        T4.setBackground(new java.awt.Color(255, 255, 255));
        T4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        T4.setText("VACANT");
        T4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T4ActionPerformed(evt);
            }
        });

        T5.setBackground(new java.awt.Color(255, 255, 255));
        T5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        T5.setText("VACANT");
        T5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T5ActionPerformed(evt);
            }
        });

        T6.setBackground(new java.awt.Color(255, 255, 255));
        T6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        T6.setText("VACANT");
        T6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T6ActionPerformed(evt);
            }
        });

        SearhData17.setBackground(new java.awt.Color(255, 255, 204));
        SearhData17.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        SearhData17.setForeground(new java.awt.Color(0, 0, 0));
        SearhData17.setText("WEDNESDAY");
        SearhData17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SearhData17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearhData17ActionPerformed(evt);
            }
        });

        W1.setBackground(new java.awt.Color(255, 255, 255));
        W1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        W1.setText("VACANT");
        W1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        W1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                W1ActionPerformed(evt);
            }
        });

        W2.setBackground(new java.awt.Color(255, 255, 255));
        W2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        W2.setText("VACANT");
        W2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        W2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                W2ActionPerformed(evt);
            }
        });

        W3.setBackground(new java.awt.Color(255, 255, 255));
        W3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        W3.setText("VACANT");
        W3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        W3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                W3ActionPerformed(evt);
            }
        });

        W4.setBackground(new java.awt.Color(255, 255, 255));
        W4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        W4.setText("VACANT");
        W4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        W4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                W4ActionPerformed(evt);
            }
        });

        W5.setBackground(new java.awt.Color(255, 255, 255));
        W5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        W5.setText("VACANT");
        W5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        W5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                W5ActionPerformed(evt);
            }
        });

        W6.setBackground(new java.awt.Color(255, 255, 255));
        W6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        W6.setText("VACANT");
        W6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        W6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                W6ActionPerformed(evt);
            }
        });

        SearhData24.setBackground(new java.awt.Color(255, 255, 204));
        SearhData24.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        SearhData24.setForeground(new java.awt.Color(0, 0, 0));
        SearhData24.setText("THURSDAY");
        SearhData24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SearhData24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearhData24ActionPerformed(evt);
            }
        });

        U1.setBackground(new java.awt.Color(255, 255, 255));
        U1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        U1.setText("VACANT");
        U1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        U1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                U1ActionPerformed(evt);
            }
        });

        U2.setBackground(new java.awt.Color(255, 255, 255));
        U2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        U2.setText("VACANT");
        U2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        U2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                U2ActionPerformed(evt);
            }
        });

        U3.setBackground(new java.awt.Color(255, 255, 255));
        U3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        U3.setText("VACANT");
        U3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        U3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                U3ActionPerformed(evt);
            }
        });

        U4.setBackground(new java.awt.Color(255, 255, 255));
        U4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        U4.setText("VACANT");
        U4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        U4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                U4ActionPerformed(evt);
            }
        });

        U5.setBackground(new java.awt.Color(255, 255, 255));
        U5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        U5.setText("VACANT");
        U5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        U5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                U5ActionPerformed(evt);
            }
        });

        U6.setBackground(new java.awt.Color(255, 255, 255));
        U6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        U6.setText("VACANT");
        U6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        U6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                U6ActionPerformed(evt);
            }
        });

        SearhData31.setBackground(new java.awt.Color(255, 255, 204));
        SearhData31.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        SearhData31.setForeground(new java.awt.Color(0, 0, 0));
        SearhData31.setText("FRIDAY");
        SearhData31.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SearhData31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearhData31ActionPerformed(evt);
            }
        });

        F1.setBackground(new java.awt.Color(255, 255, 255));
        F1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        F1.setText("VACANT");
        F1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });

        F2.setBackground(new java.awt.Color(255, 255, 255));
        F2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        F2.setText("VACANT");
        F2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F2ActionPerformed(evt);
            }
        });

        F3.setBackground(new java.awt.Color(255, 255, 255));
        F3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        F3.setText("VACANT");
        F3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F3ActionPerformed(evt);
            }
        });

        F4.setBackground(new java.awt.Color(255, 255, 255));
        F4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        F4.setText("VACANT");
        F4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F4ActionPerformed(evt);
            }
        });

        F6.setBackground(new java.awt.Color(255, 255, 255));
        F6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        F6.setText("VACANT");
        F6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F6ActionPerformed(evt);
            }
        });

        F5.setBackground(new java.awt.Color(255, 255, 255));
        F5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        F5.setText("VACANT");
        F5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F5ActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Trebuchet MS", 1, 70)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("SUBJECT AND SCHEDULE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SearhData1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(SearhData10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(SearhData17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(SearhData24, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(SearhData31, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(M1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(W1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(U1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(M2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(W2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(U2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SearhData7, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(M3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(W3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(U3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(M4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(W4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(U4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SearhData5, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(M5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(T5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(W5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(U5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(F6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(M6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(T6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(W6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(U6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(F5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(Title)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearhData1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearhData10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearhData17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearhData24, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearhData31, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(W1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(U1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(W2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(U2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(SearhData7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(W3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(U3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(W4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(U4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(SearhData5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(W5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(U5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(W6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(U6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearhData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearhData1ActionPerformed

    }//GEN-LAST:event_SearhData1ActionPerformed

    private void M1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M1ActionPerformed

    private void M2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M2ActionPerformed

    private void SearhData5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearhData5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearhData5ActionPerformed

    private void SearhData7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearhData7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearhData7ActionPerformed

    private void M4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M4ActionPerformed

    private void M3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M3ActionPerformed

    private void M6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M6ActionPerformed

    private void M5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M5ActionPerformed

    private void SearhData10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearhData10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearhData10ActionPerformed

    private void T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T1ActionPerformed

    private void T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T2ActionPerformed

    private void T3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T3ActionPerformed

    private void T4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T4ActionPerformed

    private void T5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T5ActionPerformed

    private void T6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T6ActionPerformed

    private void SearhData17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearhData17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearhData17ActionPerformed

    private void W1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_W1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_W1ActionPerformed

    private void W2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_W2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_W2ActionPerformed

    private void W3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_W3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_W3ActionPerformed

    private void W4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_W4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_W4ActionPerformed

    private void W5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_W5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_W5ActionPerformed

    private void W6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_W6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_W6ActionPerformed

    private void SearhData24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearhData24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearhData24ActionPerformed

    private void U1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_U1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_U1ActionPerformed

    private void U2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_U2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_U2ActionPerformed

    private void U3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_U3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_U3ActionPerformed

    private void U4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_U4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_U4ActionPerformed

    private void U5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_U5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_U5ActionPerformed

    private void U6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_U6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_U6ActionPerformed

    private void SearhData31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearhData31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearhData31ActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F1ActionPerformed

    private void F2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F2ActionPerformed

    private void F3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F3ActionPerformed

    private void F4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F4ActionPerformed

    private void F6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F6ActionPerformed

    private void F5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton F1;
    private javax.swing.JButton F2;
    private javax.swing.JButton F3;
    private javax.swing.JButton F4;
    private javax.swing.JButton F5;
    private javax.swing.JButton F6;
    private javax.swing.JButton M1;
    private javax.swing.JButton M2;
    private javax.swing.JButton M3;
    private javax.swing.JButton M4;
    private javax.swing.JButton M5;
    private javax.swing.JButton M6;
    private javax.swing.JButton SearhData1;
    private javax.swing.JButton SearhData10;
    private javax.swing.JButton SearhData17;
    private javax.swing.JButton SearhData24;
    private javax.swing.JButton SearhData31;
    private javax.swing.JButton SearhData5;
    private javax.swing.JButton SearhData7;
    private javax.swing.JButton T1;
    private javax.swing.JButton T2;
    private javax.swing.JButton T3;
    private javax.swing.JButton T4;
    private javax.swing.JButton T5;
    private javax.swing.JButton T6;
    private javax.swing.JLabel Title;
    private javax.swing.JButton U1;
    private javax.swing.JButton U2;
    private javax.swing.JButton U3;
    private javax.swing.JButton U4;
    private javax.swing.JButton U5;
    private javax.swing.JButton U6;
    private javax.swing.JButton W1;
    private javax.swing.JButton W2;
    private javax.swing.JButton W3;
    private javax.swing.JButton W4;
    private javax.swing.JButton W5;
    private javax.swing.JButton W6;
    // End of variables declaration//GEN-END:variables
}
