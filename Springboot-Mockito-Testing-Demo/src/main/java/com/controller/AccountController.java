package com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.model.Account;
import com.service.AccountServiceIntf;

@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired
	AccountServiceIntf service;

	@PostMapping("/saveAccount")
	public ResponseEntity<Account> saveAccount(@RequestBody Account acc) {

	          Account account = service.saveAccount(acc);

		return new ResponseEntity<Account>(account,HttpStatus.CREATED);
	}

	@GetMapping("/fetchAccount")

	public ResponseEntity<List<Account>> fetchAccount() {
		List<Account> uList = service.fetchAccount();
		if (!uList.isEmpty())
			return new ResponseEntity<>(uList, HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@DeleteMapping("/deleteAccount/{accId}")
	public ResponseEntity<String> deleteAccount(@PathVariable("accId") int accId) {
	          if(service.deleteAccountById(accId)) {
	        	  return new ResponseEntity<String>("deleted success",HttpStatus.OK);
	          }
		return new ResponseEntity<String>("account does not exist",HttpStatus.NOT_FOUND);
	}
	
	@PutMapping("/updateAccount")
	public ResponseEntity<String> updateAccount(@RequestBody Account account){
	
		if(service.updateAccount(account)) {
			return new ResponseEntity<String>("account updated success",HttpStatus.OK);

		}
		return new ResponseEntity<String>("account does not exist",HttpStatus.NO_CONTENT);
	}
}
