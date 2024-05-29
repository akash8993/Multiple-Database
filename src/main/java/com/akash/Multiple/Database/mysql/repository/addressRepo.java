package com.akash.Multiple.Database.mysql.repository;

import com.akash.Multiple.Database.mysql.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface addressRepo extends JpaRepository<Address, Integer> {
}
