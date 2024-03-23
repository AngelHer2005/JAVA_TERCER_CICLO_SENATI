/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

public class Cliente extends Persona{
    private String categoria;
    private String codigo;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String ca) {
        categoria = ca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String cod) {
        codigo = cod;
    }
    
    public String generarCodigo() {
        return "El código del cliente es: " + codigo;
    }
    
}
