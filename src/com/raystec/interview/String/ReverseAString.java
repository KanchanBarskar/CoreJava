package com.raystec.interview.String;

public class ReverseAString {
public static void main(String[] args) {
	String name="Kanchan Barskar";
	int length=name.length();
	for (int i = length-1; i >=0; i--) {
		System.out.print(name.charAt(i));
	}
}
}
