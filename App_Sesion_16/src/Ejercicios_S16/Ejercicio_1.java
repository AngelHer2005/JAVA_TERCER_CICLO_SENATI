/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_S16;

import javax.swing.JOptionPane;

public class Ejercicio_1 {

    public static void main(String[] args) {
        int ni, nf, c = 0, i;
        String nicad, nfcad;

        nicad = JOptionPane.showInputDialog("Ingresa numero inicial: ");
        ni = Integer.parseInt(nicad);
        nfcad = JOptionPane.showInputDialog("Ingresa rango final: ");
        nf = Integer.parseInt(nfcad);
        ni = ni + 1;
        nf = nf + 1;
        for (i = ni; i <= nf; i++) {
            c += 1;
        }
        JOptionPane.showMessageDialog(null, "La cantidad de numeros ingresados son "+c);
    }
    
}
