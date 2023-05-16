package com.example.springbootcrud_mvc.service;

import com.example.springbootcrud_mvc.model.User;

import java.util.List;

public interface UserService {
    List<User> getListUsers();
    void addUser(User user);
    void removeUser(Long id);
    User getUserById(long id);
    void changeUser(User user);
}
