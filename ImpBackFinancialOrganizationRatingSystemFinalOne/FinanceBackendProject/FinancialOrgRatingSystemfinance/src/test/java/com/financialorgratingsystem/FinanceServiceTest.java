package com.financialorgratingsystem;

	import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;
	import org.mockito.Mockito;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.test.context.SpringBootTest;
	import org.springframework.boot.test.mock.mockito.MockBean;

	import com.financialorgratingsystem.entity.Finance;
	import com.financialorgratingsystem.exception.NotFoundException;
	import com.financialorgratingsystem.repository.FinanceRepo;
	import com.financialorgratingsystem.service.FinanceService;

	@SpringBootTest
	class FinanceServiceTest {
		
		@Autowired
		FinanceService financeService;
		
		@MockBean
		FinanceRepo financeRepo;
		
		Finance f1;
		
		@BeforeEach
		void setUp(){
			
			f1=new Finance();
			f1.setfId(1);
			f1.setContactNumber("630144797");
			f1.setEmailId("vinutha@gmail.com");
			f1.setFirstName("vinutha");
			f1.setLastName("gangalakunta");
			f1.setPassword("vinutha9");
			f1.setRole("Analyst");
			f1.setUserName("Vinutha");
		}
		

//		@Test
//		void testValidateLogin() {			
//			Mockito.when(financeRepo.existsById(f1.getfId())).thenReturn(true);
//			Mockito.when(financeRepo.checkFinanceUserCredential(f1.getfId(), f1.getPassword())).thenReturn(f1);
//			assertThat(financeService.validateLogin(f1.getfId(), f1.getPassword())).isEqualTo(f1);
//		}
		
		
		@Test
		void testAdd() {
			Mockito.when(financeRepo.save(f1)).thenReturn(f1);
			assertThat(financeService.add(f1)).isEqualTo(f1);		
		}	
		
		@Test
		void  testgetFinanceById() throws NotFoundException {
			Mockito.when(financeRepo.existsById(f1.getfId())).thenReturn(true);
			Mockito.when(financeRepo.getById(f1.getfId())).thenReturn(f1);
			assertThat(financeService.getFinanceById(f1.getfId())).isEqualTo(f1);
			
		}

		
		@Test
		void testGetAllFinance() {
			
		Finance  f2= new Finance();
		
		f2.setfId(3);
		f2.setUserName("vishnu");
		f2.setContactNumber("966689909");
		f2.setEmailId("vishnu@gmail.com");
		f2.setFirstName("vinutha");
		f2.setLastName("gangalakunta");
		f2.setPassword("vishnu");
		f2.setRole("Analyst");
		List<Finance> fList = new ArrayList<>();
		fList.add(f1);
		fList.add(f2);
		Mockito.when(financeRepo.findAll()).thenReturn(fList);
		assertThat(financeService.getAllFinance()).isEqualTo(fList);
		}
		
	}

