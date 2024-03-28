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
public class Ejercicio_3 {

    public static void main(String[] args) {
        /*
        La librería “Pelicano” ha puesto a la venta los 
        libros indicados en la siguiente tabla:
        */
        Scanner scanner = new Scanner(System.in);
        double excelente = 10.0, secreto7 = 9.0, espejo = 15.0;

        System.out.println("Ingrese el título del libro:\n1. El ser excelente \n2. El secreto de las 7 semillas \n3. El espejo del líder");
        int libro = scanner.nextInt();
        System.out.println("Ingrese la cantidad de unidades:");
        int cantidad = scanner.nextInt();
        System.out.println("Ingrese el método de pago (1: En sede central, 2: A domicilio):");
        int metodo = scanner.nextInt();

        double importe = 0.0;
        double precioU = 0.0;

        switch (libro) {
            case 1 -> precioU = excelente;
            case 2 -> precioU = secreto7;
            case 3 -> precioU = espejo;
            default -> {
                System.out.println("Libro no válido.");
                return;
            }
        }

        if (metodo == 2) {
            precioU = Math.round(((precioU * 1.03) * 100.0) / 100.0); 
        }

        importe = precioU * cantidad;

        System.out.println("Precio unitario por libro: $" + precioU);
        System.out.println("Importe total a pagar: $" + importe);
    
    }
    
}
