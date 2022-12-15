package com.example.springbootproject.service;


import com.example.springbootproject.model.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UserService {

    List<User> getAllUsers ();
    Object getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser(@Valid User user);
}