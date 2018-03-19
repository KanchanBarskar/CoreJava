package com.raystec.interview.OOP;

public class TestInheritance {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.setBorderWidth(2);
		r.setColor("Red");
		r.setLength(10);
		r.setBreath(15);
		
		Triangle t=new Triangle();
		t.setBorderWidth(2);
		t.setColor("Red");
		t.setBase(18);
		t.setHeight(20);
		
		Circle c=new Circle();
		c.setBorderWidth(2);
		c.setColor("Red");
		c.setRadius(3);
		
		
		System.out.println("Rectangle property");
		System.out.println(r.getBorderWidth());
		System.out.println(r.getColor());
		System.out.println(r.getLength());
		System.out.println(r.getBreath());
		System.out.println(r.area());
		System.out.println("Triangle property");
		System.out.println(t.getBorderWidth());
		System.out.println(t.getColor());
		System.out.println(t.getBase());
		System.out.println(t.getHeight());
		System.out.println(t.area());
		
		System.out.println("Circle property");
		System.out.println(c.getBorderWidth());
		System.out.println(c.getColor());
		System.out.println(c.getRadius());
		System.out.println(c.area());
		
		//Parent can keep child reference then we can access only the exposed members of parent class 
		//we can not access the child members
		Shape s=new Rectangle();
		s.setBorderWidth(2);
		s.setColor("red");
		
	}
}
