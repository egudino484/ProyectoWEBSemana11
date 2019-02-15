//package com.uisrael.facturacion.backingBeans;
//
//
//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
//import com.uisrael.facturacion.controlador.IClienteControlador;
//import com.uisrael.facturacion.controlador.IPasswordControlador;
//import com.uisrael.facturacion.controladorImpl.ClienteControladorImpl;
//import com.uisrael.facturacion.controladorImpl.PasswordControladorImpl;
//import com.uisrael.facturacion.modelo.entidades.Cliente;
//import com.uisrael.facturacion.modelo.entidades.Password;
//
//
//import java.io.Serializable;
//import java.util.Date;
//import javax.annotation.PostConstruct;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
//
//
//@ManagedBean //(name="Cli")
//@ViewScoped
//public class PasswordView implements Serializable{
//
//    private int txtidPassword;
//    private String txtPassword;
//    private Date txtfechaCreacion;
//    private Date fechaUltimaModificacion ;
//   
//    private IPasswordControlador passwordControlador;
//    
//    public PasswordView() {
//    }
//    
//    @PostConstruct
//    public void init()
//    {
//        System.err.println("Inicio se creo el BEAN");
//        passwordControlador= new PasswordControladorImpl();
//    }
//
//    public void insertarPassword() throws Exception
//    {
//       // para ingresar codID 
//       // nuevoCliente.setCi(Integer.ParseInt.(txtCi));
//       
//        
//        nuevoPassword= new Password();
//        
//        nuevoPassword.setIdPassword(txtidPassword);
//        nuevoPassword.setPassword(txtPassword);
//        nuevoPassword.setFechaCreacion(txtfechaCreacion);
//        nuevoPassword.setFechaUltimaModificacion(txtfechaCreacion);
//        
//        System.err.println("Ya llego al servidor: "+nuevoPassword);
//        passwrodControlador.insertarPassword(nuevoPassword);
//    }
//    
//    public void eliminarCliente(){
//         System.out.println("INGRESE DATOS A ELIMINAR");
//    
//    }
//
