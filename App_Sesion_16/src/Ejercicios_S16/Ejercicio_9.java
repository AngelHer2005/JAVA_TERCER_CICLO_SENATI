/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_S16;

import java.util.Scanner;

public class Ejercicio_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nombre = new String[5];
        double[] sueldo = new double[5];
        double s_m = sueldo[0];
        String n_m="";
        double c_g = 0;
        
        System.out.println("En este programa, escribirás 5 nombres y sus sueldos.\nPresiona [Enter] para continuar.");
         
        for (int j = 0; j < nombre.length; j++) {
            input.nextLine();
            System.out.println("Trabajador " + (j+1) + ":");
            nombre[j]=input.nextLine();
            System.out.println("Sueldo:");
            sueldo[j]=input.nextDouble();       
            c_g+=sueldo[j];
            if (sueldo[j]>s_m) {
                s_m=sueldo[j];
                n_m=nombre[j];
            }
        }
        System.out.println("El total general de los sueldos es S/. " + String.valueOf(c_g) + " y el trabajador con el sueldo "
                + "mayor de S/. " + String.valueOf(s_m) + ", es el Sr/a.  " + n_m);
        input.close();
    }
    
}
