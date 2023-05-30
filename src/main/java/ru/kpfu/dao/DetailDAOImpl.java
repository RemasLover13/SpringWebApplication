package ru.kpfu.dao;

import org.springframework.stereotype.Repository;
import ru.kpfu.entities.Detail;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class DetailDAOImpl implements DetailDAO {
    @PersistenceContext
    private EntityManager entityManager;




    @Override
    public void addDetail(Detail detail) {
        entityManager.persist(detail);
    }

    @Override
    public void updateDetail(Detail detail) {
        entityManager.merge(detail);
    }

    @Override
    public void deleteDetail(int id) {
        Detail detail = entityManager.find(Detail.class, id);
        if (detail != null) {
            entityManager.remove(detail);
        }
    }

    @Override
    public List<Detail> getAllDetails() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Detail> criteriaQuery = criteriaBuilder.createQuery(Detail.class);
        Root<Detail> root = criteriaQuery.from(Detail.class);
        criteriaQuery.select(root);
        TypedQuery<Detail> query = entityManager.createQuery(criteriaQuery);
        return query.getResultList();
    }

    @Override
    public Detail getDetailById(int id) {
        return entityManager.find(Detail.class, id);
    }
}
