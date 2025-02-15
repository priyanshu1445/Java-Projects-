import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
import project.*;


public class CustomerCheckOut extends javax.swing.JFrame {

    /**
     * Creates new form CustomerCheckOut
     */
    public CustomerCheckOut() {
        initComponents();
        jTextField2 .setEditable(false);
        jTextField3 .setEditable(false);
        jTextField4 .setEditable(false);
        jTextField5 .setEditable(false);
        jTextField6 .setEditable(false);
        jTextField7 .setEditable(false);
        jTextField8 .setEditable(false);
        jTextField9 .setEditable(false);
    }
    
   int id =0;
   String Query;
   String roomType;
   String bed;
   String roomNo;
        

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(125, 160));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Customer Check Out.png"))); // NOI18N
        jLabel1.setText("Customer Check Out!!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 26, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1207, 26, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Room Number ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 102, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 99, 200, -1));

        jButton2.setBackground(new java.awt.Color(102, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 99, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile Number", "Nationality", "Gender", "Email", "ID Proof", "Address", "CheckIn Date", "Room Number", "Bed", "Room Type", "Price Per Day"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 357, 1204, 223));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Customer Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 250, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Check In Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 250, 30));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 250, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Check  Out Date (Today)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Customer Mobile Number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 160, -1, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 190, 250, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("PricePerDay");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 250, 30));

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 250, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Number of Days Stay");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 250, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Total Amount to Collect From Customer ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, -1, -1));

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 270, 250, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Email");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 240, -1, -1));

        jButton3.setBackground(new java.awt.Color(102, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Check Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jButton4.setBackground(new java.awt.Color(102, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 90, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all pages background.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // CLOSE BUTTON KA H 
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TABLE ME DATA SHOW KRAVANE KE KAAM AATA ...
        ResultSet rs = Select.getData("SELECT * FROM customer WHERE checkOut IS NULL");

        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        try 
        {
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)});
                
            }
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // SEARCH  BUTTON KA CODE H YEH..
        String roomNo = jTextField1.getText();
        try{
            ResultSet rs = Select.getData("SELECT * FROM customer WHERE roomNo = '" + roomNo + "' AND checkOut IS NULL");
            if(rs.next())
            {
                jTextField1.setEditable(false);
                id = rs.getInt(1);
                jTextField2.setText(rs.getString(2));
                jTextField3.setText(rs.getString(9));
                jTextField5.setText(rs.getString(3));
                jTextField6.setText(rs.getString(13));
                
                SimpleDateFormat myFormat =new SimpleDateFormat("yyyy/mm/dd");
                Calendar cal = Calendar.getInstance();
                jTextField4.setText(myFormat.format(cal.getTime()));
                String  dateBeforeString = rs.getString(9);
                java.util.Date dateBefore = myFormat.parse(dateBeforeString);
                String dateAfterString =myFormat.format(cal.getTime());
                java.util.Date dateAfter = myFormat.parse(dateAfterString); 
                long difference = dateAfter.getTime() - dateBefore.getTime();
                int noOfDayStay = (int) (difference /(1000*60*60*24));
                if(noOfDayStay == 0)
                {
                    noOfDayStay =1;
                    jTextField7.setText(String.valueOf(noOfDayStay));
                    float price = Float.parseFloat(jTextField6.getText());
                    
                    jTextField8.setText(String.valueOf(noOfDayStay * price));
                    jTextField9.setText(rs.getString(6));
                    roomType = rs.getString(12);
                    bed =rs.getString(11);
                }
                
                else{
                    JOptionPane.showMessageDialog(null, "Room Number is not Booked or RoomNumber Does Not Exist.!!");
                }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // YEH CLEAR BUTTON KA CODE H..
        setVisible(false);
        new CustomerCheckOut().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        // CHECK OUT BUTTON KA CODE H YEH...




        String name = jTextField2.getText();
        String mobileNumber = jTextField5.getText();
        String email = jTextField9.getText();
        String checkout =jTextField4.getText();
        String numberOfDaysStay = jTextField7.getText();
        String  totalAmount =jTextField8.getText();
        roomNo =jTextField1.getText();
        Query = "UPDATE customer SET numberOfDaysStay = '" + numberOfDaysStay + "', totalAmount = '" + totalAmount + "', checkOut = '" + checkout + "' WHERE id = '" + id + "'";
        InsertUpdateDelete.setData(Query, "");
        Query  = "update room Set status ='Not Booked' where roomNo ='"+ roomNo+"' ";
        InsertUpdateDelete.setData(Query, "");
        String path = "D:\\";
        com.itextpdf.text.Document doc  = new com.itextpdf.text.Document();
        try
        {
            PdfWriter.getInstance(doc, new FileOutputStream(path+""+id+".pdf"));
            doc.open();
            Paragraph paragraph1 = new Paragraph("                                      HOTEL MANAGEMENT SYSTEM\n");
            doc.add(paragraph1);
            
            Paragraph paragraph2 = new Paragraph("****************************************************************************************************************");
            doc.add(paragraph2);
            
            Paragraph paragraph3 = new Paragraph("\tBill ID: " + id + "\nCustomer Details:\nName: " + name + "\nMobile Number: " + mobileNumber + "\nEmail: " + email +"\n");
            doc.add(paragraph3);
            doc.add(paragraph2);
            
             Paragraph paragraph4 = new Paragraph("\tRoom Details:\nNumber: " + jTextField1.getText() + "\nRoom Type: " + roomType + "\nBed: " + bed +"\nPrice Per Day: "+ jTextField6.getText()+"");
            doc.add(paragraph4);
            doc.add(paragraph2);
            PdfPTable tb1 = new PdfPTable(4);
            tb1.addCell("Check IN Date: " +jTextField3.getText());
            tb1.addCell("Check Out Date: " +checkout);
            tb1.addCell("No Of Days Stay : " +numberOfDaysStay);
            tb1.addCell("Total Amount Paid: " +totalAmount);
            doc.add(tb1);
            doc.add(paragraph2);
            
            Paragraph paragraph5 = new Paragraph("Thank You! Please Visit Again.!!");
            doc.add(paragraph5);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        doc.close();
        int a = JOptionPane.showConfirmDialog(null, "Do You Want to Print Bill!!","Select",JOptionPane.YES_NO_OPTION);
        if(a ==0)
        {
            try{
                if((new File("D:\\"+ id +".pdf")).exists())
                {
                    Process p = Runtime
                            .getRuntime()
                            .exec("rundll32 url.dll, FileProtocolHandler D:\\"+ id+".pdf");
                }
                else{
                    System.out.println("File is not Exists!!");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        setVisible(false);
        new CustomerCheckOut().setVisible(true);
        


//    String name = jTextField2.getText();
//    String mobileNumber = jTextField5.getText();
//    String email = jTextField9.getText();
//    String checkOut = jTextField4.getText();
//    String numberOfDaysStay = jTextField7.getText();
//    String totalAmount = jTextField8.getText();
//    roomNo = jTextField1.getText();
//
//    // Update customer table
//     Query = "UPDATE customer SET numberOfDaysStay = '" + numberOfDaysStay + "', totalAmount = '" + totalAmount + "', checkOut = '" + checkOut + "' WHERE id = '" + id + "'";
//    InsertUpdateDelete.setData(Query, "");
//
//
//    // Update room status
//     Query = "UPDATE room SET status = 'Not Booked' WHERE roomNo = '" + roomNo + "'";
//    InsertUpdateDelete.setData(Query, "");  
//
//    // Generate PDF
//    String path = "D:\\" + id + ".pdf";
//    com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
//    try{
//        PdfWriter.getInstance(doc, new FileOutputStream(path+""+id+".pdf"));
//        doc.open();
//        
//          Paragraph paragraph1 = new Paragraph("                                      HOTEL MANAGEMENT SYSTEM\n");
//            doc.add(paragraph1);
//            
//            Paragraph paragraph2 = new Paragraph("****************************************************************************************************************");
//            doc.add(paragraph2);
//            
//            Paragraph paragraph3 = new Paragraph("\tBill ID: " + id + "\nCustomer Details:\nName: " + name + "\nMobile Number: " + mobileNumber + "\nEmail: " + email +"\n");
//            doc.add(paragraph3);
//            doc.add(paragraph2);
//            
//             Paragraph paragraph4 = new Paragraph("\tRoom Details:\nNumber: " + jTextField1.getText() + "\nRoom Type: " + roomType + "\nBed: " + bed +"\nPrice Per Day: "+ jTextField6.getText()+"");
//            doc.add(paragraph4);
//            doc.add(paragraph2);
//            PdfPTable tb1 = new PdfPTable(4);
//            tb1.addCell("Check IN Date: " +jTextField3.getText());
//            tb1.addCell("Check Out Date: " +checkOut);
//            tb1.addCell("No Of Days Stay : " +numberOfDaysStay);
//            tb1.addCell("Total Amount Paid: " +totalAmount);
//            doc.add(tb1);
//            doc.add(paragraph2);
//            
//            Paragraph paragraph5 = new Paragraph("Thank You! Please Visit Again.!!");
//            doc.add(paragraph5);
//    }
//    catch (Exception e) {
//    JOptionPane.showMessageDialog(null, e.getMessage());
//    }
//    
//       doc.close();
//        int a = JOptionPane.showConfirmDialog(null, "Do You Want to Print Bill!!","Select",JOptionPane.YES_NO_OPTION);
//        if(a ==0)
//        {
//            try{
//                if((new File("E:\\"+ id +".pdf")).exists())
//                {
//                    Process p = Runtime
//                            .getRuntime()
//                            .exec("rundll32 url.dll, FileProtocol Handler D:\\"+ id+".pdf");
//                }
//                else{
//                    System.out.println("File is not Exists!!");
//                }
//            }
//            catch(Exception e)
//            {
//                JOptionPane.showMessageDialog(null, e);
//            }
//        }
//        setVisible(false);
//        new CustomerCheckOut().setVisible(true);
//        
//
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerCheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
