
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


public class Registrar extends javax.swing.JFrame {
Connection con=null;
PreparedStatement pst=null;
ResultSet res,rst=null;

    public Registrar() {
        initComponents();
        con=dbConnect.db_Con();
        txt_reg.setText(String.valueOf(UserDetails.reg_name));
        txt_id.setText(String.valueOf(UserDetails.reg_id).toString());
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        txt_reg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_natId = new javax.swing.JTextField();
        txt_dod = new javax.swing.JTextField();
        txt_cod = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Logged in as:");

        txt_reg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("ID:");

        txt_id.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("(Ensure that information provided below is accurate, since changes are irreversible.) ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 255));
        jLabel4.setText("NATIONAL ID OF THE DECEASED:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("DATE OF DEATH(DOD):");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 255));
        jLabel6.setText("COURSE OF DEATH:");

        txt_natId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_dod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_cod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("EFFECT CHANGES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reports");

        jMenuItem1.setText("Removed Users Report");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Options");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Logout");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem5.setText("Change Password");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_natId)
                                    .addComponent(txt_dod)
                                    .addComponent(txt_cod)))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_natId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_dod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
            String nat_id=txt_natId.getText();
            String dod=txt_dod.getText();
            String cod=txt_cod.getText();
            
            if(nat_id.equals(""))
             JOptionPane.showMessageDialog(null, "Input national Id","Validation",JOptionPane.ERROR_MESSAGE);
            else if(dod.equals(""))
             JOptionPane.showMessageDialog(null, "Input date of death","Validation",JOptionPane.ERROR_MESSAGE);
            else if(cod.equals(""))
             JOptionPane.showMessageDialog(null, "Input course of death","Validation",JOptionPane.ERROR_MESSAGE);
            else{
                
            try{
                
                 Calendar calx=new GregorianCalendar();
        int month=calx.get(Calendar.MONTH);
        int yearz=calx.get(Calendar.YEAR);
        int day=calx.get(Calendar.DAY_OF_MONTH);
        
       
        
        int hr=calx.get(Calendar.HOUR);
        int min=calx.get(Calendar.MINUTE);
        int sec=calx.get(Calendar.SECOND);
                
            String sel="select * from cash_users where National_id=?";
            pst=con.prepareStatement(sel);
            pst.setString(1,nat_id);
            res=pst.executeQuery();
            if(res.next()){
               int uid=res.getInt("Id");
               String fname=res.getString("First_name");
               String mname=res.getString("Middle_name");
               String lname=res.getString("Last_name");
               String nation=res.getString("Nation");
               String county=res.getString("County");
               String ward=res.getString("Ward");
               String vil=res.getString("Village");
               String gen=res.getString("Gender");
               String sub=res.getString("Sub_County");
               
               
               String rem="insert into cash_removed(user_id,national_id,first_name,middle_name,last_name,nation,county,sub_county,"
                       + "ward,village,gender,dod,cod) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
               pst=con.prepareStatement(rem);
               pst.setInt(1, uid);
               pst.setString(2, nat_id);
               pst.setString(3, fname);
               pst.setString(4, mname);
               pst.setString(5, lname);
               pst.setString(6, nation);
               pst.setString(7, county);
               pst.setString(8, sub);
               pst.setString(9, ward);
               pst.setString(10, vil);
               pst.setString(11, gen);
               pst.setString(12, dod);
               pst.setString(13, cod);
               pst.execute();
               
               
             String inset="insert into cash_actionaudit(action,performed_by,user_id,affected_person,affected_id,date,time,role) values(?,?,?,?,?,?,?,?)";
                    pst=con.prepareStatement(inset);
                    pst.setString(1,"Removed a user(presumed dead)");
                    pst.setString(2,UserDetails.reg_ful);
                    pst.setInt(3,UserDetails.reg_id);
                    pst.setString(4,fname+" "+lname);
                    pst.setInt(5,uid);
                    pst.setString(6,day+"/"+(month+1)+"/"+yearz);
                    pst.setString(7,hr+":"+(min)+":"+sec);
                    pst.setString(8,"Registrar");
                    pst.execute();
               
               String del1="delete from cash_users where National_ID=?";
               pst=con.prepareStatement(del1);
               pst.setString(1, nat_id);
               pst.execute();
               
               String del2="delete from cash_useraccount where National_ID=?";
                pst=con.prepareStatement(del2);
                pst.setString(1, nat_id);
                pst.execute();
                JOptionPane.showMessageDialog(null,"You have Removed a user from the account!","Registrar",JOptionPane.INFORMATION_MESSAGE);
                txt_natId.setText("");
                txt_dod.setText("");
                txt_cod.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "User not part of the register", "Registrar", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
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
    }                                          

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {                                           
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
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
      
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
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
                    pst.setString(2,UserDetails.reg_ful);
                    pst.setInt(3,UserDetails.reg_id);
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
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        UserDetails.profile_id=UserDetails.reg_id;
            String role="registrar";
            UserDetails.profile_role=role;
            UserDetails.profile_pwd=UserDetails.reg_pwd;
            UserDetails.profile_usr=UserDetails.reg_name;
            Profile ad=new Profile();
            ad.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
         Registrar mn=new Registrar();
       mn.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JTextField txt_cod;
    private javax.swing.JTextField txt_dod;
    private javax.swing.JLabel txt_id;
    private javax.swing.JTextField txt_natId;
    private javax.swing.JLabel txt_reg;
    // End of variables declaration//GEN-END:variables
}
