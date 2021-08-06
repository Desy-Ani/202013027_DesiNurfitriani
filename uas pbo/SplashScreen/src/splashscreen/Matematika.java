
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splashscreen;

import javax.swing.JOptionPane;

/**
 *
 * @author Desy
 */
public class Matematika extends javax.swing.JFrame {
    int angka=1;
    int Angka=0;
    String jawaban="";
    String Betul="";
    int Benar=0;
    int Salah=0;
    String Soal1[]={"Bulan desember Fika berusia empat belas tahun, lalu kaka ingin mengadakan pesta ulang tahun Fika "
            + "\ndengan mengundang teman-teman Fika untuk merayakannya. Angka untuk empat belas adalah","A.13","B.14","C.15","D.16"};
    String Soal2[]={ "Paman mempunyai 268 ekor kambing, kambing Paman mati 57 ekor, "
            + "\nberapa kambing Paman yang ada?","A. 212","B.211","C.219","D.218"};
    String Soal3[]={"Di nomor undangan pengambilan KTP elektronik Rini mendapat nomor 72 dan Nurul mendapat nomor 74,"
            + "\n bilangan antara 72 dan 74 adalah?","A.75","B.20","C.71","D.73"};
    String Soal4[]={"Hasan membawa uang Rp50.000. Ia membeli 25 buah buku. "
            + "\nSetiap buku harganya Rp1.750. Berapa sisa uang Hasan?","A.6.250","B.7.20","C.7000","D. 6000"};
    String Soal5[]={"suhu di kota Bandung adalah 29°C, sedangkan suhu di kota London -8°C. "
            + "\nSelisih suhu dari kedua kota tersebut adalah?","A. -18 c","B.-21 c","C.37 c","D. - 37 c"};
    String Soal6[]={"Hasil dari -4 + 8 : (-2) x 2 + 5 -2 adalah?","A. 9 ","B. -9","C. 7 ","d. - 7"};
    String Soal7[]={"Diketahui barisan aritmetika dengan U4= 20 dan U8= 44. "
            + "\nSuku ke-40 baris itu adalah?","A. 236 ","B.320 ","C. 200","D. 220"};
    String Soal8[]={"Faktor prima dari 156 adalah ?","A.4,3,3","B.2,3,3","C.2,3,9","D.2,3,5,7"};
    String Soal9[]={"FPB dari 80 dan 96 adalah ?","A.12","B. 18","C.16","D.24"};
    String Soal10[]={"Diketahui -9 x p = 81 nilai p adalah?","A. -2","B. 2 ","C.9","D.-9"};
    
    public Matematika() {
        initComponents(); 
        txtSoal.setText(""+Soal1[0]);
        A.setText(""+Soal1[1]);
        B.setText(""+Soal1[2]);
        C.setText(""+Soal1[3]);
        D.setText(""+Soal1[4]);
        txtAngka.setText(""+angka);
       
    }

    public void Clear()
    {
      buttonGroupPilih.clearSelection();  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupbenar = new javax.swing.ButtonGroup();
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
        jLabel2 = new javax.swing.JLabel();

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
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        txtAngka.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAngka.setText("N");
        jPanel1.add(txtAngka, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.setText("~ Quiz ~");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 100, -1, -1));

        txtSoal.setColumns(20);
        txtSoal.setRows(5);
        jScrollPane1.setViewportView(txtSoal);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 820, 260));

        buttonGroupPilih.add(A);
        A.setText("jRadioButton1");
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        jPanel1.add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, -1, -1));

        buttonGroupPilih.add(B);
        B.setText("jRadioButton2");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        jPanel1.add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, -1, -1));

        buttonGroupPilih.add(C);
        C.setText("jRadioButton3");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        jPanel1.add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 420, -1, -1));

        buttonGroupPilih.add(D);
        D.setText("jRadioButton4");
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });
        jPanel1.add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 480, -1, -1));

        btnPrev.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrev.setText("< Prev");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, 101, -1));

        btnResult.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnResult.setText("<> Result");
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });
        jPanel1.add(btnResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 580, -1, -1));

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNext.setText("> Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 580, 103, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/splashscreen/Assets/bg mtk.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, -1));

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
       JOptionPane.showMessageDialog(null,"Betul :"+Benar+"\n"+"Salah :"+Salah+"\n"+"Skor : "+Benar*10);
    }//GEN-LAST:event_btnResultActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        Angka+=1;
        angka+=1;
        txtAngka.setText(""+angka);
        if(Angka==1){
            if(B.isSelected()){
            Benar+=1;
            }else{
                Salah+=1;
            }Clear();
        
        }
        if(angka==2){
            txtSoal.setText(""+Soal2[0]);
            A.setText(""+Soal2[1]);
            B.setText(""+Soal2[2]);
            C.setText(""+Soal2[3]);
            D.setText(""+Soal2[4]);  
        }if(Angka==2){
        if(B.isSelected()){
            Benar+=1;
        }else{
            Salah+=1;
        }Clear();
        }
         if(angka==3){
            txtSoal.setText(""+Soal3[0]);
            A.setText(""+Soal3[1]);
            B.setText(""+Soal3[2]);
            C.setText(""+Soal3[3]);
            D.setText(""+Soal3[4]);
        }if (Angka==3){
        if(D.isSelected()){
            Benar+=1;
        }else{
            Salah+=1;
        }Clear();
    }
        
        if(angka==4){
            txtSoal.setText(""+Soal4[0]);
            A.setText(""+Soal4[1]);
            B.setText(""+Soal4[2]);
            C.setText(""+Soal4[3]);
            D.setText(""+Soal4[4]);
        }if (Angka==4){
        if(A.isSelected()){
            Benar+=1;
        }else{
            Salah+=1;
        }Clear();
       
    }
