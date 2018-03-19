package com.raystec.interview.basic;

public class WrapperClassesExample {
public static void main(String[] args) {
	int i=18;
	Integer intObj=new Integer(i);  //Wrapping
	int j=intObj.intValue();  //Unwrapping
	
	double d=34.6;
	Double dObject=new Double(d);  //Wrapping
	double e=dObject.doubleValue();  //unwrapping
	
	int a=5;
	Integer b=a;  //auto boxing
	int c=b;  //auto unboxing
	
	double f=3.4;
	Double g=f;  //auto boxing
	double h=g;  //auto unboxing
	
	//Parsing = parse String object into primitive data types
	int l=Integer.parseInt("23");
	double m=Double.parseDouble("34.56");
	
	
	
	
}
}
