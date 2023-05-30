package ru.kpfu.dao;

import org.springframework.stereotype.Repository;
import ru.kpfu.entities.Post;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class PostDAOImpl implements PostDAO{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addPost(Post post) {
        entityManager.persist(post);
    }

    @Override
    public void updatePost(Post post) {
        entityManager.merge(post);
    }

    @Override
    public void deletePost(int id) {
        Post post = entityManager.find(Post.class, id);
        if (post != null) {
            entityManager.remove(post);
        }
    }

    @Override
    public List<Post> getAllPosts() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Post> criteriaQuery = criteriaBuilder.createQuery(Post.class);
        Root<Post> root = criteriaQuery.from(Post.class);
        criteriaQuery.select(root);
        TypedQuery<Post> query = entityManager.createQuery(criteriaQuery);

        return query.getResultList();
    }

    @Override
    public Post getPostById(int id) {
        return entityManager.find(Post.class, id);
    }
}
