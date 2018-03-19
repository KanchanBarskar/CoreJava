package com.raystec.interview.OOP;

public class Circle2 extends Shape2 {
	private int r;
	
	public Circle2(int r){
		this.r=r;
	}
public void area(){
	super.area();
	System.out.println("This is the area of circle");
	double a=3.14*r*r;
	System.out.println(a);
}
}
