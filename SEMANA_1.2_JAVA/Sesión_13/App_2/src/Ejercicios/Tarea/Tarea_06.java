/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.Tarea;

import java.util.Scanner;

public class Tarea_06 {

    public static void main(String[] args) {
        // 4) Ingresar 4 números, visualizar la suma, multiplicación y la media aritmética
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, n4;
        
        System.out.println("Ingresa cuatro números:");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        n4 = input.nextInt();
        
        System.out.println("La suma de los 4 números es: " + (n1 + n2 + n3 + n4));
        System.out.println("La multiplicación de los 4 números es: " + (n1 * n2 * n3 * n4));
        System.out.println("Y la media aritmética de los 4 números es: " + (n1 + n2 + n3 + n4)/4);
        input.close();
    }
    
}
