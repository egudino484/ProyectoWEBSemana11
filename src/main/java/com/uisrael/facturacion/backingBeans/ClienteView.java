
package com.uisrael.facturacion.backingBeans;


import com.uisrael.facturacion.controlador.IClienteControlador;
import com.uisrael.facturacion.controladorImpl.ClienteControladorImpl;
import com.uisrael.facturacion.modelo.entidades.Cliente;


import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean //(name="Cli")
@ViewScoped
public class ClienteView implements Serializable{

    private int txtid;
    private String txtNombre;
    private String txtAapellido;
    private String txtDieccion;
    private String txtFono;
    private String txtCi;
    private Cliente nuevoCliente;
    private IClienteControlador clienteControlador;
    
    public ClienteView() {
    }
    
    @PostConstruct
    public void init()
    {
        System.err.println("Inicio se creo el BEAN");
        clienteControlador= new ClienteControladorImpl();
    }

    public void insertarCliente() throws Exception
    {
       // para ingresar codID 
       // nuevoCliente.setCi(Integer.ParseInt.(txtCi));
       
        
        nuevoCliente= new Cliente();
        
        nuevoCliente.setIdCliente(txtid);
        nuevoCliente.setNombre(txtNombre);
        nuevoCliente.setApellido(txtAapellido);
        nuevoCliente.setDireccion(txtDieccion);
        nuevoCliente.setTelefono(txtFono);
        nuevoCliente.setCi(txtCi);
        System.err.println("Ya llego al servidor: "+nuevoCliente);
        clienteControlador.insertarCliente(nuevoCliente);
    }
    
    public void eliminarCliente(){
         System.out.println("INGRESE DATOS A ELIMINAR");
    
    }

    

    public int getTxtid() {
        return txtid;
    }

    public void setTxtid(int txtid) {
        this.txtid = txtid;
    }

    public String getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(String txtNombre) {
        this.txtNombre = txtNombre;
    }

    public String getTxtAapellido() {
        return txtAapellido;
    }

    public void setTxtAapellido(String txtAapellido) {
        this.txtAapellido = txtAapellido;
    }

    public String getTxtDieccion() {
        return txtDieccion;
    }

    public void setTxtDieccion(String txtDieccion) {
        this.txtDieccion = txtDieccion;
    }

    public String getTxtFono() {
        return txtFono;
    }

    public void setTxtFono(String txtFono) {
        this.txtFono = txtFono;
    }

    public String getTxtCi() {
        return txtCi;
    }

    public void setTxtCi(String txtCi) {
        this.txtCi = txtCi;
    }

    public Cliente getNuevoCliente() {
        return nuevoCliente;
    }

    public void setNuevoCliente(Cliente nuevoCliente) {
        this.nuevoCliente = nuevoCliente;
    }

    public IClienteControlador getClienteControlador() {
        return clienteControlador;
    }

    public void setClienteControlador(IClienteControlador clienteControlador) {
        this.clienteControlador = clienteControlador;
    }
    
}
