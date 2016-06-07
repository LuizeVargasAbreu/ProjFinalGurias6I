package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import modelo.Professor;

/**
 *
 * @author marcelosiedler
 */
public class ProfessorDAO {

    EntityManager em;
    
    public ProfessorDAO() throws Exception {
        EntityManagerFactory emf;
        emf = Conexao.getConexao();
        em = emf.createEntityManager();
    }
    
    public void incluir(Professor obj) throws Exception {
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

    public List<Professor> listar() throws Exception {
        return em.createNamedQuery("Professor.findAll").getResultList();
    }
    
     public List<Professor> listar(String nome) throws Exception {
         TypedQuery<Professor> query = 
                 em.createNamedQuery("Professor.findByName", Professor.class);
         
         query.setParameter("nome", '%' + nome + '%');
         return query.getResultList();
    }
    
    public void alterar(Professor obj) throws Exception {
        
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
    
    public void excluir(Professor obj) throws Exception {
        
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
    
    public Professor buscarPorChavePrimaria(Long chave)
    {
        return em.find(Professor.class, chave);
    }

    public void fechaEmf() {
        em.close();
        Conexao.closeConexao();
    }
    
}
