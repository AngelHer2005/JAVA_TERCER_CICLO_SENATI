/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_S16;

import javax.swing.JOptionPane;

public class Ejercicio_6 {

    public static void main(String[] args) {
        int ni, nf, cp=0;
        String in, ifi;
        
        in = JOptionPane.showInputDialog("Ingresa el número inicial:");
        ifi = JOptionPane.showInputDialog("Ingresa el número final: ");
        ni = Integer.parseInt(in);
        nf = Integer.parseInt(ifi);
        
        for (int j = ni; j <= nf; j+=5) {
            System.out.println(j);
            cp++;
        }
        
        System.out.println("Hay " + cp + " números que son múltiplos de 5 en ese rango.");
        
        // Este es el código que usted nos pidió realizar, ¿pero no sería mejor usar el módulo para sacar correctamente todos
        // sus múltiplos de 5? Si el número en cuestión es 4, saldrá 9 como un múltiplo de 5, y en este caso, sería solo si es
        // divisible entre 5.
        // Sería así:
        /*
        cp=0;
        for (int i = ni; i < nf; i++) {
            if (i%5 == 0) {
                System.out.println(i);
                cp++;
            }
                
        }
        System.out.println(cp);
        */
    }
    
}
