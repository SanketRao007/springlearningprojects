package com.sankethomeprojects.application.model;


import java.math.BigDecimal;

public class FastPassCustomer {
	
	public FastPassCustomer() {
		super();
	}
	private String fastPassId;
	private String customerFullName;
	private String fastPassPhone;
	private BigDecimal currentBalance;
	
	
	public FastPassCustomer(String fastPassId, String customerFullName, String fastPassPhone,
			BigDecimal currentBalance) {
		super();
		this.fastPassId = fastPassId;
		this.customerFullName = customerFullName;
		this.fastPassPhone = fastPassPhone;
		this.currentBalance = currentBalance;
	}
	public String getFastPassId() {
		return fastPassId;
	}
	public void setFastPassId(String fastPassId) {
		this.fastPassId = fastPassId;
	}
	public String getCustomerFullName() {
		return customerFullName;
	}
	public void setCustomerFullName(String customerFullName) {
		this.customerFullName = customerFullName;
	}
	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}
	public String getFastPassPhone() {
		return fastPassPhone;
	}
	public void setFastPassPhone(String fastPassPhone) {
		this.fastPassPhone = fastPassPhone;
	}
}

