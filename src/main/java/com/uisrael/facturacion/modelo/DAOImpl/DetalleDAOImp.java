/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.modelo.DAOImpl;

import com.uisrael.facturacion.modelo.DAO.IDetalleDAO;
import com.uisrael.facturacion.modelo.entidades.Detalle;
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
public class DetalleDAOImp extends GenericDAO<Detalle> implements IDetalleDAO {

    public DetalleDAOImp(Class<Detalle> entiClass) {
        super(entiClass);
    }

    @Override
    public void insertarDetalle(Detalle detalle) {
        this.beginTransaction();
        this.create(detalle);
        this.commit();
        this.closeTransaction();
    }

    public List<Detalle> listarDetalle() {
        this.beginTransaction();
        List<Detalle> lista = this.findAll();
        this.closeTransaction();
        return lista;
    }

    public List<Detalle> listarDetalleCQ() {
        CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Detalle> d = cb.createQuery(Detalle.class);
        Root<Detalle> detalle = d.from(Detalle.class);
        d.select(detalle);
        return this.entityManager.createQuery(d).getResultList();
    }

    public List<Tuple> listarDetalleTuple() {
        CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Tuple> d = cb.createTupleQuery();
        Root<Detalle> detalle = d.from(Detalle.class);
        d.select(cb.tuple(detalle.get("idDetalle"), detalle.get("descripcion")));
        return this.entityManager.createQuery(d).getResultList();
    }

    public List<Detalle> listarDetalleTQ() {
        TypedQuery<Detalle> det = entityManager.createQuery("Select d.idDetalle, d.descripcion from Detalle d order by d.factura", Detalle.class);
        return det.getResultList();
    }//("Select f from Factura f order by f.cliente.apellido ",Factura.class )

    @Override
    public boolean actualizarDetalle(Detalle detalle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarDetalle(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Detalle> getDetalles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detalle getDetalle(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detalle getDetalleDescripcion(String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
