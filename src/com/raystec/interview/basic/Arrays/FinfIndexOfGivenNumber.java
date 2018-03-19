package com.raystec.interview.basic.Arrays;

public class FinfIndexOfGivenNumber {
	public static int findIndex(int[] arr,int number){
		int i=0;
		while(i<arr.length){
			if(arr[i]==number){
				return i;
			}else
			i++;
		}
		return -1;
	}
	
public static void main(String[] args) {
	int[] arr={2001,2001,2003,2004,2005,2006,2007,2008,2009,2010};
	/*int number=2011;
	for(int i=0;i<=arr.length;i++){
		if(arr[i]==number){
			System.out.println("Index of number 2006 "+i);
			return;
		}
	}
	//System.out.println("-1");*/
	
	System.out.println("Index of given number "+findIndex(arr, 2011));
}
}
