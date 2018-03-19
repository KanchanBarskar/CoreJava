package com.raystec.interview.exception;

public class TestPropagation {

	public static void callMe() throws FaultException{
		throw new FaultException("This is my fault");
	}
	
	public static void calling() throws MistakeException{
		try {
			callMe();
		} catch (FaultException e) {
			System.out.println(e.getMessage());
			throw new MistakeException("This is my mistake");
		}
	}
	
	public static void main(String[] args){
		try {
			calling();
		} catch (MistakeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
}
