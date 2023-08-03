package com.skb.example.aop.service;

import com.skb.example.aop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void getAllUser(){
        System.out.println(userRepository.getAllUser());
    }
}