package dao;

import entity.PesquisaMercado;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by harlock on 23/04/17.
 */
@Repository
public class PesquisaMercadoDAO {
    @PersistenceContext
    protected EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional(readOnly=true)
    public List<PesquisaMercado> retornaTodos(){
        String jpql = "SELECT c from PesquisaMercado c order by c.nome";
        Query query = entityManager.createQuery(jpql);
        List<PesquisaMercado> pesquisamercados = (List<PesquisaMercado>) query.getResultList();
        return pesquisamercados;
    }

    @Transactional(readOnly=true)
    public List<PesquisaMercado> retornaTodos(int idFranqueado){
        String jpql = "SELECT c from PesquisaMercado c order by c.nome";
        Query query = entityManager.createQuery(jpql);
        List<PesquisaMercado> pesquisamercados = (List<PesquisaMercado>) query.getResultList();
        return pesquisamercados;
    }
    @Transactional(readOnly=true)
    public PesquisaMercado retornaEspecifico(int id){
        String jpql = "SELECT c from PesquisaMercado c order by c.nome";
        Query query = entityManager.createQuery(jpql);
        PesquisaMercado pesquisamercados = (PesquisaMercado) query.getSingleResult();
        return pesquisamercados;
    }
    @Transactional
    public PesquisaMercado inserirPesquisaMercado(PesquisaMercado PesquisaMercado){
        entityManager.persist(PesquisaMercado);
        return PesquisaMercado;
    }
    @Transactional
    public PesquisaMercado updatePesquisaMercado(PesquisaMercado PesquisaMercado){
        entityManager.merge(PesquisaMercado);
        return PesquisaMercado;
    }
    @Transactional
    public PesquisaMercado deletePesquisaMercado(PesquisaMercado PesquisaMercado){
        entityManager.remove(PesquisaMercado);
        return PesquisaMercado;
    }
}
