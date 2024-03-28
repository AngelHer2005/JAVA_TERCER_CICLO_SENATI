/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package I_Estructuras_Secuenciales;

import javax.swing.JOptionPane;

public class Ejercicio_3 {

    public static void main(String[] args) {
        String monto = JOptionPane.showInputDialog("Ingrese el monto a donar:");
        double Donacion = Double.parseDouble(monto);
        

        double Salud = 0.25;
        double ComedorInfantil = 0.35;
        double Guarderia = 0.25;
        double Asilo = 1.0 - Salud - ComedorInfantil - Guarderia;

        double montoSalud = Donacion * Salud;
        double montoComedor = Donacion * ComedorInfantil;
        double montoGuarderia = Donacion * Guarderia;
        double montoAsilo = Donacion * Asilo;
        JOptionPane.showMessageDialog(null,"Distribución de la donación:\n"
                + "------------------------------\n" 
                + "Centro de Salud: S/. " + String.format("%.2f", montoSalud) + "\n"
                + "Comedor Infantil: S/. " + String.format("%.2f", montoComedor) + "\n"
                + "Guardería: S/. " + String.format("%.2f", montoGuarderia) + "\n"
                + "Asilo de Ancianos: S/." + String.format("%.2f", montoAsilo) + "\n"
                + "------------------------------\n"
                + "Monto total de la donación: S/. " + String.format("%.2f", Donacion) );
       
    }

}
