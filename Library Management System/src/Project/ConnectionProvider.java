
package Project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author PRIYANSHU
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","");
            return con;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
            
        }
    }
    
}
