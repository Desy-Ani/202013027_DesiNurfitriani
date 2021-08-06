
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splashscreen;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Desy
 */
public class Kuis extends javax.swing.JFrame {

    int angka = 1;
    int Angka = 0;
    String jawaban = "";
    String Betul = "";
    int Benar = 0;
    int Salah = 0;
    String Soal1[] = {"Ada seseorang yang berjalan di tepi pantai tanpa memecah air Ketika ia menoleh ke belakang ia tidak menemukan jejak kakinya. Mengapa?", "A.Hantu", "B.Tidak memiliki kaki", "C.Berjalan Mundur", "D.Tidak ada cahaya matahari"};
    String Soal2[] = {"binatang apa yang jago renang?", "A. Bebek", "B.Ikan", "C.Kepiting", "D.Gurita"};
    String Soal3[] = {"Apa nama sebuah benda yang kalau ditutup berubah jadi tongkat, tapi ketika dibuka malah jadi tenda?", "A.Tenda", "B.Mantel", "C.Payung", "D.Ranting"};
    String Soal4[] = {"Kebo apa yg bikin kita lelah?", "A.Kepantai jalan kaki", "B.Kebogor jalan kaki", "C.Kebohongan yang tak sudah-sudah", "D.Kebo Lari"};
    String Soal5[] = {"Ada 5 orang yang berjalan dibawah 1 payung kecil tapi anehnya tidak seorang pun yang kehujanan, kenapa?", "A.Karena Tidak hujan", "B.Payung tidak bocor", "C.Orangnya kecil", "D.Saling gendong"};
    String Soal6[] = {"Ada bebek 10 dikali 2, jadi berapa?", "A. dua", "B.Dua Puluh", "C.Delapan", "d.Sepuluh"};
    String Soal7[] = {"Seorang pria terjebak di dalam gua, ia kebingungan karena gua tersebut gelap. "
            + "\nDi tangannya ada lilin dan obor. Apa yang harus ia nyalakan terlebih dahulu?", "A.Lilin", "B.Obor", "C.Kayu", "D.Korek Api"};
    String Soal8[] = {"Dua pria menyeberangi sungai dengan perahu yang hanya mampu mengangkut satu orang "
            + "\nNamun keduanya berhasil menyeberangi sungai.Bagaimana itu bisa terjadi?", "A.Saling memangku", "B.Satu Orang Mendorong Perahu", "C.Yang satu Berenang", "D.Karena mereka berada di tepi sungai yang berbeda"};
    String Soal9[] = {"Semakin banyak kamu mengambil, semakin banyak yang tersisa?", "A.Sidik Jari", "B.Sampah", "C.Air", "D.Mainan"};
    String Soal10[] = {"Daun apa yang tidak pernah gugur?", "A.Daun hijau", "B.Daun telinga", "C.Daun Jati", "D.Daun cemara"};

    public Kuis() {
        initComponents();
        txtSoal.setText("" + Soal1[0]);
        A.setText("" + Soal1[1]);
        B.setText("" + Soal1[2]);
        C.setText("" + Soal1[3]);
        D.setText("" + Soal1[4]);
        txtAngka.setText("" + angka);

    }
    

    public void Clear() {
        buttonGroupPilih.clearSelection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPilih = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        txtAngka = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSoal = new javax.swing.JTextArea();
        A = new javax.swing.JRadioButton();
        B = new javax.swing.JRadioButton();
        C = new javax.swing.JRadioButton();
        D = new javax.swing.JRadioButton();
        btnPrev = new javax.swing.JButton();
        btnResult = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setText("No");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        txtAngka.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAngka.setText("N");
        jPanel1.add(txtAngka, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.setText("~ Quiz ~");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 90, -1, -1));

