package ru.kpfu.dao;

import ru.kpfu.entities.Comment;
import ru.kpfu.entities.Post;

import java.util.List;

public interface CommentDAO {
    public void addComment(Comment comment);

    public List<Comment> getAllComments();

    public Comment getCommentById(int id);
}
