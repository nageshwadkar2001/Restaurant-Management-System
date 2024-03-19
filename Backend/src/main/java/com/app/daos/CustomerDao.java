package com.app.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>{   //type of primary key is integer
	Customer findByEmail(String email);
}

//Dao= Data Access Object -is a path to reach DTO(Data transfer Object {Database})