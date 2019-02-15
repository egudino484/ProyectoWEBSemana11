package com.uisrael.facturacion.modelo.entidades;

import com.uisrael.facturacion.modelo.entidades.Empleado;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2019-02-15T16:09:17")
@StaticMetamodel(Password.class)
public class Password_ { 

    public static volatile SingularAttribute<Password, String> password;
    public static volatile SingularAttribute<Password, Empleado> empleado;
    public static volatile SingularAttribute<Password, Integer> idPassword;
    public static volatile SingularAttribute<Password, Date> fechaCreacion;
    public static volatile SingularAttribute<Password, Date> fechaUltimaModificacion;

}