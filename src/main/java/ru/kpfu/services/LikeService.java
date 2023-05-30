package ru.kpfu.services;

import ru.kpfu.entities.Like;

import java.util.List;

public interface LikeService {
    public void addLike(int postId, int userId);
    public void deleteLike(int id);

    public List<Like> getAllLikes();

    public Like getLikeById(int id);


}
