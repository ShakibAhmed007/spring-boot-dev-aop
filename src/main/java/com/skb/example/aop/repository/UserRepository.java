package com.skb.example.aop.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public String getAllUser(){
        return "All User";
    }
}
