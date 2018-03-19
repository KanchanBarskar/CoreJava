package com.raystec.interview.exception;

public class FamilyPropagation {
	//Unchecked Exception propagation  
	
public static int dad(){
	try{
		mom();
	}catch(RuntimeException e){
		System.out.println("Dad handle exception raised by son");
	}finally{
		//throw new RuntimeException("From finally");
		//return 2;
	}
	return 2;
	//System.out.println("After finally");
}
public static void mom(){
	son();
}
public static void son(){
	throw new RuntimeException("I mad mistake");
}

public static void main(String[] args) {
	int i=dad();
	System.out.println(i);
}
}

