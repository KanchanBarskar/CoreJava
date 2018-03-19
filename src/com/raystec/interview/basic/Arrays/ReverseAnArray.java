package com.raystec.interview.basic.Arrays;

import java.util.Arrays;

public class ReverseAnArray {
public static void main(String[] args) {
	int[] arr={121,234,134,456,654,354,876,890,76,421};
	System.out.println(Arrays.toString(arr));
	
	for (int i = arr.length-1; i > 0; i--) {
		System.out.print(arr[i]+" ");
	}
}
}
