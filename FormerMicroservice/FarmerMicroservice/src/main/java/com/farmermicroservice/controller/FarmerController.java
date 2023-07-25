package com.farmermicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmermicroservice.exception.NotFoundException;
import com.farmermicroservice.model.Farmer;
import com.farmermicroservice.service.FarmerService;

@RestController
@RequestMapping("/farmer")
@CrossOrigin(origins = "*")
public class FarmerController {
	@Autowired
	FarmerService farmerService;

	@PostMapping("/add")
	public ResponseEntity<Farmer> insertFarmer(@RequestBody Farmer f) {
		Farmer farmer1 = farmerService.addFarmer(f);
		return new ResponseEntity<>(farmer1, HttpStatus.OK);
	}

	@GetMapping("/get/farmer")
	public ResponseEntity<List<Farmer>> getAllCrops() {
		List<Farmer> fList = farmerService.getAllCrops();
		return new ResponseEntity<>(fList, HttpStatus.OK);
	}

//	@PutMapping("/update")
//	public ResponseEntity<Object> updateFarmer(@RequestBody Farmer farmer) throws NotFoundException {
//	Farmer f = farmerService.updateFarmer(f,fId);
//	if (farmer == null) {
//	return new ResponseEntity<Object>("Sorry! update failed!", HttpStatus.NOT_FOUND);
//	}
//	return new ResponseEntity<>(f, HttpStatus.OK);
//	}

}
