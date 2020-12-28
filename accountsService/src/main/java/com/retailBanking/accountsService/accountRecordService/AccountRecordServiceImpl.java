package com.retailBanking.accountsService.accountRecordService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retailBanking.accountsService.Models.accountsModel;
import com.retailBanking.accountsService.Repository.accountRepository;

@Service
public class AccountRecordServiceImpl implements AccountRecordService {
	@Autowired
	accountRepository repo;
	
	public List<accountsModel> getAllAccountsListforType(String type, Double userId) {
	
		
		List<accountsModel> data = repo.findByAccountType(type ,userId);
		
			return data;
	}

}
