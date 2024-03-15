/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.Tarea;

import java.util.Scanner;

public class Tarea_16 {

    public static void main(String[] args) {
        //  14) Calcular el área de un círculo
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la radio del circulo: ");
        double r=sc.nextDouble();
        
        double pi=3.14;
        
        double area=pi * Math.pow(r, 2);
        
        System.out.println("El área del círculo con radio de " + r + " es: " + area);

    }
    
}
