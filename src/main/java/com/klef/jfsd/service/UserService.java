package com.klef.jfsd.service;

import java.util.List;

import com.klef.jfsd.model.User;

public interface UserService {
    User saveUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
    User getUserByUsername(String username);
    void deleteUserById(Long id);
    public List<User> getUsersByRole(String role);
}

