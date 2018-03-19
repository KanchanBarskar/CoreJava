package com.raystec.interview.exception;

public class MultiExceptionHandling {
public static void main(String[] args) {
	String name="Rays Technology";
	String address=null;
	
	try{
		System.out.println(address.length());
		System.out.println(name.charAt(16));
	}catch(StringIndexOutOfBoundsException e){
		System.out.println("String is small");
	}catch (NullPointerException e) {

		System.out.println("String is null");
		
	}
}
}
