/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.Tarea;

import java.util.Scanner;

public class Tarea_18 {

    public static void main(String[] args) {
        // 16) Calcular el área y perímetrode un rectángulo.
        Scanner sc = new Scanner(System.in);
        double longitud, ancho;
        System.out.println("Ingrese el valor de la longitud del rectángulo: ");
        longitud=sc.nextDouble();
        
        System.out.println("Ingrese el valor del ancho de un rectángulo: ");
        ancho = sc.nextDouble();
       
        double area= longitud * ancho;
        System.out.println("EL área del rectángulo es:" + area);
       
        double perimetro=2*(longitud+ancho);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }
    
}
