package com.raystec.interview.basic.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortInt_StringArray {
public static void main(String[] args) {
	int[] intArr={121,234,134,456,654,354,876,890,76,421};
	String[] sArr={"java","c","C++","pythone","ruby","Dot Net","PHP","Spring","HTML","Jquery"};
	System.out.println(Arrays.toString(intArr));
	Arrays.sort(intArr);
	System.out.println(Arrays.toString(intArr));
	
	System.out.println(Arrays.toString(sArr));
	Arrays.sort(sArr);
	System.out.println(Arrays.toString(sArr));
	
	
}
}
