package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.UserDetails;
import org.example.entity.UserDetailsEntity;
import org.example.repository.UserDetailsRepository;
import org.example.service.UserDetailService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailService {
    final ModelMapper mapper;
    final UserDetailsRepository repository;


    @Override
    public UserDetailsEntity addUserDetail(UserDetails userDetails) {
        return repository.save(mapper.map(userDetails, UserDetailsEntity.class));

    }

    @Override
    public List<UserDetails> validate(String email, String password) {
        List<UserDetails> userDetails = new ArrayList<>();
        repository.findUser(email,password).forEach(userDetailsEntity -> userDetails.add(mapper.map(userDetailsEntity, UserDetails.class)));
        System.out.println("userDetails "+userDetails);
        return userDetails;
    }
}
