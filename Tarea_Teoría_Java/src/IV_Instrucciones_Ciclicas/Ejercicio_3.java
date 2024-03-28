/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IV_Instrucciones_Ciclicas;

/**
 *
 * @author Alberto Arroyo
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
        /*
        Diseñe un programa que imprima y sume 90 términos de la siguiente serie.
        3/4, 6/6, 9/8, 12/10, ...
        System.out.println( n + “/” + d);
        */
        int sumnum = 0, sumden = 0, num = 3, den = 4;

        System.out.println("Términos de la serie:");
        for (int i = 1; i <= 90; i++) {
            System.out.println(num + "/" + den);
            sumnum += num;
            sumden += den;
            num += 3;
            den += 2;
        }
        System.out.println("La suma de los numeradores es: " + sumnum);
        System.out.println("La suma de los denominadores es: " + sumden);
    }
    
}
