package com.raystec.interview.basic;

public class PalindromeNumber {
public static void main(String[] args) {
	int n=146,r=0,rev=0;
	int temp=n;
	while(n>0){
		r=n%10;//getting remainder
		rev=(rev*10)+r;
		n=n/10;
	}
	System.out.println(rev);
	if(rev==temp){
		System.out.println("number is palindrome");
	}else{
		System.out.println("number is not palindrome");
	}
}
}
