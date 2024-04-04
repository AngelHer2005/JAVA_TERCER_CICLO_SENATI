/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sena.model;

import sena.entity.Items;
import sena.services.Comprobante;
import sena.util.Constante;

/**
 *
 * @author Academico
 */
public class Factura extends Comprobante{
    @Override
    public Items[] Documento(double total){
        double consumo = Math.round(((total / (1 + Constante.IGV))*100.0)/100.0);
        double impuesto = total - consumo;
        double servicio = Math.round(((total * Constante.SERVICIO)*100.0)/100.0);
        double totalgeneral = total + servicio;
        
        Items doc[]=new Items[5];
        doc[0]=new Items ("consumo:",consumo);
        doc[1]=new Items("impuesto(10%)",impuesto);
        doc[2]=new Items("total",total);
        doc[3]=new Items("servicio(10%)",servicio);
        doc[4]=new Items("total general",totalgeneral);
        return doc;
    }
}
