package com.example.api_week01_may2;

import com.example.api_week01_may2.models.Product;
import com.example.api_week01_may2.models.User;
import com.example.api_week01_may2.repositories.ProductRepository;
import com.example.api_week01_may2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApiWeek01May2Application {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private UserRepository userRepository;

    RestTemplate restTemplate = new RestTemplate();

    public static void main(String[] args) {
        SpringApplication.run(ApiWeek01May2Application.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                for (int i=1; i<=10; i++){
                    userRepository.save(new User(i, "User" + i));
                    productRepository.save(new Product(i, "Product"+i, 123));
                }
            }
        };
    }
}
