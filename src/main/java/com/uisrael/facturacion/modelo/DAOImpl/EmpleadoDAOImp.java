/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.modelo.DAOImpl;

import com.uisrael.facturacion.modelo.DAO.IEmpleadoDAO;
import com.uisrael.facturacion.modelo.entidades.Empleado;
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
public class EmpleadoDAOImp extends GenericDAO<Empleado> implements IEmpleadoDAO {

    public EmpleadoDAOImp(Class<Empleado> entiClass) {
        super(entiClass);
    }

    @Override
    public void insertarEmpleado(Empleado empleado) {
        this.beginTransaction();
        this.create(empleado);
        this.commit();
        this.closeTransaction();
    }

    public List<Empleado> listarEmpleado() {
        this.beginTransaction();
        List<Empleado> lista = this.findAll();
        this.closeTransaction();
        return lista;
    }

    public List<Empleado> listarEmpleadoCQ() {
        CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Empleado> e = cb.createQuery(Empleado.class);
        Root<Empleado> empleado = e.from(Empleado.class);
        e.select(empleado);
        return this.entityManager.createQuery(e).getResultList();
    }

    public List<Tuple> listarEmpleadoTuple() {
        CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Tuple> e = cb.createTupleQuery();
        Root<Empleado> empleado = e.from(Empleado.class);
        e.select(cb.tuple(empleado.get("idEmpleado"), empleado.get("nombre")));
        return this.entityManager.createQuery(e).getResultList();
    }

    public List<Empleado> listarEmpleadoTQ() {
        TypedQuery<Empleado> emp = entityManager.createQuery("Select e.idEmpleado, e.nombre from Empleado e", Empleado.class);
        return emp.getResultList();
    }

    @Override
    public boolean actualizarEmpleado(Empleado empleado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarEmpleado(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Empleado> getEmpleados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado getEmpleado(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado getEmpleadoNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
