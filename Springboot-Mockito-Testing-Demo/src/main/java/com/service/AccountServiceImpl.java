package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.model.Account;
//import com.repository.AccountRepoImpl;
import com.repository.AccountRepository;

@Service
@Transactional
public class AccountServiceImpl implements AccountServiceIntf{

	@Autowired
	AccountRepository repo;

	public Account saveAccount(Account acc) {
		Account save = repo.save(acc);
		return save;

	}

	public List<Account> fetchAccount() {
		return repo.findAll();
	}

	public boolean deleteAccountById(int id) {
		Optional<Account> acc = repo.findById(id);
		if (acc.isPresent()) {
			repo.deleteById(id);
		}else {
		return false;
		}
		return true;
	}

	public boolean updateAccount(Account account) {
		
		Optional<Account> findById = repo.findById(account.getAccId());
		if(findById.isPresent()) {
			repo.save(account);
		}else {
			return false;
		}
		return true;
	}

}
