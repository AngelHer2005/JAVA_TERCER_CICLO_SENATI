/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sena.model;

import sena.entity.Items;
import sena.services.Comprobante;
import sena.util.Constante;

public class Boleta extends Comprobante{
    @Override
    public Items[] Documento(double total){
        double servicio = total * Constante.SERVICIO;
        double totalgeneral = total + servicio;
        Items[] doc = new Items[3];
        
        doc[0] = new Items("Total: ", total);
        doc[1] = new Items("Servicio: ", servicio);
        doc[2] = new Items("Total General: ", totalgeneral);
        
        return doc;        
    }
}
