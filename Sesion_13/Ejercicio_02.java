/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sesion_13;

import java.util.Scanner;

public class Ejercicio_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        System.out.println("Ingresa tu edad: ");
        edad = input.nextInt();
        
        if (edad <=11) {
            System.out.println("Eres un niño.");
        }else{
            if(edad >= 12 && edad < 18){
                System.out.println("Eres un adolescente.");
            }else{
                System.out.println("Eres un adulto.");
            }
        }
        
    }
    
}
