package com.uisrael.facturacion.modelo.entidades;

import com.uisrael.facturacion.modelo.entidades.Cliente;
import com.uisrael.facturacion.modelo.entidades.Detalle;
import com.uisrael.facturacion.modelo.entidades.Empleado;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-02-16T17:39:47")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Date> fecha;
    public static volatile SingularAttribute<Factura, Cliente> cliente;
    public static volatile SingularAttribute<Factura, Integer> estado;
    public static volatile SingularAttribute<Factura, Double> total;
    public static volatile SingularAttribute<Factura, Integer> numero;
    public static volatile SingularAttribute<Factura, Empleado> empleado;
    public static volatile SingularAttribute<Factura, Integer> idFactura;
    public static volatile ListAttribute<Factura, Detalle> detalle;

}