/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.sql.*;
package login_page;

/**
 *
 * @author PRIYANSHU
 */
public class Login_Page {
  private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          try{
       Class.forName("com.mysql.cj.jdbc.Driver");  
        }
        catch(Exception e)
        {
            //  isse pata chlta h ki code me error kahase aarhi h or kaha tk jaari h ..
            e.printStackTrace();
         // APN ISKI JAGH YE BHI USE KR SKTE H USE BHI SAME HI KAAM HOTA H
//         System.out.println(e.getMessage());
                
        }
          
          try {
            // yeh connection banane me help krta h ...
            Connection connection = DriverManager.getConnection(url,username,password);
            // SQL QUERY EXECUTE KRNE KE LIYE HAME USE KRNA HOTA H STATEMENT KA...
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM STUDENTS";


//            String query = String.format("INSERT INTO STUDENTS(name,age,marks) VALUES('%s',%o,%f)", "Rahul", 34,87.5);
            
            // yeh data ko retrive krne ke kaaam aati h database se..
            // resultset operation help krta h database ke table pr operation perform karane me..
            
             ResultSet resultSet = statement.executeQuery(query);
             
              while(resultSet.next())
             {
                 // iski help se hm database ki table ko java ki field me show krvate h ..
                 int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                 Double marks  = resultSet.getDouble("marks");
                 System.out.println("ID:" + id);
                 System.out.println("NAME:" + name);
                 System.out.println("AGE:" + age);
                 System.out.println("MARKS" + marks);
             }
              }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
