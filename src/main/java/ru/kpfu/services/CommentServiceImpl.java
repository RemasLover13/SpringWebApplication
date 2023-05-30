package ru.kpfu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.dao.CommentDAO;
import ru.kpfu.entities.Comment;

import java.util.List;

@Service
@Transactional
public class CommentServiceImpl implements CommentService{
    @Autowired
    private CommentDAO commentDAO;
    @Override
    public void addComment(String text, int postId, int userId) {
        commentDAO.addComment(new Comment(text,postId,userId));
    }

    @Override
    public List<Comment> getAllComments() {
        return commentDAO.getAllComments();
    }

    @Override
    public Comment getCommentById(int id) {
        return commentDAO.getCommentById(id);
    }
}
