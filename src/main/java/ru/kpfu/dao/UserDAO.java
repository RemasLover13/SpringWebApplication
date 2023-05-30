package ru.kpfu.dao;

import ru.kpfu.entities.User;

import java.util.List;

public interface UserDAO {
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(int id);
    public List<User> getAllUsers();
    public User getUserById(int id);

}
