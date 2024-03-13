/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;


public class Tarea_03 {

    public static void main(String[] args) {
        /*Ingrese la descripción de un producto; el precio y la cantidad,
        calcule su total bruto, descuento y total a pagar*/
        Scanner input = new Scanner(System.in);
        String producto, desc; int cantidad; double precio, total_b, descuento, total;
        System.out.println("¿Qué producto elegirás?");
        producto = input.nextLine();
        System.out.println("¿Cuánto está el producto?");
        precio = input.nextDouble();
        System.out.println("¿Cuántas unidades comprarás?");
        cantidad = input.nextInt();
        input.nextLine();
        System.out.println("¿Qué descuento tiene el producto? (18%)");
        desc = input.nextLine();
        /* Esto permitirá sacar el porcentaje del descuento*/
        if (!desc.isEmpty()) { // Asegurarse de que la cadena no esté vacía
            desc = desc.substring(0, desc.length() - 1);
        } else {
            System.out.println("La variable 'desc' está vacía.");
        }
        
        total_b = precio*cantidad;
        descuento = Integer.parseInt(desc)/100;
        total = total_b - descuento;
               
        System.out.println("El precio total bruto del producto "+producto+" es: S/. "+total_b+".");
        System.out.println("El precio total con descuento incluido del "+desc+"% es: S/. "+total);
        input.close();
    }
    
}
