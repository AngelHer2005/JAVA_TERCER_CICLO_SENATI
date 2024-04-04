/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sena.controller;

import sena.model.*;
import sena.services.Comprobante;
import sena.util.Constante;

public class ComprobanteController {
    public static Comprobante crearDocumento(int tipo){
        Comprobante com = null;
        
        switch (tipo) {
            case Constante.FACTURA -> com = new Factura();
                
            case Constante.BOLETA -> com = new Boleta();

        }
        return com;
    }
}
