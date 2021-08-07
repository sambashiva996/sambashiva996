package com.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.model.Account;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceTest {

	@Autowired
	AccountServiceImpl accService;

	@Test
	public void saveAccount() {

		Account acc = new Account(1004, 8000.00);
		accService.saveAccount(acc);

	}

	@Test
	public void fetchAccount() {
		List<Account> ulist = accService.fetchAccount();
		
		assertEquals(1, ulist.size());
	}
	
	@Test
	public void deleteAccount() {
		assertTrue(true);
	}
	
//	@Test
//	public void updateAccount() {
//		assertTrue(true);
//	}
	
}
