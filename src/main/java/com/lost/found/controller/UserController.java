package com.lost.found.controller;


import com.lost.found.entity.User;
import com.lost.found.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/enroll")
    public ResponseEntity<?> enroll(@RequestBody User user){
        return userService.createUser(user);
    }
}
