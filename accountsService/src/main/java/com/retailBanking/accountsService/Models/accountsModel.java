package com.retailBanking.accountsService.Models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class accountsModel {

	@Column(name="userid")
	private Double userid;


	@Id
	@Column(name = "accountno")
	private Double accountNo;
	
	@Column(name = " accounttype")
	private String accountType;
	
	@Column(name="accountnickname")
	private String accountNickName;
	
	@Column(name="accountbalance")
	private Double accountBalance;

	public Double getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Double accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountNickName() {
		return accountNickName;
	}

	public void setAccountNickName(String accountNickName) {
		this.accountNickName = accountNickName;
	}

	public Double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public accountsModel() {
		super();
	}

	@OneToMany(targetEntity = creditCardModel.class, mappedBy = "accountNo")
	private List<creditCardModel> cardModel;

	public List<creditCardModel> getCardModel() {
		return cardModel;
	}

	public void setCardModel(List<creditCardModel> cardModel) {
		this.cardModel = cardModel;
	}

	public accountsModel(Double accountNo, String accountType, String accountNickName, Double accountBalance, List<creditCardModel> cardModel) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.accountNickName = accountNickName;
		this.accountBalance = accountBalance;
		this.cardModel = cardModel;
	}

	
	
	

	
	
	
	
	
}
