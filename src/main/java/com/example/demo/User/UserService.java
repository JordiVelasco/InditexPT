package com.example.demo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<UserEntity> getUserRepository() {
        return userRepository.findAll();
    }

    public boolean compareUsers(String email){
        UserEntity userEntity = userRepository.findByEmail(email);
        return userEntity != null;
    }
}