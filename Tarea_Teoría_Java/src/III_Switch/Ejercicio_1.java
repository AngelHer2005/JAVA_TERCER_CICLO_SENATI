/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package III_Switch;

import java.util.Scanner;

/**
 *
 * @author Alberto Arroyo
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        /*
        La FPF vende entradas al estadio para el encuentro Perú vs Chile a los precios unitarios
        dados en la siguiente tabla:
        Diseñe un programa que determine el importe a pagar por la compra de cierta cantidad de
        entradas a una misma tribuna.
        */
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese la tribuna (Norte, Sur, Oriente Lateral, Oriente Medio, Occidente):");
        String tribuna = input.nextLine().toLowerCase();

        double precioUnitario;
        switch (tribuna) {
            case "norte", "sur" -> precioUnitario = 40.0;
            case "oriente lateral" -> precioUnitario = 80.0;
            case "oriente medio" -> precioUnitario = 120.0;
            case "occidente" -> precioUnitario = 300.0;
            default -> {
                System.out.println("Tribuna no válida. Se asignará un precio de S/. 0.0");
                precioUnitario = 0.0;
            }
        }

        System.out.println("Ingrese la cantidad de entradas:");
        int cantidad = input.nextInt();

        double importeTotal = precioUnitario * cantidad;

        System.out.println("El importe total a pagar es: S/." + importeTotal);

        input.close();

    }
    
}
