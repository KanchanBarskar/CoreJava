package com.raystec.interview.OOP;

public class Circle extends Shape{

	private int radius=7;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area(){
		return 3.14*radius*radius;
	}
	
}
