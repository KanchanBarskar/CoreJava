package com.raystec.interview.exception;

public class ProgrammaticException {
public static boolean isUserValid(){
	return false;
			}

public static void main(String[] args) {
	boolean found=isUserValid();
	 
	
	
	if(found==true){
		System.out.println("User is valid");
	}
	else{
		throw new RuntimeException("Invalid User");
	}
}
}

