package com.raystec.interview.exception;

public class FamilyPropagationChecked {

	public static void dad(){
		try {
			mom();
		} catch (MistakeException e) {
			// TODO Auto-generated catch block
			System.out.println("Dad handle exception raised by son");
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void mom() throws MistakeException{
		son();
		
	}
	
	
	public static void son() throws MistakeException{
		throw new MistakeException("I made mistake");
	}
	
	public static void main(String[] args) {
		dad();
	}
}
