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
import modelo.Cultivos;

/**
 *
 * @author sring
 */
public class CultivoJpaController implements Serializable {

    public CultivoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public CultivoJpaController() {
          emf =   Persistence.createEntityManagerFactory("DepostioPU");
    }

    
    public void create(Cultivos cultivo) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(cultivo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCultivo(cultivo.getCodCultivo()) != null) {
                throw new PreexistingEntityException("Cultivo " + cultivo + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cultivos cultivo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            cultivo = em.merge(cultivo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                long id = cultivo.getCodCultivo();
                if (findCultivo(id) == null) {
                    throw new NonexistentEntityException("The cultivo with id " + id + " no longer exists.");
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
            Cultivos cultivo;
            try {
                cultivo = em.getReference(Cultivos.class, id);
                cultivo.getCodCultivo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cultivo with id " + id + " no longer exists.", enfe);
            }
            em.remove(cultivo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cultivos> findCultivoEntities() {
        return findCultivoEntities(true, -1, -1);
    }

    public List<Cultivos> findCultivoEntities(int maxResults, int firstResult) {
        return findCultivoEntities(false, maxResults, firstResult);
    }

    private List<Cultivos> findCultivoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cultivos.class));
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

    public Cultivos findCultivo(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cultivos.class, id);
        } finally {
            em.close();
        }
    }

    public int getCultivoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cultivos> rt = cq.from(Cultivos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    
    
    
}
