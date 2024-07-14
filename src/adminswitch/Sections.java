
package adminswitch;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import userswitch.Enroll;

public class Sections extends javax.swing.JPanel {

    Connection con; 
    PreparedStatement pst, pst2; 
    ResultSet rs, rs2;
  
  
  public void Connect() {
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost/enrollment","root","");
    } catch (ClassNotFoundException | SQLException ex){
    Logger.getLogger(Enroll.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
  
    public Sections() {
        initComponents();
        Connect();
        mypopulate();
        mypopulateTrans();
    }
    
    public void mypopulate() {
         DefaultTableModel Enrollee = (DefaultTableModel) TabEnrollee.getModel();
              Enrollee.setRowCount(0);
        try { 
            String querylogin = "SELECT * FROM enrollment WHERE Status = '"+"Enrolled"+"'"; 
            pst = con.prepareStatement(querylogin);
            rs = pst.executeQuery();
            
            while (rs.next()){
            String Name = rs.getString("Name");
            String Strand = rs.getString("Strand");
            String Form137 = rs.getString("Form137");
            String Form138 = rs.getString("Form138");
            String GoodMoral = rs.getString("GoodMoral");
            String LRN = rs.getString("LRN");
            
             String order[] = {Name,
                                Strand,
                                  Form137,
                                    Form138,
                                      GoodMoral,
                                        LRN};
             
              Enrollee.addRow(order);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Unknown Error Occured"); 
        }
    }
    
     public void mypopulateTrans() {
         DefaultTableModel Transfer = (DefaultTableModel) TabEnrollee.getModel();
             
        try { 
            String querylogin = "SELECT * FROM transferee WHERE Status = '"+"Enrolled"+"'"; 
            pst2 = con.prepareStatement(querylogin);
            rs2 = pst2.executeQuery();
            
            while (rs2.next()){
            String Name = rs2.getString("Name");
            String Strand = rs2.getString("Strand");
            String Form137 = rs2.getString("Form137");
            String Form138 = rs2.getString("Form138");
            String Dismissal = rs2.getString("Dismissal");
            String LRN = rs2.getString("LRN");
            
             String order[] = {Name,
                                Strand,
                                  Form137,
                                    Form138,
                                      Dismissal,
                                        LRN};
             
              Transfer.addRow(order);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Unknown Error Occured"); 
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        SearchTerm = new javax.swing.JTextField();
        SearhData = new javax.swing.JButton();
        OralCom = new javax.swing.JCheckBox();
        CPAR = new javax.swing.JCheckBox();
        MIL = new javax.swing.JCheckBox();
        ComPan = new javax.swing.JCheckBox();
        HOPE = new javax.swing.JCheckBox();
        Etrp = new javax.swing.JCheckBox();
        KOMPAN = new javax.swing.JCheckBox();
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
        SearchEnrolled = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabEnrollee = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 51, 0), 3));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel1.setText("Search: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 57, -1, -1));

        SearchTerm.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        SearchTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTermActionPerformed(evt);
            }
        });
        add(SearchTerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 912, 50));

