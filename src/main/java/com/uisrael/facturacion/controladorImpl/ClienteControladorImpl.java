/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.controladorImpl;

import com.uisrael.facturacion.controlador.IClienteControlador;
import com.uisrael.facturacion.modelo.DAO.IClienteDAO;
import com.uisrael.facturacion.modelo.entidades.Cliente;
import com.uisrael.facturacion.modelo.DAOImpl.ClienteDAOImp;
import java.util.List;
import javax.persistence.Tuple;

/**
 *
 * @author Edison Gómez
 */
public class ClienteControladorImpl implements IClienteControlador{
    
    @Override
    public void insertarCliente(Cliente cliente){
        try {
        IClienteDAO sql = new ClienteDAOImp(Cliente.class);
        sql.insertarCliente(cliente);
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
        }

    }
    
    public List<Cliente> listarCliente() {
        try {
          IClienteDAO sql = new ClienteDAOImp(Cliente.class);
          return sql.listarCliente();
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
            return null;
        }
    }
    
     public List<Cliente> listarClienteCQ() {
          try {
            ClienteDAOImp sql = new ClienteDAOImp(Cliente.class);
            return sql.listarClienteCQ();
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
            return null;
        }
     }
     
     public List<Tuple> listarClienteTuple() {
          try {
            ClienteDAOImp sql = new ClienteDAOImp(Cliente.class);
            return sql.listarClienteTuple();
        } catch (Exception e) {

            System.err.println("ERROR:" + e);
            return null;
        }
     }
     
     public List<Cliente> listarClienteTQ() {
          try {
            ClienteDAOImp sql = new ClienteDAOImp(Cliente.class);
            return sql.listarClienteTQ();
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
            return null;
        }
     }

    @Override
    public boolean actualizarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> getClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente getCliente(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente getClienteCI(String ci) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
