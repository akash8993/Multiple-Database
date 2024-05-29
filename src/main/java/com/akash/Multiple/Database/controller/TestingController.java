package com.akash.Multiple.Database.controller;

import com.akash.Multiple.Database.mongodb.entities.Product;
import com.akash.Multiple.Database.mysql.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.akash.Multiple.Database.mongodb.repository.productRepo;
import com.akash.Multiple.Database.mysql.repository.userRepo;
@RestController
@RequestMapping("/api/v1")
public class TestingController {

    @Autowired
    private productRepo productRepo;

    @Autowired
    private userRepo userRepo;
    @PostMapping("/mongo")
    public Product addProduct(@RequestBody Product product)
    {
        return  productRepo.save(product);

    }
    @PostMapping("/mysql")
    public User addUser(@RequestBody User user)
    {
        return userRepo.save(user);
    }


}
