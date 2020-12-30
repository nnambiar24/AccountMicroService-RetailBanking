package com.retailBanking.accountsService.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="transaction")
public class Transaction {

	@Id
	@Column(name="transactionid")
	private double transactionId;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="accountnickname")
	private String accountnickname ;
	
	@Column(name="date")
	private LocalDate date;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="userid")
	private Login userId;

	public Transaction() {
		super();
	}

	public Transaction(double transactionId, double amount, String accountnickname, LocalDate date, Login userId) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.accountnickname = accountnickname;
		this.date = date;
		this.userId = userId;
	}

	public double getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(double transactionId) {
		this.transactionId = transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getAccountnickname() {
		return accountnickname;
	}

	public void setAccountnickname(String accountnickname) {
		this.accountnickname = accountnickname;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Login getUserId() {
		return userId;
	}

	public void setUserId(Login userId) {
		this.userId = userId;
	}
	
	
}
