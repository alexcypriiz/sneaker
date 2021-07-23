package com.example.sneaker.repository;

import com.example.sneaker.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Alexey Podlubnyy on 24.07.2021
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
