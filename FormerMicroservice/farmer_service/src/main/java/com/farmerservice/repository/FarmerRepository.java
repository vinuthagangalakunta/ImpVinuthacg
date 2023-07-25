package com.farmerservice.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.farmerservice.model.Farmer;


@Repository
public interface FarmerRepository extends MongoRepository<Farmer, String>{

	public Farmer findByUsernameAndPassword(String username, String password);
}


