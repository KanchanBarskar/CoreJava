package com.raystec.interview.collection;

public class TestMarksheet1 {
public static void main(String[] args) {
	
	Marksheet1 m1=new Marksheet1("11", "Kanchan", 76);
	Marksheet1 m2=new Marksheet1("13", "Rahul", 74);
	Marksheet1 m3=new Marksheet1("15", "Ritesh", 65);
	Marksheet1 m4=new Marksheet1("13", "Kumkum", 67);
	Marksheet1 m5=new Marksheet1("16", "Pooja", 45);
	Marksheet1 m6=new Marksheet1("17", "Sunny", 77);
	Marksheet1 m7=new Marksheet1("11", "Kanchan", 76);
	Marksheet1 m8=m7;
	
	System.out.println(m1.equals(m7));
	System.out.println(m1.hashCode());
	System.out.println(m7.hashCode());
	System.out.println(m1.rollNo);
	
	System.out.println(m7.equals(m8));
	
	
}
}
