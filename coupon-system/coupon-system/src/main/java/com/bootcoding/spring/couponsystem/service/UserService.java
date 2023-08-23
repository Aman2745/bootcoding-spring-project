package com.bootcoding.spring.couponsystem.service;

import com.bootcoding.spring.couponsystem.model.User;
import com.bootcoding.spring.couponsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user){
        userRepository.save(user);
    }

    public void saveUser(List<User>users){
        for(User u:users){
            userRepository.save(u);
        }
    }

}
