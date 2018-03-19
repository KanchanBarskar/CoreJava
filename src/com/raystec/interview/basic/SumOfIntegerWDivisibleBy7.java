package com.raystec.interview.basic;
//program to find sum of integers which is divisible by seven between 100 and 200
public class SumOfIntegerWDivisibleBy7 {
public static void main(String[] args) {
	int sum=0;
	for(int i=100;i<=200;i++){
		if(i%7==0){
			System.out.println(i);
			sum=sum+i;
		}
	}
	System.out.println("sum of integers which is divisible by seven is "+sum);
}
}
 