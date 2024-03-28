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
public class Ejercicio_5 {

    public static void main(String[] args) {
        /*
        Diseñe un programa que simule varios lanzamientos de un dado hasta obtener un
        seis. Muestre los puntajes del dado conforme se vayan generando y muestre al
        final cuántos lanzamientos fueron necesarios efectuar
        */
        Random random = new Random();
        int lanzamientos = 0;

        System.out.println("Simulación de lanzamientos de dado hasta obtener un seis:");
        while (true) {
            int resultado = random.nextInt(6) + 1;
            lanzamientos++;
            System.out.println("Lanzamiento " + lanzamientos + ": " + resultado);            
            if (resultado == 6) {
                break;
            }
        }
        
        System.out.println("Se necesitaron " + lanzamientos + " lanzamientos para obtener un seis.");
    }
}
