/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_S16;

import javax.swing.JOptionPane;

public class Ejercicio_8 {

    public static void main(String[] args) {
        int n1;
        String n_m;
        
        n_m = JOptionPane.showInputDialog("Ingresa un número:");
        n1 = Integer.parseInt(n_m);
        
        switch (n1) {
            case 1 -> JOptionPane.showMessageDialog(null, "El mes es Enero.");
            case 2 -> JOptionPane.showMessageDialog(null, "El mes es Febrero.");
            case 3 -> JOptionPane.showMessageDialog(null, "El mes es Marzo.");
            case 4 -> JOptionPane.showMessageDialog(null, "El mes es Abril.");
            case 5 -> JOptionPane.showMessageDialog(null, "El mes es Mayo.");
            case 6 -> JOptionPane.showMessageDialog(null, "El mes es Junio.");
            case 7 -> JOptionPane.showMessageDialog(null, "El mes es Julio.");
            case 8 -> JOptionPane.showMessageDialog(null, "El mes es Agosto.");
            case 9 -> JOptionPane.showMessageDialog(null, "El mes es Septiembre.");
            case 10 -> JOptionPane.showMessageDialog(null, "El mes es Octubre.");
            case 11 -> JOptionPane.showMessageDialog(null, "El mes es Noviembre.");
            case 12 -> JOptionPane.showMessageDialog(null, "El mes es Diciembre.");
                
            default -> JOptionPane.showMessageDialog(null, "Mes no existe.");
        }
        
        // o también puede ser...
        /*
        String[] mes = {"Enero","Febrero","Marzo","Abril","Mayo","Junio",
                        "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        
        while (true) {
            String msj=JOptionPane.showInputDialog("Ingresa un número:");
            if (Integer.parseInt(msj) < 13 && Integer.parseInt(msj) > -1) {
                JOptionPane.showMessageDialog(null,"El mes número " + msj + " es: " + 
                mes[Integer.parseInt(msj)-1]);break;
            }else{
                JOptionPane.showMessageDialog(null,"Mes no existe, ingresa de nuevo...");
            }
            
        }
        */


    }
    
}
