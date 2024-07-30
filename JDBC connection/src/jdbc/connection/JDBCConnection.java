import java.sql.*; // isse hum sb import krdete h..
import java.util.Scanner;

package jdbc.connection;


public class JDBCConnection {
    // boiler plate code of JDBC CONNECTION..
    private static final String url = "jdbc:mysql://localhost:3306/lenden";
    private static final String username = "root";
    private static final String password = "";
    

                    
                    
   
    public static void main(String[] args) {
        // try and catch method error or exception ko control krne ke kaam aata h...
        // isme hum drivers load kr rhe h sare..
        try{
       Class .forName("com.mysql.cj.jdbc.Driver");  
        }
        catch(Exception e)
        {
            //  isse pata chlta h ki code me error kahase aarhi h or kaha tk jaari h ..
            e.printStackTrace();
         // APN ISKI JAGH YE BHI USE KR SKTE H USE BHI SAME HI KAAM HOTA H
//         System.out.println(e.getMessage());
                
        }
        
        // TRANSACTION HANDLING IN JAVA 
                try{
                    Connection connection = DriverManager.getConnection(url,username, password);
                    connection.setAutoCommit(false);
                    String debit_query =  "UPDATE accounts SET balance = balance-?  WHERE account_number = ?";
                    String credit_query =  "UPDATE accounts SET balance = balance+?  WHERE account_number = ?";
                    PreparedStatement debitprPreparedStatement = connection.prepareStatement(debit_query);
                    PreparedStatement creditPreparedStatement = connection.prepareStatement(credit_query);
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the amount number: ");
                    int account_number = sc.nextInt();
                    System.out.println("Enter the amount: ");
                    double amount  = sc.nextDouble();
                    debitprPreparedStatement.setDouble(1, amount);
                    debitprPreparedStatement.setInt(2, account_number);
                    creditPreparedStatement.setDouble(1, amount);
                    creditPreparedStatement.setInt(2,101 );
                    
                    debitprPreparedStatement.executeUpdate();
                    creditPreparedStatement.executeUpdate();
                    if(isSufficient(connection , account_number ,amount)){
                    connection.commit();
                    System.out.println("Transaction Successfull..!!");
                }else{
                        connection.rollback();
                        System.out.println("Insufficent Balance...!");
                    }   
                            
                }
                catch(SQLException e)
                {
                
                    System.out.println(e.getMessage());
                }
        
        
        
//        try {
//            // yeh connection banane me help krta h ...
//            Connection connection = DriverManager.getConnection(url,username,password);
//               // this is prepared statment
//                String query = "INSERT INTO students(name,age,marks) VALUES(?,?,?)";
//                PreparedStatement preparedStatement = connection.prepareStatement(query);
//            Scanner sc = new Scanner(System.in);
//            while(true)
//            {
//                System.out.print("Enter Name: ");
//                String name = sc.next();
//                System.out.append("Enter Age: ");
//                int age = sc.nextInt();
//                System.out.println("Enter marks: ");
//                double marks = sc.nextDouble();
//                System.out.print("Enter more data(Y/N): ");
//                String choice = sc.next();
//                preparedStatement.setString(1, name);
//                preparedStatement.setInt(2, 52);
//                preparedStatement.setDouble(3, 85);
//                
//                preparedStatement.addBatch();
//                if(choice.toUpperCase().equals("N"))
//                    
//                {
//                    break;
//                }
//                
//            }
//            
//            int [] arr = preparedStatement.executeBatch();
////            if(rowsAffected>0)
////            {
////             
////                System.out.println("Data INSERTED SUCCESSFULLY...!!!");
////            }
////            else
////            {
////                
////                System.out.println("DATA NOT INSERTED..!!!");   
////                
////            }
//
//for(int i =0; i<arr.length;i++)
//    
//{
//    if(arr[i]==0)
//        
//    {
//        System.out.print("Query" + i + "  not executed successfully ....!");
//    }
//}
//
//        
//         }
//        catch(SQLException e)
//        {
//            System.out.println(e.getMessage());
//        }
//
//
//
//
//
//// SQL QUERY EXECUTE KRNE KE LIYE HAME USE KRNA HOTA H STATEMENT KA...
////            Statement statement = connection.createStatement();
//
////              AB HUM PREPARED STATEMENTS KA USE KRNE WALE H JISME BAAR BAAR COMPILATION NHI HOTI 
////              OR HUM ISME SRF PARAMETER PASSS KRTE H ....
////            String query = "INSERT INTO students(name,age,marks) VALUES (?,?,?)";
//
////            String query = "UPDATE students SET marks = ? where id = ?";
////            PreparedStatement preparedStatement = connection.prepareStatement(query);
////            
////            preparedStatement.setDouble(1, 00);
////            preparedStatement.setInt(2, 5);
////          set help krta h database me valueadd krvane ke ...
////            preparedStatement.setString(1, "Sumit");
////            preparedStatement.setInt(2, 21);
////            preparedStatement.setDouble(3, 85.2);
//            
//            
//            // yeh database ki vlaue show krne kee kaam ata h.
////            String query = "SELECT * FROM STUDENTS";
//
////           // YEH HAMRI UPDATE QUERY H JO DATABSE ME UPDATAIN KRNE KE KAAM AATI H ...
////              String query  = String.format("UPDATE students Set marks = %f WHERE id = %d", 89.3,2);
//              
//
////            IISEE HUM DATBASE ME DELTE KR SKTE H...   
////              String query  ="Delete from students where id = 3";
//              
//              //  ISSE HM DATAABASE ME VALUE INSERT KRAVATE H...
////            String query = String.format("INSERT INTO STUDENTS(name,age,marks) VALUES('%s',%o,%f)", "Rahul", 34,87.5);
//            
//            // yeh data ko retrive krne ke kaaam aati h database se..
//            // resultset operation help krta h database ke table pr operation perform karane me..
//            
////             ResultSet resultSet = preparedStatement.executeQuery();
//              
////               AB ISME HUM PREPARED STATMENTS KA OBJECT PASS KRENEGE...
////                int rowsaffected = statement.executeUpdate();
//             
//             
//                
////             yeh method pointer set krta h databsase ki table pr jo ki data retrive krne ke kaam ata h
////             yeh value return krwane ke kaam me aata h boolean data type..
//
//
////             while(resultSet.next())
////             {
////                 // iski help se hm database ki table ko java ki field me show krvate h ..
////                 int id = resultSet.getInt("id");
////                String name = resultSet.getString("name");
////                int age = resultSet.getInt("age");
////                 Double marks  = resultSet.getDouble("marks");
////                 System.out.println("ID:" + id);
////                 System.out.println("NAME:" + name);
////                 System.out.println("AGE:" + age);
////                 System.out.println("MARKS" + marks);
////             }
//
//
////            if(rowsaffected>0)
////            {
////                System.out.println("DATA Updated SUCCESSFULLY");
////            }else{
////                System.out.println("DATA NOT Updated.!!!");
////            }   
//
//
//
////                if(resultSet.next())
////                {       
////                    // YEH VARIABLE HUMNE DATABASE SE VALUE LENE KE LIYE BANYAA H..
////                    double marks = resultSet.getDouble("marks");
////                    System.out.println("Marks:" + marks);
//////                  YEH THODA SA HARD H METHOD H PRINT KRVANE KE..
//////                    System.out.println("MArks:"+resultSet.getDouble("marks"));
////                }
////                else
////                {
////                    System.out.println("Marks not found...");
////                }
//                
             
       
        
        
    }
 
    
          static boolean isSufficient(Connection connection , int account_number,double amount){
                    try{
                       String query  = "SELECT balance FROM  accounts WHERE account_number = ?";
                       PreparedStatement preparedStatement  = connection.prepareStatement(query);
                        ResultSet resultSet = preparedStatement.executeQuery();
                        if(resultSet.next())
                            
                        {
                         double current_balance = resultSet.getDouble("balance");    
                         if(amount>current_balance)
                         {
                          return false;   
                         }
                         else 
                         {
                          return true;   
                         }
                        }
                        
                    }
                    catch(SQLException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    
}
}


 
