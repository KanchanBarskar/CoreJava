package com.raystec.interview.OOP;

public class MethodOverloadingEx {
public void sum(int a,int b){
	int c=a+b;
	System.out.println("c is "+c);
}
public void sum(int a,int b,int c){
	int d=a+b+c;
	System.out.println("d is "+d);
}
public void sum(int a,int b,int c,int d){
	int e=a+b+c+d;
	System.out.println("e is "+e);
}
public void sum(float a,float b){
	float c=a+b;
	System.out.println("float c is "+c);
}
public void sum(float a,float b,float c){
	float d=a+b+c;
	System.out.println("float d is "+d);
}
public static void main(String[] args) {
	MethodOverloadingEx ex=new MethodOverloadingEx();
	ex.sum(2, 5);
	ex.sum(20.6f, 34.7f,12.4f);
	
}
}
