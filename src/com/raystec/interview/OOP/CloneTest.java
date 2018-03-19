package com.raystec.interview.OOP;

public class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		//Shallow Cloning & default cloning
		BankAccount ba1=new BankAccount(4000);
		System.out.println("balance of ba1 "+ba1.getBalance());
		BankAccount ba2=(BankAccount) ba1.clone();
		System.out.println("balance of ba2 "+ba2.getBalance());
		
		//Deep cloning
		
		Customer customer=new Customer("Kanchan",11000);
		System.out.println("Original Object");
		System.out.println(customer.getName());
		System.out.println(customer.getAccount().getBalance());
		
		Customer customer2=(Customer) customer.clone();
		System.out.println("Cloned Object");
		System.out.println(customer2.getName());
		System.out.println(customer2.getAccount().getBalance());
		
		
	}
	
}
