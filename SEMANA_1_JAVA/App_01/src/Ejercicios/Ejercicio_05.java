/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;
/**
 *
 * @author Academico
 */
import java.util.Scanner;
public class Ejercicio_05 {


    public static void main(String[] args) {
        
        try (Scanner E = new Scanner(System.in)) {
            double numero,p;
            System.out.println("Ingresa un número");
            numero=E.nextInt();
            p=Math.pow(numero, 2);
            System.out.println("La potencia del número ingresado es: "+p);
            System.out.println("La potencia del número ingresado es: "+Math.sqrt(numero));
        }
    }
    
}
