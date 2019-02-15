/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.controladorImpl;

import com.uisrael.facturacion.controlador.IProductosControlador;
import com.uisrael.facturacion.modelo.entidades.Productos;
import com.uisrael.facturacion.modelo.DAOImpl.ProductosDAOImp;
import java.util.List;
import javax.persistence.Tuple;

/**
 *
 * @author Edison Gómez
 */
public class ProductosControladorImpl implements IProductosControlador{

    @Override
    public void insertarProductos(Productos productos) {
        try {
            ProductosDAOImp sql = new ProductosDAOImp(Productos.class);
            sql.insertarProductos(productos);
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
        }

    }
    
    public List<Productos> listarProductos() {
        try {
            ProductosDAOImp sql = new ProductosDAOImp(Productos.class);
            return sql.listarProductos();
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
            return null;
        }
    } 
    
    public List<Productos> listarProductosCQ() {
          try {
            ProductosDAOImp sql = new ProductosDAOImp(Productos.class);
            return sql.listarProductosCQ();
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
            return null;
        }
     }
     
     public List<Tuple> listarProductosTuple() {
          try {
            ProductosDAOImp sql = new ProductosDAOImp(Productos.class);
            return sql.listarProductosTuple();
        } catch (Exception e) {

            System.err.println("ERROR:" + e);
            return null;
        }
     }
     
     public List<Productos> listarProductosTQ() {
          try {
            ProductosDAOImp sql = new ProductosDAOImp(Productos.class);
            return sql.listarProductosTQ();
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
            return null;
        }
     }

    @Override
    public boolean actualizarProductos(Productos productos) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarProductos(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Productos> getProductoss() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Productos getProductos(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Productos getProductosNombre(String nombre) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
