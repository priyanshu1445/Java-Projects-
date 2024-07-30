
package project;
import java.sql.*;
import javax.swing.JOptionPane;


public class Select {
    public static ResultSet getData(String query)
            
    {
        Connection Con = null;
         Statement st = null;
        ResultSet rs = null;
        
        try{
           Con = ConnectionProvider.getCon();
           st = Con.createStatement();
           rs = st.executeQuery(query);
           return  rs;
           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null , e);
            return null;
            
        }
       
        
    }
}
