package com.financialorgratingsystem.service;

import java.util.List;

import com.financialorgratingsystem.entity.Finance;
import com.financialorgratingsystem.exception.NotFoundException;

public interface FinanceService {
	
	 public Finance add(Finance finance);	
//	public Finance validateLogin(int fId,String password);	
      public Finance getFinanceById(int fId) throws NotFoundException ;
      public List<Finance> getAllFinance();

}
