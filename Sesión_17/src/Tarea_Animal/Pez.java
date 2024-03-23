/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_Animal;

import javax.swing.JOptionPane;

public class Pez extends Animal{
    private int n_aletas;

    public Pez(String n, char s, String t, double p, String alim, int al) {
        super(n, s, t, p, alim);
        n_aletas = al;
    }
    
    public void Comer(){
        JOptionPane.showMessageDialog(null, "El/la " + nombre + " está comiendo.");
    }
    
    public void Nadar(){
        JOptionPane.showMessageDialog(null, "El/la " + nombre + " está nadando.");
    }
    
    public void Desovar(){
        JOptionPane.showMessageDialog(null, "El/la " + nombre + " está liberando sus huevos.");
    }
    
    public void descripcion(){
        String msj = "El animal " + nombre + " es de la especie de los Peces.\n"
                + "Cuenta con " + n_aletas + " aletas, su sexo es " + sexo + ", es un animal " + t_alim + ", es " + tamaño + 
                " y su peso es de " + peso + " kg.";
        JOptionPane.showMessageDialog(null, msj);
    }    
}
