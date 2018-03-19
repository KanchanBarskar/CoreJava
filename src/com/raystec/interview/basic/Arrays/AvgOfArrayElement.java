package com.raystec.interview.basic.Arrays;

public class AvgOfArrayElement {
public static void main(String[] args) {
	int[] arr={121,234,134,456,654,354,876,890,76,421};
	double sum=0;
	double avg=0.0;
	for(int i:arr){
		sum+=i;
	}
	avg=sum/arr.length;
	System.out.println("sum : "+sum);
	System.out.println("avg : "+avg);
}
}
