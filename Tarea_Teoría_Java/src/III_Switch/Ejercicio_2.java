/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package III_Switch;

import java.util.Scanner;

/**
 *
 * @author Alberto Arroyo
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
        /*
        2. Diseñe un programa que muestre la calificación de acuerdo con el puntaje obtenido en el
           lanzamiento de un dado de acuerdo con la siguiente tabla:
        */
        Scanner input = new Scanner(System.in);
        int puntaje; String calificacion; boolean val=false;
        
        while (true) {
            System.out.println("¿Qué nota sacaste?");
            puntaje = input.nextInt();
            switch (puntaje) {
                case 1, 2 -> {
                    calificacion = "Sin suerte.";
                    val=true;
                }
                case 3, 4 -> {
                    calificacion = "Con suerte.";
                    val=true;
                }
                case 5 -> {
                    calificacion = "Con estrella.";
                    val=true;
                }
                case 6 -> {
                    calificacion = "Fantástico.";
                    val=true;
                }
                default -> calificacion = "Puntaje inválido. Inténtelo de nuevo.";
            }
            if (val) {
                System.out.println("Calificación: " + calificacion);
            }
        }
        
        
        
        
    }
    
}
