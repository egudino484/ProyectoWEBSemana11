/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.modelo.DAO;

import com.uisrael.facturacion.modelo.entidades.Cliente;
import java.util.List;

/**
 *
 * @author master
 */
public interface IClienteDAO {

    public void insertarCliente(Cliente cliente);

    public boolean actualizarCliente(Cliente cliente);

    public boolean eliminarCliente(int id);

    public List<Cliente> getClientes();

    public Cliente getCliente(int id);

    public Cliente getClienteCI(String ci);
    
    public List<Cliente> listarCliente();
}
