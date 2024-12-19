package org.example.service;

import org.example.dto.UserDetails;
import org.example.entity.UserDetailsEntity;
import org.example.repository.UserDetailsRepository;

import java.util.List;

public interface UserDetailService {

    UserDetailsEntity addUserDetail(UserDetails userDetails);

    List<UserDetails> validate(String email, String password);
}
