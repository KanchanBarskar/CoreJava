package com.raystec.interview.basic;

public class Factorial {
public static void main(String[] args) {
	int a=5,fact=1;
	for(int i=1;i<=5;i++){
	//for(int i=5;i>=1;i--){
		fact=fact*i;
	}
	System.out.println("factorial of "+a+" is "+fact);
}
}
