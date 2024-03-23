/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_Animal;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Ave extends Animal{
    private boolean vuela;
    
    public Ave(String n, char s, String t, double p, String alim, boolean v) {
        super(n, s, t, p, alim);
        vuela = v;
    }
    
    public void Comer(){
        JOptionPane.showMessageDialog(null, "El/la " + nombre + " está comiendo.");
    }
    
    public void Volar() {
        JOptionPane.showMessageDialog(null, "El/la " + nombre + " está volando.");  
    }
   
    public String Buscar(){
        String[] objeto = {"Ramas", "Basura", "Tierra"};
        String item = "";
        System.out.println();
        while (true) {
            try{
                int busc= Integer.parseInt(JOptionPane.showInputDialog("¿Qué buscarás?\n1. Ramas\n2. Basura\n3. Tierra\n0. Salir"));
                if (busc == 0) {
                    item = null;
                    break;
                }else if(busc < 4 && busc > 0) {
                    item = objeto[busc-1];
                    break;
                }
            }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Se ingresó un valor no numérico, ingresa de nuevo.");
            }
        }
            return item;
            
    }
    
    public void construirNidos() {
        JOptionPane.showMessageDialog(null,  "En este método, buscarás ítems para construir tu nido.\n                   (Coloca 0 si quieres parar)");
        String pregunta = "", msj = "";
        List<String> items = new ArrayList<>();
        items.add(Buscar());
        boolean val = true;
        if(items.get(0) == null){
            val = false;
        }else{
            val = true;
        }
        
        while(val) {
            pregunta = JOptionPane.showInputDialog("¿Quieres agregar algún otro material? (si/no)");
            if("si".equals(pregunta)){
                items.add(Buscar());
            }else if("no".equals(pregunta)){
                break;
            }else{
                JOptionPane.showMessageDialog(null, "Se presentó un error, ingrese de nuevo...");
            }
            for (String cadena : items) {
                if (cadena == null) {
                    val = false;
                    break;
                }
            }
        } 
        
        if(items.isEmpty()){
            msj = "Saliendo...";
        }else if(items.size() < 10){
            msj = "Vaya, hiciste un nido incompleto.";
        }else if(items.size() >10){
            msj =  "Vaya, hiciste un nido completo, pero pequeño.";
        }else if(items.size() >50){
            msj = "Hiciste un nido grande!!!";
        }
        JOptionPane.showMessageDialog(null, msj);
    }
   
    
    public void descripcion(){
        String msj = "El/la " + nombre + " es de la especie de las Aves.\n"
                + "Es bípedo, su sexo es " + sexo + ", es un animal " + t_alim + ", es " + tamaño + 
                " y su peso es de " + peso + " kg.";
        JOptionPane.showMessageDialog(null, msj);    
    }
}
