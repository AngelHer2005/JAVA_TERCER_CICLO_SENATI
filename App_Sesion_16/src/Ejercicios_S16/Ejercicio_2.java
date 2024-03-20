/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_S16;

import javax.swing.JOptionPane;

public class Ejercicio_2 {

    public static void main(String[] args) {
        String numero;
        int n1, c=0;
        
        numero = JOptionPane.showInputDialog("Ingresa un número: ");
        n1 = Integer.parseInt(numero);
        
        for (int i = n1; i > 0 ; i--) {
            c+=i;
        }
        JOptionPane.showMessageDialog(null, "La sumatoria del número " + numero + " es " + c);
        
    }
    
}
