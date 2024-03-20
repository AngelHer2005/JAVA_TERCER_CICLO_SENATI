/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_S16;

import javax.swing.JOptionPane;

public class Ejercicio_3 {

    public static void main(String[] args) {
        int n1=0, n2=0;
        String nu1, nu2, opcad;
        
        do {
            opcad=JOptionPane.showInputDialog("Menú \n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir\nIngrese opción:");
            if ("1".equals(opcad) || "2".equals(opcad) || "3".equals(opcad) || "4".equals(opcad)) {
                nu1=JOptionPane.showInputDialog("Ingresa el primer número:");
                nu2=JOptionPane.showInputDialog("Ingresa el primer número:");
                n1=Integer.parseInt(nu1);
                n2 = Integer.parseInt(nu2);
                break;
            }
            
            switch (Integer.parseInt(opcad)) {
            case 1:
                JOptionPane.showMessageDialog(null, "La suma entre ambos números es "+ (n1+n2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "La resta entre ambos números es "+ (n1-n2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "La multiplicación entre ambos números es "+ (n1*n2));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "La división de ambos números es "+ (n1/n2));
                break;
            case 5:
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "Opción errada.");
            }
            
        } while (true);

    }
    
}
