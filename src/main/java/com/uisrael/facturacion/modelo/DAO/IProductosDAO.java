/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.modelo.DAO;

import com.uisrael.facturacion.modelo.entidades.Productos;
import java.util.List;

/**
 *
 * @author hp
 */
public interface IProductosDAO {
    
     public void insertarProductos(Productos productos);

    public boolean actualizarProductos(Productos productos);

    public boolean eliminarProductos(int id);

    public List<Productos> getProductoss();

    public Productos getProductos(int id);

    public Productos getProductosNombre(String nombre);
    
    public List<Productos> listarProductos();
    
}