        SearhData.setBackground(new java.awt.Color(102, 51, 0));
        SearhData.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        SearhData.setForeground(new java.awt.Color(255, 255, 255));
        SearhData.setText("SET SCHEDULE");
        SearhData.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SearhData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearhDataActionPerformed(evt);
            }
        });
        add(SearhData, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 213, 47));

        OralCom.setBackground(new java.awt.Color(255, 255, 255));
        OralCom.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        OralCom.setText("Oral Communication");
        OralCom.setEnabled(false);
        OralCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OralComActionPerformed(evt);
            }
        });
        add(OralCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        CPAR.setBackground(new java.awt.Color(255, 255, 255));
        CPAR.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        CPAR.setText("Contemporary Arts");
        CPAR.setEnabled(false);
        CPAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPARActionPerformed(evt);
            }
        });
        add(CPAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        MIL.setBackground(new java.awt.Color(255, 255, 255));
        MIL.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        MIL.setText("Media and Information Literacy");
        MIL.setEnabled(false);
        MIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MILActionPerformed(evt);
            }
        });
        add(MIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        ComPan.setBackground(new java.awt.Color(255, 255, 255));
        ComPan.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        ComPan.setText("Computer Programming");
        ComPan.setEnabled(false);
        ComPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComPanActionPerformed(evt);
            }
        });
        add(ComPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        HOPE.setBackground(new java.awt.Color(255, 255, 255));
        HOPE.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        HOPE.setText("Physical Education");
        HOPE.setEnabled(false);
        HOPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOPEActionPerformed(evt);
            }
        });
        add(HOPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        Etrp.setBackground(new java.awt.Color(255, 255, 255));
        Etrp.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        Etrp.setText("Entreprenuership");
        Etrp.setEnabled(false);
        Etrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EtrpActionPerformed(evt);
            }
        });
        add(Etrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        KOMPAN.setBackground(new java.awt.Color(255, 255, 255));
        KOMPAN.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        KOMPAN.setText("Kommunikasyon and Pananalaksik");
        KOMPAN.setEnabled(false);
        KOMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KOMPANActionPerformed(evt);
            }
        });
        add(KOMPAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, 30));

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
        add(SearhData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 150, 47));

        M1.setBackground(new java.awt.Color(255, 255, 255));
        M1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        M1.setText("VACANT");
        M1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        M1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1ActionPerformed(evt);
            }
        });
        add(M1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 150, 40));

        M2.setBackground(new java.awt.Color(255, 255, 255));
        M2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        M2.setText("VACANT");
        M2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        M2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2ActionPerformed(evt);
            }
        });
        add(M2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 150, 40));

        SearhData5.setBackground(new java.awt.Color(255, 255, 255));
        SearhData5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        SearhData5.setText("BREAK");
        SearhData5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SearhData5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearhData5ActionPerformed(evt);
            }
        });
        add(SearhData5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 790, 30));

        SearhData7.setBackground(new java.awt.Color(255, 255, 255));
        SearhData7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        SearhData7.setText("BREAK");
        SearhData7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SearhData7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearhData7ActionPerformed(evt);
            }
        });
        add(SearhData7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 790, 30));

        M4.setBackground(new java.awt.Color(255, 255, 255));
        M4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        M4.setText("VACANT");
        M4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        M4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M4ActionPerformed(evt);
            }
        });
        add(M4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 150, 40));

        M3.setBackground(new java.awt.Color(255, 255, 255));
        M3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        M3.setText("VACANT");
        M3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        M3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M3ActionPerformed(evt);
            }
        });
        add(M3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 150, 40));

        M6.setBackground(new java.awt.Color(255, 255, 255));
        M6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        M6.setText("VACANT");
        M6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        M6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M6ActionPerformed(evt);
            }
        });
        add(M6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 620, 150, 40));

        M5.setBackground(new java.awt.Color(255, 255, 255));
        M5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        M5.setText("VACANT");
        M5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        M5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M5ActionPerformed(evt);
            }
        });
        add(M5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, 150, 40));

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
        add(SearhData10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 150, 47));

        T1.setBackground(new java.awt.Color(255, 255, 255));
        T1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        T1.setText("VACANT");
        T1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T1ActionPerformed(evt);
            }
        });
        add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 150, 40));

        T2.setBackground(new java.awt.Color(255, 255, 255));
        T2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        T2.setText("VACANT");
        T2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T2ActionPerformed(evt);
            }
        });
        add(T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 150, 40));

        T3.setBackground(new java.awt.Color(255, 255, 255));
        T3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        T3.setText("VACANT");
        T3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T3ActionPerformed(evt);
            }
        });
        add(T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 150, 40));

        T4.setBackground(new java.awt.Color(255, 255, 255));
        T4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        T4.setText("VACANT");
        T4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T4ActionPerformed(evt);
            }
        });
        add(T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 150, 40));

        T5.setBackground(new java.awt.Color(255, 255, 255));
        T5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        T5.setText("VACANT");
        T5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T5ActionPerformed(evt);
            }
        });
        add(T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 570, 150, 40));

        T6.setBackground(new java.awt.Color(255, 255, 255));
        T6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        T6.setText("VACANT");
        T6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        T6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T6ActionPerformed(evt);
            }
        });
        add(T6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 620, 150, 40));

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
        add(SearhData17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 150, 47));

        W1.setBackground(new java.awt.Color(255, 255, 255));
        W1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        W1.setText("VACANT");
        W1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        W1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                W1ActionPerformed(evt);
            }
        });
        add(W1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, 150, 40));

        W2.setBackground(new java.awt.Color(255, 255, 255));
        W2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        W2.setText("VACANT");
        W2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        W2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                W2ActionPerformed(evt);
            }
        });
        add(W2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 340, 150, 40));

        W3.setBackground(new java.awt.Color(255, 255, 255));
        W3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        W3.setText("VACANT");
        W3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        W3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                W3ActionPerformed(evt);
            }
        });
        add(W3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 150, 40));

        W4.setBackground(new java.awt.Color(255, 255, 255));
        W4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        W4.setText("VACANT");
        W4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        W4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                W4ActionPerformed(evt);
            }
        });
        add(W4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 480, 150, 40));

        W5.setBackground(new java.awt.Color(255, 255, 255));
        W5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        W5.setText("VACANT");
        W5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        W5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                W5ActionPerformed(evt);
            }
        });
        add(W5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, 150, 40));

        W6.setBackground(new java.awt.Color(255, 255, 255));
        W6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        W6.setText("VACANT");
        W6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        W6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                W6ActionPerformed(evt);
            }
        });
        add(W6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 620, 150, 40));

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
        add(SearhData24, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, 150, 47));

        U1.setBackground(new java.awt.Color(255, 255, 255));
        U1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        U1.setText("VACANT");
        U1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        U1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                U1ActionPerformed(evt);
            }
        });
        add(U1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 290, 150, 40));

        U2.setBackground(new java.awt.Color(255, 255, 255));
        U2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        U2.setText("VACANT");
        U2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        U2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                U2ActionPerformed(evt);
            }
        });
        add(U2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 340, 150, 40));

        U3.setBackground(new java.awt.Color(255, 255, 255));
        U3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        U3.setText("VACANT");
        U3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        U3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                U3ActionPerformed(evt);
            }
        });
        add(U3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 430, 150, 40));

        U4.setBackground(new java.awt.Color(255, 255, 255));
        U4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        U4.setText("VACANT");
        U4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        U4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                U4ActionPerformed(evt);
            }
        });
        add(U4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 480, 150, 40));

        U5.setBackground(new java.awt.Color(255, 255, 255));
        U5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        U5.setText("VACANT");
        U5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        U5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                U5ActionPerformed(evt);
            }
        });
        add(U5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 570, 150, 40));

        U6.setBackground(new java.awt.Color(255, 255, 255));
        U6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        U6.setText("VACANT");
        U6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        U6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                U6ActionPerformed(evt);
            }
        });
        add(U6, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 620, 150, 40));

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
        add(SearhData31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 230, 150, 47));

        F1.setBackground(new java.awt.Color(255, 255, 255));
        F1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        F1.setText("VACANT");
        F1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });
        add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 290, 150, 40));

        F2.setBackground(new java.awt.Color(255, 255, 255));
        F2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        F2.setText("VACANT");
        F2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F2ActionPerformed(evt);
            }
        });
        add(F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 340, 150, 40));

        F3.setBackground(new java.awt.Color(255, 255, 255));
        F3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        F3.setText("VACANT");
        F3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F3ActionPerformed(evt);
            }
        });
        add(F3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 430, 150, 40));

        F4.setBackground(new java.awt.Color(255, 255, 255));
        F4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        F4.setText("VACANT");
        F4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F4ActionPerformed(evt);
            }
        });
        add(F4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 480, 150, 40));

        F6.setBackground(new java.awt.Color(255, 255, 255));
        F6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        F6.setText("VACANT");
        F6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F6ActionPerformed(evt);
            }
        });
        add(F6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 570, 150, 40));

        F5.setBackground(new java.awt.Color(255, 255, 255));
        F5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        F5.setText("VACANT");
        F5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F5ActionPerformed(evt);
            }
        });
        add(F5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 620, 150, 40));

        SearchEnrolled.setBackground(new java.awt.Color(102, 51, 0));
        SearchEnrolled.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        SearchEnrolled.setForeground(new java.awt.Color(255, 255, 255));
        SearchEnrolled.setText("SEARCH");
        SearchEnrolled.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SearchEnrolled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchEnrolledActionPerformed(evt);
            }
        });
        add(SearchEnrolled, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 40, 213, 47));

        TabEnrollee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Strand", "Form 137", "Form 138", "Good Moral/Dismissal", "LRN"
            }
        ));
        TabEnrollee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabEnrolleeMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TabEnrollee);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 1210, 96));
    }// </editor-fold>//GEN-END:initComponents

    private void SearchTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTermActionPerformed

    }//GEN-LAST:event_SearchTermActionPerformed

    private void SearhDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearhDataActionPerformed
         DefaultTableModel Transfer = (DefaultTableModel) TabEnrollee.getModel();
         String Student = Transfer.getValueAt(TabEnrollee.getSelectedRow(), 5) .toString();
         String OC, CP, ML, CN, HP, EP, KP;
         if(OralCom.isSelected()){
             OC = "Taken";
         }else{
             OC = "Restrict";
         }
         if(CPAR.isSelected()){
             CP = "Taken";
         }else{
             CP = "Restrict";
         }
          
         if(MIL.isSelected()){
             ML = "Taken";
         }else{
             ML = "Restrict";
         }
          
         if(ComPan.isSelected()){
             CN = "Taken";
         }else{
             CN = "Restrict";
         }
          
         if(HOPE.isSelected()){
             HP = "Taken";
         }else{
             HP = "Restrict";
         }
          
         if(Etrp.isSelected()){
             EP = "Taken";
         }else{
             EP = "Restrict";
         }
          
         if(KOMPAN.isSelected()){
             KP = "Taken";
         }else{
             KP = "Restrict";
         }

       
            String setSched = "INSERT INTO schedule (LRN, OralCom, CPAR, MIL, ComProg, HOPE, Etrp, KOMPAN) VALUES('" + Student + "','" + OC + "','" + CP + "','" + ML + "','" + CN + "','" + HP + "','" + EP + "','" + KP + "')";

            String Sched = "UPDATE enrollment SET Status = 'SCHEDULED' WHERE LRN = '" + Student + "'";
            String SchedTrans = "UPDATE transferee SET Status = 'SCHEDULED' WHERE LRN = '" + Student + "'";
             try {
                pst = con.prepareStatement(Sched);
                int en = pst.executeUpdate(); 
                if (en == 1) {
                    pst2 = con.prepareStatement(setSched);
                    pst2.executeUpdate();
                        mypopulate();
                        mypopulateTrans();
                        OralCom.setSelected(false);
                        CPAR.setSelected(false);
                        MIL.setSelected(false);
                        ComPan.setSelected(false);
                        HOPE.setSelected(false);
                        Etrp.setSelected(false);
                        KOMPAN.setSelected(false);
                        
                        OralCom.setEnabled(false);
                        CPAR.setEnabled(false);
                        MIL.setEnabled(false);
                        ComPan.setEnabled(false);
                        HOPE.setEnabled(false);
                        Etrp.setEnabled(false);
                        KOMPAN.setEnabled(false);
                    JOptionPane.showMessageDialog(this, "Schedule has been Set");
                      
                } else {
                    pst2 = con.prepareStatement(SchedTrans);
                    pst2.executeUpdate();
                    pst = con.prepareStatement(setSched);
                    pst.executeUpdate(); 
                        mypopulate();
                        mypopulateTrans();
                        OralCom.setSelected(false);
                        CPAR.setSelected(false);
                        MIL.setSelected(false);
                        ComPan.setSelected(false);
                        HOPE.setSelected(false);
                        Etrp.setSelected(false);
                        KOMPAN.setSelected(false);
                        
                        OralCom.setEnabled(false);
                        CPAR.setEnabled(false);
                        MIL.setEnabled(false);
                        ComPan.setEnabled(false);
                        HOPE.setEnabled(false);
                        Etrp.setEnabled(false);
                        KOMPAN.setEnabled(false);
                    JOptionPane.showMessageDialog(this, "Schedule has been Set");
                    
                }
                        W3 .setText("VACANT");
               U5.setText("VACANT");
               U6.setText("VACANT");
               F6.setText("VACANT");
               W3 .setBackground(new Color(255,255,255));
               U5.setBackground(new Color(255,255,255));
               U6.setBackground(new Color(255,255,255));
               F6.setBackground(new Color(255,255,255));
  M5 .setText("VACANT");
               T4.setText("VACANT");
               U2.setText("VACANT");
               U3.setText("VACANT");
               M5 .setBackground(new Color(255,255,255));
               T4.setBackground(new Color(255,255,255));
               U2.setBackground(new Color(255,255,255));
               U3.setBackground(new Color(255,255,255));

 W1 .setText("VACANT");
               W2.setText("VACANT");
              
               W1.setBackground(new Color(255,255,255));
               W2.setBackground(new Color(255,255,255));
    M3.setBackground(new Color(255,255,255));
                M4.setBackground(new Color(255,255,255));
                T5.setBackground(new Color(255,255,255));
                T6.setBackground(new Color(255,255,255)); 
                W5.setBackground(new Color(255,255,255));
                W6.setBackground(new Color(255,255,255));
                F3.setBackground(new Color(255,255,255));
                F4.setBackground(new Color(255,255,255));
M2 .setText("VACANT");
               T1.setText("VACANT");
               U1.setText("VACANT");
               F2.setText("VACANT");
               M2 .setBackground(new Color(255,255,255));
               T1.setBackground(new Color(255,255,255));
               U1.setBackground(new Color(255,255,255));
               F2.setBackground(new Color(255,255,255));
  M6 .setText("VACANT");
               T2.setText("VACANT");
               U4.setText("VACANT");
               F1.setText("VACANT");
               M6 .setBackground(new Color(255,255,255));
               T2.setBackground(new Color(255,255,255));
               U4.setBackground(new Color(255,255,255));
               F1.setBackground(new Color(255,255,255));
   M1.setText("VACANT");
               T3.setText("VACANT");
               W4.setText("VACANT");
               F5.setText("VACANT");
               M1.setBackground(new Color(255,255,255));
               T3.setBackground(new Color(255,255,255));
               W4.setBackground(new Color(255,255,255));
               F5.setBackground(new Color(255,255,255));
                
                M3.setText("VACANT");
                M4.setText("VACANT");
                T5.setText("VACANT");
                T6.setText("VACANT");
                W5.setText("VACANT");
                W6.setText("VACANT");
                F3.setText("VACANT");
                F4.setText("VACANT");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Unknown Error Occurred");
            }
       
    }//GEN-LAST:event_SearhDataActionPerformed

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

    private void OralComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OralComActionPerformed
         if (OralCom.isSelected()) {
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
    }//GEN-LAST:event_OralComActionPerformed

    private void CPARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPARActionPerformed
        if (CPAR.isSelected()) {
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
    }//GEN-LAST:event_CPARActionPerformed

    private void MILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MILActionPerformed
       if (MIL.isSelected()) {
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
    }//GEN-LAST:event_MILActionPerformed

    private void ComPanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComPanActionPerformed
         if (ComPan.isSelected()) {
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
    }//GEN-LAST:event_ComPanActionPerformed

    private void HOPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOPEActionPerformed
         if (HOPE.isSelected()) {
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
    }//GEN-LAST:event_HOPEActionPerformed

    private void EtrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EtrpActionPerformed
         if (Etrp.isSelected()) {
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
    }//GEN-LAST:event_EtrpActionPerformed

    private void KOMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KOMPANActionPerformed
        if (KOMPAN.isSelected()) {
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
            }
    }//GEN-LAST:event_KOMPANActionPerformed

    private void SearchEnrolledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchEnrolledActionPerformed
        DefaultTableModel Enrollee = (DefaultTableModel) TabEnrollee.getModel();
        Enrollee.setRowCount(0);
        
        String Search = SearchTerm.getText();
        try{
           String queSearch = "SELECT * FROM enrollment WHERE Name LIKE '%" + Search + "%' OR Strand LIKE '%" + Search + "%' AND Status = ' " + "Enrolled" + " '";
           
           String tranSearch = "SELECT * FROM transferee WHERE Name LIKE '%" + Search + "%' OR Strand LIKE '%" + Search + "%' AND Status = ' " + "Enrolled" + " '";
            pst = con.prepareStatement(queSearch);
            rs = pst.executeQuery();
            
          
            
            if(rs.next()){
            String Name = rs.getString("Name");
            String Strand = rs.getString("Strand");
            String Form137 = rs.getString("Form137");
            String Form138 = rs.getString("Form138");
            String GoodMoral = rs.getString("GoodMoral");
            String LRN = rs.getString("LRN");
            
             String order[] = {Name,
                                Strand,
                                  Form137,
                                    Form138,
                                      GoodMoral,
                                        LRN};
             
              Enrollee.addRow(order);
                pst2 = con.prepareStatement(tranSearch);
                rs2 = pst2.executeQuery();
              if(rs2.next()){
                    String tName = rs2.getString("Name");
                    String tStrand = rs2.getString("Strand");
                    String tForm137 = rs2.getString("Form137");
                    String tForm138 = rs2.getString("Form138");
                    String Dismissal = rs2.getString("Dismissal");
                    String tLRN = rs2.getString("LRN");
            
             String ordert[] = {tName,
                                tStrand,
                                  tForm137,
                                    tForm138,
                                      Dismissal,
                                       tLRN};
               Enrollee.addRow(ordert);
              }
            }else{
                JOptionPane.showMessageDialog(this, "Searched term doesn't match any students");
                mypopulate();
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(this, "Unknown Error Occurred" + e);
        }
    }//GEN-LAST:event_SearchEnrolledActionPerformed

    private void TabEnrolleeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabEnrolleeMouseClicked
       OralCom.setEnabled(true);
       ComPan.setEnabled(true);
       Etrp.setEnabled(true);
       CPAR.setEnabled(true);
       KOMPAN.setEnabled(true);
       HOPE.setEnabled(true);
       MIL.setEnabled(true);
       
    }//GEN-LAST:event_TabEnrolleeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CPAR;
    private javax.swing.JCheckBox ComPan;
    private javax.swing.JCheckBox Etrp;
    private javax.swing.JButton F1;
    private javax.swing.JButton F2;
    private javax.swing.JButton F3;
    private javax.swing.JButton F4;
    private javax.swing.JButton F5;
    private javax.swing.JButton F6;
    private javax.swing.JCheckBox HOPE;
    private javax.swing.JCheckBox KOMPAN;
    private javax.swing.JButton M1;
    private javax.swing.JButton M2;
    private javax.swing.JButton M3;
    private javax.swing.JButton M4;
    private javax.swing.JButton M5;
    private javax.swing.JButton M6;
    private javax.swing.JCheckBox MIL;
    private javax.swing.JCheckBox OralCom;
    private javax.swing.JButton SearchEnrolled;
    private javax.swing.JTextField SearchTerm;
    private javax.swing.JButton SearhData;
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
    private javax.swing.JTable TabEnrollee;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
