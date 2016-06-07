package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import modelo.Monitor;

/**
 *
 * @author marcelosiedler
 */
public class MonitorDAO {

    EntityManager em;
    
    public MonitorDAO() throws Exception {
        EntityManagerFactory emf;
        emf = Conexao.getConexao();
        em = emf.createEntityManager();
    }
    
    public void incluir(Monitor obj) throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
        } catch (RuntimeException e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            //em.close();
            
        }
        
    }

    public List<Monitor> listar() throws Exception {
        return em.createNamedQuery("Monitor.findAll").getResultList();
    }
    
    public List<Monitor> listar(String nome) throws Exception {
         TypedQuery<Monitor> query = 
                 em.createNamedQuery("Monitor.findByName", Monitor.class);
         
         query.setParameter("nome", '%' + nome + '%');
         return query.getResultList();
    }
    
    public void alterar(Monitor obj) throws Exception {
        
        try {
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
        } catch (RuntimeException e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            // em.close();
        }
    }
    
    public void excluir(Monitor obj) throws Exception {
        
        try {
            em.getTransaction().begin();
            em.remove(obj);
            em.getTransaction().commit();
        } catch (RuntimeException e) {
            em.getTransaction().rollback();
        } finally {
            //em.close();
        }
    }
    
     public Monitor buscarPorChavePrimaria(Long chave)
    {
        return em.find(Monitor.class, chave);
    }

    public void fechaEmf() {
        em.close();
        Conexao.closeConexao();
    }
    
}
