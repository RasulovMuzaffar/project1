/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sh.GUI;

import sh.ModelZY;
import sh.PoTexRasch;

/**
 *
 * @author Muzaffar
 */
public class PJFrame extends javax.swing.JFrame {

//    static ModelZY[][] zyM = new ModelZY[11][31];

    /**
     * Creates new form PJFrame
     */
    public PJFrame() {
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 789, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ModelZY zy = new ModelZY();
        PoTexRasch p = new PoTexRasch();
        for (int i = 0; i < PoTexRasch.zyM.length; i++) {
            for (int j = 0; j < PoTexRasch.zyM[i].length; j++) {
//                int i=1;
                if (i + j == 10) {
                    PoTexRasch.ZY(i, j);
//                    System.out.println("ZYMZ " + i + ":" + j + " -- " + zyM[i][j].getZ());
//                    System.out.println("ZYMY " + i + ":" + j + " -- " + zyM[i][j].getY());
//                    System.out.println("ZYMS " + i + ":" + j + " -- " + zyM[i][j].getSigma());
//                    System.out.println("ZYMD " + i + ":" + j + " -- " + zyM[i][j].getDelta());
//                    System.out.println("ZYMCd " + i + ":" + j + " -- " + zyM[i][j].getCdin());
//                    System.out.println("ZYMFd " + i + ":" + j + " -- " + zyM[i][j].getFidin());
//                    p.mju();
//                    System.out.println("z " + zyM[i][j].getZ() + " : y " + zyM[i][j].getY());
//                    System.out.println("Cdin " + p.Cdin(zyM[i][j].getZ(), zyM[i][j].getY()));
                } else {

                    zy.setZ(0);
                    zy.setY(0);
                    zy.setSigma(0);
                    zy.setDelta(0);
                    zy.setCdin(0);
                    zy.setFidin(0);
                    PoTexRasch.zyM[i][j] = zy;
                }
            }
        }
//        zyM[8][2].setDelta(0.001);
//System.out.println(""+PoTexRasch.zyM[9][1].getZ());
        for (int i = 0; i < PoTexRasch.zyM.length; i++) {
////            System.out.println(zyM[i].length);
            for (int j = 0; j < PoTexRasch.zyM[i].length; j++) {
                System.out.print(" "+i + ":" + j + " " + PoTexRasch.zyM[i][j].toString());
            }
            System.out.println("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
