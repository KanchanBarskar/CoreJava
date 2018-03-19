package com.raystec.interview.OOP;



public class TestOverriding {
	
	public static double calTotalArea(Shape[] s){
		double totalArea=0;
		
		for(int i=0;i<s.length;i++){
			totalArea=totalArea+s[i].area();
		}
		return totalArea;
		
	}
	
	public static Shape getShape(int i){
		if(i==1)
			return new Rectangle();
		if(i==2)
			return new Circle();
		if(i==3)
			return new Triangle();
		return null;
	}
	
public static void main(String[] args) {
	/*Rectangle1 r=new Rectangle1();
	r.setBorderWidth(2);
	r.setColor("Red");
	r.setLength(7);
	r.setWidth(3);
	System.out.println(r.getBorderWidth());
	System.out.println(r.getColor());
	System.out.println(r.area());*/
	
	//Rectangle r=(Rectangle) new Shape();
	//System.out.println(r.area());
	
	//polymorphism using array
	Shape[] s=new Shape[3];
	s[0]=new Rectangle();
	s[1]=new Circle();
	s[2]=new Triangle();
	
	System.out.println(s[0].area());
	System.out.println(s[1].area());
	System.out.println(s[2].area());
	
	//polymorphism using method argument
	
	double totalArea=calTotalArea(s);
	System.out.println("Total area "+totalArea);
	
	//polymorphism using method return type
	
	Shape s1=getShape(1);
	System.out.println(s1.area());
	
	
	
	
}
}
