package org.example.controller;

import org.example.dto.User;

import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {
@Autowired
    UserService service;
@PostMapping("/add-user")
public void addUser(@RequestBody User user){
    service.addUser(user);
}
@GetMapping("/get-user")
public List<User> getUser(){
   return service.getUsers();
}
@DeleteMapping("delete-user/{userId}")
@ResponseStatus(HttpStatus.ACCEPTED)
public void deleteUsers(@PathVariable Integer userId){
    service.deleteUser(userId);
}
@GetMapping("/search-user/{name}")
    public List<User> searchByName(@PathVariable String name){
   return service.searchByName(name);
    }
}
