/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.modelo.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Edison Gómez
 */
@Entity
@Table(name="empleado")
public class Empleado implements Serializable {
    @Id
    private int idEmpleado;
    private String nombre;
    private String direccion;
    private String fono;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="idPassword")
    private Password password;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Empleado")
    private List<Factura> facturas = new ArrayList<>();
    
    public Empleado(){
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", direccion=" + direccion + ", fono=" + fono + ", password=" + password + '}';
    }

   
}
