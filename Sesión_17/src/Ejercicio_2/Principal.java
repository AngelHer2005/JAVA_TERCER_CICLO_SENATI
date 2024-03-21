/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_2;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
       
        Cliente c1 = new Cliente();
        c1.setNombre("Ángel Hernán Alberto");
        c1.setApellido("Patricio Arroyo");
        c1.setEdad(18);
        c1.setN_documento("74307947");
        c1.setTipo("Adulto");
        c1.setCategoria("Activo");
        c1.setCodigo("001");
        
        Empleado e1 = new Empleado();
        e1.setNombre("Fabiano Alessandro");
        e1.setApellido("Belladoni Portal");
        e1.setEdad(18);
        e1.setN_documento("99521353");
        e1.setTipo("Adulto");
        e1.setT_contrato("Ayudante");
        e1.setSueldo(1000.0);
        
        JOptionPane.showMessageDialog(null, "Cliente 1: \nNombre: " + c1.getNombre() + "\nApellido: " + c1.getApellido() + "\nEdad: " + c1.getEdad() + "\nDocumento: " + c1.getN_documento() + "\nTipo: " + c1.getTipo() + "\nCategoría: " + c1.getCategoria() + "\nCódigo: " + c1.getCodigo() + "\nUso del método GenerarCódigo(): " + c1.generarCodigo());
        
        JOptionPane.showMessageDialog(null,"Cliente 1: \nNombre: " + e1.getNombre() + "\nApellido: " + e1.getApellido() + "\nEdad: " + e1.getEdad() + "\nDocumento: " + e1.getN_documento() + "\nTipo: " + e1.getTipo() + "\nTipo Contrato: " + e1.getT_contrato() + "\nSueldo" + Double.toString(e1.getSueldo()) + "\nUso del método calcular Sueldo(): " + e1.calcular_Sueldo());
        


    }
    
}
