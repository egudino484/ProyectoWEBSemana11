/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.controlador;


import com.uisrael.facturacion.modelo.entidades.Password;
import java.util.List;

/**
 *
 * @author hp
 */
public interface IPasswordControlador {
    
    public void insertarPassword(Password password) throws Exception ;

    public boolean actualizarPassword(Password password)throws Exception;

    public boolean eliminarPassword(int id)throws Exception;

    public List<Password> getPasswords()throws Exception;

   public Password getPassword(int id)throws Exception;

    public Password getPasswordPassword(String password)throws Exception;
    
}
