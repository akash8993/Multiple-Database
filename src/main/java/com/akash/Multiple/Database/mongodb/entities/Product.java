package com.akash.Multiple.Database.mongodb.entities;


import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection= "Product")
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private boolean live;
    private double price;


    public Product(String initialDocument) {
    }
}

