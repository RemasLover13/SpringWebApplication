package ru.kpfu.dao;

import org.springframework.stereotype.Repository;
import ru.kpfu.entities.Avatar;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AvatarDAOImpl implements AvatarDAO {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void addAvatar(Avatar avatar) {
        entityManager.persist(avatar);
    }

    @Override
    public void deleteAvatar(int id) {
        Avatar avatar = entityManager.find(Avatar.class, id);
        if (avatar != null) {
            entityManager.remove(avatar);
        }
    }
}
