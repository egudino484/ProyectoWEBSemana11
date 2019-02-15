/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.modelo.DAO;

import com.uisrael.facturacion.modelo.entidades.Detalle;
import java.util.List;
/**
 *
 * @author master
 */
public interface IDetalleDAO {
    
     public void insertarDetalle(Detalle detalle);

    public boolean actualizarDetalle(Detalle detalle);

    public boolean eliminarDetalle(int id);

    public List<Detalle> getDetalles();

    public Detalle getDetalle(int id);

    public Detalle getDetalleDescripcion(String descripcion);
    
    public List<Detalle> listarDetalle();
}
