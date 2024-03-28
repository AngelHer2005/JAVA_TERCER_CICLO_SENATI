/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package I_Estructuras_Secuenciales;

import javax.swing.JOptionPane;

public class Ejercicio_1 {

    public static void main(String[] args) {
        String base, altura;

        base = JOptionPane.showInputDialog("Ingresa la base de un rectángulo: ");
        double b = Double.parseDouble(base);

        altura = JOptionPane.showInputDialog("Ingresa la altura de un rectángulo: ");
        double h = Double.parseDouble(altura);
        double area = b * h;
        double perimetro = 2 * (b + h);

        JOptionPane.showMessageDialog(null, "El área de un rectángulo es: " + area + "\nEl perímetro de un rectángulo es: "
                + "" + perimetro);

    }
}
