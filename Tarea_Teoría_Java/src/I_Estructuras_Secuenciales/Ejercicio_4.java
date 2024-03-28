/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package I_Estructuras_Secuenciales;
import javax.swing.JOptionPane;

public class Ejercicio_4 {

   
    public static void main(String[] args) {
        double costoUnitario = 21.6;
        double descuento = 0.13;

        String cant = JOptionPane.showInputDialog("Ingrese la cantidad de productos adquiridos: ");
        int cantidad = Integer.parseInt(cant);

        double importeCompra = cantidad * costoUnitario;
        double importeDescuento = importeCompra * descuento;
        double importeAPagar = importeCompra - importeDescuento;

        int Lapiceros = cantidad / 5 * 3;

        JOptionPane.showMessageDialog(null,
                "Importe de la compra: S/. " + String.format("%.2f", importeCompra) + "\n"
                + "Importe del descuento: S/. " + String.format("%.2f", importeDescuento) + "\n"
                + "Importe a pagar: S/. " + String.format("%.2f", importeAPagar) + "\n"
                + "Cantidad de lapiceros de obsequio: " + Lapiceros+
                " Lapiceros de obsequio");
                

    }
    
}
