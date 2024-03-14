/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sesion_13;

import java.util.Calendar;

public class Ejercicio_06 {

    public static void main(String[] args) {
        char c = 'd';
        switch (c) {
            case 'a':
            case 'b':
            case 'c':
                System.out.println("a, b o c");
                break;
            case 'd':
                System.out.println("d");
            case 'e':
                System.out.println("d o e!!");
                break;
            
        }
            Integer dia=Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
            switch (dia) {
                case 1 -> System.out.println("Domingo");
                case 2 -> System.out.println("Lunes");
                case 3 -> System.out.println("Martes");
                case 4 -> System.out.println("Miércoles");
                case 5 -> System.out.println("Jueves");
                case 6 -> System.out.println("Viernes");
        }
        switch (dia) {
            case 2, 3, 4, 5, 6 -> System.out.println("Día laboral");
            case 1, 7 -> System.out.println("Fin de Semana");
            default -> System.out.println("La semana solo tiene 7 días.");
                
        }
    }   
    
}
