
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Şeyda
 */
public class tablo extends javax.swing.JFrame {
    
    DefaultTableModel tablo = new DefaultTableModel();
    
    public tablo() {
        initComponents();
        gosterge_tablosu.setModel(tablo);
        tablo.setColumnIdentifiers(new String[]{"Ad", "Soyad", "Numara", "Plaka", "Saat"});
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sys_ad = new javax.swing.JTextField();
        sys_soyad = new javax.swing.JTextField();
        sys_numara = new javax.swing.JTextField();
        sys_plaka = new javax.swing.JTextField();
        sys_saat = new javax.swing.JTextField();
        btn_giris = new javax.swing.JButton();
        btn_iptal = new javax.swing.JButton();
        btn_cikis = new javax.swing.JButton();
        btn_sonlandir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gosterge_tablosu = new javax.swing.JTable();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MÜŞTERİ KAYIT");
        setLocation(new java.awt.Point(250, 100));

        jLabel1.setText("  adı :");

        jLabel2.setText("  soyadı:");

        jLabel3.setText("  iletişim numarası :");

        jLabel4.setText("  araç plaka :");

        jLabel5.setText("  giriş saati :");

        sys_ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sys_adActionPerformed(evt);
            }
        });

        sys_soyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sys_soyadActionPerformed(evt);
            }
        });

        sys_numara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sys_numaraActionPerformed(evt);
            }
        });

        sys_plaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sys_plakaActionPerformed(evt);
            }
        });

        btn_giris.setBackground(new java.awt.Color(153, 204, 0));
        btn_giris.setText("KAYIT");
        btn_giris.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_girisActionPerformed(evt);
            }
        });

        btn_iptal.setBackground(new java.awt.Color(204, 102, 0));
        btn_iptal.setForeground(new java.awt.Color(51, 51, 51));
        btn_iptal.setText("İPTAL");
        btn_iptal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_iptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iptalActionPerformed(evt);
            }
        });

        btn_cikis.setBackground(new java.awt.Color(204, 204, 255));
        btn_cikis.setText("ÇIKIŞ YAP");
        btn_cikis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikisActionPerformed(evt);
            }
        });

        btn_sonlandir.setBackground(new java.awt.Color(204, 204, 0));
        btn_sonlandir.setText("SİSTEMİ SONLANDIR");
        btn_sonlandir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sonlandir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sonlandirActionPerformed(evt);
            }
        });

        gosterge_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(gosterge_tablosu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_cikis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_sonlandir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_iptal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_giris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sys_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sys_soyad, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                .addComponent(sys_numara)
                                .addComponent(sys_saat, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(sys_plaka)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(sys_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(sys_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(sys_numara)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sys_plaka))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sys_saat, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(btn_giris)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_iptal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(btn_cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_sonlandir)
                        .addContainerGap(52, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sys_adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sys_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sys_adActionPerformed

    private void sys_soyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sys_soyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sys_soyadActionPerformed

    private void sys_numaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sys_numaraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sys_numaraActionPerformed

    private void btn_girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_girisActionPerformed
        String ad = sys_ad.getText();
        
        String soyad = sys_soyad.getText();
        
        String numara = sys_numara.getText();
        
        String plaka = sys_plaka.getText();
        
        String saat = sys_saat.getText();
        sys_ad.setText("");
        sys_soyad.setText("");
        sys_numara.setText("");
        sys_plaka.setText("");
        sys_saat.setText("");
        
        tablo.addRow(new String[]{ad, soyad, numara, plaka, saat});
        String save_message = "KAYIT TAMAMLANDI..";
        JOptionPane.showMessageDialog(rootPane, save_message);
    }//GEN-LAST:event_btn_girisActionPerformed

    private void sys_plakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sys_plakaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sys_plakaActionPerformed

    private void btn_iptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iptalActionPerformed
        sys_ad.setText("");
        sys_soyad.setText("");
        sys_numara.setText("");
        sys_plaka.setText("");
        sys_saat.setText("");
    }//GEN-LAST:event_btn_iptalActionPerformed

    private void btn_sonlandirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sonlandirActionPerformed
       dispose();
    }//GEN-LAST:event_btn_sonlandirActionPerformed

    private void btn_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikisActionPerformed
        double sonuc = 0;
        String giris_saati = JOptionPane.showInputDialog("GİRİŞ SAATİ:");
        String cikis_saati = JOptionPane.showInputDialog("ÇIKIŞ SAATİ:");
        Double grs_st = Double.parseDouble(giris_saati);
        Double cks_st = Double.parseDouble(cikis_saati);
        Double saat_farkı = (cks_st - grs_st);
        sonuc += saat_farkı * 15;
        JOptionPane.showMessageDialog(rootPane, "tutar=" + String.valueOf(sonuc));
        tablo.removeRow(gosterge_tablosu.getSelectedRow());
        
    }//GEN-LAST:event_btn_cikisActionPerformed

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
            java.util.logging.Logger.getLogger(tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cikis;
    private javax.swing.JButton btn_giris;
    private javax.swing.JButton btn_iptal;
    private javax.swing.JButton btn_sonlandir;
    private javax.swing.JTable gosterge_tablosu;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sys_ad;
    private javax.swing.JTextField sys_numara;
    private javax.swing.JTextField sys_plaka;
    private javax.swing.JTextField sys_saat;
    private javax.swing.JTextField sys_soyad;
    // End of variables declaration//GEN-END:variables
}
