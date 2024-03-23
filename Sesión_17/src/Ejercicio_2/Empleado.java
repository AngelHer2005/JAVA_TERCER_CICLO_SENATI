/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

public class Empleado extends Persona{
    private String t_contrato;
    private double sueldo;

    public String getT_contrato() {
        return t_contrato;
    }

    public void setT_contrato(String t_c) {
        t_contrato = t_c;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double s) {
        sueldo = s;
    }
    
    public String calcular_Sueldo() {

        return "El sueldo del empleado "+ nombre + " " + apellido + ", es de S/. " + Double.toString(sueldo);
    }

    
    
}
