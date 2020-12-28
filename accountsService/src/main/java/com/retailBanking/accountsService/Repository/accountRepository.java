package com.retailBanking.accountsService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.retailBanking.accountsService.Models.accountsModel;

public interface accountRepository extends JpaRepository<accountsModel, Double> {

	@Query("select a from accountsModel a where a.accountType = ?1 and a.userid=?2")
	List<accountsModel> findByAccountType(String type , Double id);

}
