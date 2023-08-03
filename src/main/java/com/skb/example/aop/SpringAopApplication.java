package com.skb.example.aop;

import com.skb.example.aop.service.ProductService;
import com.skb.example.aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

	@Autowired
	private ProductService productService;
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productService.getAllProducts();
		userService.getAllUser();
	}
}
