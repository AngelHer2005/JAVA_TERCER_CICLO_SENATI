package App_20;

public class Producto {
    //atributos
    private String codigoProd;
    private String nombreProd;
    private String tipoTrasladoProd;
    private double precioCostoProd;
    private double precioVentaProd;

    public void Producto(String pCodigoProd, String pNombreProd, String TipoTraslado, double pPrecioCostoProd) {
        codigoProd = pCodigoProd;
        nombreProd = pNombreProd;
        tipoTrasladoProd = TipoTraslado;
        precioCostoProd = pPrecioCostoProd;
        precioVentaProd = 0;
    }
    
    public void Producto(String pCodigoProd) {
        codigoProd = pCodigoProd;
        nombreProd = null;
        tipoTrasladoProd = null;
        precioCostoProd = 0;
        precioVentaProd = 0;
   }
    public String getCodigoProd() {
        return codigoProd;
    }

    public void setCodigoProd(String pCodigoProd) {
        codigoProd = pCodigoProd;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String pNombreProd) {
        nombreProd = pNombreProd;
    }

    public String getTipoTrasladoProd() {
        return tipoTrasladoProd;
    }

    public void setTipoTrasladoProd(String pNombreProd) {
        tipoTrasladoProd = pNombreProd;
    }

    public double getPrecioCostoProd() {
        return precioCostoProd;
    }

    public void setPrecioCostoProd(double pNombreProd) {
        precioCostoProd = pNombreProd;
    }

    public double getPrecioVentaProd() {
        return precioVentaProd;
    }
    
    public void calcularprecioVenta() {
        if (tipoTrasladoProd.equalsIgnoreCase("SIMPLE")) 
            precioVentaProd = precioCostoProd * 1.35;
         else if (tipoTrasladoProd.equalsIgnoreCase("COMPLEJO")) 
            precioVentaProd = precioCostoProd * 1.65;
         else 
            precioVentaProd = precioCostoProd * 1.95;
        
    }

}
