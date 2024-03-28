/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IV_Instrucciones_Ciclicas;

import java.util.Random;

/**
 *
 * @author Alberto Arroyo
 */
public class Ejercicio_7 {

    public static void main(String[] args) {
        /*
        Diseñe un programa que genere aleatoriamente la nota de un alumno y muestre
        la nota seguido de tantos ? como indique la nota.
        */
        Random random = new Random();
        int nota = random.nextInt(11);
        System.out.print("Nota: " + nota + " ");
        for (int i = 0; i < nota; i++) {
            System.out.print("?");
        }
        System.out.println("");
    }
    
}
