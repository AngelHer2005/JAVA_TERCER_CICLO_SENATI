/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sesion_13;

import java.util.Scanner;

public class Ejercicio_05 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        int m = input.nextInt();
        int i = 0;
        int j = 0;
        
        do {
            if (j%2==0) {
                System.out.print(j+", ");
                j++;
                i++;
            }else{j++;}
            
        } while (i!=m);
        
        
        
    }
    
}
