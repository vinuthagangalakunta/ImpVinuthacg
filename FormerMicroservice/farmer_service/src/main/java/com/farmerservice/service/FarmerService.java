package com.farmerservice.service;

import java.util.List;

import com.farmerservice.model.Farmer;

public interface FarmerService {

	

	Farmer addFarmer(Farmer farmer);

	Farmer farmerLogin(String username, String password);

	List<Farmer> getAllFarmers();

	Farmer getFarmerById(String farmerId);

	Farmer updateFarmer(Farmer farmer);

	void deleteFarmer(String farmerId);

}
