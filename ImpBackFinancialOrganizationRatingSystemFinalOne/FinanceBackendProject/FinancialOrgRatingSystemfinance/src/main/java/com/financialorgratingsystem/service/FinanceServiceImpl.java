package com.financialorgratingsystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financialorgratingsystem.entity.Finance;
import com.financialorgratingsystem.exception.NotFoundException;
import com.financialorgratingsystem.repository.FinanceRepo;
@Service("financeService")
public class FinanceServiceImpl implements FinanceService{
	@Autowired
	FinanceRepo financeRepo;

//	@Override
//      public Finance validateLogin(int fId,String password) {
//		if(financeRepo.existsById(fId))
//		{
//			return financeRepo.checkFinanceUserCredential(fId,password);
//		}
//		return null;
//	}
	
	@Transactional
	@Override
		public Finance add(Finance finance) {
		Finance f1=financeRepo.save(finance);
		return f1;
	}
	

	@Override
	public Finance getFinanceById(int fId) throws NotFoundException{
		if(financeRepo.existsById(fId)) {
		return financeRepo.getById(fId);
	}
		return null;
	}

	@Override
	public List<Finance> getAllFinance() {
		return financeRepo.findAll();
	}

}
