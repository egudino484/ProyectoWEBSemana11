/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.controlador;

import com.uisrael.facturacion.modelo.entidades.Empleado;
import java.util.List;

/**
 *
 * @author hp
 */
public interface IEmpleadoControlador {

    public void insertarEmpleado(Empleado empleado) throws Exception;

    public boolean actualizarEmpleado(Empleado empleado) throws Exception;

    public boolean eliminarEmpleado(int id) throws Exception;

    public List<Empleado> getEmpleados() throws Exception;

    public Empleado getEmpleado(int id) throws Exception;

    public Empleado getEmpleadoNombre(String nombre) throws Exception;
}
