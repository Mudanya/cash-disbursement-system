/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashdisburser;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Audit extends javax.swing.JFrame {

    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rst=null;
    public Audit() {
        initComponents();
        con=dbConnect.db_Con();
        AuditResult();
        
         
        
        
    }
private void AuditResult(){
    try{
           String sel="select * from cash_actionAudit";
            pst=con.prepareStatement(sel);
           
            rst=pst.executeQuery();
            tbl_adt.setModel(DbUtils.resultSetToTableModel(rst));   
            tbl_adt.setVisible(true);
    }
    catch(Exception e){
        
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_adt = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_adt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(tbl_adt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 69, 770, 413));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Search by Role:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 30, -1, -1));

        txt_search.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 28, 243, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, -1, 40));

        jButton3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 420, 70, -1));

        jMenu1.setText("File");

        jMenuItem1.setText("Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reports");

        jMenuItem4.setText("Audit Report");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenu5.setText("Other Reports");

        jMenuItem6.setText("Amount Allocation Report");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("Removed User Report");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem8.setText("Deleted User Report");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenu2.add(jMenu5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Account Settings");

        jMenuItem9.setText("Change Password");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Options");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem10.setText("Logout");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        try{
            String sel="select * from cash_actionAudit where role=?";
            pst=con.prepareStatement(sel);
            pst.setString(1,txt_search.getText());
            rst=pst.executeQuery();
            tbl_adt.setModel(DbUtils.resultSetToTableModel(rst));
            tbl_adt.setVisible(true);
            
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         AuditResult();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        txt_search.setText("");
        tbl_adt.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Login lg=new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      Audit mn=new Audit();
       mn.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.dispose();
 
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
         Login lg=new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       //goes here
        
        JFileChooser dialog=new JFileChooser();
        dialog.setSelectedFile(new File("Cash Disbursment Audit Report"+".pdf"));
        int dRst=dialog.showSaveDialog(null);
        if(dRst==JFileChooser.APPROVE_OPTION){
        String filep=dialog.getSelectedFile().getPath();
        try{
              Document myDoc=new Document();
           PdfWriter myWriter=PdfWriter.getInstance(myDoc,new FileOutputStream(filep));
           
           PdfPTable table=new PdfPTable(9); 
           
           
           float[] col=new float[]{8,8,8,8,8,8,8,8,8};
           table.setWidths(col);
           table.setWidthPercentage(100);
           
           myDoc.open();
           myDoc.add(new Paragraph("Cash Disbursement",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD,BaseColor.BLUE)));
           
           myDoc.add(new Paragraph(new Date().toString()));
           myDoc.add(new Paragraph("=========================================================================="));
           
           
          
           table.addCell(new PdfPCell(new Paragraph("Audit ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("Role",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("Action",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("Performed by",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("Performer ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           
           table.addCell(new PdfPCell(new Paragraph("Affected person",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("Affected person ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("Date",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("Time",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          
          String sel="select * from cash_actionaudit";
           pst=con.prepareStatement(sel);
           rst=pst.executeQuery();
           while(rst.next()){
            table.addCell(new PdfPCell(new Paragraph(rst.getString("audit_id"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("role"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("action"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("performed_by"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("user_id"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("affected_person"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("affected_id"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("date"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("time"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           }
           myDoc.add(table);
           myDoc.close();    
           JOptionPane.showMessageDialog(null, "Report successfully generated","Report",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        
        
        }  
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       
        JFileChooser dialog=new JFileChooser();
        dialog.setSelectedFile(new File("Cash Disbursment Amount Allocation Report"+".pdf"));
        int dRst=dialog.showSaveDialog(null);
        if(dRst==JFileChooser.APPROVE_OPTION){
        String filep=dialog.getSelectedFile().getPath();
        try{
              Document myDoc=new Document();
           PdfWriter myWriter=PdfWriter.getInstance(myDoc,new FileOutputStream(filep));
           
           PdfPTable table=new PdfPTable(4); 
           
           
           float[] col=new float[]{8,8,8,8};
           table.setWidths(col);
           table.setWidthPercentage(100);
           
           myDoc.open();
           myDoc.add(new Paragraph("Cash Disbursement",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD,BaseColor.BLUE)));
           
           myDoc.add(new Paragraph(new Date().toString()));
           myDoc.add(new Paragraph("=========================================================================="));
           
           
          
           table.addCell(new PdfPCell(new Paragraph("Amount",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("Allocated by",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("date",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("time",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           
          
          String sel="select * from cash_funds";
           pst=con.prepareStatement(sel);
           rst=pst.executeQuery();
           while(rst.next()){
            table.addCell(new PdfPCell(new Paragraph(rst.getString("amount"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("allocator"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("date"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("time"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           
           }
           myDoc.add(table);
           myDoc.close();    
           JOptionPane.showMessageDialog(null, "Report successfully generated","Report",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
JFileChooser dialog=new JFileChooser();
        dialog.setSelectedFile(new File("Cash Disbursment Removed users Report"+".pdf"));
        int dRst=dialog.showSaveDialog(null);
        if(dRst==JFileChooser.APPROVE_OPTION){
        String filep=dialog.getSelectedFile().getPath();
        try{
              Document myDoc=new Document();
           PdfWriter myWriter=PdfWriter.getInstance(myDoc,new FileOutputStream(filep));
           
           PdfPTable table=new PdfPTable(13); 
           
           
           float[] col=new float[]{8,8,8,8,8,8,8,8,8,8,8,8,8};
           table.setWidths(col);
           table.setWidthPercentage(100);
           
           myDoc.open();
           myDoc.add(new Paragraph("Cash Disbursement",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD,BaseColor.BLUE)));
           
           myDoc.add(new Paragraph(new Date().toString()));
           myDoc.add(new Paragraph("=========================================================================="));
           
           
          
           table.addCell(new PdfPCell(new Paragraph("User ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("National ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("First Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("Middle Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("Last Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           
           table.addCell(new PdfPCell(new Paragraph("Nation",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("County",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("Sub County",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("Ward",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           
            table.addCell(new PdfPCell(new Paragraph("Village",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("Gender",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("Date of Death",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("Course of Death",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          
          String sel="select * from cash_removed";
           pst=con.prepareStatement(sel);
           rst=pst.executeQuery();
           while(rst.next()){
            table.addCell(new PdfPCell(new Paragraph(rst.getString("user_id"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("national_id"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("first_name"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("middle_name"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("last_name"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("nation"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("county"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("sub_county"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("ward"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("village"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("gender"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("dod"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("cod"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           }
           myDoc.add(table);
           myDoc.close();    
           JOptionPane.showMessageDialog(null, "Report successfully generated","Report",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        
        
        }          
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        JFileChooser dialog=new JFileChooser();
        dialog.setSelectedFile(new File("Cash Disbursment deleted user Report"+".pdf"));
        int dRst=dialog.showSaveDialog(null);
        if(dRst==JFileChooser.APPROVE_OPTION){
        String filep=dialog.getSelectedFile().getPath();
        try{
              Document myDoc=new Document();
           PdfWriter myWriter=PdfWriter.getInstance(myDoc,new FileOutputStream(filep));
           
           PdfPTable table=new PdfPTable(11); 
           
           
           float[] col=new float[]{8,8,8,8,8,8,8,8,8,8,8};
           table.setWidths(col);
           table.setWidthPercentage(100);
           
           myDoc.open();
           myDoc.add(new Paragraph("Cash Disbursement",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD,BaseColor.BLUE)));
           
           myDoc.add(new Paragraph(new Date().toString()));
           myDoc.add(new Paragraph("=========================================================================="));
           
           
          
           table.addCell(new PdfPCell(new Paragraph("User ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("National ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("First Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("Middle Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("Last Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           
           table.addCell(new PdfPCell(new Paragraph("Nation",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("County",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("Sub County",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("Ward",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           
            table.addCell(new PdfPCell(new Paragraph("Village",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           table.addCell(new PdfPCell(new Paragraph("Reason",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
           
          
          String sel="select * from cash_deleted";
           pst=con.prepareStatement(sel);
           rst=pst.executeQuery();
           while(rst.next()){
            table.addCell(new PdfPCell(new Paragraph(rst.getString("user_id"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("national_id"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("first_name"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("middle_name"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("last_name"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("nation"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("county"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("sub_county"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("ward"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("village"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph(rst.getString("reason"),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            JOptionPane.showMessageDialog(null, "Report successfully generated","Report",JOptionPane.INFORMATION_MESSAGE);
           }
           myDoc.add(table);
           myDoc.close();    
           
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        
        
        }          
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
       try{
           
           Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
        int year=cal.get(Calendar.YEAR);
        int day=cal.get(Calendar.DAY_OF_MONTH);
        
        
        
        int hr=cal.get(Calendar.HOUR);
        int min=cal.get(Calendar.MINUTE);
        int sec=cal.get(Calendar.SECOND);
        
           
         String inset="insert into cash_actionaudit(action,performed_by,user_id,affected_person,affected_id,date,time,role) values(?,?,?,?,?,?,?,?)";
                    pst=con.prepareStatement(inset);
                    pst.setString(1,"Logged out");
                    pst.setString(2,UserDetails.fulaud);
                    pst.setInt(3,UserDetails.audit_id);
                    pst.setString(4,"N/A");
                    pst.setString(5,"N/A");
                    pst.setString(6,day+"/"+(month+1)+"/"+year);
                    pst.setString(7,hr+":"+(min)+":"+sec);
                    pst.setString(8,"Audit");
                    pst.execute();
        Login lg=new Login();
       lg.setVisible(true);
       this.dispose();
       }
       catch(Exception e){
           
       }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
       
            UserDetails.profile_id=UserDetails.audit_id;
            String role="audit";
            UserDetails.profile_role=role;
            UserDetails.profile_pwd=UserDetails.audit_pwd;
            UserDetails.profile_usr=UserDetails.audit_name;
            Profile ad=new Profile();
            ad.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    
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
            java.util.logging.Logger.getLogger(Audit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Audit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Audit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Audit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Audit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_adt;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
