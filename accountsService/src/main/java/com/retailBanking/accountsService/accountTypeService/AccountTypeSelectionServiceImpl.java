package com.retailBanking.accountsService.accountTypeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retailBanking.accountsService.Models.accountsModel;
import com.retailBanking.accountsService.accountRecordController.AccountRecord;

@Service
public class AccountTypeSelectionServiceImpl implements AccountTypeSelectionService {
	@Autowired
	AccountRecord record;

	@Override
	public List<accountsModel> getAccountType(String type )  {
		
	return record.getAllAccountsListforType(type);
				
				
	}

}
