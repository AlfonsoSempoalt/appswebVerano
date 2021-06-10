/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import dominio.Comun;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author l3tal
 */
public class ComunRepository extends BaseRepository<Comun> {

    @Override
    public boolean guardar(Comun entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entidad);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public boolean actualizar(Comun entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Comun comun = entityManager.find(Comun.class, entidad.getId());
        if (comun != null) {
            comun.setContenido(entidad.getContenido());
            comun.setComentarios(entidad.getComentarios());
            comun.setFechaHoraCreacion(entidad.getFechaHoraCreacion());
            comun.setFechaHoraEdicion(entidad.getFechaHoraEdicion());
            comun.setTitulo(entidad.getTitulo());
            entityManager.merge(comun);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        return false;
    }

    @Override
    public Comun buscarporID(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Comun anclado = entityManager.find(Comun.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return anclado;
    }

    @Override
    public List<Comun> buscarTodas() {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Comun.class));
        Query query = em.createQuery(cq);
        ArrayList<Comun> comentarios = new ArrayList<>(query.getResultList());
        em.getTransaction().commit();
        em.close();
        return comentarios;
    }

    @Override
    public boolean eliminar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Comun> buscarComo(String busqueda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
