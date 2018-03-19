package com.raystec.interview.basic;

public class ReverseANumber {
public static void main(String[] args) {
	int n=346;
	int digit=0,rev=0;
	while(n>0){
	digit=n%10;
	//System.out.print(digit);
	rev=(rev*10)+digit;
	n=n/10;
	
	}
	System.out.println(rev);
}
}
