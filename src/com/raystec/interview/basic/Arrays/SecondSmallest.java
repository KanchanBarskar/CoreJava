package com.raystec.interview.basic.Arrays;

public class SecondSmallest {
public static void main(String[] args) {
	int[] arr={121,234,134,456,654,354,876,890,76,421};
	
	int min=arr[0];
	int secondMin=arr[0];
	
	for (int i = 1; i < arr.length; i++) {
		if(arr[i]<min){
			secondMin=min;
			min=arr[i];
		}
	}
	System.out.println("Min : "+min);
	System.out.println("Second Min : "+secondMin);
}
}
