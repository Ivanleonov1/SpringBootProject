package com.example.springbootproject.dao;


import com.example.springbootproject.model.User;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UserDAO {
    List<User> getAllUsers ();
    User getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser(User user);
}
