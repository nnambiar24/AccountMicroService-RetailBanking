package com.retailBanking.accountsService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retailBanking.accountsService.model.CreditCard;
import com.retailBanking.accountsService.service.AccountRecordService;

@RestController
@RequestMapping("card")
public class CreditCardControllerImpl {

	@Autowired
	private AccountRecordService accountService; 
	
	@GetMapping("{account_no}")
	public List<CreditCard> getCreditCardDetails(@PathVariable("account_no")double accountNo) {
		List<CreditCard> card=accountService.fetchCardForAccontNo(accountNo);
		return card;
	}
}
