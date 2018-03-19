package com.raystec.interview.OOP;

public class Rectangle extends Shape{

	private int length=6;
	private int breath=8;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreath() {
		return breath;
	}
	public void setBreath(int breath) {
		this.breath = breath;
	}
	
	public double area(){
		return length*breath;
	}
	
}
