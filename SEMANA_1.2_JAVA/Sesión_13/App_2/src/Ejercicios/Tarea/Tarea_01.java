/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.Tarea;

import java.util.Scanner;

public class Tarea_01 {

    public static void main(String[] args) {
     //2.- Realizar la carga del lado de un cuadrado, mostrar por
     //pantalla el perímetro del mismo. (El perímetro de un cuadrado
     //se calcula multiplicando el valor del lado por cuatro).
        Scanner input = new Scanner(System.in);
        int lado;
        System.out.println("¿Cuál es el lado del cuadrado?");
        lado = input.nextInt();
        
        System.out.println("El perímetro del cuadrado, cuyo lado es " + lado + ", es " + (lado*4));        
    }
    
}
