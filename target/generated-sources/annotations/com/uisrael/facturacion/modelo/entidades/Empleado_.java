package com.uisrael.facturacion.modelo.entidades;

import com.uisrael.facturacion.modelo.entidades.Factura;
import com.uisrael.facturacion.modelo.entidades.Password;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-02-16T17:39:47")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, Password> password;
    public static volatile SingularAttribute<Empleado, Integer> idEmpleado;
    public static volatile ListAttribute<Empleado, Factura> facturas;
    public static volatile SingularAttribute<Empleado, String> direccion;
    public static volatile SingularAttribute<Empleado, String> fono;
    public static volatile SingularAttribute<Empleado, String> nombre;

}