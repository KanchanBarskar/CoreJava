package com.raystec.interview.basic;

public class RandomNumbers {
public static void main(String[] args) {
	for(int i=1;i<=5;i++){
		int randomNo=(int) (Math.random()*100);
		System.out.print(" "+randomNo);
	}
}
}
