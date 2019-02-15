/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.controlador;


import com.uisrael.facturacion.modelo.entidades.Productos;
import java.util.List;
/**
 *
 * @author hp
 */
public interface IProductosControlador {
    
    public void insertarProductos(Productos productos) throws Exception ;

    public boolean actualizarProductos(Productos productos)throws Exception;

    public boolean eliminarProductos(int id)throws Exception;

    public List<Productos> getProductoss()throws Exception;

    public Productos getProductos(int id)throws Exception;

    public Productos getProductosNombre(String nombre)throws Exception;
    
}
