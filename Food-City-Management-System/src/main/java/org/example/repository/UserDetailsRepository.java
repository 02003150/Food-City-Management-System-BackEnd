package org.example.repository;

import org.example.entity.UserDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDetailsRepository extends JpaRepository<UserDetailsEntity,Integer> {

    @Query(value = "SELECT * FROM user_details_entity WHERE email =:email AND password =:password", nativeQuery = true)
    List<UserDetailsEntity> findUser(@Param("email")  String email, @Param("password")String password);
}
