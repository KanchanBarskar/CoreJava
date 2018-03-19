package com.raystec.interview.basic.Arrays;

import java.util.Arrays;

public class RemoveDuplicateElements {
public static void main(String[] args) {
	int arr[]={1,2,3,4,5,2,4,1,6,7};
	int length=arr.length;
	System.out.println(Arrays.toString(arr));
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]==arr[j]){
				arr[j]=arr[length-1];
				System.out.println(arr[j]);
				length--;
				j--;
			}
		}
	}
	
	int[] array=Arrays.copyOf(arr, length);
	
	System.out.println(Arrays.toString(arr));
}
}
