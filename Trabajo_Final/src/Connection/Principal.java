/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) throws SQLException {
        Conexion conx = new Conexion();
        Connection conn = conx.getConexion();
        
        String consulta = "SELECT P.Nombre_PRO, P.pre_venta, P.stock, C.nombre_cat \n" +
                          "FROM PRODUCTO P\n" +
                          "INNER JOIN Categoria C ON P.IdCategoria = C.IdCategoria"; 
        
        StringBuilder resultados = conx.ejecutaStatement(consulta, conn, "PRODUCTO", "PRE VENTA", "STOCK", "CATEGORÍA");      
        String[] opciones = resultados.toString().split("\n");
 
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                null,
                "BBDD:",
                "Selecciona una opción:",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);
        
        if (opcionSeleccionada != null) {
            JOptionPane.showMessageDialog(null, opcionSeleccionada);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna opción.");
        }
        
    }
    
}
