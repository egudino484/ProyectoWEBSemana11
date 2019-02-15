/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.controlador;

import com.uisrael.facturacion.modelo.entidades.Factura;
import java.util.List;
/**
 *
 * @author hp
 */
public interface IFacturaControlador {
    
    public void insertarFactura(Factura factura) throws Exception ;

    public boolean actualizarFactura(Factura factura)throws Exception;

    public boolean eliminarFactura(int id)throws Exception;

    public List<Factura> getFacturas()throws Exception;

    public Factura getFactura(int id)throws Exception;

    public Factura getFacturaNumero(int numero)throws Exception;
}
