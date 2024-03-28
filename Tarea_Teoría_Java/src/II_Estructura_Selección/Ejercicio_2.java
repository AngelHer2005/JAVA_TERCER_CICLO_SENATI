/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package II_Estructura_Selección;
import javax.swing.JOptionPane;
public class Ejercicio_2 {

    public static void main(String[] args) {
        String tarj = JOptionPane.showInputDialog(null, "Ingrese el número de la tarjeta: ");
        int tarjeta = Integer.parseInt(tarj);
        String comp = JOptionPane.showInputDialog(null, "Ingrese el importe de la compra: ");
        double compra = Double.parseDouble(comp);
        double descuento = 0;
        if (tarjeta >= 250 && tarjeta % 2 == 0) {
            descuento = compra * 0.11;
        } else {
            descuento = compra * 0.03;
        }
        double pago = compra - descuento;

        JOptionPane.showMessageDialog(null,"El importe a pagar es: "+ compra + "\n"+
                " Descuento: S/. " + String.format("%.2f", descuento) + "\n"
                + "Importe a pagar con descuento: S/. " + String.format("%.2f", pago)
                + " Descuento por tarjeta");
    }

}
