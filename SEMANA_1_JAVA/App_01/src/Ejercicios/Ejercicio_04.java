/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;
import java.util.Scanner;


public class Ejercicio_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); int n1,n2,n3,n4;
        System.out.println("Ingresa tu primer número");
        n1 = input.nextInt();
        System.out.println("Ingresa tu segundo número");
        n2 = input.nextInt();
        System.out.println("Ingresa tu tercer número");
        n3 = input.nextInt();
        System.out.println("Ingresa tu cuarto número");
        n4 = input.nextInt();
        
        System.out.println("El suma de los 4 números es: "+(n1+n2+n3+n4));
        System.out.println("El resta de los 4 números es: "+(n1-n2-n3-n4));
        System.out.println("El multiplicación de los 4 números es: "+(n1*n2*n3*n4));
        System.out.println("El promedio de los 4 números es: "+((n1+n2+n3+n4)/4));
        input.close();
        
        
        
    }
    
}
