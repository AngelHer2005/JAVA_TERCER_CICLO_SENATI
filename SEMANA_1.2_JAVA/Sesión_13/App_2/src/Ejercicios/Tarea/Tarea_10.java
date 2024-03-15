/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.Tarea;

import java.util.Scanner;

public class Tarea_10 {

    public static void main(String[] args) {
        // 8) Ingresar la Base y la altura de un triángulo, calcular el área.
        Scanner input = new Scanner(System.in);
        double base, altura;
        System.out.println("Ingresa la base y la altura de un triángulo:");
        base = input.nextDouble();
        altura = input.nextDouble();
        
        System.out.println("El área del tríángulo cuya base es " + base + " y su altura es " + altura + ", es " + ((base*altura)/2));
        input.close();
    }
    
}
