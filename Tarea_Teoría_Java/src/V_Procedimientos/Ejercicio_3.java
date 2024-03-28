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
public class Ejercicio_3 {
    public static void main(String[] args) {
        /*
        En una universidad, los alumnos están categorizados en cuatro categorías. A
        cada categoría le corresponde una pensión mensual distinta dada en la
        siguiente tabla: 
        Semestralmente, la universidad efectúa rebajas en las pensiones de sus estudiantes
        a partir del segundo ciclo en base al promedio ponderado del ciclo anterior en
        porcentajes dados en la tabla siguiente:
        */
        Scanner input = new Scanner(System.in);
        double prom = 0;
        String categ = "";
        try {
            while (true) {
                System.out.print("Ingrese la categoría del estudiante: \n1. AA1 \n2. AA2 \n3. BB1 \n4. CC1\nCategoría: ");
                categ = input.nextLine().toUpperCase();
                if("AA1".equals(categ) || "AA2".equals(categ) || "BB1".equals(categ) || "CC1".equals(categ)){
                    System.out.println("");
                    break;
                }else{
                    System.out.println("Ingresa un valor entre los mencionados.");
                }
            }
            
            while (true) {
                System.out.print("Ingrese el promedio ponderado del ciclo anterior:\nPromedio: ");
                prom = input.nextDouble();
                if(0 <= prom && prom<=20){
                    System.out.println("");
                    break;
                }else{
                    System.out.println("Ingresa un promedio del 1 al 20.");
                }
            }

            double pensionac = obtenerPension(categ);
            double desc = calcularDescuento(prom);
            double nuevapen = calcularNuevaPension(pensionac, desc);
            if(desc == 0){
                System.out.println("No recibió descuento.");
            }else{
                System.out.println("El descuento recibido es: " + desc + " %.");
            }
            System.out.println("La nueva pensión es: S/. " + nuevapen);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error. Asegúrate de ingresar datos válidos.");
        } finally {
            input.close();
        }
    }

    // Función para obtener la pensión actual del estudiante según su categoría
    public static double obtenerPension(String categ) {
        double pens = 0;
        switch (categ) {
            case "AA1" -> pens = 750.00;
            case "AA2" -> pens = 655.00;
            case "BB1" -> pens = 420.00;
            case "CC1" -> pens = 350.50;
        }
        return pens;
    }

    public static double calcularDescuento(double promedio) {
        double prom = 0;
        if (promedio >= 18 && promedio <= 20) {
            prom = 14.02;
        } else if (promedio >= 15 && promedio < 18) {
            prom = 11.3;
        } else if (promedio >= 11 && promedio < 15) {
            prom = 7.5;
        } else if (promedio >= 0 && promedio < 11) {
            prom = 0.0;
        }
        return prom;
    }

    public static double calcularNuevaPension(double pensionac, double desc) {
        return pensionac * (1 - desc);
    }
}