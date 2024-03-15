/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.Tarea;

import java.util.Scanner;

public class Tarea_02 {

    public static void main(String[] args) {
        //3.- Escribir un programa en el cual se ingresen cuatro
        //números, calcular e informar la suma de los dos primeros y el
        //producto del tercero y el cuarto.
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, n4;
        System.out.println("Ingresa el primer número: ");
        n1 = input.nextInt();
        System.out.println("Ingresa el segundo número: ");
        n2 = input.nextInt();
        System.out.println("Ingresa el tercer número: ");
        n3 = input.nextInt();
        System.out.println("Ingresa el cuarto número: ");
        n4 = input.nextInt();
        System.out.println("La suma de los 2 primeros números es " + (n1+n2) + " y el producto del tercero y el cuarto es " + (n3*n4));
        
    }
    
}
