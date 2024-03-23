/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_Animal;

import java.util.Random;
import javax.swing.JOptionPane;

public class Insecto extends Animal{
    private int n_patas;
    private boolean vuela;
    Random random = new Random();

    public Insecto(String n, char s, String t, double p, String alim, int pat, boolean v) {
        super(n, s, t, p, alim);
        n_patas = pat;
        vuela = v;
    }
    
    public void Comer(){
        JOptionPane.showMessageDialog(null, "El/la " + nombre + " está comiendo.");
    }
    
    public void Volar() {
        JOptionPane.showMessageDialog(null, "El/la " + nombre + " está volando.");  
    }
    
    public String Evento(){
        String[] evento = {"Alimento", "Pareja", "Refugio", "Depredador", "Nada"};
        double[] porcentajes = {0.3, 0.1, 0.15, 0.1, 0.35}; 
        double suma = 0;
        for (double i : porcentajes) {
            suma += i;
        }
        double numAl = random.nextDouble() * suma;

        String opcEle = null;
        double sumaPa = 0;
        for (int i = 0; i < evento.length; i++) {
            sumaPa += porcentajes[i];
            if (numAl < sumaPa) {
                opcEle = evento[i];
                break;
            }
        }
        return opcEle;
        
    }
    
    public void Navegacion(){
        int opcion = 0;
        boolean val = true;
        String[] dir = {"adelante", "atrás", "izquierda", "derecha"};
        JOptionPane.showMessageDialog(null, "                             Elegirás una opción para moverte (adelante, atrás, izquierda o derecha);\n"
                + "después de eso, habrán probabilidades de que te salga un evento aleatorio, ten suerte, mi amigo " + nombre + ".\n                                                                       (Puedes salir con 0)");
        
        while (val) {
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa una opción (adelante = 1, atrás = 2, izquierda = 3 o derecha = 4) \n(0 para salir)"));
                if(opcion == 0){
                    JOptionPane.showMessageDialog(null,"Saliendo...");
                    break;
                }else if(opcion > 0 && opcion < 5){
                    String event = Evento();
                    switch (event) {
                        case "Depredador" -> {
                            JOptionPane.showMessageDialog(null, "Fuiste " + dir[opcion-1] + "...\nTe tocó: " + event + ".\nLastimosamente, fuiste devorado por el depredador.");
                            val = !val;
                        }
                        case "Nada" -> JOptionPane.showMessageDialog(null, "Fuiste " + dir[opcion-1] + "...\nTe tocó: " + event + ".\nUps, suele pasar, je, je, je.");
                        case "Alimento" -> JOptionPane.showMessageDialog(null, "Fuiste " + dir[opcion-1] + "...\nTe tocó: " + event + ".\nSe ve riquísimo, provecho.");
                        case "Refugio" -> JOptionPane.showMessageDialog(null, "Fuiste " + dir[opcion-1] + "...\nTe tocó: " + event + ".\nYa tienes algo que no tengo yo :c.");
                        case "Pareja" -> JOptionPane.showMessageDialog(null, "Fuiste " + dir[opcion-1] + "...\nTe tocó: " + event + ".\nEncontró a su media naranja :D.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingresaste un valor incorrecto, ingresa de nuevo (1, 2, 3 o 4)");            
                }
            }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Se ingresó un valor no numérico, ingresa de nuevo.");
            }
            
        }
    }
    
    public void descripcion(){
        String msj = "";
        if(n_patas == 0){
            msj = "El/la " + nombre + " es de la especie de los Insectos.\nEs un animal sin patas"
                    + ", su sexo es " + sexo + ", es un insecto " + t_alim + ", es " + tamaño + 
                    " y su peso es de " + peso + " kg.";
        }else{
            msj = "El/la " + nombre + " es de la especie de los Insectos.\nCuenta con " + 
                n_patas + " patas, su sexo es " + sexo + ", es un insecto " + t_alim + ", es " + tamaño + 
                " y su peso es de " + peso + " kg.";
        }
        JOptionPane.showMessageDialog(null, msj);
    }
    
    
}
