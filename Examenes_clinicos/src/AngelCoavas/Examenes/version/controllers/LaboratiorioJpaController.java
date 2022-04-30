/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AngelCoavas.Examenes.version.controllers;

import AngelCoavas.Examenes.version.Front_end.vistas.exceptions.NonexistentEntityException;
import AngelCoavas.Examenes.version.models.Laboratiorio;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author HP5
 */
public class LaboratiorioJpaController implements Serializable {

    public LaboratiorioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
     public LaboratiorioJpaController() {
        this.emf = Persistence.createEntityManagerFactory("Examenes_clinicosPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Laboratiorio laboratiorio) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(laboratiorio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Laboratiorio laboratiorio) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            laboratiorio = em.merge(laboratiorio);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = laboratiorio.getId();
                if (findLaboratiorio(id) == null) {
                    throw new NonexistentEntityException("The laboratiorio with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Laboratiorio laboratiorio;
            try {
                laboratiorio = em.getReference(Laboratiorio.class, id);
                laboratiorio.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The laboratiorio with id " + id + " no longer exists.", enfe);
            }
            em.remove(laboratiorio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Laboratiorio> findLaboratiorioEntities() {
        return findLaboratiorioEntities(true, -1, -1);
    }

    public List<Laboratiorio> findLaboratiorioEntities(int maxResults, int firstResult) {
        return findLaboratiorioEntities(false, maxResults, firstResult);
    }

    private List<Laboratiorio> findLaboratiorioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Laboratiorio.class));
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

    public Laboratiorio findLaboratiorio(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Laboratiorio.class, id);
        } finally {
            em.close();
        }
    }

    public int getLaboratiorioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Laboratiorio> rt = cq.from(Laboratiorio.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
