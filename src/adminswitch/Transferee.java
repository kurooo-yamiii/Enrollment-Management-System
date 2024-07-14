
package adminswitch;

import enrollment.Profile;
import enrollment.View;
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


public class Transferee extends javax.swing.JPanel {

     Connection con; 
    PreparedStatement pst; 
    ResultSet rs;
  
  
  public void Connect() {
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost/enrollment","root","");
    } catch (ClassNotFoundException | SQLException ex){
    Logger.getLogger(Enroll.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
  
    public Transferee() {
        initComponents();
        Connect();
        mypopulate();
    }
    
    public void mypopulate() {
         DefaultTableModel Enrollee = (DefaultTableModel) TabEnrollee.getModel();
              Enrollee.setRowCount(0);
        try { 
            String querylogin = "SELECT * FROM transferee WHERE Status = '"+""+"'"; 
            pst = con.prepareStatement(querylogin);
            rs = pst.executeQuery();
            
            while (rs.next()){
            String Name = rs.getString("Name");
            String Strand = rs.getString("Strand");
            String Form137 = rs.getString("Form137");
            String Form138 = rs.getString("Form138");
            String Dismissal = rs.getString("Dismissal");
            String LRN = rs.getString("LRN");
            
             String order[] = {Name,
                                Strand,
                                  Form137,
                                    Form138,
                                      Dismissal,
                                        LRN};
             
              Enrollee.addRow(order);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Unknown Error Occured"); 
        }
       
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchTerm = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        SearhData = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabEnrollee = new javax.swing.JTable();
        Drop = new javax.swing.JButton();
        Approve = new javax.swing.JButton();
        View = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 51, 0), 3));

        SearchTerm.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        SearchTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTermActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel1.setText("Search: ");

        SearhData.setBackground(new java.awt.Color(102, 51, 0));
        SearhData.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        SearhData.setForeground(new java.awt.Color(255, 255, 255));
        SearhData.setText("SEARCH");
        SearhData.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SearhData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearhDataActionPerformed(evt);
            }
        });

        TabEnrollee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Strand", "Form 137", "Form 138", "Dismissal", "LRN"
            }
        ));
        jScrollPane1.setViewportView(TabEnrollee);

        Drop.setBackground(new java.awt.Color(102, 51, 0));
        Drop.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Drop.setForeground(new java.awt.Color(255, 255, 255));
        Drop.setText("DROP");
        Drop.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Drop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropActionPerformed(evt);
            }
        });

        Approve.setBackground(new java.awt.Color(102, 51, 0));
        Approve.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Approve.setForeground(new java.awt.Color(255, 255, 255));
        Approve.setText("APPROVE");
        Approve.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApproveActionPerformed(evt);
            }
        });

        View.setBackground(new java.awt.Color(102, 51, 0));
        View.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        View.setForeground(new java.awt.Color(255, 255, 255));
        View.setText("VIEW");
        View.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Approve, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Drop, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(2, 2, 2)
                            .addComponent(SearchTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(SearhData, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(SearhData, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Drop, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Approve, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTermActionPerformed

    }//GEN-LAST:event_SearchTermActionPerformed

    private void SearhDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearhDataActionPerformed
        DefaultTableModel Enrollee = (DefaultTableModel) TabEnrollee.getModel();
        Enrollee.setRowCount(0);

        String Search = SearchTerm.getText();
        try{
            String queSearch = "SELECT * FROM transferee WHERE Status LIKE '%" + Search + "%' OR Name LIKE '%" + Search + "%' OR Strand LIKE '%" + Search + "%'";
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
            }else{
                JOptionPane.showMessageDialog(this, "Searched term doesn't match any students");
                mypopulate();
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(this, "Unknown Error Occurred");
        }

    }//GEN-LAST:event_SearhDataActionPerformed

    private void DropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropActionPerformed
        DefaultTableModel Enrollee = (DefaultTableModel) TabEnrollee.getModel();
        String Student = Enrollee.getValueAt(TabEnrollee.getSelectedRow(), 5) .toString();
        String Name = Enrollee.getValueAt(TabEnrollee.getSelectedRow(), 0) .toString();

        if (TabEnrollee.getSelectedRowCount() == 1) {

            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the record for Ms/Mr " + Name + "?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (dialogResult == JOptionPane.YES_OPTION) {
                String Drop = "DELETE FROM transferee WHERE LRN = '" + Student + "' ";
                try {
                    pst = con.prepareStatement(Drop);
                    int update = pst.executeUpdate();
                    if (update > 0) {
                        JOptionPane.showMessageDialog(this, "Ms/Mr " + Name + " has been deleted from the records.");
                        mypopulate();
                    } else {
                        JOptionPane.showMessageDialog(this, "Connection Lost, Please Try Again");
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Unknown Error Occurred");
                }
            }
        } else {
            if (TabEnrollee.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "There is no Student listed for the meantime");
            } else {
                JOptionPane.showMessageDialog(this, "Select a Student from the Table");
            }
        }
    }//GEN-LAST:event_DropActionPerformed

    private void ApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApproveActionPerformed
        DefaultTableModel Enrollee = (DefaultTableModel) TabEnrollee.getModel();
        String Student = Enrollee.getValueAt(TabEnrollee.getSelectedRow(), 5) .toString();
        String Name = Enrollee.getValueAt(TabEnrollee.getSelectedRow(), 0) .toString();

        if(TabEnrollee.getSelectedRowCount() ==1){
            String Approve = "UPDATE transferee SET Status = '"+"Enrolled"+"' WHERE LRN = '"+Student+"' ";
            try{
                pst = con.prepareStatement(Approve);
                int update = pst.executeUpdate();
                if(update > 0){

                    JOptionPane.showMessageDialog(this, "Ms/Mr " + Name + " is now Enrolled to Rizal High School");
                    mypopulate();
                }else{
                    JOptionPane.showMessageDialog(this, "Connection Lost, Please Try Again");
                }
            }catch (SQLException e){
                JOptionPane.showMessageDialog(this, "Unknown Error Occured");
            }
        }else{
            if(TabEnrollee.getSelectedRowCount() ==0){
                JOptionPane.showMessageDialog(this, "There is no Student listed for a meantime");
            }else{
                JOptionPane.showMessageDialog(this, "Select Student to the Table");
            }
        }

    }//GEN-LAST:event_ApproveActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        DefaultTableModel Enrollee = (DefaultTableModel) TabEnrollee.getModel();
        String Student = Enrollee.getValueAt(TabEnrollee.getSelectedRow(), 5) .toString();

        try{
            String viewQue = "SELECT * FROM transferee WHERE LRN = '"+Student+"'";
            pst = con.prepareStatement(viewQue);
            rs = pst.executeQuery();
            if(rs.next()){
                String Name, Age, Sex, Birthdate, Address, Number, Civil, Elem, ESY, High, HSY, LRN, Strand, Form137, Form138, Dismissal;
                Name = rs.getString("Name");
                Age = rs.getString("Age");
                Sex = rs.getString("Sex");
                Birthdate = rs.getString("Birthday");
                Address = rs.getString("Address");
                Number = rs.getString("Number");
                Civil = rs.getString("Civil");
                Elem = rs.getString("Elem");
                ESY = rs.getString("ESY");
                High = rs.getString("High");
                HSY = rs.getString("HSY");
                LRN = rs.getString("LRN");
                Strand = rs.getString("Strand");
                Form137 = rs.getString("Form137");
                Form138 = rs.getString("Form138");
                Dismissal = rs.getString("Dismissal");

                View ViewShow = new View();
                ViewShow.View(Name, Age, Sex, Birthdate, Address, Number, Civil, Elem, ESY, High, HSY, LRN, Strand, Form137, Form138, Dismissal);
                ViewShow.show();
            }else{
                JOptionPane.showMessageDialog(this, "Please Select a Student you want to View");
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(this, "Unknown Error Occurred");
        }
    }//GEN-LAST:event_ViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Approve;
    private javax.swing.JButton Drop;
    private javax.swing.JTextField SearchTerm;
    private javax.swing.JButton SearhData;
    private javax.swing.JTable TabEnrollee;
    private javax.swing.JButton View;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
