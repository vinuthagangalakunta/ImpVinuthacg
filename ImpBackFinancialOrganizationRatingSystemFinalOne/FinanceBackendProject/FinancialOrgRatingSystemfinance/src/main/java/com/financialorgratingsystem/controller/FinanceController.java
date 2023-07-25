package com.financialorgratingsystem.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financialorgratingsystem.entity.Finance;
import com.financialorgratingsystem.exception.NotFoundException;
import com.financialorgratingsystem.service.FinanceService;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/finance")



public class FinanceController {
	@Autowired
    FinanceService financeService;
	
	//http://localhost:8088/api/finance/add
	@PostMapping("/add")
	public ResponseEntity<Finance> insertFinance(@RequestBody Finance finance){
		Finance finance1= financeService.add(finance);
		if(finance1==null)
		{
			return new ResponseEntity("Sorry! finance not added!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Finance>(finance1, HttpStatus.OK);
	}
	
//	@PostMapping("/fin")
//	public ResponseEntity<Finance> validateFinanceUser(@RequestBody Finance finance1)
//	{
//		Finance finance= financeService.validateLogin(finance1.getfId(),finance1.getPassword());
//		if(finance==null)
//		{
//			return new ResponseEntity("Sorry! login failed",HttpStatus.NOT_FOUND);
//		}
//		return new ResponseEntity<Finance>(finance, HttpStatus.OK);
//		
//	}
	
	
	@GetMapping("/get/{fId}")
	public ResponseEntity<Finance> findFinanceById(
			@PathVariable("fId")Integer fId) throws NotFoundException{
		Finance f= financeService.getFinanceById(fId);
		if(f==null) {
			throw new NotFoundException();
//			return new ResponseEntity("Sorry! finance not found!", 
//					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Finance>(f, HttpStatus.OK);
	}
	
	//http://localhost:8088/api/finance/getall
	@GetMapping("/getall")
	public ResponseEntity<List<Finance>> findAllFinance()
			 throws NotFoundException{
		List<Finance> finList=financeService.getAllFinance();
		if(finList.isEmpty()) {
			return new ResponseEntity("Sorry! Finance is not Found", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Finance>>(finList, HttpStatus.OK);
	}
	
}

