/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_Animal;

import javax.swing.JOptionPane;

public class Reptil extends Animal{
    private int n_patas;
    public boolean camuflaje;
    
    public Reptil(String n, char s, String t, double p, String alim, int pat, boolean cam) {
        super(n, s, t, p, alim);
        n_patas = pat;
        camuflaje = cam;
    }
    
    public void Comer(){
        JOptionPane.showMessageDialog(null, "El/la " + nombre + " está comiendo.");
    }
    
    public void Camuflar(String cosa){
        JOptionPane.showMessageDialog(null, "El/la " + nombre + " se camufló en un/a" + cosa);
    }
    
    public void MudaPiel(){
        JOptionPane.showMessageDialog(null, "El/la " + nombre + " mudó de piel.");
    }
    
    public void descripcion(){
        String msj = "";
        if(n_patas == 0){
            msj = "El/la " + nombre + " es de la especie de los Reptiles.\nEs un animal sin patas"
                    + ", su sexo es " + sexo + ", es un animal " + t_alim + ", es " + tamaño + 
                    " y su peso es de " + peso + " kg.";
        }else{
            msj = "El/la " + nombre + " es de la especie de los Reptiles.\nCuenta con " + 
                n_patas + " patas, su sexo es " + sexo + ", es un animal " + t_alim + ", es " + tamaño + 
                " y su peso es de " + peso + " kg.";
        }
        JOptionPane.showMessageDialog(null, msj);
    }
    
}
