/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

public class Tarea_05 {

    public static void main(String[] args) {
        /*Dada una cantidad en soles, obtener la equivalencia en dólares,
        asumiendo que la unidad cambiaría es un dato desconocido.*/
        Scanner input = new Scanner(System.in); double sol, dolar;
        System.out.println("Este programa recibirá una cantidad de soles y te entregará su equivalencia en dólares.");
        sol = input.nextDouble();
        dolar = (double)Math.round((sol*0.2711)*100d)/100;
        System.out.println("La cantidad en dólares de S/. "+sol+" soles es: $"+dolar+".");
        input.close();
    }
    
}
