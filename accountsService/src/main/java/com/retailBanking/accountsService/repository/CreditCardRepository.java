package com.retailBanking.accountsService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.retailBanking.accountsService.model.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard,Double>{

}
