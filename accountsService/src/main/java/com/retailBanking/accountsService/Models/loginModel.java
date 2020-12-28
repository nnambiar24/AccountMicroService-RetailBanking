package com.retailBanking.accountsService.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class loginModel {
	
	@Id
	@Column(name="userid")
	private double userid;

	public double getUserid() {
		return userid;
	}

	public void setUserid(double userid) {
		this.userid = userid;
	}

	public loginModel() {
		
	}
	
	
}
