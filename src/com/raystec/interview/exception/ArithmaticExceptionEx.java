package com.raystec.interview.exception;

public class ArithmaticExceptionEx {
public static void main(String[] args) {
	int a=25;
	int b=0;
	int div;
	System.out.println("Before Exception");
	try{
	div=a/b;
	}catch(Throwable e){
	//}catch(ArithmeticException e){
		System.out.println("Number is not devided by 0");
	}
	System.out.println("After Exception");
	
	
	
}
}
