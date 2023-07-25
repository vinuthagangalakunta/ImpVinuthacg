package com.financialorgratingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.financialorgratingsystem.entity.Finance;
@Repository("financeRepo")
public interface FinanceRepo extends JpaRepository<Finance,Integer>{

	@Query("Select f from Finance f where f.fId=?1 and f.password=?2")
	public Finance checkFinanceUserCredential(int fId, String password);
	

}
