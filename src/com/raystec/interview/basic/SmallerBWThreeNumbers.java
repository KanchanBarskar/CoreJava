package com.raystec.interview.basic;
//using conditional operator
public class SmallerBWThreeNumbers {
public static void main(String[] args) {
	int a=5,b=9,c=2;
	if(a<b && a<c){
		System.out.println("a is smaller "+a);
	}else{
		if(b<a && b<c){
			System.out.println("b is smaller "+b);
		}else{
			System.out.println("c is smaller "+c);
		}
	}
}
}
