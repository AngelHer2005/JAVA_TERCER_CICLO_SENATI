/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        num = 3;
        
        System.out.println("Ingresa un número de 3 digitos.");
        num = input.nextInt();
        String numero = Integer.toString(num);
        if (numero.length() == 3) {
            System.out.println("Tiene 3 dígitos");
            char centena = numero.charAt(0);
            char decena = numero.charAt(1);
            char unidad = numero.charAt(2);
            System.out.println("Son " + centena + " centenas, " +  decena +" decenas y "+ unidad + " unidades.");
        }else{
            System.out.println("Error");
        }
        input.close();
        
            
        
        


    }
    
}
