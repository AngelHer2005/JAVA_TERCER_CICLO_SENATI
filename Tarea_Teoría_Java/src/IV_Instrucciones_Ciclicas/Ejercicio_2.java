/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IV_Instrucciones_Ciclicas;

/**
 *
 * @author Alberto Arroyo
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
        /*
        Diseñe un programa que imprima y sume 75 términos de la siguiente serie. Los
        términos serán mostrados en una columna a razón de un término por fila.
        6, 13, 20, 27, 34, 41, 48, …
        */
        int suma = 0, termino = 6;

        System.out.println("Términos de la serie:");
        for (int i = 1; i <= 75; i++) {
            System.out.println(termino);
            suma += termino;
            termino += 7;
        }
        System.out.println("La suma de los términos es: " + suma);
    }
    
}
