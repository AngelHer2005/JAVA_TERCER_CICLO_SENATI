/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;


public class Tarea_02 {


    public static void main(String[] args) {
        /*Ingresar la Base y la altura de un triángulo, calcular el área*/
        Scanner input = new Scanner(System.in);
        double base, altura;
        System.out.println("En este programa, se hallará el área del triángulo según los datos que nos brindes.");
    
        System.out.println("\nIngresa la base del triángulo: ");
        base = input.nextDouble();
        System.out.println("\nIngresa la altura del triángulo: ");
        altura = input.nextDouble();
        System.out.println("Según los datos recibidos...\nEl área del triángulo es de: "+(base*altura)/2);
        input.close();
    }
    
}
