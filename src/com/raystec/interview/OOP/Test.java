package com.raystec.interview.OOP;

public class Test {

	public int sum(int a,int b){
		int c=a+b;
		return c;
		
	}
	public double sum(double a,double b){
		double c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t.sum(2, 4));
		System.out.println(t.sum(2.5, 4.5));
	}
}


