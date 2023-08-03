package com.skb.example.aop.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    public String getAllProduct(){
        return "All Product";
    }
}
