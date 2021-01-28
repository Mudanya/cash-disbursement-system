
package cashdisburser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Signup extends javax.swing.JFrame {
PreparedStatement pst=null;
Connection con=null;
ResultSet res=null;
    
    public Signup() {
        initComponents();
        txt_role.setText(String.valueOf(UserDetails.role).toString());
        
        con=dbConnect.db_Con();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_role = new javax.swing.JTextField();
        txt_natId = new javax.swing.JTextField();
        txt_fname = new javax.swing.JTextField();
        txt_mname = new javax.swing.JTextField();
        txt_unem = new javax.swing.JTextField();
        txt_lname = new javax.swing.JTextField();
        txt_ref = new javax.swing.JTextField();
        txt_pwdH = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txt_pwd = new javax.swing.JPasswordField();
        txt_pwdR = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Registration");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 37, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Role:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 94, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("National ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 146, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("First Name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 197, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Middle Name:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 239, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Last Name:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 303, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Username:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 95, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Reference NO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 148, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Password:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 200, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Re-enter Password:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 257, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Password Hint:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 299, -1, -1));

        txt_role.setEditable(false);
        txt_role.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_role, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 229, 33));

        txt_natId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_natId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_natIdActionPerformed(evt);
            }
        });
        getContentPane().add(txt_natId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 141, 229, 36));

        txt_fname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 197, 229, 31));

        txt_mname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 253, 229, 33));

        txt_unem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_unem, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 90, 229, 35));

        txt_lname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 299, 229, 33));

        txt_ref.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txt_ref, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 143, 229, 36));

        txt_pwdH.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_pwdH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pwdHActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pwdH, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 295, 229, 33));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));
        getContentPane().add(txt_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 198, 229, 30));
        getContentPane().add(txt_pwdR, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 255, 229, 30));

        jMenu1.setText("File");

        jMenuItem1.setText("Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Options");

        jMenuItem2.setText("End Registration");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_pwdHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pwdHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pwdHActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String valu=txt_natId.getText();
        String valu0=txt_fname.getText();
        String valu1=txt_mname.getText();
        String valu2=txt_lname.getText();
        String valu3=txt_unem.getText();
        String valu4=txt_ref.getText();
        String valu5=txt_pwd.getText();
        String valu6=txt_pwdR.getText();
        String valu7=txt_pwdH.getText();
        if(valu.equals(null))
            JOptionPane.showMessageDialog(null, "You must input national ID", "Validation", JOptionPane.ERROR_MESSAGE);
        else if(valu0.equals(""))
            JOptionPane.showMessageDialog(null, "You must input First name", "Validation", JOptionPane.ERROR_MESSAGE);
        else if(valu1.equals(""))
            JOptionPane.showMessageDialog(null, "You must input Middle name", "Validation", JOptionPane.ERROR_MESSAGE);
         else if(valu2.equals(""))
            JOptionPane.showMessageDialog(null, "You must input Last name", "Validation", JOptionPane.ERROR_MESSAGE);
         else if(valu3.equals(""))
            JOptionPane.showMessageDialog(null, "You must input Username", "Validation", JOptionPane.ERROR_MESSAGE);
         else if(valu4.equals(""))
            JOptionPane.showMessageDialog(null, "You must input Reference Number", "Validation", JOptionPane.ERROR_MESSAGE);
         else if(valu5.equals(""))
            JOptionPane.showMessageDialog(null, "You must input Password", "Validation", JOptionPane.ERROR_MESSAGE);
          else if(valu5.length()<4||valu5.length()>10)
            JOptionPane.showMessageDialog(null, "Password should be between 4-10 in length", "Validation", JOptionPane.ERROR_MESSAGE);
         else if(valu6.equals(""))
            JOptionPane.showMessageDialog(null, "You must Re-enter Password", "Validation", JOptionPane.ERROR_MESSAGE);
         else if(valu7.equals(""))
            JOptionPane.showMessageDialog(null, "It is recommended to input password hint", "Validation", JOptionPane.ERROR_MESSAGE);
         else{
             if(UserDetails.role.equals("Audit")){
                 //start of try audit
               try{
                   String chk="select * from cash_audit where nat_id=?";
                   pst=con.prepareStatement(chk);
                   pst.setString(1, txt_natId.getText());
                   res=pst.executeQuery();
                   if(res.next()){
                    JOptionPane.showMessageDialog(null, "User already exists","Audit account",JOptionPane.ERROR_MESSAGE);
                   }
                   else{
                       String chkuser="select * from cash_audit where username=?";
                   pst=con.prepareStatement(chkuser);
                   pst.setString(1, txt_unem.getText());
                   res=pst.executeQuery();
                   if(res.next()){
                      JOptionPane.showMessageDialog(null, "Username already exists","Audit account",JOptionPane.ERROR_MESSAGE);  
                   }
                   
                   else{
                      if(txt_ref.getText().startsWith("AU")&&txt_ref.getText().endsWith("T")) {
                          String chkref="select * from cash_audit where ref_no=?";
                   pst=con.prepareStatement(chkref);
                   pst.setString(1, txt_ref.getText());
                   res=pst.executeQuery(); 
                   if(res.next()){
                    JOptionPane.showMessageDialog(null, "The reference has already been registered!","Audit account",JOptionPane.ERROR_MESSAGE);     
                   }
                   else{
                   String conref="select * from cash_ref where reference=?";
                   pst=con.prepareStatement(conref);
                   pst.setString(1, txt_ref.getText());
                   res=pst.executeQuery(); 
                   if(res.next())
                   {
                   if(txt_pwd.getText().equals(txt_pwdR.getText()))
                   {
                       try{
                     String inset="insert into cash_audit(role,nat_id,first_name,middle_name,last_name,username,ref_no,password,pwd_hint)"
                             + "values(?,?,?,?,?,?,?,?,?)";  
                     pst=con.prepareStatement(inset);
                     pst.setString(1, txt_role.getText());
                     pst.setString(2, txt_natId.getText());
                     pst.setString(3, txt_fname.getText());
                     pst.setString(4, txt_mname.getText());
                     pst.setString(5, txt_lname.getText());
                     pst.setString(6, txt_unem.getText());
                     pst.setString(7, txt_ref.getText());
                     pst.setString(8, txt_pwd.getText());
                     pst.setString(9, txt_pwdH.getText());
                     pst.execute();
                     JOptionPane.showMessageDialog(null, "Account created successfully","Audit account",JOptionPane.INFORMATION_MESSAGE); 
                     Login lg=new Login();
                     lg.setVisible(true);
                     this.dispose();
                       }
                       catch(Exception e){
                           JOptionPane.showMessageDialog(null, e);   
                       }
                   }
                   else{
                     JOptionPane.showMessageDialog(null, "Password mismatch!","Audit account",JOptionPane.ERROR_MESSAGE);   
                   }
                   }
                   else{
                       JOptionPane.showMessageDialog(null, "Wrong reference number!","Audit account",JOptionPane.ERROR_MESSAGE); 
                   }
                   }
                      }
                      else{
                        JOptionPane.showMessageDialog(null, "Wrong reference number!","Audit account",JOptionPane.ERROR_MESSAGE);  
                      }
                   }
                   }
               }  
               catch(Exception e){
                   
               }
               //---end of try audit
             }
             else if(UserDetails.role.equals("Admin")){
                  //start of try admin
               try{
                   String chk="select * from cash_admin where nat_id=?";
                   pst=con.prepareStatement(chk);
                   pst.setString(1, txt_natId.getText());
                   res=pst.executeQuery();
                   if(res.next()){
                    JOptionPane.showMessageDialog(null, "User already exists","Admin account",JOptionPane.ERROR_MESSAGE);
                   }
                   else{
                       String chkuser="select * from cash_admin where username=?";
                   pst=con.prepareStatement(chkuser);
                   pst.setString(1, txt_unem.getText());
                   res=pst.executeQuery();
                   if(res.next()){
                      JOptionPane.showMessageDialog(null, "Username already exists","Admin account",JOptionPane.ERROR_MESSAGE);  
                   }
                 
                   else{
                      if(txt_ref.getText().startsWith("AD")&&txt_ref.getText().endsWith("M")) {
                          String chkref="select * from cash_admin where ref_no=?";
                   pst=con.prepareStatement(chkref);
                   pst.setString(1, txt_ref.getText());
                   res=pst.executeQuery(); 
                   if(res.next()){
                    JOptionPane.showMessageDialog(null, "The reference has already been registered!","Admin account",JOptionPane.ERROR_MESSAGE);     
                   }
                   else{
                   String conref="select * from cash_ref where reference=?";
                   pst=con.prepareStatement(conref);
                   pst.setString(1, txt_ref.getText());
                   res=pst.executeQuery(); 
                   if(res.next())
                   {
                   if(txt_pwd.getText().equals(txt_pwdR.getText()))
                   {
                       try{
                     String inset="insert into cash_admin(role,nat_id,first_name,middle_name,last_name,username,ref_no,password,pwd_hint)"
                             + "values(?,?,?,?,?,?,?,?,?)";  
                     pst=con.prepareStatement(inset);
                     pst.setString(1, txt_role.getText());
                     pst.setString(2, txt_natId.getText());
                     pst.setString(3, txt_fname.getText());
                     pst.setString(4, txt_mname.getText());
                     pst.setString(5, txt_lname.getText());
                     pst.setString(6, txt_unem.getText());
                     pst.setString(7, txt_ref.getText());
                     pst.setString(8, txt_pwd.getText());
                     pst.setString(9, txt_pwdH.getText());
                     pst.execute();
                     JOptionPane.showMessageDialog(null, "Account created successfully","Admin account",JOptionPane.INFORMATION_MESSAGE); 
                     Login lg=new Login();
                     lg.setVisible(true);
                     this.dispose();
                       }
                       catch(Exception e){
                           JOptionPane.showMessageDialog(null, e);   
                       }
                   }
                   else{
                     JOptionPane.showMessageDialog(null, "Password mismatch!","Admin account",JOptionPane.ERROR_MESSAGE);   
                   }
                   }
                   else{
                       JOptionPane.showMessageDialog(null, "Wrong reference number!","Admin account",JOptionPane.ERROR_MESSAGE); 
                   }
                   }
                      }
                      else{
                        JOptionPane.showMessageDialog(null, "Wrong reference number!","Admin account",JOptionPane.ERROR_MESSAGE);  
                      }
                   }
                   }
               }  
               catch(Exception e){
                   
               }
               //---end of try admin
                 
             }
             else{
                 //start of try registrar
               try{
                   String chk="select * from cash_registrar where nat_id=?";
                   pst=con.prepareStatement(chk);
                   pst.setString(1, txt_natId.getText());
                   res=pst.executeQuery();
                   if(res.next()){
                    JOptionPane.showMessageDialog(null, "User already exists","Registrar account",JOptionPane.ERROR_MESSAGE);
                   }
                   else{
                       String chkuser="select * from cash_registrar where username=?";
                   pst=con.prepareStatement(chkuser);
                   pst.setString(1, txt_unem.getText());
                   res=pst.executeQuery();
                   if(res.next()){
                      JOptionPane.showMessageDialog(null, "Username already exists","Registrar account",JOptionPane.ERROR_MESSAGE);  
                   }
                   
                   else{
                      if(txt_ref.getText().startsWith("RE")&&txt_ref.getText().endsWith("R")) {
                          String chkref="select * from cash_registrar where ref_no=?";
                   pst=con.prepareStatement(chkref);
                   pst.setString(1, txt_ref.getText());
                   res=pst.executeQuery(); 
                   if(res.next()){
                    JOptionPane.showMessageDialog(null, "The reference has already been registered!","Registrar account",JOptionPane.ERROR_MESSAGE);     
                   }
                   else{
                   String conref="select * from cash_ref where reference=?";
                   pst=con.prepareStatement(conref);
                   pst.setString(1, txt_ref.getText());
                   res=pst.executeQuery(); 
                   if(res.next())
                   {
                   if(txt_pwd.getText().equals(txt_pwdR.getText()))
                   {
                       try{
                     String inset="insert into cash_registrar(role,nat_id,first_name,middle_name,last_name,username,ref_no,password,pwd_hint)"
                             + "values(?,?,?,?,?,?,?,?,?)";  
                     pst=con.prepareStatement(inset);
                     pst.setString(1, txt_role.getText());
                     pst.setString(2, txt_natId.getText());
                     pst.setString(3, txt_fname.getText());
                     pst.setString(4, txt_mname.getText());
                     pst.setString(5, txt_lname.getText());
                     pst.setString(6, txt_unem.getText());
                     pst.setString(7, txt_ref.getText());
                     pst.setString(8, txt_pwd.getText());
                     pst.setString(9, txt_pwdH.getText());
                     pst.execute();
                     JOptionPane.showMessageDialog(null, "Account created successfully","Registrar account",JOptionPane.INFORMATION_MESSAGE); 
                     Login lg=new Login();
                     lg.setVisible(true);
                     this.dispose();
                       }
                       catch(Exception e){
                           JOptionPane.showMessageDialog(null, e);   
                       }
                   }
                   else{
                     JOptionPane.showMessageDialog(null, "Password mismatch!","Registrar account",JOptionPane.ERROR_MESSAGE);   
                   }
                   }
                   else{
                       JOptionPane.showMessageDialog(null, "Wrong reference number!","Registrar account",JOptionPane.ERROR_MESSAGE); 
                   }
                   }
                      }
                      else{
                        JOptionPane.showMessageDialog(null, "Wrong reference number!","Registrar account",JOptionPane.ERROR_MESSAGE);  
                      }
                   }
                   }
               }  
               catch(Exception e){
                   
               }
               //---end of try registrar
             }
             
             
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_natIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_natIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_natIdActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Login lg=new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         Login lg=new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
         Signup mn=new Signup();
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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JTextField txt_mname;
    private javax.swing.JTextField txt_natId;
    private javax.swing.JPasswordField txt_pwd;
    private javax.swing.JTextField txt_pwdH;
    private javax.swing.JPasswordField txt_pwdR;
    private javax.swing.JTextField txt_ref;
    private javax.swing.JTextField txt_role;
    private javax.swing.JTextField txt_unem;
    // End of variables declaration//GEN-END:variables
}
