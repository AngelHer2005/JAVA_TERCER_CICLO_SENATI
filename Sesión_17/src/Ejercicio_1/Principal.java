/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_1;

import Ejercicio_1.Coche;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
        Coche c1=new Coche();
        c1.setModelo("Van Toyota Hiace");
        c1.setVelocidad(90.2);
        c1.setNombre("Escolar");
        
        c1.mostraMensaje();
        
        Coche c2 = new Coche();
        c2.setModelo("Toyota Coaster");
        c2.setVelocidad(90);
        c2.setNombre("Transport Pepito");
        
        c2.mostraMensaje();
        
        System.out.println("Coche 1:\nModelo: " + c1.getModelo() + "\nVelocidad: " + c1.getVelocidad() + "\nNombre: " + c1.getNombre() + "\n");
        
        System.out.println("Coche 2:\nModelo: " + c2.getModelo() + "\nVelocidad: " + c2.getVelocidad() + "\nNombre: " + c2.getNombre());
        
        JOptionPane.showMessageDialog(null, "Coche 1:\nModelo: " + c1.getModelo() + "\nVelocidad: " + c1.getVelocidad() + "\nNombre: " + c1.getNombre() + "\n");
        JOptionPane.showMessageDialog(null, "Coche 2:\nModelo: " + c2.getModelo() + "\nVelocidad: " + c2.getVelocidad() + "\nNombre: " + c2.getNombre());


    }
    
}
