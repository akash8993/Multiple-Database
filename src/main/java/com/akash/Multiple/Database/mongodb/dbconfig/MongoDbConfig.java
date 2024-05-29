package com.akash.Multiple.Database.mongodb.dbconfig;

import com.akash.Multiple.Database.mongodb.entities.Product;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@Configuration
@EnableMongoRepositories(basePackages = {"com.akash.Multiple.Database.mongodb.repository"})
public class MongoDbConfig {

    @Autowired
    private Environment environment;

    @Bean
    public MongoTemplate mongoTemplate()
    {
        String host= environment.getProperty("second.data.mongodb.host");
        String port= environment.getProperty("second.data.mongodb.port");
        String database= environment.getProperty("second.data.mongodb.database");

        MongoClient mongoClient= MongoClients.create(String.format("mongodb://%s:%s",host,port));
        return new MongoTemplate(mongoClient, database);
    }

//    @Bean
//    public ApplicationRunner applicationRunner(MongoTemplate mongoTemplate) {
//        return args -> {
//            // Check if the document already exists to avoid duplicates
//            long count = mongoTemplate.getCollection("mycollection").countDocuments();
//            if (count == 0) {
//                // Insert a document
//                Product initialDocument = new Product("Initial Document");
//                mongoTemplate.insert(initialDocument);
//                System.out.println("Initial document inserted.");
//            } else {
//                System.out.println("Documents already exist. Skipping insertion.");
//            }
//        };
    //}
}
