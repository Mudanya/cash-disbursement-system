/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashdisburser;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Nexo Bentola
 */
public class Login extends javax.swing.JFrame {
Connection con=null;
ResultSet rst,res,rset=null;
PreparedStatement ps,pst,prep=null;
private String ful;
    public Login() {
        initComponents();
        //Toolkit kit=getToolkit();
        //Dimension size=kit.getScreenSize();
        
        //setLocation(size.width/2-getWidth()/2,size.height/2-getHeight());
        
        con=dbConnect.db_Con();
        currentDate();
    }

    public void currentDate(){
        Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
        int year=cal.get(Calendar.YEAR);
        int day=cal.get(Calendar.DAY_OF_MONTH);
        
        jMenu3.setText(day+"/"+(month+1)+"/"+year);
        
        int hr=cal.get(Calendar.HOUR);
        int min=cal.get(Calendar.MINUTE);
        int sec=cal.get(Calendar.SECOND);
        
        jMenu2.setText(hr+":"+(min)+":"+sec);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        combo_role = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Fund Disburser");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 37, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Username:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 186, 96, 29));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 233, 96, 29));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Role:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 269, 96, 29));

        combo_role.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combo_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Beneficiary", "Audit", "Registrar" }));
        combo_role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_roleActionPerformed(evt);
            }
        });
        getContentPane().add(combo_role, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 269, 128, 24));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 298, 104, -1));

        txt_username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 186, 128, 29));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 233, 128, 26));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 102));
        jButton2.setText("New User?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 352, 128, -1));

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Date");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{String acess=(combo_role.getSelectedItem().toString());
          Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
        int year=cal.get(Calendar.YEAR);
        int day=cal.get(Calendar.DAY_OF_MONTH);
        
       
        
        int hr=cal.get(Calendar.HOUR);
        int min=cal.get(Calendar.MINUTE);
        int sec=cal.get(Calendar.SECOND);
        
        
            if(acess=="Admin"){
                int count=0;
                String qry="select id,username,password,role,first_name,last_name from cash_admin where (username=? and password=? and role=?)";
                ps=con.prepareStatement(qry);
                ps.setString(1, txt_username.getText());
                ps.setString(2, txt_password.getText());
                ps.setString(3, combo_role.getSelectedItem().toString());

                rst=ps.executeQuery();
                while(rst.next())
                {
                    count++;
                    
                    String admin=rst.getString("username");
                    String pwd=rst.getString("password");
                    String fname=rst.getString("first_name");
                    String lname=rst.getString("last_name");
                    
                    String full=fname+" "+lname;
                    this.ful=full;
                    UserDetails.fuladm=full;
                    UserDetails.adminpwd=pwd;
                    UserDetails.admin=admin;
                    int a_pwd=rst.getInt("id");
                    UserDetails.id_admin=a_pwd;
                    UserDetails.adminful=full;
                }
                if(acess=="Admin")
                {
                    if(count==1)
                    {
                    String inset="insert into cash_actionaudit(action,performed_by,user_id,affected_person,affected_id,date,time,role) values(?,?,?,?,?,?,?,?)";
                    pst=con.prepareStatement(inset);
                    pst.setString(1,"Logged in");
                    pst.setString(2,ful);
                    pst.setInt(3,UserDetails.id_admin);
                    pst.setString(4,"N/A");
                    pst.setString(5,"N/A");
                    pst.setString(6,day+"/"+(month+1)+"/"+year);
                    pst.setString(7,hr+":"+(min)+":"+sec);
                    pst.setString(8,"Admin");
                    pst.execute();
                        MainMenu menu=new MainMenu();
                        menu.setVisible(true);
                        this.dispose();

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Wrong username and password combination. Try Again!","Login Failure",JOptionPane.ERROR_MESSAGE);

                    }

                }
            }

            else if(acess=="Beneficiary"){
                
                int cnt=0;
                String usr="select * from cash_useraccount where(username=? and password=?)";
                pst=con.prepareStatement(usr);
                pst.setString(1, txt_username.getText());
                pst.setString(2, txt_password.getText());
                res=pst.executeQuery();
                while(res.next()){
                    cnt++;
                    int id=res.getInt("user_id");
                    UserDetails.theid=id;

                    int benk=res.getInt("bank");
                    UserDetails.bank=benk;
                    String upwd=res.getString("password");
                    UserDetails.thepwd=upwd;
                    String unem=res.getString("username");
                    UserDetails.theunem=unem;

                    String det=res.getString("date_allocated");
                    UserDetails.date=det;
                    String tym=res.getString("time_allocated");
                    UserDetails.time=tym;
                    String amt=res.getString("amount");
                    UserDetails.amount=amt;

                    String sget="select * from cash_users where Id=?";
                    prep=con.prepareStatement(sget);
                    prep.setInt(1, id);
                    rset=prep.executeQuery();

                    while(rset.next()){
                        String fname=rset.getString("First_name");
                        String mname=rset.getString("Middle_name");
                        String lname=rset.getString("Last_name");
                        String full=""+fname+" "+mname+" "+lname+"";
                        String fl=fname+" "+lname;
                        this.ful=fl;
                        UserDetails.fullname=full;
                        byte[] image=rset.getBytes("Image");
                        UserDetails.imeg=image;
                    }

                }

                if(acess=="Beneficiary"){
                    if(cnt==1){
                        String inset="insert into cash_actionaudit(action,performed_by,user_id,affected_person,affected_id,date,time,role) values(?,?,?,?,?,?,?,?)";
                    pst=con.prepareStatement(inset);
                    pst.setString(1,"Logged in");
                    pst.setString(2,ful);
                    pst.setString(3,String.valueOf(UserDetails.theid).toString());
                    pst.setString(4,"N/A");
                    pst.setString(5,"N/A");
                    pst.setString(6,day+"/"+(month+1)+"/"+year);
                    pst.setString(7,hr+":"+(min)+":"+sec);
                    pst.setString(8,"User");
                    pst.execute();
                        UserView view=new UserView();
                        view.setVisible(true);
                        this.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Wrong username and password combination. Try Again!","Login Failure",JOptionPane.ERROR_MESSAGE);
                        
                    }
                }
            }
            else if(acess=="Audit"){
                int cnt=0;
                String aud="select * from cash_audit where username=? and password=?";
                pst=con.prepareStatement(aud);
                pst.setString(1,txt_username.getText());
                pst.setString(2,txt_password.getText());
                res=pst.executeQuery();
                while(res.next()){
                    cnt++;
                    String nem1=res.getString("first_name");
                    String nem2=res.getString("last_name");
                    String nem3=res.getString("password");
                    String nem=nem1+" "+nem2;
                    this.ful=nem;
                    UserDetails.fulaud=nem;
                   String unem=res.getString("username");
                   int id=res.getInt("user_id");
                  UserDetails.audit_name=unem;
                  UserDetails.audit_id=id;
                  UserDetails.audit_pwd=nem3;
                }
                if(acess=="Audit"){
                    if(cnt==1){
                        String inset="insert into cash_actionaudit(action,performed_by,user_id,affected_person,affected_id,date,time,role) values(?,?,?,?,?,?,?,?)";
                    pst=con.prepareStatement(inset);
                    pst.setString(1,"Logged in");
                    pst.setString(2,ful);
                    pst.setInt(3,UserDetails.audit_id);
                    pst.setString(4,"N/A");
                    pst.setString(5,"N/A");
                    pst.setString(6,day+"/"+(month+1)+"/"+year);
                    pst.setString(7,hr+":"+(min)+":"+sec);
                    pst.setString(8,"Audit");
                    pst.execute();
                        Audit adt=new Audit();
                        adt.setVisible(true);
                        this.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Wrong username and password combination. Try Again!","Login Failure",JOptionPane.ERROR_MESSAGE);
                        
                    }
                }
            }
            
            else if(acess=="Registrar"){
                int cnt=0;
                String aud="select * from cash_registrar where username=? and password=?";
                pst=con.prepareStatement(aud);
                pst.setString(1,txt_username.getText());
                pst.setString(2,txt_password.getText());
                res=pst.executeQuery();
                while(res.next()){
                    cnt++;
                   String unem=res.getString("username");
                   String fn=res.getString("first_name");
                   String sn=res.getString("last_name");
                   String nm=fn+" "+sn;
                   UserDetails.reg_ful=nm;
                   this.ful=nm;
                   int id=res.getInt("user_id");
                   String regpwd=res.getString("password");
                  UserDetails.reg_pwd=regpwd;
                  UserDetails.reg_name=unem;
                  UserDetails.reg_id=id;
                }
                if(acess=="Registrar"){
                    if(cnt==1){
                       String inset="insert into cash_actionaudit(action,performed_by,user_id,affected_person,affected_id,date,time,role) values(?,?,?,?,?,?,?,?)";
                    pst=con.prepareStatement(inset);
                    pst.setString(1,"Logged in");
                    pst.setString(2,ful);
                    pst.setInt(3,UserDetails.reg_id);
                    pst.setString(4,"N/A");
                    pst.setString(5,"N/A");
                    pst.setString(6,day+"/"+(month+1)+"/"+year);
                    pst.setString(7,hr+":"+(min)+":"+sec);
                    pst.setString(8,"Registrar");
                    pst.execute();
                       Registrar reg=new Registrar();
                        reg.setVisible(true);
                        this.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Wrong username and password combination. Try Again!","Login Failure",JOptionPane.ERROR_MESSAGE);
                        
                    }
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

        finally{
            try{
                rst.close();
                ps.close();
            }
            catch(Exception e)
            {

            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String val=JOptionPane.showInputDialog(null,"Enter your Role","Admin,Audit,User and Registrar roles",JOptionPane.INFORMATION_MESSAGE);
       
       if(val.equals("Audit")||val.equals("Admin")||val.equals("Registrar")){
           UserDetails.role=val;
       Signup sign=new Signup(); 
       sign.setVisible(true);
       this.dispose();
       }
       else if(val.equals("Beneficiary")){
       JOptionPane.showMessageDialog(null,"You cant create an account yourself, An Admin has to verify you!","Account", JOptionPane.INFORMATION_MESSAGE);
       }
       else{
          JOptionPane.showMessageDialog(null,"The Role does not exist","Role", JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Login mn=new Login();
       mn.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void combo_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_roleActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_role;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
