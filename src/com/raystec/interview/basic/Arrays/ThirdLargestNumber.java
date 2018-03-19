package com.raystec.interview.basic.Arrays;

import java.util.Arrays;

public class ThirdLargestNumber {
public static void main(String[] args) {
	int[] arr={23,13,43,24,56,75,68,97,89,67,34,90};
	int temp=0;
	int length=arr.length;
	for(int i=0;i<length;i++){
		for(int j=i+1;j<length;j++){
			if(arr[i]>arr[j]){
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(arr));
	int thirdLargest=arr[length-3];
	System.out.println("Third largest number is "+thirdLargest);
}
}
