package com.klef.jfsd.service;

import java.util.List;
import com.klef.jfsd.model.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.model.User;
import com.klef.jfsd.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
    
    @Override
    public List<User> getUsersByRole(String role) {
        try {
            Role roleEnum = Role.valueOf(role.toUpperCase()); // Convert String to Role enum
            return userRepository.findByRole(roleEnum);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Invalid role provided: " + role, e);
        }
    }
}
