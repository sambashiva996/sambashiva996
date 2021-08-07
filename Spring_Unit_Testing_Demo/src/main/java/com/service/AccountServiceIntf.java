package com.service;

import java.util.List;

import com.model.Account;

public interface AccountServiceIntf {
	void saveAccount(Account acc);
	List<Account> fetchAccount();
	boolean deleteAccountById(int id);
	boolean updateAccount(Account account);
}
