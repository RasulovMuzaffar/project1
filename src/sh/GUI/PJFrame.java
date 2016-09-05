/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sh.GUI;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;
import sh.ModelZY;
import sh.PoTexRasch;

/**
 *
 * @author Muzaffar
 */
public class PJFrame extends javax.swing.JFrame {

    private Graphics2D g;
    private Line2D lineBuffer;
    private Ellipse2D circBuffer;
    private Ellipse2D circBuffer2;
    private Ellipse2D circBuffer3;

    private List<Line2D> lineContainer = new ArrayList();
    private List<Ellipse2D> circContainer = new ArrayList();
    private List<Ellipse2D> circContainer2 = new ArrayList();
    private List<Ellipse2D> circContainer3 = new ArrayList();

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
            .addGap(0, 606, Short.MAX_VALUE)
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
                        .addGap(0, 1014, Short.MAX_VALUE)))
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
        for (int i = 0; i < PoTexRasch.zyM.length; i++) {
            for (int j = 0; j < PoTexRasch.zyM[i].length; j++) {
                PoTexRasch.ZY(i, j);
            }
        }

        for (int i = 0; i < PoTexRasch.zyM.length; i++) {
            for (int j = 0; j < PoTexRasch.zyM[i].length; j++) {
                System.out.print(" " + i + ":" + j + " " + PoTexRasch.zyM[i][j].toString());
//                if (PoTexRasch.zyM[i][j].getSigma() != 0) {
//                    System.out.println("ZYMZ " + i + ":" + j + " -- " + PoTexRasch.zyM[i][j].getZ());
//                    System.out.println("ZYMY " + i + ":" + j + " -- " + PoTexRasch.zyM[i][j].getY());
//                    System.out.println("ZYMS " + i + ":" + j + " -- " + PoTexRasch.zyM[i][j].getSigma());
//                    System.out.println("ZYMD " + i + ":" + j + " -- " + PoTexRasch.zyM[i][j].getDelta());
//                    System.out.println("ZYMCd " + i + ":" + j + " -- " + PoTexRasch.zyM[i][j].getCdin());
//                    System.out.println("ZYMFd " + i + ":" + j + " -- " + PoTexRasch.zyM[i][j].getFidin());
//                    System.out.println("ZYMmju " + i + ":" + j + " -- " + PoTexRasch.zyM[i][j].getMju());
//                }
            }
            System.out.println("");
        }

        //------Рисуем------
        g = (Graphics2D) jPanel1.getGraphics();

        for (int i = 0; i < PoTexRasch.zyM.length; i++) {
            for (int j = 0; j < PoTexRasch.zyM[i].length; j++) {
//                if ((i == 10 && j == 0) || (i == 0 && j == 10)) {
//                if ((i + j == 10)||(i + j > 10 && (i <= 10 && j <= 10)) || j == 10) {
                if (i + j == 10) {
                    circBuffer = new Ellipse2D.Double((PoTexRasch.zyM[i][j].getZ() * 50), (PoTexRasch.zyM[i][j].getY() * 50), 6, 6);
                    circContainer.add(circBuffer);
//                    if (i < 10 && j < 10) {
//                        lineBuffer = new Line2D.Double((PoTexRasch.zyM[i][j].getZ() * 50), (PoTexRasch.zyM[i][j].getY() * 50),
//                                (PoTexRasch.zyM[i + 1][j + 1].getZ() * 50), (PoTexRasch.zyM[i + 1][j + 1].getY() * 50));
//                        lineContainer.add(lineBuffer);
//                    }
                }
                if (i + j == 11) {
                    circBuffer2 = new Ellipse2D.Double((PoTexRasch.zyM[i][j].getZ() * 10), (PoTexRasch.zyM[i][j].getY() * 10), 6, 6);
                    circContainer2.add(circBuffer2);
                }
                if (i + j == 12) {
                    circBuffer3 = new Ellipse2D.Double((PoTexRasch.zyM[i][j].getZ() ), (PoTexRasch.zyM[i][j].getY()), 6, 6);
                    circContainer3.add(circBuffer3);
                }
            }
        }
        for (int i = 0; i < circContainer.size(); i++) {
            g.draw(circContainer.get(i));
        }
//        for (int i = 0; i < lineContainer.size(); i++) {
//            g.draw(lineContainer.get(i));
//        }
        for (int i = 0; i < circContainer2.size(); i++) {
            g.setColor(Color.red);
            g.draw(circContainer2.get(i));
        }
        for (int i = 0; i < circContainer3.size(); i++) {
            g.setColor(Color.BLUE);
            g.draw(circContainer3.get(i));
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
