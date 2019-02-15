package com.uisrael.facturacion.backingBeans;

import com.uisrael.facturacion.controlador.IClienteControlador;
import com.uisrael.facturacion.controlador.IFacturaControlador;
import com.uisrael.facturacion.controladorImpl.ClienteControladorImpl;
import com.uisrael.facturacion.controladorImpl.FacturaControladorImpl;
import com.uisrael.facturacion.modelo.entidades.Cliente;
import com.uisrael.facturacion.modelo.entidades.Factura;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean //(name="Cli")
@ViewScoped
public class FacturaView implements Serializable {

    private IFacturaControlador controlador;

    public FacturaView() {
    }

    @PostConstruct
    public void init() {
        System.err.println("Inicio se creo el BEAN");
        controlador = new FacturaControladorImpl();
    }

    public List<Factura> listarFacturasBimestral() {
        try {
            return controlador.listarFacturasBimestral();
        } catch (Exception ex) {

            Logger.getLogger(FacturaView.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }

}
