package com.retailBanking.accountsService.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retailBanking.accountsService.model.Account;
import com.retailBanking.accountsService.model.CreditCard;
import com.retailBanking.accountsService.repository.AccountRepository;
import com.retailBanking.accountsService.repository.CreditCardRepository;

@Service
public class AccountRecordServiceImpl implements AccountRecordService{

	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private CreditCardRepository creditCardRepository;
	
	public List<Account> fetchAllAccounts(){
		List<Account> list=accountRepository.findAll();
		return list;
	}
	
	public List<Account> fetchAllAccountByType(String accountType, double userId){
		List<Account> list=accountRepository.findAll().stream().filter(account->account.getAccountType().equals(accountType) && account.getUserId().getUserId()==userId).collect(Collectors.toList());
		return list;
	}
	
	public List<Account> fetchAllAccountByAccountNo(double accountNo){
		List<Account> list=accountRepository.findAll().stream().filter(account->account.getAccountNo()==accountNo).collect(Collectors.toList());
		return list;
	}
	
	public List<Account> fetchAllAccountByAccountNoUserId(double accountNo, double userId){
		List<Account> list=accountRepository.findAll().stream().filter(account->account.getAccountNo()==accountNo && account.getUserId().getUserId()==userId).collect(Collectors.toList());
		return list;
	}
	
	public List<CreditCard> fetchCardForAccontNo(double accountNo){
		List<CreditCard> list=creditCardRepository.findAll().stream().filter(card->card.getAccountNo().getAccountNo()==accountNo).collect(Collectors.toList());
		return list;
	}
}
