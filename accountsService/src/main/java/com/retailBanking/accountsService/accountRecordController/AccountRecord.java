package com.retailBanking.accountsService.accountRecordController;

import java.util.List;

import com.retailBanking.accountsService.Models.accountsModel;

public interface AccountRecord {

	

	List<accountsModel> getAllAccountsListforType(String type);

}
