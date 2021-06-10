package repository;

import dominio.Admor;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class AdmorRepository extends BaseRepository<Admor> {

    @Override
    public boolean guardar(Admor entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entidad);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public boolean actualizar(Admor entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Admor admor = entityManager.find(Admor.class, entidad.getIdusuario());
        if (admor != null) {
            admor.setNombreCompleto(entidad.getNombreCompleto());
            admor.setEmail(entidad.getEmail());
            admor.setContrasenia(entidad.getContrasenia());
            admor.setTelefono(entidad.getTelefono());
            admor.setAvatar(entidad.getAvatar());
            admor.setCiudad(entidad.getCiudad());
            admor.setFechaNacimiento(entidad.getFechaNacimiento());
            admor.setGenero(entidad.getGenero());
            admor.setComunes(entidad.getComunes());
            entityManager.merge(admor);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        return false;
    }

    @Override
    public Admor buscarporID(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Admor admor = entityManager.find(Admor.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return admor;
    }

    @Override
    public List<Admor> buscarTodas() {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Admor.class));
        Query query = em.createQuery(cq);
        ArrayList<Admor> admors = new ArrayList<>(query.getResultList());
        em.getTransaction().commit();
        em.close();
        return admors;
    }

    @Override
    public boolean eliminar(long id) {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        Admor admor = em.find(Admor.class, id);
        if (admor != null) {
            em.remove(admor);
            em.getTransaction().commit();
            em.close();
            return true;
        }
        em.getTransaction().commit();
        em.close();
        return false;
    }

    @Override
    public List<Admor> buscarComo(String busqueda) {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Admor> cq = builder.createQuery(Admor.class);
        Root<Admor> root = cq.from(Admor.class);
        cq = cq.select(root).where(builder.like(root.get("nombreCompleto"), "%" + busqueda + "%"));
        TypedQuery<Admor> typedQuery = em.createQuery(cq);
        ArrayList<Admor> pedidos = new ArrayList<>(typedQuery.getResultList());
        em.getTransaction().commit();
        em.close();
        return pedidos;
    }

}
