package com.retailBanking.accountsService.accountRecordController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.retailBanking.accountsService.Models.accountsModel;
import com.retailBanking.accountsService.accountRecordService.AccountRecordService;

@RestController
public class AccountRecordImpl implements AccountRecord {
	double userId = 1.0;
	@Autowired
	AccountRecordService service;
	
	
	@Override
	public List<accountsModel> getAllAccountsListforType(@RequestParam(name = "type")String type) {
	
		return  service.getAllAccountsListforType(type, userId);
		
		
	}
	

}
