package ru.kpfu.dao;

import ru.kpfu.entities.Like;

import java.util.List;

public interface LikeDAO {
    public void addLike(Like like);
    public void deleteLike(int id);
    public List<Like> getAllLikes();
    public Like getLikeById(int id);
}
