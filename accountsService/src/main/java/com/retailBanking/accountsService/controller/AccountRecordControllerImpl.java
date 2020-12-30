package com.retailBanking.accountsService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retailBanking.accountsService.model.Account;
import com.retailBanking.accountsService.model.CreditCard;
import com.retailBanking.accountsService.service.AccountRecordService;

@RequestMapping("accounts")
@RestController
public class AccountRecordControllerImpl{

	@Autowired
	private AccountRecordService accountService; 
	
	@GetMapping
	public List<Account> getAllAccountDetails(){
		List<Account> accountDetailslist=accountService.fetchAllAccounts();
		return accountDetailslist;
	}
	
	@GetMapping("{account_type}/{user_id}")
	public List<Account> getAccountDetailsByType(@PathVariable("account_type")String accountType, @PathVariable("user_id")double userId){
		List<Account> accountDetailsByTypeList=accountService.fetchAllAccountByType(accountType, userId);
		return accountDetailsByTypeList;
	}
	
	@GetMapping("{account_no}")
	public List<Account> getAccountDetailsByAccountNo(@PathVariable("account_no")double accountNo){
		List<Account> accountDetailsByAccountNoList=accountService.fetchAllAccountByAccountNo(accountNo);
		return accountDetailsByAccountNoList;
	}
	
	@GetMapping("{account_no}/{user_id}")
	public List<Account> getAccountDetailsByAccountNoUserId(@PathVariable("account_no")double accountNo,@PathVariable("user_id")double userId){
		List<Account> accountDetailsByAccountNoUserIdList=accountService.fetchAllAccountByAccountNoUserId(accountNo, userId);
		return accountDetailsByAccountNoUserIdList;
	}
	
}
