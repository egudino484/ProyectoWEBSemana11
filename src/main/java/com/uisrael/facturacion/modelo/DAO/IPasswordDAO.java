/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.modelo.DAO;

import com.uisrael.facturacion.modelo.entidades.Password;
import java.util.List;

/**
 *
 * @author hp
 */
public interface IPasswordDAO {

    public void insertarPassword(Password password);

    public boolean actualizarPassword(Password password);

    public boolean eliminarPassword(int id);

    public List<Password> getPasswords();

    public Password getPassword(int id);

    public Password getPasswordPassword(String password);

    public List<Password> listarPassword();

}
