/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.modelo.entidades;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Edison Gómez
 */
@Entity
@Table(name="factura")
public class Factura implements Serializable {
    @Id
    private int idFactura;
    private int numero;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private int estado;
    
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="idCliente")
    private Cliente cliente;
    
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="idEmpleado")
    private Empleado empleado;
    
    @OneToMany (cascade = CascadeType.ALL, mappedBy = "Factura")
    private List<Detalle> detalle = new  ArrayList<>();
    
    
    public Factura(){
    }

    public Factura(int idFactura, int numero, Date fecha, int estado, Cliente cliente, Empleado empleado) {
        this.idFactura = idFactura;
        this.numero = numero;
        this.fecha = fecha;
        this.estado = estado;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Factura{" + "idFactura=" + idFactura + ", numero=" + numero + ", fecha=" + fecha + ", estado=" + estado + ", cliente=" + cliente + ", empleado=" + empleado + '}';
    }

}
