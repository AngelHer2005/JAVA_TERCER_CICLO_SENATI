/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

public class Tarea_06 {

    public static void main(String[] args) {
        /*Una vendedora recibe un sueldo base más un 7% extra por
          comisión de sus ventas, el vendedor desea saber cuánto dinero
          obtendrá por concepto de comisiones por las cuatro ventas que
          realiza en el mes y el total que recibirá en el mes tomando en
          cuenta su sueldo base y comisiones.*/
        Scanner input = new Scanner(System.in);
        double s_base, venta, comisiones, total;
        
        System.out.println("¿Cuál es su sueldo base?");
        s_base = input.nextInt();
        System.out.println("¿Cuánto ganó en la primera venta?");
        venta = input.nextInt();
        System.out.println("¿Cuánto ganó en la segunda venta?");
        venta += input.nextInt();
        System.out.println("¿Cuánto ganó en la tercera venta?");
        venta += input.nextInt();
        System.out.println("¿Cuánto ganó en la cuarta venta?");
        venta += input.nextInt();
        
        comisiones = venta*0.07;
        total = s_base+((double)Math.round(comisiones*100d)/100);
        
        System.out.println("La vendedora obtendrá un total de: S/. "+total);
        input.close();
    }
    
}
