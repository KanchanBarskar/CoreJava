package com.raystec.interview.basic.Arrays;

import java.util.Arrays;

public class RemoveASpecificElement {
/*public static void main(String[] args) {
	int[] arr={2001,2001,2003,2004,2005,2006,2007,2008,2009,2010};
	int removeIndex=5;
	for(int i=0;i<arr.length;i++){
		if(i==removeIndex){
			arr[i]=arr[i+1];
		}
	}
	System.out.println("After removing the given element "+Arrays.toString(arr));
}*/
	public static void main(String[] args) {
		int[] arr={2001,2001,2003,2004,2005,2006,2007,2008,2009,2010};
		int number=2007;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==number){
				i=i+1;
				
			}
			System.out.println(arr[i]);
		}
	}
}
