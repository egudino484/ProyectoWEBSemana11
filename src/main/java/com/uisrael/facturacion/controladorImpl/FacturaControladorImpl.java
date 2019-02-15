/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.controladorImpl;

import com.uisrael.facturacion.controlador.IFacturaControlador;
import com.uisrael.facturacion.modelo.entidades.Factura;
import com.uisrael.facturacion.modelo.DAOImpl.FacturaDAOImp;
import java.util.List;
import javax.persistence.Tuple;

/**
 *
 * @author Edison Gómez
 */
public class FacturaControladorImpl implements IFacturaControlador {
    
    @Override
    public void insertarFactura(Factura factura) {
        try {
            FacturaDAOImp sql = new FacturaDAOImp(Factura.class);
            sql.insertarFactura(factura);
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
        }
    }
    
    public List<Factura> listarFactura() {
        try {
            FacturaDAOImp sql = new FacturaDAOImp(Factura.class);
            return sql.listarFactura();
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
            return null;
        }
    }
    
    
    public List<Factura> listarFacturaCQ() {
          try {
            FacturaDAOImp sql = new FacturaDAOImp(Factura.class);
            return sql.listarFacturaCQ();
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
            return null;
        }
     }
     
     public List<Tuple> listarClienteTuple() {
          try {
            FacturaDAOImp sql = new FacturaDAOImp(Factura.class);
            return sql.listarFacturaTuple();
        } catch (Exception e) {

            System.err.println("ERROR:" + e);
            return null;
        }
     }
    
    
     public List<Factura> listarFacturaTQ() {
          try {
            FacturaDAOImp sqltq = new FacturaDAOImp(Factura.class);
            return sqltq.listarFacturaTQ();
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
            return null;
        }
     }
      public List<Factura> listarFacturasBimestral() {
          try {
            FacturaDAOImp sqltq = new FacturaDAOImp(Factura.class);
            return sqltq.listarFacturasBimestral();
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
            return null;
        }
     }
     

    @Override
    public boolean actualizarFactura(Factura factura) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarFactura(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Factura> getFacturas() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Factura getFactura(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Factura getFacturaNumero(int numero) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
