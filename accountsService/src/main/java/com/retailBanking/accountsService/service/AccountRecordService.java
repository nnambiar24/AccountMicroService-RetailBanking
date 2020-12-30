package com.retailBanking.accountsService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.retailBanking.accountsService.model.Account;
import com.retailBanking.accountsService.model.CreditCard;

@Service
public interface AccountRecordService {

	public List<Account> fetchAllAccounts();
	public List<Account> fetchAllAccountByType(String accountType, double userId);
	public List<Account> fetchAllAccountByAccountNo(double accountNo);
	public List<Account> fetchAllAccountByAccountNoUserId(double accountNo, double userId);
	public List<CreditCard> fetchCardForAccontNo(double accountNo);
}
