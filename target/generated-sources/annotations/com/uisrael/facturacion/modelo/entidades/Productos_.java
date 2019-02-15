package com.uisrael.facturacion.modelo.entidades;

import com.uisrael.facturacion.modelo.entidades.Detalle;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-02-15T16:09:17")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, String> descripcion;
    public static volatile SingularAttribute<Productos, Integer> estado;
    public static volatile SingularAttribute<Productos, Integer> idProductos;
    public static volatile SingularAttribute<Productos, String> nombre;
    public static volatile SingularAttribute<Productos, String> precios;
    public static volatile ListAttribute<Productos, Detalle> detalle;

}