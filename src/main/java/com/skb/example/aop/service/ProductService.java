package com.skb.example.aop.service;

import com.skb.example.aop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void getAllProducts(){
        System.out.println(productRepository.getAllProduct());
    }
}
