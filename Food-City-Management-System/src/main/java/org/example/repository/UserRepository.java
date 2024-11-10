package org.example.repository;

import jakarta.persistence.Entity;
import org.example.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    UserEntity findByName(String name);
}
