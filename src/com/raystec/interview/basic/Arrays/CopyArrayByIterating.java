package com.raystec.interview.basic.Arrays;

import java.util.Arrays;

public class CopyArrayByIterating {
public static void main(String[] args) {
	int[] arr1={2001,2002,2003,2004,2005,2006,2007,2008,2009,2010};
	int[] arr2=new int[10];
	System.out.println(Arrays.toString(arr1));
	for(int i=0;i<arr1.length;i++){
		
		arr2[i]=arr1[i];
	}
	
	
	System.out.println(Arrays.toString(arr2));
}
}
