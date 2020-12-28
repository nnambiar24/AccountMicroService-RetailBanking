package com.retailBanking.accountsService.Models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="creditcard")
public class creditCardModel {
	
	
	@Id
	@Column(name="creditcardnumber")
	private Double creditCardNumber;
	
	@Column(name="accountno")
	private Double accountNo;
	

	@Column(name = "creditbalance")
	private Double creditBalance;
	
	@Column(name=" availablebalance")
	private Double avaliableBalance;
	
	@Column(name="paymentduedate")
	private String date;
	
	@Column(name="minimumpayment")
	private Double minimumPayment;
	
	
	public Double getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(Double creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public Double getCreditBalance() {
		return creditBalance;
	}

	public void setCreditBalance(Double creditBalance) {
		this.creditBalance = creditBalance;
	}

	public Double getAvaliableBalance() {
		return avaliableBalance;
	}

	public void setAvaliableBalance(Double avaliableBalance) {
		this.avaliableBalance = avaliableBalance;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Double getMinimumPayment() {
		return minimumPayment;
	}

	public void setMinimumPayment(Double minimumPayment) {
		this.minimumPayment = minimumPayment;
	}

	

	
	
	
	
	
	
	public creditCardModel() {
		
	}



	
	

	

	
	
}
