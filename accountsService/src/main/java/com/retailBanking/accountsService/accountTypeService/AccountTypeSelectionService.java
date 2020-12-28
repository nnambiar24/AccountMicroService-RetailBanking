package com.retailBanking.accountsService.accountTypeService;

import java.util.List;

import com.retailBanking.accountsService.Models.accountsModel;

public interface AccountTypeSelectionService {

	
	
	List<accountsModel> getAccountType(String type);

}
