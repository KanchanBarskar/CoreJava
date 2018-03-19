package com.raystec.interview.OOP;

public abstract class Shape1 {
	
public Shape1(){
	System.out.println("This is Super class constructor");
}

public Shape1(int a,int b){
	System.out.println("This is Parameterized constructor of super class");
}
	private int borderWidth;
	private String color;
	
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double area();
}
