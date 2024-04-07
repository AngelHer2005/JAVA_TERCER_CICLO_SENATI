/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CÓDIGO;

import javax.swing.JOptionPane;

/**
 *
 * @author Alberto Arroyo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        1. Diseñe la Clase Empleado con los atributos públicos: codigo (int), nombre (String), horas
        trabajadas (int) y tarifa por hora (double).
        2. Crear los siguientes métodos en la clase “Empleado”:
        – Un método que retorne el sueldo bruto (horas*tarifa).
        – Un método que retorne el descuento (15% del sueldo bruto).
        – Un método que retorne el sueldo neto (sueldo bruto - descuento).
        3. Crear tres objetos a partir de la clase “Empleado”, asignarle datos y realizar los cálculos del
        sueldo.
        */
        Object[] empleados = {new Empleado(1, "Ángel", 40, 20.5),
                              new Empleado(2, "José", 50, 23.2),
                              new Empleado(3, "María", 45, 18)};
        StringBuilder msj = new StringBuilder();
        
        for (Object obj : empleados) {
            if (obj instanceof Empleado empleado) {
                msj.append("El empleado " + empleado.nombre + ", cuyo código es '" + empleado.codigo
                        + "' posee un sueldo bruto de S/. " + empleado.extraerSueldoBruto() + ", un descuento de S/. " +
                        empleado.extraerDescuento() + " y un sueldo neto de S/. " + empleado.extraerSueldoNeto() + ".\n");
            }
        }
        JOptionPane.showMessageDialog(null,
                                      msj,
                                      "Mensaje",
                                      JOptionPane.INFORMATION_MESSAGE);
    }
    
}
