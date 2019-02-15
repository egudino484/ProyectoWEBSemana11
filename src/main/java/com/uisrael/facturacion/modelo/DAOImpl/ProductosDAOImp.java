/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.facturacion.modelo.DAOImpl;

import com.uisrael.facturacion.modelo.DAO.IProductosDAO;
import com.uisrael.facturacion.modelo.entidades.Productos;
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
public class ProductosDAOImp extends GenericDAO<Productos> implements IProductosDAO{
    public ProductosDAOImp (Class<Productos> entiClass){
        super (entiClass);
    }
    
    
    @Override
    public void insertarProductos (Productos productos){
        this.beginTransaction();
        this.create(productos);
        this.commit();
        this.closeTransaction();       
    }
    
    public List<Productos> listarProductos(){
        this.beginTransaction();
        List<Productos> lista = this.findAll();
        this.closeTransaction();
        return lista;        
    }
    
    
    public List<Productos> listarProductosCQ() {
        CriteriaBuilder cb= this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Productos> c = cb.createQuery(Productos.class) ;
        Root<Productos> productos= c.from(Productos.class);
        c.select(productos);
        return this.entityManager.createQuery(c).getResultList();
    }
    //para listar nombre y precio
    public List<Tuple> listarProductosTuple() {
        CriteriaBuilder cb= this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Tuple> p = cb.createTupleQuery();
        Root<Productos> productos= p.from(Productos.class);
        p.select(cb.tuple(productos.get("idProductos"),productos.get("nombre"), productos.get("precios")));
        return this.entityManager.createQuery(p).getResultList();
    }
    public List<Productos> listarProductosTQ() {
        TypedQuery<Productos> pr= entityManager.createQuery("Select p.idProductos, p.nombre from Productos p",Productos.class );
        return  pr.getResultList();
    }
    /*("Select d.idDetalle, d.descripcion from Detalle d order by d.factura",Detalle.class );
       
    ("Select f from Factura f order by f.cliente.apellido ",Factura.class )*/

    @Override
    public boolean actualizarProductos(Productos productos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarProductos(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Productos> getProductoss() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Productos getProductos(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Productos getProductosNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
