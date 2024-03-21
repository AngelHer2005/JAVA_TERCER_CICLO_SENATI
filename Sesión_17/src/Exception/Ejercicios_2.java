/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicios_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        try{
            System.out.println("Ingresa un valor:");
            num = input.nextInt();
            int cuadrado = num * num;
            System.out.println("El cuadrado de " + num + " es igual a " + cuadrado);
        }catch(InputMismatchException ex){
            System.out.println("Debe ingresar obligatoriamente un número entero.");
        }
        


    }
    
}
