package com.retailBanking.accountsService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.retailBanking.accountsService.model.Account;

public interface AccountRepository extends JpaRepository<Account,Double>{

}
