package ru.kpfu.services;

import ru.kpfu.entities.Post;

import java.util.List;

public interface PostService {
    public void addPost(String title, String text);
    public void updatePost(int id, String title, String text);
    public void deletePost(int id);
    public List<Post>  getAllPosts();
    public Post getPostById(int id);

}
