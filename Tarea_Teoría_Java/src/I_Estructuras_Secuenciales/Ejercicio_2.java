/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package I_Estructuras_Secuenciales;

import javax.swing.JOptionPane;

public class Ejercicio_2 {

    public static void main(String[] args) {
        String lado = JOptionPane.showInputDialog("Ingrese el lado de un cuadrado:");
        double L = Double.parseDouble(lado);

        
        double area =Math.pow(L, 2);
        double perimetro = L*4;

        JOptionPane.showMessageDialog(null, "El area de un cuadrado es: " + area + "\nEl perimetro de un cuadrado es: "
                + "" + perimetro);
    }

}
