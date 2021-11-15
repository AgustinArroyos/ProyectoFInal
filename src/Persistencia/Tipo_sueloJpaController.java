/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Persistencia.exceptions.NonexistentEntityException;
import Persistencia.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import modelo.Tipo_suelo;

/**
 *
 * @author sring
 */
public class Tipo_sueloJpaController implements Serializable {

    public Tipo_sueloJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public Tipo_sueloJpaController() {
        
      emf =   Persistence.createEntityManagerFactory("DepostioPU");
      
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Tipo_suelo tipo_suelo) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tipo_suelo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findTipo_suelo(tipo_suelo.getCodTipoSuelo()) != null) {
                throw new PreexistingEntityException("Tipo_suelo " + tipo_suelo + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Tipo_suelo tipo_suelo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tipo_suelo = em.merge(tipo_suelo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                long id = tipo_suelo.getCodTipoSuelo();
                if (findTipo_suelo(id) == null) {
                    throw new NonexistentEntityException("The tipo_suelo with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Tipo_suelo tipo_suelo;
            try {
                tipo_suelo = em.getReference(Tipo_suelo.class, id);
                tipo_suelo.getCodTipoSuelo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipo_suelo with id " + id + " no longer exists.", enfe);
            }
            em.remove(tipo_suelo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Tipo_suelo> findTipo_sueloEntities() {
        return findTipo_sueloEntities(true, -1, -1);
    }

    public List<Tipo_suelo> findTipo_sueloEntities(int maxResults, int firstResult) {
        return findTipo_sueloEntities(false, maxResults, firstResult);
    }

    private List<Tipo_suelo> findTipo_sueloEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Tipo_suelo.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Tipo_suelo findTipo_suelo(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Tipo_suelo.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipo_sueloCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Tipo_suelo> rt = cq.from(Tipo_suelo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
