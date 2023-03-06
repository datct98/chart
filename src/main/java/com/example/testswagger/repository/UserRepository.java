package com.example.testswagger.repository;

import com.example.testswagger.model.User;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
