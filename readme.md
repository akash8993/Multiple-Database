We have configured multiple database for the storage of data in multiple database instance

Database used :- MySQL and MongoDB

We have created the Configuration files for the same to configure multiple database

After configuration we make a post query and store data in multiple database

For MYSQL

http://localhost:8080/api/v1/mysql with Request body attached below

Since we have used mysql and this entity is mapped to mysql so it will be stored in mysql

    {
    "firstName":"abc",
    "lastName":"def",
    "email":"abc@Gmail.com"
    }

FOR MongoDB

http://localhost:8080/api/v1/mongo 

    {
    "name":"Apple",
    "description":"Apple Iphone 13",
    "live":true,
    "price":1000.00
    }

Here we had made configurations so springboot automatically choose the database to store as per the repository used.