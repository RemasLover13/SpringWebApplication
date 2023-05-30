package ru.kpfu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.dao.LikeDAO;
import ru.kpfu.entities.Like;

import javax.persistence.PersistenceContext;
import java.util.List;

@Service
@Transactional
public class LikeServiceImpl implements LikeService {
    @Autowired
    private LikeDAO likeDAO;
    @Override
    public void addLike(int postId, int userId) {
        likeDAO.addLike(new Like(postId, userId));
    }

    @Override
    public void deleteLike(int id) {
        likeDAO.deleteLike(id);
    }

    @Override
    public List<Like> getAllLikes() {
        return likeDAO.getAllLikes();
    }

    @Override
    public Like getLikeById(int id) {
        return likeDAO.getLikeById(id);
    }
}
