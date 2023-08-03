package com.skb.example.aop.service;

import com.skb.example.aop.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void getAllUser(){
        logger.info("Get all User exceuted !!!");
    }
}
