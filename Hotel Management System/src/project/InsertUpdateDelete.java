
package project;

import java.sql.*;
import javax.swing.JOptionPane;
public class InsertUpdateDelete {
    public static void setData(String Query, String msg)
            
    {
        Connection Con = null;
        Statement st = null;
        try
        {
           Con = ConnectionProvider.getCon();
           st = Con.createStatement();
           st.executeUpdate(Query);
           if(!msg.equals(""))
               
           {
               JOptionPane.showMessageDialog(null, msg);
           }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
          try
        {
            
        }
        catch(Exception e)
        {
            
        }  
        }
    }
}
