package Ejercicios.Tarea;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Tarea_12 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio_02
     */
    public Tarea_12() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXT_PRI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TXT_SEGUN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TXT_TERCER = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TXT_MAYOR = new javax.swing.JTextField();
        BTN_MAYOR = new javax.swing.JButton();
        BTN_LIM = new javax.swing.JButton();
        BTN_SALI = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Escoge el número mayor");

        jLabel2.setText("Ingrese el primer número:");

        TXT_PRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_PRIActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingrese el segundo número:");

        TXT_SEGUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_SEGUNActionPerformed(evt);
            }
        });

        jLabel4.setText("Ingrese el tercer número:");

        TXT_TERCER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_TERCERActionPerformed(evt);
            }
        });

        jLabel5.setText("EL NÚMERO MAYOR ES:");

        TXT_MAYOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_MAYORActionPerformed(evt);
            }
        });

        BTN_MAYOR.setText("EL MAYOR");
        BTN_MAYOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_MAYORActionPerformed(evt);
            }
        });

        BTN_LIM.setText("LIMPIAR");
        BTN_LIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_LIMActionPerformed(evt);
            }
        });

        BTN_SALI.setText("SALIR");
        BTN_SALI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SALIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TXT_PRI))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXT_SEGUN, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(TXT_TERCER, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(BTN_MAYOR)
                                        .addComponent(TXT_MAYOR, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(BTN_LIM)
                        .addGap(41, 41, 41)
                        .addComponent(BTN_SALI)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXT_PRI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_SEGUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(TXT_MAYOR, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXT_TERCER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_MAYOR)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_LIM)
                    .addComponent(BTN_SALI))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXT_TERCERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_TERCERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_TERCERActionPerformed
    int mayor = Integer.MIN_VALUE;
    private void BTN_MAYORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_MAYORActionPerformed
        int num1 = Integer.parseInt(TXT_PRI.getText());
        int num2 = Integer.parseInt(TXT_SEGUN.getText());
        int num3 = Integer.parseInt(TXT_TERCER.getText());

        if (num1 > mayor) {
            mayor = num1;
        }
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        TXT_MAYOR.setText(String.valueOf(mayor));
        TXT_PRI.requestFocus();    }//GEN-LAST:event_BTN_MAYORActionPerformed

    private void TXT_PRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_PRIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_PRIActionPerformed

    private void TXT_SEGUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_SEGUNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_SEGUNActionPerformed

    private void TXT_MAYORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_MAYORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_MAYORActionPerformed

    private void BTN_LIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_LIMActionPerformed
        TXT_PRI.setText("");
        TXT_SEGUN.setText("");
        TXT_MAYOR.setText("");    }//GEN-LAST:event_BTN_LIMActionPerformed

    private void BTN_SALIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SALIActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BTN_SALIActionPerformed

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
            java.util.logging.Logger.getLogger(Tarea_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tarea_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tarea_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tarea_12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tarea_12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_LIM;
    private javax.swing.JButton BTN_MAYOR;
    private javax.swing.JButton BTN_SALI;
    private javax.swing.JTextField TXT_MAYOR;
    private javax.swing.JTextField TXT_PRI;
    private javax.swing.JTextField TXT_SEGUN;
    private javax.swing.JTextField TXT_TERCER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
