package com.raystec.interview.basic.Arrays;

import java.util.Arrays;

public class FindCommonElements {
public static void main(String[] args) {
	int[] arr1={1,2,3,4,5,6,7,8,9,0};
	int[] arr2={3,22,43,5,7,56,8,76,89};
	System.out.println(Arrays.toString(arr1));
	System.out.println(Arrays.toString(arr2));
	System.out.println("Common elements are : ");
	for (int i = 0; i < arr1.length; i++) {
		for (int j = 0; j < arr2.length; j++) {
			if(arr1[i]==arr2[j]){
				System.out.println(arr1[i]);
			}
		}
	}
}
}
