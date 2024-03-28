/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package V_Procedimientos;

import java.util.Scanner;

/**
 *
 * @author Alberto Arroyo
 */
public class Ejercicio_1 {
    // Declarar variables globales
    static double horast, tarifa, sueldob, desc, sueldon;
    static String categ;

    public static void main(String[] args) {
        /*
        Una empresa calcula el sueldo bruto de sus trabajadores multiplicando las horas
        trabajadas por una tarifa horaria que depende de la categoría del trabajador de 
        acuerdo con la siguiente tabla:
        Por ley, todo trabajador se somete a un porcentaje de descuento del sueldo bruto:
        15.5% si el sueldo bruto es mayor que S/. 3700 y 12.3% en caso contrario. Diseñe
        un programa que determine el sueldo bruto, el descuento y el sueldo neto que le
        corresponden a un trabajador de la empresa. Declare todas las variables como
        globales y use métodos tipo void diferentes para cada uno de los cálculos.
        */
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("¿Qué categoría posees (Master, Senior, Junior, Pracicante)\n y cuántas horas trabajas?");
            System.out.print("Categoría: ");
            categ = input.nextLine();
            if(categ.equals("Master") || categ.equals("Senior") || categ.equals("Junior") || categ.equals("Practicante")){
                System.out.print("Horas Trabajadas: ");
                horast = input.nextInt(); 
                System.out.println("");
                break;
            }else{
                System.out.println("Ingresa una categoría válida, por favor.");
            }
        }

        calcularTarifa();
        calcularSueldoBruto();
        calcularDescuento();
        calcularSueldoNeto();

        System.out.println("Sueldo bruto: S/. " + sueldob);
        System.out.println("Descuento: S/. " + desc);
        System.out.println("Sueldo neto: S/. " + sueldon);
    }

    public static void calcularTarifa() {
        switch (categ) {
            case "Master" -> tarifa = 70.0;
            case "Senior" -> tarifa = 50.5;
            case "Junior" -> tarifa = 30.0;
            case "Practicante" -> tarifa = 15.0;
            default -> System.out.println("Categoría no válida.");
        }
    }

    public static void calcularSueldoBruto() {
        sueldob = horast* tarifa;
    }

    public static void calcularDescuento() {
        if (sueldob > 3700) {
            desc = sueldob * 0.155;
        } else {
            desc = sueldob * 0.123;
        }
    }

    public static void calcularSueldoNeto() {
        sueldon = sueldob - desc;
    }    
}
