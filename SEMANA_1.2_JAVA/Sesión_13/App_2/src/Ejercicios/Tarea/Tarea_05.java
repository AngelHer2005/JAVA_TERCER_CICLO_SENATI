/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.Tarea;

import java.util.Scanner;

public class Tarea_05 {

    public static void main(String[] args) {
        //  3) Ingresar un número, visualizar su 40%.
        Scanner input = new Scanner(System.in);
        int n1;
        
        System.out.println("Ingresa un número:");
        n1 = input.nextInt();
        
        System.out.println("El 40% de " + n1 + " es " + (n1*0.4));
        input.close();


    }
    
}
