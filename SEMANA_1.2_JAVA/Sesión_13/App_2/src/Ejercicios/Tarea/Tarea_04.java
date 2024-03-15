/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.Tarea;

import java.util.Scanner;

public class Tarea_04 {

    public static void main(String[] args) {
        //  2) Ingresar un 2 número, visualizar  de la suma su cuadrado y cubo.
        Scanner input = new Scanner(System.in);
        int n1, n2;
        
        System.out.println("Ingresa 2 números:");
        n1 = input.nextInt();
        n2 = input.nextInt();
        
        System.out.println("La suma de su cuadrado de ambos números es " + (Math.pow(n1,2)+Math.pow(n2,2)) + " y su cubo es " + (Math.pow(n1,3)+Math.pow(n2,3)));
        input.close();
    }
    
}
