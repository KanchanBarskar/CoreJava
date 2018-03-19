

package com.raystec.interview.OOP;

//Cloning Example

public class BankAccount implements Cloneable {
private double balance=0.0;

public BankAccount(double balance){
	this.balance=balance;
}

public double getBalance(){
	return balance;
}

public Object clone() throws CloneNotSupportedException{
	return super.clone();
	
}


}
