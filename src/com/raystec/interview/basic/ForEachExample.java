package com.raystec.interview.basic;

import java.util.ArrayList;

public class ForEachExample {
public static void main(String[] args) {
	int[] arr={2,3,5,4,1,2,7,6,8,9};
	for(int n:arr){
		System.out.println(n);
	}
	
	ArrayList<String> numbers=new ArrayList<String>();
	numbers.add("One");
	numbers.add("Two");
	numbers.add("Three");
	numbers.add("Four");
	numbers.add("Five");
	numbers.add("Six");
	numbers.add("Seven");
	numbers.add("Eight");
	numbers.add("Nine");
	numbers.add("Ten");
	
	for(String n:numbers){
		System.out.println(n);
	}
}

}
