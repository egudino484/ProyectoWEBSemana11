/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.controladorImpl;

import com.uisrael.facturacion.controlador.IPasswordControlador;
import com.uisrael.facturacion.modelo.entidades.Password;
import com.uisrael.facturacion.modelo.DAOImpl.PasswordDAOImp;
import java.util.List;
import javax.persistence.Tuple;

/**
 *
 * @author Edison Gómez
 */
public class PasswordControladorImpl implements IPasswordControlador{
    
    @Override
    public void insertarPassword(Password password) {
        try {
            PasswordDAOImp sql = new PasswordDAOImp(Password.class);
            sql.insertarPassword(password);
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
        }

    }
    
    public List<Password> listarPassword() {
        try {
            PasswordDAOImp sql = new PasswordDAOImp(Password.class);
            return sql.listarPassword();
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
            return null;
        }
    }
    
    
    public List<Password> listarPasswordCQ() {
          try {
            PasswordDAOImp sql = new PasswordDAOImp(Password.class);
            return sql.listarPasswordCQ();
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
            return null;
        }
     }
     
     public List<Tuple> listarPasswordTuple() {
          try {
            PasswordDAOImp sql = new PasswordDAOImp(Password.class);
            return sql.listarPasswordTuple();
        } catch (Exception e) {

            System.err.println("ERROR:" + e);
            return null;
        }
     }
     
     public List<Password> listarPasswordTQ() {
          try {
            PasswordDAOImp sql = new PasswordDAOImp(Password.class);
            return sql.listarPasswordTQ();
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
            return null;
        }
     }

    @Override
    public boolean actualizarPassword(Password password) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarPassword(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Password> getPasswords() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Password getPassword(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Password getPasswordPassword(String password) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
