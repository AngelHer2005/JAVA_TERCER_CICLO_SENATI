/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App_20;

import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Producto objProducto = new Producto("001", "Licuadora", "Simple", 195);
        objProducto.calcularprecioVenta();
        NumberFormat formato  = NumberFormat.getNumberInstance();
        formato.setMinimumFractionDigits(2);
        JOptionPane.showMessageDialog(null,"Código: "+objProducto.getCodigoProd()+
                "\nNombre: " + objProducto.getNombreProd()
                +"\nTipo de Traslado: " + objProducto.getTipoTrasladoProd()
                +"\nPrecio Costo: " +formato.format(objProducto.getPrecioCostoProd())
                +"\nPrecio Venta: "+objProducto.precioVentaProd);

    }
    
}
