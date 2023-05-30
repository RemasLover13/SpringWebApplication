package ru.kpfu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.dao.UserDAO;
import ru.kpfu.entities.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void addUser(String name, String email, String password) {
        userDAO.addUser(new User(name, email, password));
    }

    @Override
    public void updateUser(int id, String name, String email) {
        User user = userDAO.getUserById(id);
        if (user != null) {
            user.setName(name);
            user.setEmail(email);
            userDAO.updateUser(user);
        }
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }
}
