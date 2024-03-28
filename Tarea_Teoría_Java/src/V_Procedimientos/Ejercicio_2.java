/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package V_Procedimientos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alberto Arroyo
 */
public class Ejercicio_2 {
    static double prod=0, p1 = 15, p2 = 17.5, p3 = 20, importe = 0;
    static int opcion, cantidad;
    static String regalo=null;
    public static void main(String[] args) {
        /*
        Una tienda vende tres tipos de productos a los precios unitarios dados en la
        siguiente tabla:
        Como oferta la tienda ofrece un regalo de acuerdo a la siguiente tabla:
        Diseñe un programa que determine el importe a pagar y el regalo para un cliente de la tienda.
        */

        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("¿Qué producto comprarás? \n1. P1\n2. P2\n3. P3");
                opcion = input.nextInt();
                switch (opcion) {
                    case 1 -> prod = p1;
                    case 2 -> prod = p2;
                    case 3 -> prod = p3;
                    default -> {
                        System.out.println("Valor inválido, ingresa de nuevo.");
                        return;
                    }
                }
                if (prod != 0) {
                    while (true) {
                        try {
                            System.out.println("¿Cuántos?");
                            cantidad = input.nextInt();
                            if (cantidad > 0) {
                                break;
                            } else {
                                System.out.println("Ingresa un valor entero.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Por favor, ingresa un número entero.");
                            input.next();
                        }
                    }
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingresa un número entero.");
                input.next();
            }
        }
        
        calcularRegalo();
        calcularImporte();
        
        System.out.println("El importe a pagar es: " + Double.toString(importe));
        if (regalo == null) {
            System.out.println("El cliente no recibe regalo.");
        }else{
            System.out.println("El cliente recibe un/a " + regalo + ".");
        }
    }
    
    public static void calcularRegalo(){
        if (1 < cantidad && cantidad <=25) {
            regalo = "lapicero";            
        }else if(25< cantidad && cantidad <=50){
            regalo = "cuaderno";
        }else if(cantidad > 50){
            regalo = "agenda";
        }
    }
    
    public static void calcularImporte(){
        importe = prod * cantidad;
    }
    
    
    
}
