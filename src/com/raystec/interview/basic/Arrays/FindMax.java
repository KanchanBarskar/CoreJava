package com.raystec.interview.basic.Arrays;

public class FindMax {
public static void main(String[] args) {
	int[] arr={121,234,134,456,654,354,876,890,76,421};
	int max=arr[0];
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]>max){
			max=arr[i];
		}
	}
	System.out.println("Max : "+max);
}
}
