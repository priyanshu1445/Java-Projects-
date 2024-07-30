import java.sql.*;
import javax.swing.JOptionPane;

package login_page;





public class login extends javax.swing.JFrame {

    // CONNECTION ESTABLISHED WITH DATABASE..
    
      private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "";
    
    
    
    public login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtuser = new javax.swing.JTextField();
        bexit = new javax.swing.JButton();
        blogin = new javax.swing.JButton();
        jpassword = new javax.swing.JPasswordField();
        jcshow_password = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("LOGIN APPLICATION");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("USERNAME");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("PASSWORD");

        bexit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bexit.setText("EXIT");
        bexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexitActionPerformed(evt);
            }
        });

        blogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        blogin.setText("LOGIN");
        blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloginActionPerformed(evt);
            }
        });

        jcshow_password.setText("Show Password");
        jcshow_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcshow_passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcshow_password)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bexit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(blogin, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtuser)
                            .addComponent(jpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcshow_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bexit)
                    .addComponent(blogin))
                .addGap(38, 38, 38))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloginActionPerformed
         try {
            String usernameInput = jtuser.getText();
            String passwordInput = jpassword.getText();

            if (usernameInput.isEmpty()) {
                showMessageDialog("Please fill out username");
            } else if (passwordInput.isEmpty()) {
                showMessageDialog("Please enter the Password");
            } else {
                // Establish database connection
                try (Connection connection = DriverManager.getConnection(url, username, password)) {
                    String query = "SELECT * FROM STUDENTS WHERE name=? AND password=?";
                    try (PreparedStatement statement = connection.prepareStatement(query)) {
                        statement.setString(1, usernameInput);
                        statement.setString(2, passwordInput);
                        ResultSet resultSet = statement.executeQuery();

                        if (resultSet.next()) {
                            // Login successful
                            showMessageDialog("Success");
                           
                        } else {
                            showMessageDialog("Invalid username or password");
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_bloginActionPerformed

    private void jcshow_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcshow_passwordActionPerformed
        if(jcshow_password.isSelected())
        {
            
            jpassword.setEchoChar((char)0);
        }
        else {
            jpassword.setEchoChar('*');
        }
        
    }//GEN-LAST:event_jcshow_passwordActionPerformed

    private void bexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bexitActionPerformed

    private static void showMessageDialog(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        // JDBC CONNECTION WITH LOGIN PAGE...
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
        
        java.awt.EventQueue.invokeLater(new Runnable() {    
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bexit;
    private javax.swing.JButton blogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JCheckBox jcshow_password;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField jtuser;
    // End of variables declaration//GEN-END:variables
}
