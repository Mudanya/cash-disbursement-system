
package cashdisburser;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class dbConnect {
    Connection con=null;
    public static Connection db_Con(){
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cash_db","root","");
        return con;
    }
    catch(Exception e)
    {
     JOptionPane.showMessageDialog(null,e); 
     return null;
    }
    }
}
