package com.raystec.interview.basic.Arrays;

public class CheckArrayContainsAValue {
 public static boolean contains(int[] arr,int number){
	 for(int i:arr){
		 if(i==number){
			 return true;
		 }
	 }
	return false;
	 
 }
 public static void main(String[] args) {
	int[] arr={2001,2001,2003,2004,2005,2006,2007,2008,2009,2010};
	boolean b=contains(arr, 2011);
	System.out.println(b);
}
}
