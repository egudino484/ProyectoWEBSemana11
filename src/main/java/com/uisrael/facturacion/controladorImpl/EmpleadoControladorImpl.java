/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.controladorImpl;

import com.uisrael.facturacion.controlador.IEmpleadoControlador;
import com.uisrael.facturacion.modelo.entidades.Empleado;
import com.uisrael.facturacion.modelo.DAOImpl.EmpleadoDAOImp;
import java.util.List;
import javax.persistence.Tuple;

/**
 *
 * @author Edison Gómez
 */
public class EmpleadoControladorImpl implements IEmpleadoControlador {

    @Override
    public void insertarEmpleado(Empleado empleado) {
        try {
            EmpleadoDAOImp sql = new EmpleadoDAOImp(Empleado.class);
            sql.insertarEmpleado(empleado);
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
        }

    }

    public List<Empleado> listarEmpleado() {
        try {
            EmpleadoDAOImp sql = new EmpleadoDAOImp(Empleado.class);
            return sql.listarEmpleado();
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
            return null;
        }
    }

    public List<Empleado> listarEmpleadoCQ() {
        try {
            EmpleadoDAOImp sql = new EmpleadoDAOImp(Empleado.class);
            return sql.listarEmpleadoCQ();
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
            return null;
        }
    }

    public List<Tuple> listarClienteTuple() {
        try {
            EmpleadoDAOImp sql = new EmpleadoDAOImp(Empleado.class);
            return sql.listarEmpleadoTuple();
        } catch (Exception e) {

            System.err.println("ERROR:" + e);
            return null;
        }
    }

    public List<Empleado> listarEmpleadoTQ() {
        try {
            EmpleadoDAOImp sql = new EmpleadoDAOImp(Empleado.class);
            return sql.listarEmpleadoTQ();
        } catch (Exception e) {
            System.err.println("ERROR:" + e);
            return null;
        }
    }

    @Override
    public boolean actualizarEmpleado(Empleado empleado) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarEmpleado(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Empleado> getEmpleados() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado getEmpleado(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado getEmpleadoNombre(String nombre) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
