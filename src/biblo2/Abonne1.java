
package biblo2;
import java.sql.*; 
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Mahfo
 */
public class Abonne1 extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs ;
    public Abonne1() {
        initComponents();
        setupTableLivres ();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Titre = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        ID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jButton6.setBackground(new java.awt.Color(83, 135, 213));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Emprunt");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(83, 135, 213));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Actualiser");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Identifiant ");

        Titre.setBackground(new java.awt.Color(204, 204, 255));

        jButton8.setBackground(new java.awt.Color(83, 135, 213));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Livre");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(83, 135, 213));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Inserstion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nom et Prenom");

        jButton3.setBackground(new java.awt.Color(83, 135, 213));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Supprimer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(83, 135, 213));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Recherche");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(83, 135, 213));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Modification");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        ID.setBackground(new java.awt.Color(204, 204, 255));
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Enregistrement des abonnés ");

        jButton5.setBackground(new java.awt.Color(83, 135, 213));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Requetes");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Identifiant ", "Nom et Prénom"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(Titre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Titre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Emprunts ou = new Emprunts();
         this.setVisible(false);
        ou.setVisible(true) ;

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try  {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/bib","root","");
            String sql= "select * from abonne" ;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel table1 = (DefaultTableModel) jTable1.getModel();
            table1.setRowCount(0);
            while (rs.next()){
                String id = String.valueOf(rs.getInt("idab"));
                String Titre = String.valueOf(rs.getString("nomab"));
                String tbData [] = {id,Titre} ;
                table1.addRow(tbData);
            }
            con.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Abonne ou = new Abonne();
         this.setVisible(false);
        ou.setVisible(true) ;
    }//GEN-LAST:event_jButton8ActionPerformed
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    try  {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/bib","root","");
        String id = ID.getText();
        String titre = Titre.getText();
        String sqlSelect = "SELECT * FROM abonne WHERE idab = ?";
        pst = con.prepareStatement(sqlSelect);
        pst.setString(1, id);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            JOptionPane.showMessageDialog(null, "L'ID de abonné " + id + " existe déjà dans la base de données.");
        } else {
            String sqlInsert = "INSERT INTO abonne (idab, nomab) values (?, ?)";
            pst = con.prepareStatement(sqlInsert);
            pst.setString(1, id);
            pst.setString(2, titre);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Abonné ajouté avec succès !");
        }
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    
    /*
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try  {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/bib","root","");
            String sql = "INSERT INTO livre (idlivre, titre) values (?, ?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, ID.getText());
            pst.setString(2, Titre.getText());
            pst.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "done");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed
/*
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try  {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/bib","root","");
            String sql = "DELETE FROM livre WHERE idlivre = ? and  titre = ? ";
            pst = con.prepareStatement(sql);
            pst.setString(1, ID.getText());
            pst.setString(2, Titre.getText());
            pst.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "done");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed
*/
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    try  {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/bib","root","");
        String id = ID.getText();
        String titre = Titre.getText();
        String sql = "DELETE FROM abonne WHERE idab = ? AND nomab = ?";
        pst = con.prepareStatement(sql);
        pst.setString(1, id);
        pst.setString(2, titre);
        int rowsAffected = pst.executeUpdate();
        if (rowsAffected == 0) {
            JOptionPane.showMessageDialog(null, "L'abonné avec l'ID " + id + " et le nom " + titre + " n'existe pas dans la base de données.");
        } else {
            JOptionPane.showMessageDialog(null, "Abonné supprimé avec succès !");
        }
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try  {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/bib","root","");
            String sql= "select * from abonne where idab= ?" ;
            pst = con.prepareStatement(sql);
            pst.setString(1, ID.getText());
            rs = pst.executeQuery();
            DefaultTableModel table1 = (DefaultTableModel) jTable1.getModel();
            table1.setRowCount(0);
            while (rs.next()){
                String id = String.valueOf(rs.getInt("idab"));
                String Titre = String.valueOf(rs.getString("nomab"));
                String tbData [] = {id,Titre} ;
                table1.addRow(tbData);
            }
            con.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try  {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/bib","root","");
            String sql = "update abonne set nomab = ? where idab=? ";
            pst = con.prepareStatement(sql);
            pst.setString(2, ID.getText());
            pst.setString(1, Titre.getText());
            pst.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "done");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        request ou = new request();
         this.setVisible(false);
        ou.setVisible(true) ;

    }//GEN-LAST:event_jButton5ActionPerformed

    
    public void setupTableLivres () {
     try  {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/bib","root","");  
            String sql= "select * from abonne" ;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel table1 = (DefaultTableModel) jTable1.getModel();
            table1.setRowCount(0);
            while (rs.next()){
                String id = String.valueOf(rs.getInt("idab"));
                String Titre = String.valueOf(rs.getString("nomab"));
                String tbData [] = {id,Titre} ;
                table1.addRow(tbData);    
            }
            con.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Abonne1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Abonne1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Abonne1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Abonne1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Abonne1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Titre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
