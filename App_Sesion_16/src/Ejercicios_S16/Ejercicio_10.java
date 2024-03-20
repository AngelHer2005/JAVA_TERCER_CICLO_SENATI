/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios_S16;


public class Ejercicio_10 {

    public static void main(String[] args) {
        /*
        10.- Programa que ingrese los siguientes números : 2, 3, 5, 7, 1, 4,
        7, 3, 0, 5 , en un arreglo incremente su valor de cada uno.
        */
        int[] numeros = {2,3,5,7,1,4,7,3,0,5};
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]++;            
        }
        System.out.println("Este es el arreglo modificado.");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
    
}
