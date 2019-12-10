package com.security.jwt.repo;

import com.security.jwt.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Integer> {
    User findUserByUsername(String username);
}
