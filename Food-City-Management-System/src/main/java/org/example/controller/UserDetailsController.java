package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.UserDetails;
import org.example.service.UserDetailService;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class UserDetailsController {

    final UserDetailService service;

    @PostMapping("/add-details")
    public void addUserDetail(@RequestBody UserDetails userDetails){
       service.addUserDetail(userDetails);
    }

    @GetMapping("/validate")
    public List<UserDetails> validate(@RequestParam String email, String password){

        if (email != null && password != null) {
            return service.validate(email,password);
        }
        return Collections.emptyList();
    }
}
