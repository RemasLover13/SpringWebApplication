package ru.kpfu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.dao.PostDAO;
import ru.kpfu.entities.Post;

import java.util.List;

@Service
@Transactional
public class PostServiceImpl implements PostService{
    @Autowired
    private PostDAO postDAO;


    @Override
    public void addPost(String title, String text) {
        postDAO.addPost(new Post(title, text));
    }

    @Override
    public void updatePost(int id, String title, String text) {
        Post post = postDAO.getPostById(id);
        if(post != null) {
            post.setTitle(title);
            post.setText(text);
            postDAO.updatePost(post);
        }
    }

    @Override
    public void deletePost(int id) {
        postDAO.deletePost(id);
    }

    @Override
    public List<Post> getAllPosts() {
        return postDAO.getAllPosts();
    }

    @Override
    public Post getPostById(int id) {
        return postDAO.getPostById(id);
    }
}
