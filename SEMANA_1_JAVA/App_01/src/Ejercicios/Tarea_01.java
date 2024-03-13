/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;


public class Tarea_01 {

    public static void main(String[] args) {
        /*Calcule un programa que permita ingresar 6 notas ,visualizar su 
promedio y sus datos de le alumno.*/
        Scanner input = new Scanner(System.in);
        String nombre, apellidos, grado;
        int n1, n2, n3, n4, n5, n6;
        System.out.println("Ingresa tu nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingresa tus apellidos: ");
        apellidos = input.nextLine();
        System.out.println("Ingresa tu grado escolar (primaria, secundaria, universidad o superior): ");
        grado = input.nextLine();
        System.out.println("Ingresa tu primera nota: ");
        n1 = input.nextInt();
        System.out.println("Ingresa tu segunda nota: ");
        n2 = input.nextInt();
        System.out.println("Ingresa tu tercera nota: ");
        n3 = input.nextInt();
        System.out.println("Ingresa tu cuarta nota: ");
        n4 = input.nextInt();
        System.out.println("Ingresa tu quinta nota: ");
        n5 = input.nextInt();
        System.out.println("Ingresa tu sexta nota: ");
        n6 = input.nextInt();
        
        System.out.println("Según los registros...");
        System.out.println(nombre+" "+apellidos+".");
        System.out.println("El promedio de todas las notas que envió es: "+((n1+n2+n3+n4+n5+n6)/6));
        input.close(); 
        
    }
    
}
