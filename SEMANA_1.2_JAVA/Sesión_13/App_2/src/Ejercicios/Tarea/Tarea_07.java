/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.Tarea;

import java.util.Scanner;

public class Tarea_07 {

    public static void main(String[] args) {
        // 5) Ingresar 3 números, visualizar de la suma el promedio y la raíz cuadrada.
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;
        
        System.out.println("Ingresa tres números:");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        
        System.out.println("El promedio es: " + (n1+n2+n3)/3);
        System.out.println("La raíz cuadrada de la suma de los 3 números es: " + Math.sqrt(n1 + n2 + n3));
        input.close();
    }
    
}
