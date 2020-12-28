package com.retailBanking.accountsService.accountRecordService;

import java.util.List;

import com.retailBanking.accountsService.Models.accountsModel;

public interface AccountRecordService {

	 List<accountsModel> getAllAccountsListforType(String type, Double userId);
	
}