        txtSoal.setEditable(false);
        txtSoal.setColumns(20);
        txtSoal.setRows(5);
        jScrollPane1.setViewportView(txtSoal);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 870, 289));

        buttonGroupPilih.add(A);
        A.setText("jRadioButton1");
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        jPanel1.add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, -1, -1));

        buttonGroupPilih.add(B);
        B.setText("jRadioButton2");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        jPanel1.add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, -1, -1));

        buttonGroupPilih.add(C);
        C.setText("jRadioButton3");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        jPanel1.add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 460, -1, -1));

        buttonGroupPilih.add(D);
        D.setText("jRadioButton4");
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });
        jPanel1.add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 520, -1, -1));

        btnPrev.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrev.setText(" Prev");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 620, 101, -1));

        btnResult.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnResult.setText("<> Result");
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });
        jPanel1.add(btnResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 620, -1, -1));

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNext.setText(" Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 620, 103, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/splashscreen/Assets/logika ku.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1340, 880));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
        JOptionPane.showMessageDialog(null, "Betul :" + Benar + "\n" + "Salah :" + Salah+"\n"+"Sekor : "+Benar*10);
    }//GEN-LAST:event_btnResultActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        
        Angka += 1;
        angka +=1;
        txtAngka.setText("" + angka);
        if (Angka == 1) {
            if (C.isSelected()) {
                Benar += 1;
            } else {
                Salah+=1;
            }
             Clear();   
        }
        
        if (angka == 2) {
            txtSoal.setText("" + Soal2[0]);
            A.setText("" + Soal2[1]);
            B.setText("" + Soal2[2]);
            C.setText("" + Soal2[3]);
            D.setText("" + Soal2[4]);
        }
        if (Angka == 2) {
            if (A.isSelected()) {
                Benar += 1;
            } else {
                Salah += 1;
                
            }
            Clear();
    }//GEN-LAST:event_btnNextActionPerformed

        if (angka == 3) {
            txtSoal.setText("" + Soal3[0]);
            A.setText("" + Soal3[1]);
            B.setText("" + Soal3[2]);
            C.setText("" + Soal3[3]);
            D.setText("" + Soal3[4]);
        }
        if (Angka == 3) {
            if (C.isSelected()) {
                Benar += 1;
            } else {
                Salah += 1;
            }
            Clear();
        }
        
        if (angka == 4) {
            txtSoal.setText("" + Soal4[0]);
            A.setText("" + Soal4[1]);
            B.setText("" + Soal4[2]);
            C.setText("" + Soal4[3]);
            D.setText("" + Soal4[4]);
        }
        if (Angka == 4) {
            if (B.isSelected()) {
                Benar += 1;
            } else {
                Salah += 1;
            }
            Clear();
        }

        if (angka == 5) {
            txtSoal.setText("" + Soal5[0]);
            A.setText("" + Soal5[1]);
            B.setText("" + Soal5[2]);
            C.setText("" + Soal5[3]);
            D.setText("" + Soal5[4]);
        }
        if (Angka == 5) {
            if (A.isSelected()) {
                Benar += 1;
            } else {
                Salah +=1;
            }
            Clear();
        }

        if (angka == 6) {
            txtSoal.setText("" + Soal6[0]);
            A.setText("" + Soal6[1]);
            B.setText("" + Soal6[2]);
            C.setText("" + Soal6[3]);
            D.setText("" + Soal6[4]);
        }
        if (Angka == 6) {
            if (C.isSelected()) {
                Benar += 1;
            } else {
                Salah += 1;
            }
            Clear();
        }

        if (angka == 7) {
            txtSoal.setText("" + Soal7[0]);
            A.setText("" + Soal7[1]);
            B.setText("" + Soal7[2]);
            C.setText("" + Soal7[3]);
            D.setText("" + Soal7[4]);
        }
        if (Angka == 7) {
            if (D.isSelected()) {
                Benar += 1;
            } else {
                Salah += 1;
            }
            Clear();
        }

        if (angka == 8) {
            txtSoal.setText("" + Soal8[0]);
            A.setText("" + Soal8[1]);
            B.setText("" + Soal8[2]);
            C.setText("" + Soal8[3]);
            D.setText("" + Soal8[4]);
        }
        if (Angka == 8) {
            if (D.isSelected()) {
                Benar += 1;
            } else {
                Salah += 1;
            }
            Clear();
        }

        if (angka == 9) {
            txtSoal.setText("" + Soal9[0]);
            A.setText("" + Soal9[1]);
            B.setText("" + Soal9[2]);
            C.setText("" + Soal9[3]);
            D.setText("" + Soal9[4]);
           
        }
        if (Angka == 9) {
            if (A.isSelected()) {
                Benar += 1;
            } else {
                Salah += 1;
            }
            Clear();
        }
        if (angka == 10) {
            txtAngka.setText(""+angka);
            txtSoal.setText("" + Soal10[0]);
            A.setText("" + Soal10[1]);
            B.setText("" + Soal10[2]);
            C.setText("" + Soal10[3]);
            D.setText("" + Soal10[4]);
        }
          
        if (Angka == 10) {
            if (B.isSelected()) {
                Benar += 1;
            } else {
                Salah += 1;
            }
            
            Clear();
        }
         if (angka == 11) {
            txtAngka.setText(""+(--angka));
            txtSoal.setText("" + Soal10[0]);
            A.setText("" + Soal10[1]);
            B.setText("" + Soal10[2]);
            C.setText("" + Soal10[3]);
            D.setText("" + Soal10[4]);
         
        }
    }

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        Angka -=0;
        angka -=1;
        txtAngka.setText("" + angka);

        if (angka == 0) {
            txtAngka.setText("" + angka++);
    }//GEN-LAST:event_btnPrevActionPerformed
          else {
            txtAngka.setText("" + angka);
        }
        if (angka == 1) {
            txtAngka.setText("" + angka);
            txtSoal.setText("" + Soal1[0]);
            A.setText("" + Soal1[1]);
            B.setText("" + Soal1[2]);
            C.setText("" + Soal1[3]);
            D.setText("" + Soal1[4]);
           
        }
        else if (angka == 2) {
            txtSoal.setText("" + Soal2[0]);
            A.setText("" + Soal2[1]);
            B.setText("" + Soal2[2]);
            C.setText("" + Soal2[3]);
            D.setText("" + Soal2[4]);
        } else if (angka == 3) {
            txtSoal.setText("" + Soal3[0]);
            A.setText("" + Soal3[1]);
            B.setText("" + Soal3[2]);
            C.setText("" + Soal3[3]);
            D.setText("" + Soal3[4]);
        } else if (angka == 4) {
            txtSoal.setText("" + Soal4[0]);
            A.setText("" + Soal4[1]);
            B.setText("" + Soal4[2]);
            C.setText("" + Soal4[3]);
            D.setText("" + Soal4[4]);
        } else if (angka == 5) {
            txtSoal.setText("" + Soal5[0]);
            A.setText("" + Soal5[1]);
            B.setText("" + Soal5[2]);
            C.setText("" + Soal5[3]);
            D.setText("" + Soal5[4]);
        } else if (angka == 6) {
            txtSoal.setText("" + Soal6[0]);
            A.setText("" + Soal6[1]);
            B.setText("" + Soal6[2]);
            C.setText("" + Soal6[3]);
            D.setText("" + Soal6[4]);
        } else if (angka == 7) {
            txtSoal.setText("" + Soal7[0]);
            A.setText("" + Soal7[1]);
            B.setText("" + Soal7[2]);
            C.setText("" + Soal7[3]);
            D.setText("" + Soal7[4]);
        } else if (angka == 8) {
            txtSoal.setText("" + Soal8[0]);
            A.setText("" + Soal8[1]);
            B.setText("" + Soal8[2]);
            C.setText("" + Soal8[3]);
            D.setText("" + Soal8[4]);
        } else if (angka == 9) {
            txtSoal.setText("" + Soal9[0]);
            A.setText("" + Soal9[1]);
            B.setText("" + Soal9[2]);
            C.setText("" + Soal9[3]);
            D.setText("" + Soal9[4]);
        } else if (angka == 10) {
            txtAngka.setText(""+angka);
            txtSoal.setText("" + Soal10[0]);
            A.setText("" + Soal10[1]);
            B.setText("" + Soal10[2]);
            C.setText("" + Soal10[3]);
            D.setText("" + Soal10[4]);
//            txtAngka.setText(""+angka--);
        }
         if (angka == 11) {
            
            txtSoal.setText("" + Soal10[0]);
            A.setText("" + Soal10[1]);
            B.setText("" + Soal10[2]);
            C.setText("" + Soal10[3]);
            D.setText("" + Soal10[4]);
            txtAngka.setText("10"+(--angka));
        }
        Clear();
    }

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        jawaban = "B";
    }//GEN-LAST:event_BActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        jawaban = "C";
    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        jawaban = "D";
    }//GEN-LAST:event_DActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        jawaban = "A";
    }//GEN-LAST:event_AActionPerformed

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
            java.util.logging.Logger.getLogger(Kuis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kuis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kuis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kuis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Kuis().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A;
    private javax.swing.JRadioButton B;
    private javax.swing.JRadioButton C;
    private javax.swing.JRadioButton D;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnResult;
    private javax.swing.ButtonGroup buttonGroupPilih;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtAngka;
    private javax.swing.JTextArea txtSoal;
    // End of variables declaration//GEN-END:variables
}
