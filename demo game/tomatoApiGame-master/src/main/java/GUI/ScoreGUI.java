/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import Quizgame.DbConnection;
import Quizgame.Player;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author Praba
 */
public class ScoreGUI extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form ScoreGUI
     */
    String email;
    int score1;
    Player player = Player.getInstance();

    public ScoreGUI() {

        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        con = DbConnection.connect();
        tableload();
       // getHigestScoreForlevel();
//        userLevel();
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
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistory = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblHistory = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        num = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));

        btnBack.setBackground(new java.awt.Color(81, 12, 12));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblHistory.setBackground(new java.awt.Color(204, 64, 97));
        tblHistory.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tblHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email", "Score"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHistory.setInheritsPopupMenu(true);
        tblHistory.setRowHeight(30);
        tblHistory.setRowMargin(2);
        tblHistory.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tblHistory.setShowGrid(true);
        jScrollPane1.setViewportView(tblHistory);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(btnBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 183, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,80));

        lblHistory.setBackground(new java.awt.Color(0, 0, 0));
        lblHistory.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblHistory.setForeground(new java.awt.Color(150, 11, 3));
        lblHistory.setText("Score Board");
        lblHistory.setOpaque(true);

        lblLevel.setBackground(new java.awt.Color(255, 255, 255));
        lblLevel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblLevel.setForeground(new java.awt.Color(255, 255, 255));

        num.setBackground(new java.awt.Color(0, 51, 51));
        num.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        num.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(lblLevel)
                        .addGap(71, 71, 71)
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(lblHistory)))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(num, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(lblLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 140));

        jLabel1.setBackground(new java.awt.Color(178, 7, 7));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/22.jpg"))); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 640));

        setBounds(0, 0, 644, 682);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new PlayGameGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    public void tableload() {
        String sql = "SELECT `email`, `score` FROM `scoretable`;";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            System.out.println(rs);
            while (rs.next()) {
//               
                String Email = rs.getString("email");
                String Score = String.valueOf(rs.getInt("score"));

                String tbData[] = {Email, Score};
                DefaultTableModel tbl = (DefaultTableModel) tblHistory.getModel();

                tbl.addRow(tbData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }

    }

    public void userLevel() {
        /*int sc = score1;
        System.out.println("hogest score " + sc);
        if (sc < 10) {
            num.setText("1");
        } else if (10 <= sc && sc < 20) {
            num.setText("2");
        } else if (20 <= sc && sc < 30) {
            num.setText("3");
        } else if (30 <= sc && sc < 40) {
            num.setText("4");
        } else if (40 <= sc && sc < 50) {
            num.setText("5");
        }*/
    }

    public void getHigestScoreForlevel() {

        
        String Query = "SELECT email,score FROM `scoretable` WHERE score = (SELECT MAX(score) FROM `scoretable` WHERE `email`='"+player.getEmail()+"');";
        try {
            pst = con.prepareStatement(Query);
            rs = pst.executeQuery();
            System.out.println(rs);
            while (rs.next()) {
//               
                email = rs.getString("email");
                int sc = rs.getInt("score");

                if (sc < 10) {
                    num.setText("1");
                } else if (10 <= sc && sc < 20) {
                    num.setText("2");
                } else if (20 <= sc && sc < 30) {
                    num.setText("3");
                } else if (30 <= sc && sc < 40) {
                    num.setText("4");
                } else if (40 <= sc && sc < 50) {
                    num.setText("5");
                }
                System.out.println(sc);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

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
            java.util.logging.Logger.getLogger(ScoreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScoreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScoreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScoreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScoreGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHistory;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel num;
    private javax.swing.JTable tblHistory;
    // End of variables declaration//GEN-END:variables
}
