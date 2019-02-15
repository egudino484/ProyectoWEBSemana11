/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.modelo.DAO;

import com.uisrael.facturacion.modelo.entidades.Empleado;
import java.util.List;

/**
 *
 * @author master
 */
public interface IEmpleadoDAO {

    public void insertarEmpleado(Empleado empleado);

    public boolean actualizarEmpleado(Empleado empleado);

    public boolean eliminarEmpleado(int id);

    public List<Empleado> getEmpleados();

    public Empleado getEmpleado(int id);

    public Empleado getEmpleadoNombre(String nombre);

    public List<Empleado> listarEmpleado();

}
