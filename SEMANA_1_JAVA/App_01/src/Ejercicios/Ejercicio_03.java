/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;
import java.time.Duration;
public class Ejercicio_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); String nombre; int edad;
        System.out.println("Por favor, ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.println("Por favor, ingrese su edad: ");
        edad = input.nextInt();
        
        System.out.println("El nombre es: "+nombre);
        System.out.println("Posee "+edad+" años.");
        System.out.println("Y en 10 años tendrá "+(edad+10)+" años.");
        input.close();
    }
    
}
