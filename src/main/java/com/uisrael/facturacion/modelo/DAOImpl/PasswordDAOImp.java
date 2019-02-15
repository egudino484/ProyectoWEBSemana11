/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.modelo.DAOImpl;

import com.uisrael.facturacion.modelo.DAO.IPasswordDAO;
import com.uisrael.facturacion.modelo.entidades.Password;
import java.util.List;
import javax.persistence.Tuple;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Edison Gómez
 */
public class PasswordDAOImp extends GenericDAO<Password> implements IPasswordDAO{
    
    public PasswordDAOImp (Class<Password> entiClass){
        super (entiClass);
    }
   
    
    @Override
    public void insertarPassword (Password password){
        this.beginTransaction();
        this.create(password);
        this.commit();
        this.closeTransaction();       
    }
    
    public List<Password> listarPassword(){
        this.beginTransaction();
        List<Password> lista = this.findAll();
        this.closeTransaction();
        return lista;        
    }
    
    
       public List<Password> listarPasswordCQ() {
        CriteriaBuilder cb= this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Password> p = cb.createQuery(Password.class) ;
        Root<Password> password= p.from(Password.class);
        p.select(password);
        return this.entityManager.createQuery(p).getResultList();
    }
    
    public List<Tuple> listarPasswordTuple() {
        CriteriaBuilder cb= this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Tuple> p = cb.createTupleQuery();
        Root<Password> password= p.from(Password.class);
        p.select(cb.tuple(password.get("idPassword"), password.get("password")));
        return this.entityManager.createQuery(p).getResultList();
    }
    public List<Password> listarPasswordTQ() {
        TypedQuery<Password> pwd= entityManager.createQuery("Select p.idPassword, p.password from Password p",Password.class );
        return  pwd.getResultList();
    }
    
    
    @Override
    public boolean actualizarPassword(Password password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarPassword(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Password> getPasswords() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Password getPassword(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Password getPasswordPassword(String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
