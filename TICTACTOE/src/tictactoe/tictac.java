/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tictactoe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author PRIYANSHU
 */
public class tictac extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    
    
    
    
    public tictac() {
        initComponents();
    }
    
    
    private void gameScore()
    {
        jlblPlayerX.setText(String.valueOf(xCount));
        jlblPlayerO.setText(String.valueOf(oCount));
    }

    
     private void choose_a_Player()
    {
       if(startGame.equalsIgnoreCase("X"))
       {
        
           startGame = "O";
       } 
       
       else
           
       {
           startGame = "X";
       }
    }
     
     private void winningGame()
     {
         
         String b1 = jbtnTic1.getText();
         String b2 = jbtnTic2.getText();
         String b3 = jbtnTic3.getText();
         String b4 = jbtnTic4.getText();
         String b5 = jbtnTic5.getText();
         String b6 = jbtnTic6.getText();
         String b7 = jbtnTic7.getText();
         String b8 = jbtnTic8.getText();
         String b9 = jbtnTic9.getText();
         
         if(b1 == ("X") && b2 == ("X") && b3 == ("X"))
         {
             JOptionPane.showMessageDialog(this,"Player X wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jbtnTic1.setBackground(Color.ORANGE);
        jbtnTic2.setBackground(Color.ORANGE);
        jbtnTic3.setBackground(Color.ORANGE);
        xCount++;
        gameScore();
         }
         
          if(b4 == ("X") && b5 == ("X") && b6 == ("X"))
         {
             JOptionPane.showMessageDialog(this,"Player X wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jbtnTic4.setBackground(Color.CYAN);
        jbtnTic5.setBackground(Color.CYAN);
        jbtnTic6.setBackground(Color.CYAN);
        xCount++;
        gameScore();
         }
          
           if(b7 == ("X") && b8 == ("X") && b9 == ("X"))
         {
             JOptionPane.showMessageDialog(this,"Player X wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jbtnTic7.setBackground(Color.GREEN);
        jbtnTic8.setBackground(Color.GREEN);
        jbtnTic9.setBackground(Color.GREEN);
        xCount++;
        gameScore();
         }
           
             if(b1 == ("X") && b4 == ("X") && b7 == ("X"))
         {
             JOptionPane.showMessageDialog(this,"Player X wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jbtnTic1.setBackground(Color.PINK);
        jbtnTic4.setBackground(Color.PINK);
        jbtnTic7.setBackground(Color.PINK);
        xCount++;
        gameScore();
         }
             
               if(b2 == ("X") && b5 == ("X") && b8 == ("X"))
         {
             JOptionPane.showMessageDialog(this,"Player X wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jbtnTic2.setBackground(Color.BLUE);
        jbtnTic5.setBackground(Color.BLUE);
        jbtnTic8.setBackground(Color.BLUE);
        xCount++;
        gameScore();
         }
               
                 if(b3 == ("X") && b6 == ("X") && b9 == ("X"))
         {
             JOptionPane.showMessageDialog(this,"Player X wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jbtnTic3.setBackground(Color.RED);
        jbtnTic6.setBackground(Color.RED);
        jbtnTic9.setBackground(Color.RED);
        xCount++;
        gameScore();
         }
                 
                   if(b1 == ("X") && b5 == ("X") && b9 == ("X"))
         {
             JOptionPane.showMessageDialog(this,"Player X wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jbtnTic1.setBackground(Color.YELLOW);
        jbtnTic5.setBackground(Color.YELLOW);
        jbtnTic9.setBackground(Color.YELLOW);
        xCount++;
        gameScore();
         }
                   
                     if(b3 == ("X") && b5 == ("X") && b7 == ("X"))
         {
             JOptionPane.showMessageDialog(this,"Player X wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jbtnTic3.setBackground(Color.MAGENTA);
        jbtnTic5.setBackground(Color.MAGENTA);
        jbtnTic7.setBackground(Color.MAGENTA);
        xCount++;
        gameScore();
         }
         
                     
         // O PART....
         
         if(b1 == ("O") && b2 == ("O") && b3 == ("O"))
         {
             JOptionPane.showMessageDialog(this,"Player X wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jbtnTic1.setBackground(Color.ORANGE);
        jbtnTic2.setBackground(Color.ORANGE);
        jbtnTic3.setBackground(Color.ORANGE);
        oCount++;
        gameScore();
         }
         
          if(b4 == ("O") && b5 == ("O") && b6 == ("O"))
         {
             JOptionPane.showMessageDialog(this,"Player O wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jbtnTic4.setBackground(Color.CYAN);
        jbtnTic5.setBackground(Color.CYAN);
        jbtnTic6.setBackground(Color.CYAN);
        oCount++;
        gameScore();
         }
          
           if(b7 == ("O") && b8 == ("O") && b9 == ("O"))
         {
             JOptionPane.showMessageDialog(this,"Player O wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jbtnTic7.setBackground(Color.GREEN);
        jbtnTic8.setBackground(Color.GREEN);
        jbtnTic9.setBackground(Color.GREEN);
        oCount++;
        gameScore();
         }
           
             if(b1 == ("O") && b4 == ("O") && b7 == ("O"))
         {
             JOptionPane.showMessageDialog(this,"Player O wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jbtnTic1.setBackground(Color.PINK);
        jbtnTic4.setBackground(Color.PINK);
        jbtnTic7.setBackground(Color.PINK);
        oCount++;
        gameScore();
         }
             
               if(b2 == ("O") && b5 == ("O") && b8 == ("O"))
         {
             JOptionPane.showMessageDialog(this,"Player O wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jbtnTic2.setBackground(Color.BLUE);
        jbtnTic5.setBackground(Color.BLUE);
        jbtnTic8.setBackground(Color.BLUE);
        oCount++;
        gameScore();
         }
               
                 if(b3 == ("O") && b6 == ("O") && b9 == ("O"))
         {
             JOptionPane.showMessageDialog(this,"Player O wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jbtnTic3.setBackground(Color.RED);
        jbtnTic6.setBackground(Color.RED);
        jbtnTic9.setBackground(Color.RED);
        oCount++;
        gameScore();
         }
                 
                   if(b1 == ("O") && b5 == ("O") && b9 == ("O"))
         {
             JOptionPane.showMessageDialog(this,"Player O wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jbtnTic1.setBackground(Color.YELLOW);
        jbtnTic5.setBackground(Color.YELLOW);
        jbtnTic9.setBackground(Color.YELLOW);
        oCount++;
        gameScore();
         }
                   
                     if(b3 == ("O") && b5 == ("O") && b7 == ("O"))
         {
             JOptionPane.showMessageDialog(this,"Player O wins ","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             jbtnTic3.setBackground(Color.MAGENTA);
        jbtnTic5.setBackground(Color.MAGENTA);
        jbtnTic7.setBackground(Color.MAGENTA);
        oCount++;
        gameScore();
         }
                     
                   
     }
     
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jbtnTic1 = new javax.swing.JButton();
        jbtnTic2 = new javax.swing.JButton();
        jbtnTic3 = new javax.swing.JButton();
        jbtnTic4 = new javax.swing.JButton();
        jbtnTic5 = new javax.swing.JButton();
        jbtnTic6 = new javax.swing.JButton();
        jbtnTic7 = new javax.swing.JButton();
        jbtnTic8 = new javax.swing.JButton();
        jbtnTic9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlblPlayerX = new javax.swing.JLabel();
        jlblPlayerO = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(95, 158, 168));
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 800));

        jPanel2.setBackground(new java.awt.Color(95, 158, 168));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setPreferredSize(new java.awt.Dimension(615, 653));

        jbtnTic1.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnTic1.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic1.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic1.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic1ActionPerformed(evt);
            }
        });

        jbtnTic2.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnTic2.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic2.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic2.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic2ActionPerformed(evt);
            }
        });

        jbtnTic3.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnTic3.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic3.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic3.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic3ActionPerformed(evt);
            }
        });

        jbtnTic4.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnTic4.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic4.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic4.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic4ActionPerformed(evt);
            }
        });

        jbtnTic5.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnTic5.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic5.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic5.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic5ActionPerformed(evt);
            }
        });

        jbtnTic6.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnTic6.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic6.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic6.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic6ActionPerformed(evt);
            }
        });

        jbtnTic7.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnTic7.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic7.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic7.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic7ActionPerformed(evt);
            }
        });

        jbtnTic8.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnTic8.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic8.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic8.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic8ActionPerformed(evt);
            }
        });

        jbtnTic9.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jbtnTic9.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic9.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic9.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnTic4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnTic1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnTic7, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jbtnTic8, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(jbtnTic9, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jbtnTic5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnTic6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jbtnTic2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnTic3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnTic3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnTic6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnTic8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic7, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic9, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(95, 158, 168));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel4.setBackground(new java.awt.Color(95, 158, 168));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jLabel1.setText("Player O:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jLabel2.setText("Player X:");

        jlblPlayerX.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");
        jlblPlayerX.setOpaque(true);

        jlblPlayerO.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("0");
        jlblPlayerO.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblPlayerO, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jlblPlayerX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlblPlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jlblPlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jPanel5.setBackground(new java.awt.Color(98, 158, 168));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setPreferredSize(new java.awt.Dimension(581, 271));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton10.setText("Reset");
        jButton10.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton10.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton10.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton11.setText("EXIT");
        jButton11.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton11.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton11.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton12.setText("New Game");
        jButton12.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton12.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton12.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(98, 158, 168));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Java Advanced Tic Tac Toe Game");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private JFrame frame;
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        frame = new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to Exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jbtnTic1.setEnabled(true);
        jbtnTic2.setEnabled(true);
        jbtnTic3.setEnabled(true);
        jbtnTic4.setEnabled(true);
        jbtnTic5.setEnabled(true);
        jbtnTic6.setEnabled(true);
        jbtnTic7.setEnabled(true);
        jbtnTic8.setEnabled(true);
        jbtnTic9.setEnabled(true);
        
        
        jbtnTic1.setText("");
        jbtnTic2.setText("");
        jbtnTic3.setText("");
        jbtnTic4.setText("");
        jbtnTic5.setText("");
        jbtnTic6.setText("");
        jbtnTic7.setText("");
        jbtnTic8.setText("");
        jbtnTic9.setText("");
        
        jbtnTic1.setBackground(Color.LIGHT_GRAY);
        jbtnTic2.setBackground(Color.LIGHT_GRAY);
        jbtnTic3.setBackground(Color.LIGHT_GRAY);
        jbtnTic4.setBackground(Color.LIGHT_GRAY);
        jbtnTic5.setBackground(Color.LIGHT_GRAY);
        jbtnTic6.setBackground(Color.LIGHT_GRAY);
        jbtnTic7.setBackground(Color.LIGHT_GRAY);
        jbtnTic8.setBackground(Color.LIGHT_GRAY);
        jbtnTic9.setBackground(Color.LIGHT_GRAY);
        
        
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jbtnTic1.setEnabled(true);
        jbtnTic2.setEnabled(true);
        jbtnTic3.setEnabled(true);
        jbtnTic4.setEnabled(true);
        jbtnTic5.setEnabled(true);
        jbtnTic6.setEnabled(true);
        jbtnTic7.setEnabled(true);
        jbtnTic8.setEnabled(true);
        jbtnTic9.setEnabled(true);
        
        jlblPlayerX.setText("0");
        jlblPlayerO.setText("0");
        
        
        jbtnTic1.setText("");
        jbtnTic2.setText("");
        jbtnTic3.setText("");
        jbtnTic4.setText("");
        jbtnTic5.setText("");
        jbtnTic6.setText("");
        jbtnTic7.setText("");
        jbtnTic8.setText("");
        jbtnTic9.setText("");
        
        jbtnTic1.setBackground(Color.LIGHT_GRAY);
        jbtnTic2.setBackground(Color.LIGHT_GRAY);
        jbtnTic3.setBackground(Color.LIGHT_GRAY);
        jbtnTic4.setBackground(Color.LIGHT_GRAY);
        jbtnTic5.setBackground(Color.LIGHT_GRAY);
        jbtnTic6.setBackground(Color.LIGHT_GRAY);
        jbtnTic7.setBackground(Color.LIGHT_GRAY);
        jbtnTic8.setBackground(Color.LIGHT_GRAY);
        jbtnTic9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jbtnTic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic1ActionPerformed
       jbtnTic1.setText(startGame);
       
       if(startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       
       else
       {
           checker = true;
       }
       
       choose_a_Player();
       winningGame();
    }//GEN-LAST:event_jbtnTic1ActionPerformed

    private void jbtnTic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic2ActionPerformed
         jbtnTic2.setText(startGame);
       
       if(startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       
       else
       {
           checker = true;
       }
       
       choose_a_Player();
       winningGame();
    }//GEN-LAST:event_jbtnTic2ActionPerformed

    private void jbtnTic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic3ActionPerformed
         jbtnTic3.setText(startGame);
       
       if(startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       
       else
       {
           checker = true;
       }
       
       choose_a_Player();
       winningGame();
    }//GEN-LAST:event_jbtnTic3ActionPerformed

    private void jbtnTic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic4ActionPerformed
         jbtnTic4.setText(startGame);
       
       if(startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       
       else
       {
           checker = true;
       }
       
       choose_a_Player();
       winningGame();
    }//GEN-LAST:event_jbtnTic4ActionPerformed

    private void jbtnTic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic5ActionPerformed
         jbtnTic5.setText(startGame);
       
       if(startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       
       else
       {
           checker = true;
       }
       
       choose_a_Player();
       winningGame();
    }//GEN-LAST:event_jbtnTic5ActionPerformed

    private void jbtnTic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic6ActionPerformed
        jbtnTic6.setText(startGame);
       
       if(startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       
       else
       {
           checker = true;
       }
       
       choose_a_Player();
       winningGame();
    }//GEN-LAST:event_jbtnTic6ActionPerformed

    private void jbtnTic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic7ActionPerformed
        jbtnTic7.setText(startGame);
       
       if(startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       
       else
       {
           checker = true;
       }
       
       choose_a_Player();
       winningGame();
    }//GEN-LAST:event_jbtnTic7ActionPerformed

    private void jbtnTic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic8ActionPerformed
        jbtnTic8.setText(startGame);
       
       if(startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       
       else
       {
           checker = true;
       }
       
       choose_a_Player();
       winningGame();
    }//GEN-LAST:event_jbtnTic8ActionPerformed

    private void jbtnTic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic9ActionPerformed
        jbtnTic9.setText(startGame);
       
       if(startGame.equalsIgnoreCase("X"))
       {
           checker = false;
       }
       
       else
       {
           checker = true;
       }
       
       choose_a_Player();
       winningGame();
    }//GEN-LAST:event_jbtnTic9ActionPerformed

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
            java.util.logging.Logger.getLogger(tictac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jbtnTic1;
    private javax.swing.JButton jbtnTic2;
    private javax.swing.JButton jbtnTic3;
    private javax.swing.JButton jbtnTic4;
    private javax.swing.JButton jbtnTic5;
    private javax.swing.JButton jbtnTic6;
    private javax.swing.JButton jbtnTic7;
    private javax.swing.JButton jbtnTic8;
    private javax.swing.JButton jbtnTic9;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    // End of variables declaration//GEN-END:variables
}
