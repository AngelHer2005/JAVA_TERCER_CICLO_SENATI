/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Ingresa un numero: ");
        num = input.nextInt();
        
        if (num%2==0) {
            System.out.println("Ganarás el triple.");
        }else{
            System.out.println("Ganarás el doble.");
        }
        input.close();
    }
    
}
