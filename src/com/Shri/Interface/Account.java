package com.Shri.Interface;

public class Account {
	private String accountname;
	private int accountNumber;
	private int balanace;
	private Bank bank;
	
	public Account(String accountname, int accountNumber, int balanace, Bank bank) {
		super();
		this.accountname = accountname;
		this.accountNumber = accountNumber;
		this.balanace = balanace;
		this.bank = bank;
	}
	
	
	public String getAccountname() {
		return accountname;
	}
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getBalanace() {
		return balanace;
	}
	public void setBalanace(int balanace) {
		this.balanace = balanace;
	}
	
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	
	@Override
	public String toString() {
		return "Account [accountname=" + accountname + ", accountNumber=" + accountNumber + ", balanace=" + balanace
				+ ", bank=" + bank + "]";
	}
}
