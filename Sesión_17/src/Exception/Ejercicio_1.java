/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exception;

import javax.swing.JOptionPane;

public class Ejercicio_1 {

    public static void main(String[] args) {
        try{
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un número: "));
            int m = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un número: "));
            int r = n/m;
            System.out.println("Resultado: " + r);
        }catch(ArithmeticException e){
            System.out.println("Error!\n"+e.getMessage());
        }catch(IllegalArgumentException el){
            System.out.println("Error2:\n" + el.getMessage());
        }catch(Exception ex){
            System.out.println("Error3:\n" + ex.getMessage());
        }finally{
            System.out.println("Fin del Programa.");
        }
        System.out.println("Chau...");


    }
    
}
