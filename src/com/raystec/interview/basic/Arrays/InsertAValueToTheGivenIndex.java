package com.raystec.interview.basic.Arrays;

import java.util.Arrays;

public class InsertAValueToTheGivenIndex {
public static void main(String[] args) {
	int[] arr={2001,2002,2003,2004,2005,2006,2007,2008,2009,2010};
	int index=5;
	int value=2018;
	System.out.println(Arrays.toString(arr));
	for(int i=0;i<arr.length;i++){
		if(i==5){
			arr[i]=value;
			//i=i+1;
		}
	}
	
	System.out.println(Arrays.toString(arr));
}
}
