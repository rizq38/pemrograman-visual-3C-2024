/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cob;

import javax.swing.JOptionPane;

/**
 *
 * @author RIZQY
 */
public class slide2 extends javax.swing.JFrame {

    /**
     * Creates new form hari1
     */
    public slide2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        rdbtnstatus = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        Alamat1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        Notlp1 = new javax.swing.JTextField();
        Email1 = new javax.swing.JTextField();
        Divisi1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        Nama1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        Tempat1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        Tanggal1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Exit1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        JenisK5 = new javax.swing.JTextField();
        Pekerjaan1 = new javax.swing.JTextField();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("PENDAFTARAN PANITIA PILKADA");

        jLabel3.setText("KEC.Lenteng Timur.Des Lenteng");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel4.setText("Sumenep September 2024 Kode Pos 69461 No tlp 0872793977");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cob/kpu-removebg-preview (1).png"))); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 120));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(0, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setText("Alamat");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        Alamat1.setEditable(false);
        Alamat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alamat1ActionPerformed(evt);
            }
        });
        jPanel2.add(Alamat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 250, -1));

        jLabel25.setText("No Telp");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        Notlp1.setEditable(false);
        jPanel2.add(Notlp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 250, -1));

        Email1.setEditable(false);
        Email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email1ActionPerformed(evt);
            }
        });
        jPanel2.add(Email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 250, -1));

        Divisi1.setEditable(false);
        Divisi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Divisi1ActionPerformed(evt);
            }
        });
        jPanel2.add(Divisi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 250, -1));

        jLabel26.setText("Email");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel29.setText("Nama");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 40, 20));

        jLabel30.setText("Tempat Lahir");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 80, -1));

        Nama1.setEditable(false);
        Nama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nama1ActionPerformed(evt);
            }
        });
        jPanel2.add(Nama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 250, -1));

        jLabel31.setText("Tanggal Lahir");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 80, -1));

        Tempat1.setEditable(false);
        Tempat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tempat1ActionPerformed(evt);
            }
        });
        jPanel2.add(Tempat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 250, -1));

        jLabel32.setText("Jenis kelamin");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 80, -1));

        Tanggal1.setEditable(false);
        Tanggal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tanggal1ActionPerformed(evt);
            }
        });
        jPanel2.add(Tanggal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 250, -1));

        jLabel33.setText("Pekerjaan");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 60, -1));

        jLabel5.setText("Divisi");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        Exit1.setText("Exit");
        Exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit1ActionPerformed(evt);
            }
        });
        jPanel2.add(Exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel6.setText("Coppyright : @rzq");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        JenisK5.setEditable(false);
        jPanel2.add(JenisK5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 250, -1));

        Pekerjaan1.setEditable(false);
        Pekerjaan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pekerjaan1ActionPerformed(evt);
            }
        });
        jPanel2.add(Pekerjaan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 250, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 480, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Divisi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Divisi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Divisi1ActionPerformed

    private void Email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email1ActionPerformed

    private void Tempat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tempat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tempat1ActionPerformed

    private void Tanggal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tanggal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tanggal1ActionPerformed

    private void Alamat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alamat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alamat1ActionPerformed

    private void Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit1ActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_Exit1ActionPerformed

    private void Nama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nama1ActionPerformed

    private void Pekerjaan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pekerjaan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pekerjaan1ActionPerformed

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
            java.util.logging.Logger.getLogger(slide2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(slide2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(slide2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(slide2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new slide2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Alamat1;
    public javax.swing.JTextField Divisi1;
    public javax.swing.JTextField Email1;
    public javax.swing.JButton Exit1;
    public javax.swing.JTextField JenisK5;
    public javax.swing.JTextField Nama1;
    public javax.swing.JTextField Notlp1;
    public javax.swing.JTextField Pekerjaan1;
    public javax.swing.JTextField Tanggal1;
    public javax.swing.JTextField Tempat1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private javax.swing.ButtonGroup rdbtnstatus;
    // End of variables declaration//GEN-END:variables
}
