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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Edison Gómez
 */
@Entity
@Table (name="productos")
public class Productos implements Serializable {
    @Id
    private int idProductos;
    private String descripcion;
    private String nombre;
    private String precios;
    private int estado;
    @OneToMany (cascade = CascadeType.ALL, mappedBy = "Productos")
    private List<Detalle> detalle = new  ArrayList<>();
    
    public Productos (){
    }

    public Productos(int idProductos, String descripcion, String nombre, String precios, int estado) {
        this.idProductos = idProductos;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.precios = precios;
        this.estado = estado;
    }

    public int getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(int idProductos) {
        this.idProductos = idProductos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecios() {
        return precios;
    }

    public void setPrecios(String precios) {
        this.precios = precios;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Productos{" + "idProductos=" + idProductos + ", descripcion=" + descripcion + ", nombre=" + nombre + ", precios=" + precios + ", estado=" + estado + '}';
    }

    
    
}
