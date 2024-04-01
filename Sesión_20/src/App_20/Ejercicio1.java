
package App_20;

import javax.swing.JOptionPane;
import java.text.NumberFormat;
public class Ejercicio1 {
  
    public static void main(String[] args) {
        
        //
        Producto objProducto=new Producto();
        objProducto.Producto("001","Licuadora","Simple",195);
        /*        
        objProducto.Producto();
        */
        objProducto.calcularprecioVenta();
        
        NumberFormat formato=NumberFormat.getNumberInstance();
        formato.setMinimumFractionDigits(2);
        JOptionPane.showMessageDialog(null,"Codigo:"+objProducto.getCodigoProd()
                +"\nNombre:"+objProducto.getNombreProd()
                +"\nTipo de Traslado:"
                +objProducto.getTipoTrasladoProd()
                +"\nPrecio Costo:"
                +formato.format(objProducto.getPrecioCostoProd())
                +"\nPrecio Venta:"+formato.format(objProducto.getPrecioVentaProd()));
    }
    
}
