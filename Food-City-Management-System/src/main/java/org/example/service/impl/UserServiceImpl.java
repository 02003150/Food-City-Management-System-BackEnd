package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.User;
import org.example.entity.UserEntity;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    final ModelMapper mapper;
    @Autowired
    UserRepository repository;

    @Override
    public UserEntity addUser(User user) {
       return repository.save(mapper.map(user, UserEntity.class));
    }

    @Override
    public List<User> getUsers() {
        List<User> users=new ArrayList<>();
        List<UserEntity> all = repository.findAll();
        all.forEach(userEntity ->users.add(mapper.map(userEntity, User.class)) );
        return users;
    }

    @Override
    public void deleteUser(Integer userId) {
        repository.deleteById(userId);
    }

    @Override
    public List<User> searchByName(String name) {
        List<User> users=new ArrayList<>();
        UserEntity byName = repository.findByName(name);
        users.add(mapper.map(byName, User.class));
        return users;
    }
}
