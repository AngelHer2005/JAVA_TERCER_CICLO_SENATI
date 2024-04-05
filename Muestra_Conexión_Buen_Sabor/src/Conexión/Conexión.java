/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexión;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alberto Arroyo
 */
public class Conexión {
    private final String USUARIO = "buen_sabor";
    private final String CONTRASEÑA = "1234";
    private final String URLCONEXION = "jdbc:sqlserver://DESKTOP-STBFGEG\\MSSQL:1433;databaseName=PROYECTO_BUENSABOR;encrypt=true;trustServerCertificate=true;";
    private Connection conexion;
    Statement stm;
    ResultSet rs;
    
    public Connection getConexion() throws SQLException{
        try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
        conexion = DriverManager.getConnection(URLCONEXION, USUARIO, CONTRASEÑA);
        } catch (ClassNotFoundException c) {
            System.out.println("Error al conectarse a la base de datos " + c);
        }
    return conexion;
    }
    
    public ArrayList<Object[]> ejecutaStatement(String query, Connection conexion, String... columnas) throws SQLException {
        ArrayList<Object[]> registros = new ArrayList<>();
        try {
            stm = conexion.createStatement();
            rs = stm.executeQuery(query);
                        
            while (rs.next()) {
                    String[] fila = new String[columnas.length];
                    for (int i = 0; i < columnas.length; i++) {
                        fila[i] = rs.getString(i + 1);
                    }
                    registros.add(fila);
                }
            return registros;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error: " + e);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null,"Error: " + e);
                }
            }
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null,"Error: " + e);
                }
            }
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null,"Error: " + e);
                }
            }
        }
        return null;
    }
}
