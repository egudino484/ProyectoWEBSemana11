/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.modelo.DAOImpl;

import com.uisrael.facturacion.modelo.DAO.IFacturaDAO;
import com.uisrael.facturacion.modelo.entidades.Factura;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Tuple;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Edison Gómez
 */
public class FacturaDAOImp extends GenericDAO<Factura> implements IFacturaDAO {

    public FacturaDAOImp(Class<Factura> entiClass) {
        super(entiClass);
    }

    @Override
    public void insertarFactura(Factura factura) {
        this.beginTransaction();
        this.create(factura);
        this.commit();
        this.closeTransaction();
    }

    public List<Factura> listarFactura() {
        this.beginTransaction();
        List<Factura> lista = this.findAll();
        this.closeTransaction();
        return lista;
    }

    public List<Factura> listarFacturaCQ() {
        CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Factura> f = cb.createQuery(Factura.class);
        Root<Factura> factura = f.from(Factura.class);
        f.select(factura);
        return this.entityManager.createQuery(f).getResultList();
    }

    public List<Tuple> listarFacturaTuple() {
        CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Tuple> f = cb.createTupleQuery();
        Root<Factura> factura = f.from(Factura.class);
        f.select(cb.tuple(factura.get("idFactura"), factura.get("numero")));
        return this.entityManager.createQuery(f).getResultList();
    }

    public List<Factura> listarFacturaTQ() {
        TypedQuery<Factura> tq = entityManager.createQuery("Select f from Factura f order by f.cliente.apellido ", Factura.class);
        return tq.getResultList();
    }

    public List<Factura> listarFacturasBimestral() {
        List<Factura> lista;
        List<Factura> listaFiltrada = new ArrayList<>();
        int mesInicial = 1;//enero
        int mesFinal = 2;//febrero
        try {
            lista = entityManager.createQuery("SELECT f FROM  Factura f ", Factura.class).getResultList();
            Calendar cal = Calendar.getInstance();
            for (int i = 0; i < lista.size(); i++) {
                cal.setTime(lista.get(i).getFecha());
                int month = cal.get(Calendar.MONTH) + 1;// se le suma uno ya que devuelde 0-> enero 1->febrero... 11->diciembre
                System.out.println("Mes factura : " + month + " inicio:" + mesInicial + " fin:" + mesFinal);
                if (month <= mesFinal && month >= mesInicial) {
                    listaFiltrada.add(lista.get(i));
                } 
            }
            //entityManager.close();
            return listaFiltrada;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();

        }
    }

    @Override
    public boolean actualizarFactura(Factura factura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarFactura(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Factura> getFacturas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Factura getFactura(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Factura getFacturaNumero(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
