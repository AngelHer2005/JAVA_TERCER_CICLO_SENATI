/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.Tarea;

import java.util.Scanner;

public class Tarea_03 {

    public static void main(String[] args) {
        // 1) Ingresar  3 números y visualiza su mitad
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;
        
        System.out.println("Ingresa 3 números: ");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        
        System.out.println("La mitad del primer número es " + (n1/2) + ", la mitad del segundo número es " + (n2/2) + " y la del tercero es " + (n3/2));
        input.close();
    }
    
}
