package com.raystec.interview.OOP;

public class Rectangle1  extends Shape1 {

	
	private int length;
	private int width;
	
	
	public Rectangle1(){
		//super();
		super(2,4);
		System.out.println("This is child class constructor");
	}
	public int getLength() {
		return length;
	}



	public void setLength(int length) {
		this.length = length;
	}



	public int getWidth() {
		return width;
	}



	public void setWidth(int width) {
		this.width = width;
	}



	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*width;
	}

}
