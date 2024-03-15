/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.Tarea;

import java.util.Scanner;

public class Tarea_17 {

    public static void main(String[] args) {
        // 15) Calcular el área y perímetro de un cuadrado
        Scanner sc = new Scanner(System.in);
        double lado;
        System.out.println("Ingrese el valor de un lado: ");
        lado=sc.nextDouble();
        double area=Math.pow(lado, 2);
        System.out.println("EL área del cuadrado es:" + area);
       
        double perimetro=4*lado;
        System.out.println("El perímetro del cuadrado es: " + perimetro);
    }
    
}
