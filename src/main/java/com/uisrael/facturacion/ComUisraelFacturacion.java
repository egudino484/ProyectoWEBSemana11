///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.uisrael.facturacion;
//
//import com.uisrael.facturacion.controlador.IClienteControlador;
//import com.uisrael.facturacion.controlador.IDetalleControlador;
//import com.uisrael.facturacion.controlador.IEmpleadoControlador;
//import com.uisrael.facturacion.controlador.IFacturaControlador;
//import com.uisrael.facturacion.controlador.IPasswordControlador;
//import com.uisrael.facturacion.controlador.IProductosControlador;
//import com.uisrael.facturacion.controladorImpl.ClienteControladorImpl;
//import com.uisrael.facturacion.controladorImpl.DetalleControladorImpl;
//import com.uisrael.facturacion.controladorImpl.EmpleadoControladorImpl;
//import com.uisrael.facturacion.controladorImpl.FacturaControladorImpl;
//import com.uisrael.facturacion.controladorImpl.PasswordControladorImpl;
//import com.uisrael.facturacion.controladorImpl.ProductosControladorImpl;
//import com.uisrael.facturacion.modelo.entidades.Cliente;
//import com.uisrael.facturacion.modelo.entidades.Detalle;
//import com.uisrael.facturacion.modelo.entidades.Empleado;
//import com.uisrael.facturacion.modelo.entidades.Factura;
//import com.uisrael.facturacion.modelo.entidades.Password;
//
//import com.uisrael.facturacion.modelo.entidades.Productos;
//import java.util.Date;
//import java.util.List;
//import javax.persistence.Tuple;
//
///**
// *
// * @author Edison Gómez
// */
//public class ComUisraelFacturacion {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//
//        
//        Cliente cliente = new Cliente();
//
//        cliente.setIdCliente(19);
//        cliente.setNombre("Majo");
//        cliente.setApellido("Edison");
//        cliente.setDireccion("Pumasunta");
//        cliente.setTelefono("3264555");
//        cliente.setCi("3264555");
//        cliente.setEstado(1);
//        IClienteControlador clientcontroler = new ClienteControladorImpl();
//        try {
//            clientcontroler.insertarCliente(cliente);
//        } catch (Exception e) {
//            System.err.println("Erro: No se pudo Insertar Cliente" + e.getMessage());
//        }
//
//        Password password = new Password();
//
//        password.setIdPassword(38);
//        password.setPassword("5555");
//        password.setFechaCreacion(new Date());
//        password.setFechaUltimaModificacion(new Date());
//
//        IPasswordControlador passcontroler = new PasswordControladorImpl();
//        try {
//            passcontroler.insertarPassword(password);
//        } catch (Exception e) {
//            System.err.println("Erro: No se pudo Insertar password" + e.getMessage());
//        }
//
//        Empleado empleado = new Empleado();
//
//        empleado.setIdEmpleado(59);
//        empleado.setNombre("Vaneza Pulupa");
//        empleado.setDireccion("loma");
//        empleado.setFono("3190142");
//        //empleado.setPassword(password);
//
//        IEmpleadoControlador empcontroler = new EmpleadoControladorImpl();
//        try {
//            empcontroler.insertarEmpleado(empleado);
//        } catch (Exception e) {
//            System.err.println("Erro: No se pudo Insertar empleado" + e.getMessage());
//        }
//
//        Factura factura = new Factura();
//        
//        factura.setIdFactura(10);
//        factura.setNumero(10001);
//        factura.setFecha(new Date());
//        factura.setEstado(1);
//        //factura.setEmpleado(empleado);
//        //factura.setCliente(cliente);
//        
//        IFacturaControlador faccontroler = new FacturaControladorImpl();
//        try {
//            faccontroler.insertarFactura(factura);
//        } catch (Exception e) {
//            System.err.println("Erro: No se pudo Insertar factura" + e.getMessage());
//        }
//
//        Productos productos = new Productos();
//        
//        productos.setIdProductos(10);
//        productos.setDescripcion("Gaseosa");
//        productos.setNombre("litro");
//        productos.setPrecios("1,25");
//        productos.setEstado(1);
//        
//        IProductosControlador procontroler = new ProductosControladorImpl();
//        try {
//            procontroler.insertarProductos(productos);
//        } catch (Exception e) {
//            System.err.println("Erro: No se pudo Insertar productos" + e.getMessage());
//        }
//
//        
//        Detalle detalle = new Detalle();
//        
//        detalle.setIdDetalle(10);
//        detalle.setCantidad(10);
//        detalle.setDescripcion("CocaCola");
//        //detalle.setFactura(factura);
//        //detalle.setProductos(productos);
//        
//        IDetalleControlador detcontroler = new DetalleControladorImpl();
//        try {
//            detcontroler.insertarDetalle(detalle);
//        } catch (Exception e) {
//            System.err.println("Erro: No se pudo Insertar detalle" + e.getMessage());
//        }
//
//        //Listar Factutas ordenado por idCliente tiped Query
//        /*FacturaControladorImpl facturaControladorTQ = new FacturaControladorImpl();
//        List<Factura> listafacturastq = facturaControladorTQ.listarFacturaTQ();
//        for(Factura factp: listafacturastq){
//            System.out.println(""+factp);
//        }    */
//    }
//}
