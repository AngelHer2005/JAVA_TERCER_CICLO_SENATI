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
public class Ejercicio_6 {

    public static void main(String[] args) {
        /*
        Diseñe un programa que genere aleatoriamente las notas de una práctica calificada
        para 50 alumnos de una sección y determine la nota promedio de la sección, la
        cantidad de alumnos aprobados y la cantidad de alumnos desaprobados.
        */
        Random random = new Random();
        int sumaNotas = 0, aprobados = 0, desaprobados = 0;
        System.out.println("Generando notas de práctica calificada para 50 alumnos:");
        for (int i = 1; i <= 50; i++) {
            int nota = random.nextInt(21); // Generar nota entre 0 y 20
            sumaNotas += nota;
            if (nota >= 10) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        double promedio = (double) sumaNotas / 50;

        System.out.println("Nota promedio de la sección: " + promedio);
        System.out.println("Cantidad de alumnos aprobados: " + aprobados);
        System.out.println("Cantidad de alumnos desaprobados: " + desaprobados);
    }
    
}
