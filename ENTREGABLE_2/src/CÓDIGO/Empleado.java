/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CÓDIGO;

/**
 *
 * @author Alberto Arroyo
 */
public class Empleado {
    public int codigo;
    public String nombre;
    public int horas_T;
    public double tarifa_H;

    public Empleado(int codigo, String nombre, int horas_T, double tarifa_H) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horas_T = horas_T;
        this.tarifa_H = tarifa_H;
    }

    public double extraerSueldoBruto(){
        double sueldo_B = horas_T * tarifa_H;
        return sueldo_B;
    }
    
    public double extraerDescuento(){
        double descuento = extraerSueldoBruto() * 0.15;
        return descuento;
    }
    
    public double extraerSueldoNeto(){
        double sueldo_N = extraerSueldoBruto() - extraerDescuento();
        return sueldo_N;
    }
    
}
