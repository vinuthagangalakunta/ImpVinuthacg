package com.farmerservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farmerservice.model.Farmer;
import com.farmerservice.service.FarmerService;



//This controller class  contains basic crud operation

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class FarmerController {

	@Autowired
	private FarmerService farmerservice;



	/*
	 * doFarmerLogin() is used to login to the farmer dashboard
	 */

	@PostMapping("/farmer-login")
	public ResponseEntity<Farmer> doFarmerLogin(@RequestParam("username") String username,
			@RequestParam("password") final String password) {

		Farmer farmer =farmerservice.farmerLogin(username, password);

		ResponseEntity<Farmer> responseEntity = new ResponseEntity<>(farmer, HttpStatus.OK);

		return responseEntity;

	}

	/*
	 * fetchAllFarmers() is used to get list of all Farmers
	 */

	@GetMapping("/allFarmers")
	public List<Farmer> fetchAllFarmers() {

		List<Farmer> farmers = farmerservice.getAllFarmers();
		return farmers;
	}

	/*
	 * addFarmer() is used to add Farmer details
	 */

	@PostMapping("/save")
	public ResponseEntity<Farmer> addFarmer(@Valid @RequestBody Farmer farmer) {

		Farmer newFarmer = farmerservice.addFarmer(farmer);
		ResponseEntity<Farmer> responseEntity = new ResponseEntity<>(newFarmer, HttpStatus.CREATED);
		return responseEntity;
	}

	/*
	 * fetchFarmerById() is used to get detail of particular Farmer
	 */

	@GetMapping("/get/{id}")
	public ResponseEntity<?> fetchFarmerById(@PathVariable("id") String farmerId) {

		ResponseEntity<?> responseEntity = null;
		Farmer Farmer = farmerservice.getFarmerById(farmerId);
		responseEntity = new ResponseEntity<>(Farmer, HttpStatus.OK);
		return responseEntity;
	}

	/*
	 * deleteFarmerById() is used to delete a single Farmer detail
	 */

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteFarmerById(@PathVariable("id") String farmerId) {

		ResponseEntity<String> responseEntity = null;
		farmerservice.deleteFarmer(farmerId);
		responseEntity = new ResponseEntity<>("Farmer deleted successfully", HttpStatus.OK);
		return responseEntity;
	}

	/*
	 * updateFarmer() is used to update particular Farmer detail
	 */

	@PutMapping("/update")
	public ResponseEntity<Object> updateFarmer(@Valid @RequestBody Farmer farmer) {

		ResponseEntity<Object> responseEntity = null;
		farmerservice.updateFarmer(farmer);
		responseEntity = new ResponseEntity<>("Customer updated successfully", HttpStatus.OK);
		return responseEntity;
	}

}
