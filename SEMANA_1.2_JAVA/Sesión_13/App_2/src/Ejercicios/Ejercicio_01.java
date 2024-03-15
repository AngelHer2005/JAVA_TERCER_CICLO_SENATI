/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;   

public class Ejercicio_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       double area, perimetro, radio;
        final double pi = 3.14;
        System.out.println("Escribe un valor radio: ");
        radio = input.nextDouble();
        
        area = pi*(Math.pow(radio,2));
        perimetro = (double)Math.round((2*pi*radio)*100d/100);
        
        System.out.println("El perímetro del círculo cuyo radio es " + radio + " es " + area);
        System.out.println("El área del círculo cuyo radio es " + radio + " es " + perimetro);
        input.close();

    }
    
}
