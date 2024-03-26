/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Academico
 */
public class Ejercicio_1 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio_1
     */
    public Ejercicio_1() {
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
        CB_ING = new javax.swing.JCheckBox();
        CB_AD = new javax.swing.JCheckBox();
        CB_CON = new javax.swing.JCheckBox();
        BTN_ACEPTAR = new javax.swing.JButton();
        BTN_LIMPIAR = new javax.swing.JButton();
        BTN_SALIR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TX_PROF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("SELECCIÓN ESPECIALIDAD");
        jLabel1.setName(""); // NOI18N

        CB_ING.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CB_ING.setText("INGENIERÍA DE SISTEMAS");
        CB_ING.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_INGActionPerformed(evt);
            }
        });

        CB_AD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CB_AD.setText("ADMINISTRACIÓN");
        CB_AD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_ADActionPerformed(evt);
            }
        });

        CB_CON.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CB_CON.setText("CONTABILIDAD");
        CB_CON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_CONActionPerformed(evt);
            }
        });

        BTN_ACEPTAR.setBackground(new java.awt.Color(0, 204, 51));
        BTN_ACEPTAR.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BTN_ACEPTAR.setText("ACEPTAR");
        BTN_ACEPTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ACEPTARActionPerformed(evt);
            }
        });

        BTN_LIMPIAR.setBackground(new java.awt.Color(255, 255, 0));
        BTN_LIMPIAR.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BTN_LIMPIAR.setText("LIMPIAR");
        BTN_LIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_LIMPIARActionPerformed(evt);
            }
        });

        BTN_SALIR.setBackground(new java.awt.Color(204, 51, 0));
        BTN_SALIR.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BTN_SALIR.setText("SALIR");
        BTN_SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SALIRActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("PROFESIÓN:");

        TX_PROF.setEditable(false);
        TX_PROF.setBackground(new java.awt.Color(204, 204, 204));
        TX_PROF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Academico\\Downloads\\senati.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TX_PROF))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(418, 418, 418)
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CB_AD)
                                    .addComponent(CB_ING)
                                    .addComponent(CB_CON)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(BTN_ACEPTAR)
                .addGap(71, 71, 71)
                .addComponent(BTN_LIMPIAR)
                .addGap(81, 81, 81)
                .addComponent(BTN_SALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(CB_ING)
                        .addGap(18, 18, 18)
                        .addComponent(CB_AD)
                        .addGap(18, 18, 18)
                        .addComponent(CB_CON))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_ACEPTAR)
                    .addComponent(BTN_LIMPIAR)
                    .addComponent(BTN_SALIR))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TX_PROF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CB_INGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_INGActionPerformed
        // TODO add your handling code here:
        if (CB_ING.isSelected()) {
            CB_AD.setSelected(false);
            CB_CON.setSelected(false);
        }
    }//GEN-LAST:event_CB_INGActionPerformed

    private void CB_ADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_ADActionPerformed
        // TODO add your handling code here:
        if (CB_AD.isSelected()) {
            CB_ING.setSelected(false);
            CB_CON.setSelected(false);
        }
    }//GEN-LAST:event_CB_ADActionPerformed

    private void BTN_ACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ACEPTARActionPerformed
        // TODO add your handling code here:
        String mensaje="La profesión que seleccionaste es: ";
        if (CB_ING.isSelected()) {
            mensaje+="Ingeniería de sistemas";
        }
        if (CB_AD.isSelected()) {
            mensaje+="Administración";
        }
        if (CB_CON.isSelected()) {
            mensaje+="Contabilidad";
        }
        TX_PROF.setText(mensaje);
        
    }//GEN-LAST:event_BTN_ACEPTARActionPerformed

    private void BTN_SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SALIRActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BTN_SALIRActionPerformed

    private void BTN_LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_LIMPIARActionPerformed
        // TODO add your handling code here:
        TX_PROF.setText("");
        CB_ING.setSelected(false);
        CB_AD.setSelected(false);
        CB_CON.setSelected(false);
    }//GEN-LAST:event_BTN_LIMPIARActionPerformed

    private void CB_CONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_CONActionPerformed
        // TODO add your handling code here:
            if (CB_CON.isSelected()) {
                CB_ING.setSelected(false);
                CB_AD.setSelected(false);
        }
    }//GEN-LAST:event_CB_CONActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_ACEPTAR;
    private javax.swing.JButton BTN_LIMPIAR;
    private javax.swing.JButton BTN_SALIR;
    private javax.swing.JCheckBox CB_AD;
    private javax.swing.JCheckBox CB_CON;
    private javax.swing.JCheckBox CB_ING;
    private javax.swing.JTextField TX_PROF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
