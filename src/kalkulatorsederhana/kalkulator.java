/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kalkulatorsederhana;

/**
 *
 * @author MyPC One Pro K
 */
public class kalkulator extends javax.swing.JFrame {
        String angka;
        Double a, b, hasil;
        int o;
    /**
     * Creates new form kalkulator
     */
    public kalkulator() {
        initComponents();
        angka = "";
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
        tampilTeks = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        btnbagi = new javax.swing.JButton();
        angka5 = new javax.swing.JButton();
        angka7 = new javax.swing.JButton();
        angka8 = new javax.swing.JButton();
        angka4 = new javax.swing.JButton();
        angka6 = new javax.swing.JButton();
        angka0 = new javax.swing.JButton();
        angka9 = new javax.swing.JButton();
        angka1 = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        angka2 = new javax.swing.JButton();
        angka3 = new javax.swing.JButton();
        btnkurang = new javax.swing.JButton();
        btnhasil = new javax.swing.JButton();
        btntitik = new javax.swing.JButton();
        btnkali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 51));
        setName(""); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.setName(""); // NOI18N

        tampilTeks.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        tampilTeks.setName(""); // NOI18N
        tampilTeks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilTeksActionPerformed(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(255, 255, 0));
        hapus.setForeground(new java.awt.Color(51, 0, 51));
        hapus.setText("c");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        btnbagi.setBackground(new java.awt.Color(255, 255, 0));
        btnbagi.setText("/");
        btnbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbagiActionPerformed(evt);
            }
        });

        angka5.setText("5");
        angka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka5ActionPerformed(evt);
            }
        });

        angka7.setText("7");
        angka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka7ActionPerformed(evt);
            }
        });

        angka8.setText("8");
        angka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka8ActionPerformed(evt);
            }
        });

        angka4.setText("4");
        angka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka4ActionPerformed(evt);
            }
        });

        angka6.setText("6");
        angka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka6ActionPerformed(evt);
            }
        });

        angka0.setText("0");
        angka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka0ActionPerformed(evt);
            }
        });

        angka9.setText("9");
        angka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka9ActionPerformed(evt);
            }
        });

        angka1.setText("1");
        angka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka1ActionPerformed(evt);
            }
        });

        btntambah.setBackground(new java.awt.Color(255, 255, 0));
        btntambah.setText("+");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        angka2.setText("2");
        angka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka2ActionPerformed(evt);
            }
        });

        angka3.setText("3");
        angka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka3ActionPerformed(evt);
            }
        });

        btnkurang.setBackground(new java.awt.Color(255, 255, 0));
        btnkurang.setText("-");
        btnkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkurangActionPerformed(evt);
            }
        });

        btnhasil.setBackground(new java.awt.Color(255, 255, 0));
        btnhasil.setForeground(new java.awt.Color(51, 0, 51));
        btnhasil.setText("=");
        btnhasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhasilActionPerformed(evt);
            }
        });

        btntitik.setBackground(new java.awt.Color(255, 255, 0));
        btntitik.setText(",");
        btntitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntitikActionPerformed(evt);
            }
        });

        btnkali.setBackground(new java.awt.Color(255, 255, 0));
        btnkali.setForeground(new java.awt.Color(51, 0, 0));
        btnkali.setText("X");
        btnkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(angka4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(angka5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(angka6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(angka7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(angka8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(angka9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(angka0, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btntitik, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbagi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnkurang, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnhasil, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnkali, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(tampilTeks, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(tampilTeks, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbagi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkali, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkurang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka0, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhasil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntitik, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void angka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka7ActionPerformed
      angka += "7";
      tampilTeks.setText(angka);
    }//GEN-LAST:event_angka7ActionPerformed

    private void angka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka1ActionPerformed
      angka += "1";
      tampilTeks.setText(angka);
    }//GEN-LAST:event_angka1ActionPerformed

    private void angka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka2ActionPerformed
        angka += "2";
      tampilTeks.setText(angka);
    }//GEN-LAST:event_angka2ActionPerformed

    private void angka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka3ActionPerformed
      angka += "3";
      tampilTeks.setText(angka);
    }//GEN-LAST:event_angka3ActionPerformed

    private void angka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka4ActionPerformed
     angka += "4";
      tampilTeks.setText(angka);
    }//GEN-LAST:event_angka4ActionPerformed

    private void angka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka5ActionPerformed
      angka += "5";
      tampilTeks.setText(angka);
    }//GEN-LAST:event_angka5ActionPerformed

    private void angka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka6ActionPerformed
      angka += "6";
      tampilTeks.setText(angka);
    }//GEN-LAST:event_angka6ActionPerformed

    private void angka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka8ActionPerformed
    angka += "8";
      tampilTeks.setText(angka);
    }//GEN-LAST:event_angka8ActionPerformed

    private void angka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka9ActionPerformed
       angka += "9";
      tampilTeks.setText(angka);
    }//GEN-LAST:event_angka9ActionPerformed

    private void angka0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka0ActionPerformed
      angka += "0";
      tampilTeks.setText(angka);
    }//GEN-LAST:event_angka0ActionPerformed

    private void btntitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntitikActionPerformed
       angka += ",";
      tampilTeks.setText(angka);
    }//GEN-LAST:event_btntitikActionPerformed

    private void btnhasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhasilActionPerformed
       switch (o){
           case 1:
               b =Double.parseDouble(angka);
               hasil = a+b;
               angka = Double.toString(hasil);
               tampilTeks.setText(angka);
               break;
           case 2:
               b =Double.parseDouble(angka);
               hasil = a-b;
               angka = Double.toString(hasil);
               tampilTeks.setText(angka);
               break;
           case 3:
               b =Double.parseDouble(angka);
               hasil = a*b;
               angka = Double.toString(hasil);
               tampilTeks.setText(angka);
               break;
           case 4:
               b =Double.parseDouble(angka);
               hasil = a/b;
               angka = Double.toString(hasil);
               tampilTeks.setText(angka);
               break;
           default:
               break;
       }
    }//GEN-LAST:event_btnhasilActionPerformed

    private void btnkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkurangActionPerformed
       a = Double.parseDouble(angka);
       tampilTeks.setText("-");
       angka = "";
       o=2;
    }//GEN-LAST:event_btnkurangActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
       a = Double.parseDouble(angka);
       tampilTeks.setText("+");
       angka = "";
       o=1;
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaliActionPerformed
        a = Double.parseDouble(angka);
       tampilTeks.setText("*");
       angka = "";
       o=3;
    }//GEN-LAST:event_btnkaliActionPerformed

    private void btnbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbagiActionPerformed
         a = Double.parseDouble(angka);
       tampilTeks.setText("/");
       angka = "";
       o=4;
    }//GEN-LAST:event_btnbagiActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
       tampilTeks.setText(angka);
       a = 0.0;
       b = 0.0;
       hasil = 0.0;
       angka = "";
    }//GEN-LAST:event_hapusActionPerformed

    private void tampilTeksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilTeksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tampilTeksActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton angka0;
    private javax.swing.JButton angka1;
    private javax.swing.JButton angka2;
    private javax.swing.JButton angka3;
    private javax.swing.JButton angka4;
    private javax.swing.JButton angka5;
    private javax.swing.JButton angka6;
    private javax.swing.JButton angka7;
    private javax.swing.JButton angka8;
    private javax.swing.JButton angka9;
    private javax.swing.JButton btnbagi;
    private javax.swing.JButton btnhasil;
    private javax.swing.JButton btnkali;
    private javax.swing.JButton btnkurang;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton btntitik;
    private javax.swing.JButton hapus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton tampilTeks;
    // End of variables declaration//GEN-END:variables
}
