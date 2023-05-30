package ru.kpfu.dao;

import org.springframework.stereotype.Repository;
import ru.kpfu.entities.Like;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class LikeDAOImpl implements LikeDAO{
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void addLike(Like like) {
        entityManager.persist(like);
    }

    @Override
    public void deleteLike(int id) {
        Like like = entityManager.find(Like.class, id);
        if (like != null) {
            entityManager.remove(like);
        }
    }

    @Override
    public List<Like> getAllLikes() {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Like> criteriaQuery = criteriaBuilder.createQuery(Like.class);
        Root<Like> root = criteriaQuery.from(Like.class);
        criteriaQuery.select(root);
        TypedQuery<Like> query = entityManager.createQuery(criteriaQuery);
        return query.getResultList();
    }

    @Override
    public Like getLikeById(int id) {
        return entityManager.find(Like.class, id);
    }
}
