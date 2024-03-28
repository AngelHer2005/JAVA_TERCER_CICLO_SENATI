/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IV_Instrucciones_Ciclicas;

import java.util.Scanner;

/**
 *
 * @author Alberto Arroyo
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        /*
        Diseñe un programa que imprima y sume n términos de la siguiente serie.
        3/4, 6/8, 9/12, 12/16, ...
        */
        Scanner input = new Scanner(System.in);
        int sumnum = 0, sumden = 0, num = 3, den = 4;
        System.out.println("Ingresa cuantos términos quieres realizar.");
        int cantidad = input.nextInt();
        
        System.out.println("Términos de la serie:");
        for (int i = 0; i <= cantidad; i++) {
            System.out.println(num + "/" + den);
            sumnum += num;
            sumden += den;
            num += 3;
            den += 4;
        }
        System.out.println("La suma de los númeradores es: " + sumnum);
        System.out.println("La suma de los denominadores es: " + sumden);
    }
}
