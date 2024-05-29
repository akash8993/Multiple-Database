package com.akash.Multiple.Database.mongodb.repository;


import com.akash.Multiple.Database.mongodb.entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepo extends MongoRepository<Product,String> {

}
