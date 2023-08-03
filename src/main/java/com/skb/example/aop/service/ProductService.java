package com.skb.example.aop.service;

import com.skb.example.aop.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void getAllProducts(){
        logger.info("Get all product exceuted !!!");
    }

    public String getProductById(){
        return "ABC Product 123";
    }

    public void calculateAmount() throws InterruptedException {
        Thread.sleep(5000);
    }
}
