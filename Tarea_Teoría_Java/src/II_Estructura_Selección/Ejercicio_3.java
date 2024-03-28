/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package II_Estructura_Selección;
import javax.swing.JOptionPane;
public class Ejercicio_3 {
    
    public static void main(String[] args) {
        String cod = JOptionPane.showInputDialog(null,"Ingrese el código del artículo: (A100, A101, A102 o A103)");
        String code = cod.toUpperCase();
        String art = JOptionPane.showInputDialog(null,"Ingrese la cantidad de artículos comprados: ");
        int cantidad = Integer.parseInt(art);
        double unitPrice = 0;
        switch (code) {
            case "A100" -> unitPrice = 26.5;
            case "A101" -> unitPrice = 20.0;
            case "A102" -> unitPrice = 11.5;
            case "A103" -> unitPrice = 8.0;
            default -> JOptionPane.showMessageDialog(null,"Código de artículo no válido.");
        }
        double totalPrice = cantidad * unitPrice;
        double descuento = 0;
        if (cantidad >= 1 && cantidad <= 5) {
            descuento = totalPrice * 0.03;
        } else if (cantidad >= 6 && cantidad <= 10) {
            descuento = totalPrice * 0.045;
        } else if (cantidad >= 11 && cantidad <= 20) {
            descuento = totalPrice * 0.09;
        } else if (cantidad > 20) {
            descuento = totalPrice * 0.115;
        }
        double finalPrice = totalPrice - descuento;
        String ca = "";
        if (finalPrice > 200) {
            ca = "Calendario 2012 gigante";
        } else {
            ca = "Calendario de bolsillo";
        }
        JOptionPane.showMessageDialog(null,
                "Total a pagar: S/. " + String.format("%.2f", finalPrice) + "\n"
                + "Descuento: S/. " + String.format("%.2f", descuento) + "\n"
                + "Obsequio: " + ca+
                " Obsequio de la tienda");
    }
}
