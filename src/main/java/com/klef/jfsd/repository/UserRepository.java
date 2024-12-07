package com.klef.jfsd.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.model.Role;
import com.klef.jfsd.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Find a user by username
    User findByUsername(String username);

	public List<User> findByRole(Role roleEnum);
}
