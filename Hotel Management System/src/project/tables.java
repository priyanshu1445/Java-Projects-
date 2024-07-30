
package project;

import java.sql.*;
import javax.swing.JOptionPane;

public class tables {
    public static void main(String args[])
    {
       Connection Con = null ;
     Statement  st = null;  
     
     try{
         Con = ConnectionProvider.getCon();
          st = Con.createStatement();
          st.executeUpdate("create table users(name varchar(200) , email varchar(200),password varchar(50), securityQuestion varchar(500),answer varchar(200),address varchar(200),status varchar(25))");
          st.executeUpdate("CREATE TABLE room (roomNo VARCHAR(10), roomType VARCHAR(200), bed VARCHAR(200), price INT, status VARCHAR(20))");
          st.executeUpdate("CREATE TABLE customer (id INT, name VARCHAR(200), mobileNumber VARCHAR(20), nationality VARCHAR(200), gender VARCHAR(20), email VARCHAR(200), idProof VARCHAR(200), address VARCHAR(200), checkIn VARCHAR(200), roomNo VARCHAR(10), bed VARCHAR(200), roomType VARCHAR(200), pricePerDay INT, numberOfDaysStay VARCHAR(255), totalAmount VARCHAR(200), checkout VARCHAR(50))");

         JOptionPane.showMessageDialog(null, "Table Created Successfully!!!");
     }
     catch(Exception e)
         
     {
         JOptionPane.showMessageDialog(null, e);
     }
     
     finally
     {
      try{
         Con.close();
         st.close();
     }
     catch(Exception e)
         
     {
         
     }   
     }
    }
}
