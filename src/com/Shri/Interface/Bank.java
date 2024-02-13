package com.Shri.Interface;

public interface Bank {
	double Min_Balance=1000;
	double Deposite_Limit=2500;
	double interset_rate=7.8;
	
	void deposite(Account account,double amount);
	void withdraw(Account account,double amount);
}
