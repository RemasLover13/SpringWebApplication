package ru.kpfu.services;

import ru.kpfu.entities.User;

import java.util.List;

public interface UserService {
   public void addUser(String name, String email, String password);
   public void updateUser(int id, String name, String email);
   public void deleteUser(int id);
   public List<User> getAllUsers();
   public User getUserById(int id);
}
