package com.raystec.interview.basic.Arrays;

public class SumValueOfAnArray {
public static void main(String[] args) {
	int[] arr={121,234,134,456,654,354,876,890,76,421};
	int sum=0;
	for(int i:arr){
		sum+=i;
	}
	System.out.println("Sum of values of an arrays "+sum);
}
}
