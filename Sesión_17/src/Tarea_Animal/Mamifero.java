/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_Animal;

import javax.swing.JOptionPane;

public class Mamifero extends Animal{
    private int n_patas;

    public Mamifero(String n, char s, String t, double p, String alim, int pat) {
        super(n, s, t, p, alim);
        n_patas = pat;        
    }
    
    public void Comer(){
        JOptionPane.showMessageDialog(null, "El/la " + nombre + " está comiendo.");
    }
    
    public void rugir(){
        JOptionPane.showMessageDialog(null, "El " + nombre + " está rugiendo.");
    }
    
    public void descripcion(){
        String msj = "";
        if(n_patas == 0){
            msj = "El/la " + nombre + " es de la especie de los Mamíferos.\nEs un animal sin patas"
                    + ", su sexo es " + sexo + ", es un animal " + t_alim + ", es " + tamaño + 
                    " y su peso es de " + peso + " kg.";
        }else{
            msj = "El/la " + nombre + " es de la especie de los Mamíferos.\nCuenta con " + 
                n_patas + " patas, su sexo es " + sexo + ", es un animal " + t_alim + ", es " + tamaño + 
                " y su peso es de " + peso + " kg.";
        }
        JOptionPane.showMessageDialog(null, msj);
    }
}