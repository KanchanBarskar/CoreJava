package com.raystec.interview.exception;

public class HandleMulExceptionInSingleCatch {
public static void main(String[] args) {
	String name="Rays";
	String n=null;
	try{
		System.out.println(n.length());
		System.out.println(name.charAt(5));
	}
	catch(NullPointerException | StringIndexOutOfBoundsException ex){
		System.out.println("String is small "+ex.getMessage());
		ex.printStackTrace();
	}
}
}
