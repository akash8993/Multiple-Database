package com.akash.Multiple.Database.mysql.repository;

import com.akash.Multiple.Database.mysql.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends JpaRepository<User,Integer> {
}
