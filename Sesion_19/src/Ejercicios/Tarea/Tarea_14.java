package Ejercicios.Tarea;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author USUARIO
 */
public class Tarea_14 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio_04
     */
    public Tarea_14() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXT_NOM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TXT_EDAD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TXT_POS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TXT_APR = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TXT_NOTA = new javax.swing.JTextField();
        BTN_APRO = new javax.swing.JButton();
        BTN_SALIR = new javax.swing.JButton();
        BTN_LIM = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("POSTULANTE A LA UNI");

        jLabel2.setText("NOMBRE DEL POSTULANTE:");

        TXT_NOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_NOMActionPerformed(evt);
            }
        });

        jLabel3.setText("EDAD DEL POSTULANTE:");

        TXT_EDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_EDADActionPerformed(evt);
            }
        });

        jLabel4.setText("SU CÓDIGO DE POSTULACIÓN O SU NÚMERO DE DNI:");

        TXT_POS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_POSActionPerformed(evt);
            }
        });

        jLabel5.setText("ESTADO:");

        jLabel6.setText("NOTA MÍNIMA PARA APROBAR ES 10.5");

        TXT_APR.setEditable(false);
        TXT_APR.setBackground(new java.awt.Color(255, 51, 0));
        TXT_APR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_APRActionPerformed(evt);
            }
        });

        jLabel7.setText("NOTA QUE SACÓ EL POSTULANTE:");

        TXT_NOTA.setEditable(false);
        TXT_NOTA.setBackground(new java.awt.Color(51, 51, 255));
        TXT_NOTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_NOTAActionPerformed(evt);
            }
        });

        BTN_APRO.setBackground(new java.awt.Color(102, 255, 102));
        BTN_APRO.setText("SABER SI APROBÓ O DESAPROBÓ");
        BTN_APRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_APROActionPerformed(evt);
            }
        });

        BTN_SALIR.setBackground(new java.awt.Color(0, 255, 51));
        BTN_SALIR.setText("SALIR");
        BTN_SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SALIRActionPerformed(evt);
            }
        });

        BTN_LIM.setBackground(new java.awt.Color(51, 255, 204));
        BTN_LIM.setText("LIMPIAR");
        BTN_LIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_LIMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTN_SALIR))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TXT_POS, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TXT_NOM)
                                    .addComponent(TXT_EDAD))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(210, 210, 210)
                                        .addComponent(BTN_LIM)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(BTN_APRO, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_APR, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT_NOTA, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXT_NOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_EDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_LIM))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(BTN_SALIR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXT_POS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TXT_NOTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TXT_APR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BTN_APRO)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private double NUMEROSRANDOM() {
        Random r = new Random();
        return r.nextInt((20 - 5) + 1) + 5;
    }
    private void BTN_APROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_APROActionPerformed
        double ran = NUMEROSRANDOM();

        if (ran >= 10.5) {
            TXT_APR.setText("APROBADO");
            TXT_NOTA.setText(String.valueOf(ran));
        } else {
            TXT_APR.setText("No aprobado");
            TXT_NOTA.setText(String.valueOf(ran));
        }
    }//GEN-LAST:event_BTN_APROActionPerformed

    private void TXT_NOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_NOMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_NOMActionPerformed

    private void TXT_EDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_EDADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_EDADActionPerformed

    private void TXT_POSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_POSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_POSActionPerformed

    private void TXT_NOTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_NOTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_NOTAActionPerformed

    private void TXT_APRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_APRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_APRActionPerformed

    private void BTN_LIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_LIMActionPerformed
        TXT_NOM.setText("");
        TXT_EDAD.setText("");
        TXT_POS.setText("");
        TXT_APR.setText("");
        TXT_NOTA.setText("");
    }//GEN-LAST:event_BTN_LIMActionPerformed

    private void BTN_SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SALIRActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BTN_SALIRActionPerformed

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
            java.util.logging.Logger.getLogger(Tarea_14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tarea_14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tarea_14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tarea_14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tarea_14().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_APRO;
    private javax.swing.JButton BTN_LIM;
    private javax.swing.JButton BTN_SALIR;
    private javax.swing.JTextField TXT_APR;
    private javax.swing.JTextField TXT_EDAD;
    private javax.swing.JTextField TXT_NOM;
    private javax.swing.JTextField TXT_NOTA;
    private javax.swing.JTextField TXT_POS;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}