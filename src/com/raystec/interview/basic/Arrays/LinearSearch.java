package com.raystec.interview.basic.Arrays;

public class LinearSearch {
	
	public static int linearSearch(int[] arr,int number){
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==number){
				return i;
			}
		}
		
		return -1;
		
	}
public static void main(String[] args) {
	int[] arr={10,20,30,40,50,60,70,80,90,100};
	int number=50;
	
	int index=linearSearch(arr, number);
	System.out.println("index of number "+index);
	
	
}
}
