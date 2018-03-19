package com.raystec.interview.basic.Arrays;

public class FindDuplicateElement {
public static void main(String[] args) {
	int arr[]={1,2,3,4,5,2,4,1,6,7};
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]==arr[j]){
				System.out.println("Duplicate element : "+arr[i]);
			}
		}
	}
}
}
