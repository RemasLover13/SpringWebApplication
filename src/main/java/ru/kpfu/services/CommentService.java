package ru.kpfu.services;

import ru.kpfu.entities.Comment;

import java.util.List;

public interface CommentService {
    public void addComment(String text, int postId, int userId);

    public List<Comment> getAllComments();

    public Comment getCommentById(int id);
}
