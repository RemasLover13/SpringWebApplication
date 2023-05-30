package ru.kpfu.dao;

import org.springframework.stereotype.Repository;
import ru.kpfu.entities.Comment;
import ru.kpfu.entities.Post;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class CommentDAOImpl implements CommentDAO {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void addComment(Comment comment) {
        entityManager.persist(comment);
    }

    @Override
    public List<Comment> getAllComments() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Comment> criteriaQuery = criteriaBuilder.createQuery(Comment.class);
        Root<Comment> root = criteriaQuery.from(Comment.class);
        criteriaQuery.select(root);
        TypedQuery<Comment> query = entityManager.createQuery(criteriaQuery);
        return query.getResultList();

    }

    @Override
    public Comment getCommentById(int id) {
        return entityManager.find(Comment.class, id);
    }
}
