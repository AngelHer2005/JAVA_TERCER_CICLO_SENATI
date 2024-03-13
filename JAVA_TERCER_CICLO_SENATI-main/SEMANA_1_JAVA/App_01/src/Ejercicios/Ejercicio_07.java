/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Academico
 */
public class Ejercicio_07 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in); String nom, apell; double sbasic,incre,ns;
        System.out.println("La hora y fecla del sistema es: ");
        System.out.println(new Date());
        
        System.out.println("Ingrese nombre del trabajador: ");
        nom=input.nextLine();
        System.out.println("Ingrese apellidos del trabajador: ");
        apell=input.nextLine();
        System.out.println("Ingrese sueldo básico del trabajador: ");
        sbasic=input.nextInt();
        incre=sbasic*0.18;
        System.out.println("El nuevo sueldo del trabajador es: "+(sbasic+incre));
        input.close();
    }
    
}
