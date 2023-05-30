package ru.kpfu.dao;

import ru.kpfu.entities.Post;

import java.util.List;

public interface PostDAO {
    public void addPost(Post post);

    public void updatePost(Post post);

    public void deletePost(int id);

    public List<Post> getAllPosts();

    public Post getPostById(int id);
}
