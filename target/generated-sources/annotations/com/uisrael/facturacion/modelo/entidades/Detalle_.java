package com.uisrael.facturacion.modelo.entidades;

import com.uisrael.facturacion.modelo.entidades.Factura;
import com.uisrael.facturacion.modelo.entidades.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-02-16T17:46:15")
@StaticMetamodel(Detalle.class)
public class Detalle_ { 

    public static volatile SingularAttribute<Detalle, String> descripcion;
    public static volatile SingularAttribute<Detalle, Factura> factura;
    public static volatile SingularAttribute<Detalle, Integer> idDetalle;
    public static volatile SingularAttribute<Detalle, Integer> cantidad;
    public static volatile SingularAttribute<Detalle, Productos> productos;

}