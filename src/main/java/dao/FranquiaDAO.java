package dao;


import entity.Franquia;
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
public class FranquiaDAO {
    @PersistenceContext
    protected EntityManager entityManager;

    @Transactional(readOnly=true)
    public List<Franquia> retornaTodos(){
        String jpql = " SELECT c from Acompanhamento c order by c.nome";
        Query query = entityManager.createQuery(jpql);
        List<Franquia> acompanhamentos = (List<Franquia>) query.getResultList();
        return acompanhamentos;
    }

    @Transactional(readOnly=true)
    public List<Franquia> retornaTodos(int idFranqueado){
        String jpql = " SELECT c from Acompanhamento c order by c.nome";
        Query query = entityManager.createQuery(jpql);
        List<Franquia> acompanhamentos = (List<Franquia>) query.getResultList();
        return acompanhamentos;
    }
    @Transactional(readOnly=true)
    public Franquia retornaEspecifico(int id){
        String jpql = " SELECT c from Acompanhamento c order by c.nome";
        Query query = entityManager.createQuery(jpql);
        Franquia acompanhamentos = (Franquia) query.getSingleResult();
        return acompanhamentos;
    }
    @Transactional
    public Franquia inserirFranquia(Franquia franquia){
        entityManager.persist(franquia);
        return franquia;
    }
    @Transactional
    public Franquia updateFranquia(Franquia franquia){
        entityManager.merge(franquia);
        return franquia;
    }
    @Transactional
    public Franquia deleteFranquia(Franquia franquia){
        entityManager.remove(franquia);
        return franquia;
    }
}
