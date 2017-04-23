package dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by harlock on 23/04/17.
 */
@Repository
public class ImovelDAO {
    @PersistenceContext
    protected EntityManager entityManager;
}
