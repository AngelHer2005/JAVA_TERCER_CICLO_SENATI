/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_S16;

import javax.swing.JOptionPane;

public class Ejercicio_5 {

    public static void main(String[] args) {
        String numero;
        int n1;
        numero = JOptionPane.showInputDialog("Ingresa un número: ");
        n1=Integer.parseInt(numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numero + " = " + i*n1);
        }
    }
    
}