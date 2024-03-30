/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App_20;

public class Producto {
    //atributos
    private String codigoProd;
    private String nombreProd;
    private String tipoTrasladoProd;
    private double precioCostoProd;
    double precioVentaProd;
    
    /*
    public void Producto(String pcodigoProd){
        codigoProd=pcodigoProd;
        nombreProd=null;
        tipoTrasladoProd = null;
        precioCostoProd = 0;
        precioVentaProd = 0;
    }
    */
    public Producto(String pCodigoProd, String pNombreProd, String pTipoTrasladoProd, double pPrecioCostoProd) {
        codigoProd = pCodigoProd;
        nombreProd = pNombreProd;
        tipoTrasladoProd = pTipoTrasladoProd;
        precioCostoProd = pPrecioCostoProd;
        precioVentaProd = 0;
    }
    
     public Producto(String pCodigoProd) {
        codigoProd = pCodigoProd;
        nombreProd = null;
        tipoTrasladoProd = null;
        precioCostoProd = 0;
        precioVentaProd = 0;
    }
    
    //valores defecto
     /*
    public void Producto(){
        codigoProd = "";
        nombreProd="";
        tipoTrasladoProd = "";
        precioCostoProd = 0;
        precioVentaProd = 0;
    }
     */
    //métodos

    public String getCodigoProd() {
        return codigoProd;
    }

    public void setCodigoProd(String pcodigoProd) {
        codigoProd = pcodigoProd;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String pnombreProd) {
        nombreProd = pnombreProd;
    }

    public String getTipoTrasladoProd() {
        return tipoTrasladoProd;
    }

    public void setTipoTrasladoProd(String ptipoTrasladoProd) {
        tipoTrasladoProd = ptipoTrasladoProd;
    }

    public double getPrecioCostoProd() {
        return precioCostoProd;
    }

    public void setPrecioCostoProd(double pprecioCostoProd) {
        precioCostoProd = pprecioCostoProd;
    }
    //Personalizo
    /*
    public double getPrecioVentaProd() {
        return precioVentaProd;
    }
    */
    public void calcularprecioVenta(){
        if (tipoTrasladoProd.equalsIgnoreCase("SIMPLE")) {
            precioVentaProd=precioCostoProd*1.35;
        }else if (tipoTrasladoProd.equalsIgnoreCase("COMPLEJO")) {
            precioVentaProd=precioCostoProd*1.65;
        }else{
            precioVentaProd=precioCostoProd*1.95;
        }
    }

}
