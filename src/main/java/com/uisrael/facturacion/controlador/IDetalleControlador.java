/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.controlador;

import com.uisrael.facturacion.modelo.entidades.Detalle;
import java.util.List;
/**
 *
 * @author hp
 */
public interface IDetalleControlador {
    
    
    public void insertarDetalle(Detalle detalle) throws Exception ;

    public boolean actualizarDetalle(Detalle detalle)throws Exception;

    public boolean eliminarDetalle(int id)throws Exception;

    public List<Detalle> getDetalles()throws Exception;

    public Detalle getDetalle(int id)throws Exception;

    public Detalle getDetalleDescripcion(String descripcion)throws Exception;
    
}
