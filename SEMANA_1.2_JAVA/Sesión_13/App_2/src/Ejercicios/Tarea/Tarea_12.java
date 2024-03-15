/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios.Tarea;

import java.util.Scanner;

public class Tarea_12 {

    public static void main(String[] args) {
        // 10) Visualizar el precio y la cantidad de productos comprados; calcular el total bruto,el descuento del 5% y el
        // total a pagar.
        Scanner input = new Scanner(System.in);
        double precio, cantidad, t_bruto, total;
        
        System.out.println("¿Cuál es el precio de los productos comprados?");
        precio = input.nextInt();
        System.out.println("¿Cuántos productos compraron?");
        cantidad = input.nextInt();
        
        t_bruto = precio * cantidad;
        total = t_bruto + ((double) Math.round((t_bruto * 0.05) * 100d) / 100);
        
        System.out.println("Se compraron " + cantidad + " productos, cuyo precio por todo es " + precio + ", el total bruto es " + t_bruto + ", con un descuento del 5% y el total a pagar es " + total);
        input.close();
    
    }
    
}
