/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.Tarea;

import java.util.Scanner;

public class Tarea_15 {

    public static void main(String[] args) {
        // 13) Calcular el área de un trapecio
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa la primera base de un trapecio: ");
        double a=sc.nextDouble();
        
        System.out.println("Ingresa la segunda base de un trapecio: ");
        double b=sc.nextDouble();
        
        System.out.println("Ingresa la altura de un trapecio: ");
        double h=sc.nextDouble();
        
        double area=(a+b)*h/2;
        
        System.out.println("El area de este trapecio con medidas de " + " base 1 " + a + "," + "base 2 " + b + " y de altura " + h + " es: " + area);

    }
    
}
