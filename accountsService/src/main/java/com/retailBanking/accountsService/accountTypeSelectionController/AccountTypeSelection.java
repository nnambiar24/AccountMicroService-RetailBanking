package com.retailBanking.accountsService.accountTypeSelectionController;

import java.io.IOException;
import java.util.List;

import com.retailBanking.accountsService.Models.accountsModel;

public interface AccountTypeSelection {
	
	
	List<accountsModel> getAccountType(String type) throws IOException;

	
}