//        Clear();
        
        if(angka==5){
            txtSoal.setText(""+Soal5[0]);
            A.setText(""+Soal5[1]);
            B.setText(""+Soal5[2]);
            C.setText(""+Soal5[3]);
            D.setText(""+Soal5[4]);
        }if (Angka==5){
        if(C.isSelected()){
            Benar+=1;
        }else{
            Salah+=1;
        }
        Clear();
    }
//        Clear();
        
     
        if(angka==6){
            txtSoal.setText(""+Soal6[0]);
            A.setText(""+Soal6[1]);
            B.setText(""+Soal6[2]);
            C.setText(""+Soal6[3]);
            D.setText(""+Soal6[4]);
        }if (Angka==6){
        if(B.isSelected()){
            Benar+=1;
        }else{
            Salah+=1;
        }
     Clear();  
    }
        
        if(angka==7){
            txtSoal.setText(""+Soal7[0]);
            A.setText(""+Soal7[1]);
            B.setText(""+Soal7[2]);
            C.setText(""+Soal7[3]);
            D.setText(""+Soal7[4]);
        }if (Angka==7){
        if(A.isSelected()){
            Benar+=1;
        }else{
            Salah+=1;
        }
     Clear();
    }
        
        if(angka==8){
            txtSoal.setText(""+Soal8[0]);
            A.setText(""+Soal8[1]);
            B.setText(""+Soal8[2]);
            C.setText(""+Soal8[3]);
            D.setText(""+Soal8[4]);
        }if (Angka==8){
        if(B.isSelected()){
            Benar+=1;
        }else{
            Salah+=1;
        }
    Clear();
        }
       
        if(angka==9){
            txtSoal.setText(""+Soal9[0]);
            A.setText(""+Soal9[1]);
            B.setText(""+Soal9[2]);
            C.setText(""+Soal9[3]);
            D.setText(""+Soal9[4]);
        }if (Angka==9){
        if(C.isSelected()){
            Benar+=1;
        }else{
            Salah+=1;
        }
        Clear();
        }
        if(angka==10){
            txtAngka.setText(""+angka);
            txtSoal.setText(""+Soal10[0]);
            A.setText(""+Soal10[1]);
            B.setText(""+Soal10[2]);
            C.setText(""+Soal10[3]);
            D.setText(""+Soal10[4]);
        }if (Angka==10){
        if(D.isSelected()){
            Benar+=1;
        }else{
            Salah+=1;
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
  
    }//GEN-LAST:event_btnNextActionPerformed
        
       
    
    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
          Angka-=0;
          angka-=1;
          txtAngka.setText(""+angka);
          
          if(angka==0){
              txtAngka.setText(""+angka++);
    }//GEN-LAST:event_btnPrevActionPerformed
          else {
              txtAngka.setText(""+angka);
          }
          if (angka==1){
           txtSoal.setText(""+Soal1[0]);
           A.setText(""+Soal1[1]);
           B.setText(""+Soal1[2]);
           C.setText(""+Soal1[3]);
           D.setText(""+Soal1[4]);
          }else if (angka==2){
           txtSoal.setText(""+Soal2[0]);
           A.setText(""+Soal2[1]);
           B.setText(""+Soal2[2]);
           C.setText(""+Soal2[3]);
           D.setText(""+Soal2[4]);   
          }else if(angka==3){
           txtSoal.setText(""+Soal3[0]);
           A.setText(""+Soal3[1]);
           B.setText(""+Soal3[2]);
           C.setText(""+Soal3[3]);
           D.setText(""+Soal3[4]);
          }else if(angka==4){
           txtSoal.setText(""+Soal4[0]);
           A.setText(""+Soal4[1]);
           B.setText(""+Soal4[2]);
           C.setText(""+Soal4[3]);
           D.setText(""+Soal4[4]);
          }else if (angka==5){
           txtSoal.setText(""+Soal5[0]);
           A.setText(""+Soal5[1]);
           B.setText(""+Soal5[2]);
           C.setText(""+Soal5[3]);
           D.setText(""+Soal5[4]);
          }else if (angka==6){
              txtSoal.setText(""+Soal6[0]);
           A.setText(""+Soal6[1]);
           B.setText(""+Soal6[2]);
           C.setText(""+Soal6[3]);
           D.setText(""+Soal6[4]);
          }else if (angka==7){
           txtSoal.setText(""+Soal7[0]);
           A.setText(""+Soal7[1]);
           B.setText(""+Soal7[2]);
           C.setText(""+Soal7[3]);
           D.setText(""+Soal7[4]);
          }else if (angka==8){
           txtSoal.setText(""+Soal8[0]);
           A.setText(""+Soal8[1]);
           B.setText(""+Soal8[2]);
           C.setText(""+Soal8[3]);
           D.setText(""+Soal8[4]);
          }else if (angka==9){
           txtSoal.setText(""+Soal9[0]);
           A.setText(""+Soal9[1]);
           B.setText(""+Soal9[2]);
           C.setText(""+Soal9[3]);
           D.setText(""+Soal9[4]);
          }else if (angka==10){
           txtSoal.setText(""+Soal10[0]);
           A.setText(""+Soal10[1]);
           B.setText(""+Soal10[2]);
           C.setText(""+Soal10[3]);
           D.setText(""+Soal10[4]);
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
       jawaban="B";
    }//GEN-LAST:event_BActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        jawaban="C";
    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        jawaban="D";
    }//GEN-LAST:event_DActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        jawaban="A";
    }//GEN-LAST:event_AActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(Matematika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matematika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matematika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matematika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Matematika().setVisible(true);
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
    private javax.swing.ButtonGroup groupbenar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtAngka;
    private javax.swing.JTextArea txtSoal;
    // End of variables declaration//GEN-END:variables
}
