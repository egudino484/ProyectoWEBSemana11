/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.modelo.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Edison Gómez
 */
@Entity
@Table(name="password")
public class Password implements Serializable {
    @Id
    private int idPassword;
    private String password;
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Temporal(TemporalType.DATE)
    private Date fechaUltimaModificacion;
    
    @OneToOne(mappedBy = "password", fetch = FetchType.EAGER)
    private Empleado empleado;
    
    public Password (){
    }

    public Password(int idPassword, String password, Date fechaCreacion, Date fechaUltimaModificacion, Empleado empleado) {
        this.idPassword = idPassword;
        this.password = password;
        this.fechaCreacion = fechaCreacion;
        this.fechaUltimaModificacion = fechaUltimaModificacion;
        this.empleado = empleado;
    }

    public int getIdPassword() {
        return idPassword;
    }

    public void setIdPassword(int idPassword) {
        this.idPassword = idPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    public void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
        this.fechaUltimaModificacion = fechaUltimaModificacion;
    }

    @Override
    public String toString() {
        return "Password{" + "idPassword=" + idPassword + ", password=" + password + ", fechaCreacion=" + fechaCreacion + ", fechaUltimaModificacion=" + fechaUltimaModificacion + '}';
    }

    
    
}
