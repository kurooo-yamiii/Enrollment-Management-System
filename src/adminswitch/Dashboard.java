
package adminswitch;

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

public class Dashboard extends javax.swing.JPanel {
    
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
    
    public Dashboard() {
        initComponents();
        Connect();
        mypopulate();
        mypopulatetrans();
        scheduled();
    }
    
    public int EN, TR, SB, SCH;
    
    
    public void mypopulate() {
         DefaultTableModel Enrollee = (DefaultTableModel) TabEN.getModel();
              Enrollee.setRowCount(0);
        try { 
            String querylogin = "SELECT * FROM enrollment WHERE Status='' ORDER BY ID DESC LIMIT 4";
            pst = con.prepareStatement(querylogin);
            rs = pst.executeQuery();
            
            
            String totEnroll = "SELECT COUNT(*) AS total FROM enrollment";
            pst2 = con.prepareStatement(totEnroll);
            rs2 = pst2.executeQuery();
            if (rs2.next()) {
             EN = rs2.getInt("total");
             TotEnrollees.setText(String.valueOf(EN));
             }
            
            while (rs.next()){
            String Name = rs.getString("Name");
            String Strand = rs.getString("Strand");
            String Form138 = rs.getString("Form138");
            String LRN = rs.getString("LRN");
            
             String order[] = {Name,
                                Strand,
                                    Form138,
                                        LRN};
             
             Enrollee.addRow(order);
            }
           
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Unknown Error Occured"); 
        }
       
        
    }
    
     public void mypopulatetrans() {
         DefaultTableModel Tansfer = (DefaultTableModel) TabTRA.getModel();
              Tansfer.setRowCount(0);
        try { 
            String trans = "SELECT * FROM transferee WHERE Status='' ORDER BY ID DESC LIMIT 4";
            pst = con.prepareStatement(trans);
            rs = pst.executeQuery();
            
            
            String totTrans = "SELECT COUNT(*) AS total FROM transferee";
            pst2 = con.prepareStatement(totTrans);
            rs2 = pst2.executeQuery();
            if (rs2.next()) {
             TR = rs2.getInt("total");
             TotTransferee.setText(String.valueOf(TR));
              SB = TR + EN;
                TotStandby.setText(String.valueOf(SB));
             }
           
            
            while (rs.next()){
            String Name = rs.getString("Name");
            String Strand = rs.getString("Strand");
            String Form138 = rs.getString("Form138");
            String LRN = rs.getString("LRN");
            
             String order[] = {Name,
                                Strand,
                                    Form138,
                                        LRN};
             
             Tansfer.addRow(order);
            }
     
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Unknown Error Occured" + ex); 
        }
       
        
    }
     
     public void scheduled(){
         try{
          String sched = "SELECT COUNT(*) AS total FROM schedule";
            pst2 = con.prepareStatement(sched);
            rs2 = pst2.executeQuery();
            if (rs2.next()) {
             SCH = rs2.getInt("total");
             TotSchedule.setText(String.valueOf(SCH));
              
             }
         }catch (SQLException e){
               JOptionPane.showMessageDialog(this, "Unknown Error Occured" + e); 
         }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        TotEnrollees = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TotTransferee = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TotStandby = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabTRA = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TotSchedule = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabEN = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 51, 0), 3));
        setPreferredSize(new java.awt.Dimension(1301, 714));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel8.setText("TOTAL OF STUDENT ");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 12, -1, -1));

        TotEnrollees.setFont(new java.awt.Font("Arial Narrow", 1, 60)); // NOI18N
        TotEnrollees.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TotEnrollees.setText("8");
        jPanel3.add(TotEnrollees, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabel21.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel21.setText("ENROLLEES");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 350));

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel3.setText("TOTAL OF STUDENT ");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 12, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel13.setText("TRANSFEREE");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        TotTransferee.setFont(new java.awt.Font("Arial Narrow", 1, 60)); // NOI18N
        TotTransferee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TotTransferee.setText("8");
        jPanel4.add(TotTransferee, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 310, 350));

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel9.setText("TOTAL OF STUDENT ");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 12, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel14.setText("STANDBY");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        TotStandby.setFont(new java.awt.Font("Arial Narrow", 1, 60)); // NOI18N
        TotStandby.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TotStandby.setText("8");
        jPanel5.add(TotStandby, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 290, 350));

        TabTRA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Strand", "Form138", "LRN"
            }
        ));
        jScrollPane2.setViewportView(TabTRA);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 1260, 100));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel10.setText("TOTAL OF STUDENT ");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 12, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel12.setText("SCHEDULED");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        TotSchedule.setFont(new java.awt.Font("Arial Narrow", 1, 60)); // NOI18N
        TotSchedule.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TotSchedule.setText("8");
        jPanel6.add(TotSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, 290, 350));

        jLabel19.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel19.setText("ENROLLEES");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel20.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel20.setText("ENROLLEES");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel15.setText("RECENT TRANSFEREE");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 230, -1));

        jLabel22.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel22.setText("RECENT ENROLLEES");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        TabEN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Strand", "Form138", "LRN"
            }
        ));
        jScrollPane3.setViewportView(TabEN);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 1260, 100));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabEN;
    private javax.swing.JTable TabTRA;
    private javax.swing.JLabel TotEnrollees;
    private javax.swing.JLabel TotSchedule;
    private javax.swing.JLabel TotStandby;
    private javax.swing.JLabel TotTransferee;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
