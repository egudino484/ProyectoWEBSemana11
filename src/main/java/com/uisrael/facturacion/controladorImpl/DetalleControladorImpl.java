/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.controladorImpl;

import com.uisrael.facturacion.controlador.IDetalleControlador;
import com.uisrael.facturacion.modelo.entidades.Detalle;
import com.uisrael.facturacion.modelo.DAOImpl.DetalleDAOImp;
import java.util.List;
import javax.persistence.Tuple;

/**
 *
 * @author Edison Gómez
 */
public class DetalleControladorImpl implements IDetalleControlador{
    
    @Override
    public void insertarDetalle(Detalle detalle) {
        try {
            DetalleDAOImp sql = new DetalleDAOImp(Detalle.class);
            sql.insertarDetalle(detalle);
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
        }
    }

    public List<Detalle> listarDetalle() {
        try {
            DetalleDAOImp sql = new DetalleDAOImp(Detalle.class);
            return sql.listarDetalle();
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
            return null;
        }
    }
    
    public List<Detalle> listarDetalleCQ() {
          try {
            DetalleDAOImp sql = new DetalleDAOImp(Detalle.class);
            return sql.listarDetalleCQ();
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
            return null;
        }
     }
     
     public List<Tuple> listarDetalleTuple() {
          try {
            DetalleDAOImp sql = new DetalleDAOImp(Detalle.class);
            return sql.listarDetalleTuple();
        } catch (Exception e) {

            System.err.println("ERROR:" + e);
            return null;
        }
     }
     
     public List<Detalle> listarDetalleTQ() {
          try {
            DetalleDAOImp sql = new DetalleDAOImp(Detalle.class);
            return sql.listarDetalleTQ();
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
            return null;
        }
     }

    @Override
    public boolean actualizarDetalle(Detalle detalle) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarDetalle(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Detalle> getDetalles() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detalle getDetalle(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detalle getDetalleDescripcion(String descripcion) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
