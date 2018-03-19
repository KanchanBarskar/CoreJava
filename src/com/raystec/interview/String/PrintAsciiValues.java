package com.raystec.interview.String;

public class PrintAsciiValues {
public static void main(String[] args) {
	char ch;
	for (int i = 0; i <= 255; i++) {
		ch=(char) i;
		System.out.println(i+" "+ch);
	}
}
}
