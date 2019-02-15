/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.modelo.DAO;

import com.uisrael.facturacion.modelo.entidades.Factura;
import java.util.List;
/**
 *
 * @author hp
 */
public interface IFacturaDAO {
    
     public void insertarFactura(Factura factura);

    public boolean actualizarFactura(Factura factura);

    public boolean eliminarFactura(int id);

    public List<Factura> getFacturas();

    public Factura getFactura(int id);

    public Factura getFacturaNumero(int numero);
    
    public List<Factura> listarFactura();
    
}
