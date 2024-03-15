/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio_03_forma_2 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
      int nEntero=in.nextInt();
      String[]nombres={"unidades","decenas","centenas"};
        System.out.println("Escribe un número: ");
        
      int cd=contarDigito(nEntero);
      
      if(cd<=4){
          separar(nEntero,nombres);
      }else{
          System.out.println("Error!!");}
      in.close();
      
    }

    private static int contarDigito(int nEntero) {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(nEntero<10){
            return 1;
        }else{    
            return 1+contarDigito(nEntero%10);
        }
    }

    private static void separar(int nEntero, String[] nombres) {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("El número esta"+nEntero+"compuesto por:");
        int j=0;
        while(nEntero>0){
            System.out.println((nEntero%10)+""+nombres[j]);
            nEntero=nEntero/10;
            j++;
        }
        
    }
    
}
