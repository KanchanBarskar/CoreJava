package com.raystec.interview.OOP;

public class Customer implements Cloneable {
private String name;
private BankAccount account;

public Customer(String name,double balance){
	this.name=name;
	this.account=new BankAccount(balance);
}

public String getName() {
	return name;
}

public BankAccount getAccount() {
	return account;
}

public Object clone() throws CloneNotSupportedException{
	
	Customer customer=(Customer) super.clone();
	customer.account=(BankAccount) account.clone();
	return customer;
}

}
