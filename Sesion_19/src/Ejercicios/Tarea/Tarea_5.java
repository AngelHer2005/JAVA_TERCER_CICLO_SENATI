/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejercicios.Tarea;

import java.awt.Color;

/**
 *
 * @author Alberto Arroyo
 */
public class Tarea_5 extends javax.swing.JFrame {

    /**
     * Creates new form Tarea_5
     */
    public Tarea_5() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cel = new javax.swing.JTextField();
        fah = new javax.swing.JTextField();
        kel = new javax.swing.JTextField();
        grado = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        cal = new javax.swing.JButton();
        nue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CONVERSOR DE GRADOS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Celsius");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Fahrenheit");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Kelvin");

        fah.setEditable(false);
        fah.setBackground(java.awt.Color.lightGray);

        kel.setEditable(false);
        kel.setBackground(new java.awt.Color(204, 204, 204));

        grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin" }));
        grado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("SALIR");

        cal.setBackground(new java.awt.Color(51, 204, 0));
        cal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cal.setText("CALCULAR");
        cal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calActionPerformed(evt);
            }
        });

        nue.setBackground(new java.awt.Color(255, 255, 0));
        nue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nue.setText("NUEVO");
        nue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fah, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(69, 69, 69)
                                    .addComponent(cel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nue, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(kel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cal)
                    .addComponent(nue))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradoActionPerformed
        switch (grado.getSelectedItem().toString()) {
                case "Celsius" -> {
                    cel.setEditable(true);
                    fah.setEditable(false);
                    kel.setEditable(false);
                    cel.setBackground(Color.white);
                    fah.setBackground(Color.lightGray);
                    kel.setBackground(Color.lightGray);
            }
                case "Fahrenheit" -> {
                    cel.setEditable(false);
                    fah.setEditable(true);
                    kel.setEditable(false);
                    cel.setBackground(Color.lightGray);
                    fah.setBackground(Color.white);
                    kel.setBackground(Color.lightGray);
            }
                case "Kelvin" -> {
                    cel.setEditable(false);
                    fah.setEditable(false);
                    kel.setEditable(true);
                    cel.setBackground(Color.lightGray);
                    fah.setBackground(Color.lightGray);
                    kel.setBackground(Color.white);
            }
        }
        cel.setText(null);
        fah.setText(null);
        kel.setText(null);
        
    }//GEN-LAST:event_gradoActionPerformed

    private void calActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calActionPerformed
        // TODO add your handling code here:
            switch (grado.getSelectedItem().toString()) {
                case "Celsius" -> {
                    double celsius = Double.parseDouble(cel.getText());
                    fah.setText(Double.toString(Math.round(((celsius * (9.0/5.0)) + 32.0) * 100.0) / 100.0));
                    kel.setText(Double.toString(Math.round((celsius + 273.15) * 100.0) / 100.0));
            }
                case "Fahrenheit" -> {
                    double fahrenheit = Double.parseDouble(fah.getText());
                    cel.setText(Double.toString(Math.round(((fahrenheit - 32.0) * (5.0/9.0)) * 100.0) / 100.0));
                    kel.setText(Double.toString(Math.round((((fahrenheit - 32.0) * (5.0/9.0)) + 273.15) * 100.0) / 100.0));
            }
                case "Kelvin" -> {
                    double kelvin = Double.parseDouble(kel.getText());
                    cel.setText(Double.toString(Math.round((kelvin - 273.15) * 100.0) / 100.0));
                    fah.setText(Double.toString(Math.round((((kelvin - 273.15) * (9.0/5.0)) + 32.0) * 100.0) / 100.0));
            }

            }
    }//GEN-LAST:event_calActionPerformed

    private void nueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueActionPerformed
        // TODO add your handling code here:
        cel.setText(null);
        fah.setText(null);
        kel.setText(null);
    }//GEN-LAST:event_nueActionPerformed

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
            java.util.logging.Logger.getLogger(Tarea_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tarea_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tarea_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tarea_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tarea_5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cal;
    private javax.swing.JTextField cel;
    private javax.swing.JTextField fah;
    private javax.swing.JComboBox<String> grado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField kel;
    private javax.swing.JButton nue;
    // End of variables declaration//GEN-END:variables
}
