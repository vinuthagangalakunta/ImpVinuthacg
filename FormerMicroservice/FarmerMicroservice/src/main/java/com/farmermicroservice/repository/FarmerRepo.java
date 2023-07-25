package com.farmermicroservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.farmermicroservice.model.Farmer;

@Repository
public interface FarmerRepo extends MongoRepository<Farmer, String> {

	List<Farmer> findByfarmerId(String fId);

}
