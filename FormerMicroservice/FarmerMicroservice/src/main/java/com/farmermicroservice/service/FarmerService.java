package com.farmermicroservice.service;

import java.util.List;
import java.util.Optional;

import com.farmermicroservice.exception.NotFoundException;
import com.farmermicroservice.model.Farmer;

public interface FarmerService {

	public Farmer addFarmer(Farmer f);

	public List<Farmer> getAllCrops() throws NotFoundException;

	public Optional<Farmer> getFarmerDetails(String fId);

	public Farmer updateFarmer(Farmer farmer);

	public void deleteFarmer(int fId);

}
