/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.Tarea;

import java.util.Scanner;

public class Tarea_09 {

    public static void main(String[] args) {    
    // 7) Ingresar 2 números, visualiza el resto de la división y su división entera.
        Scanner input = new Scanner(System.in);
        int n1,n2;
        System.out.println("Ingresa 2 números: ");
        n1 = input.nextInt();
        n2 = input.nextInt();
        
        System.out.println("El resto de la división entre ambos números es " + (n1%n2) + " y su división entera es " + Math.round(n1/n2));
        input.close();
    }
    
}
