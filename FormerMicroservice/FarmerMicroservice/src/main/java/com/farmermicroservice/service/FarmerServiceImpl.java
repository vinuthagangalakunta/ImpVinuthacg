package com.farmermicroservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.farmermicroservice.exception.NotFoundException;
import com.farmermicroservice.model.Farmer;
import com.farmermicroservice.repository.FarmerRepo;

public class FarmerServiceImpl implements FarmerService {

	@Autowired
	FarmerRepo farmerRepo;

	@Transactional

	public Farmer addFarmer(Farmer f) {
		Farmer farmer = farmerRepo.save(f);
		return farmer;
	}

	@Override
	public List<Farmer> getAllCrops() throws NotFoundException {
		// TODO Auto-generated method stub
		return farmerRepo.findAll();
	}

	@Override
	public Optional<Farmer> getFarmerDetails(String fId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Farmer updateFarmer(Farmer farmer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteFarmer(int fId) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public Farmer updateFarmer(Farmer farmer) {
//		// TODO Auto-generated method stub
//		Optional<Farmer> optionalFarmer = farmerRepository.findById(farmer.getfarmerId());
//		if(optionalFarmer ==null) {
//			throw new ResorceNotFoundException()
//		}
//	}

//	@Override
//	public String deleteFarmer(String fId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
