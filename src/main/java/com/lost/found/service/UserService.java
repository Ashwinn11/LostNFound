package com.lost.found.service;

import com.lost.found.entity.User;
import com.lost.found.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public ResponseEntity<?> createUser(User user) {
        Optional<User> optional = userRepository.findByEmailId(user.getEmailId());
        if(optional.isEmpty()) {
            userRepository.save(user);
            return new ResponseEntity<>(user,HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Already enrolled",HttpStatus.BAD_REQUEST);
    }
}
