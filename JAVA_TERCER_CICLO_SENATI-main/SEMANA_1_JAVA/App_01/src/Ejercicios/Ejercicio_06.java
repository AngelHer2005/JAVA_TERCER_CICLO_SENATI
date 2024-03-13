/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Academico
 */
public class Ejercicio_06 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String nombre;
            int horas, c_hora;
            System.out.println("Ingresa tu nombre: ");
            nombre=input.nextLine();
            System.out.println("Ingresa la cantidad de horas trabajadas: ");
            horas = input.nextInt();
            System.out.println("Ingresa el costo por hora: ");
            c_hora =input.nextInt();
            System.out.println("");
            System.out.println("Sr. "+nombre+", el sueldo total diario que recibe es: S/. "+(horas*c_hora));
        }
       
    }
    
}
