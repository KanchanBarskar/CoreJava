package com.raystec.interview.basic.Arrays;

import java.util.Arrays;

public class BubbleSort {
public static void main(String[] args) {
	int[] arr={23,43,12,56,74,87,67,43,87,90,23};
	System.out.println(Arrays.toString(arr));
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j]){
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(arr));
	
}
}
