package com.retailBanking.accountsService.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="login")
public class Login {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userid")
	private double userId;
	
	@JsonManagedReference
	@JsonIgnore
	@OneToMany(targetEntity=Account.class,mappedBy="userId",fetch=FetchType.LAZY)
	private List<Account> accounts;
	
	@JsonManagedReference
	@JsonIgnore
	@OneToMany(targetEntity=Transaction.class,mappedBy="userId",fetch=FetchType.LAZY)
	private List<Transaction> transaction = new ArrayList<>();

	public Login() {
		super();
	}

	public Login(double userId) {
		super();
		this.userId = userId;
	}

	public double getUserId() {
		return userId;
	}

	public void setUserId(double userId) {
		this.userId = userId;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public List<Transaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}
	
	
}
