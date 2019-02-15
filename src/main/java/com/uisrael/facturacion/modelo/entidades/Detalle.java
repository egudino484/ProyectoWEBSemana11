/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.modelo.entidades;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Edison Gómez
 */
@Entity
@Table(name="detalle")
public class Detalle implements Serializable {
    @Id
    private int idDetalle;
    private int cantidad;
    private String descripcion;
    
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="idFactura")
    private Factura factura;
    
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="idProductos")
    private Productos productos;
    
    public Detalle (){
    }

    public Detalle(int idDetalle, int cantidad, String descripcion, Factura factura, Productos productos) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.factura = factura;
        this.productos = productos;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Detalle{" + "idDetalle=" + idDetalle + ", cantidad=" + cantidad + ", descripcion=" + descripcion + ", factura=" + factura + ", productos=" + productos + '}';
    }


}
