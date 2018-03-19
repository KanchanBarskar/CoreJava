package com.raystec.interview.basic;

import java.util.Random;

public class RandomClassExample {
public static void main(String[] args) {
	Random r=new Random();
	for(int i=1;i<=10;i++){
		//int number=r.nextInt(100);
		double number=r.nextDouble()*100;
		System.out.println(number);
	}
}
}
