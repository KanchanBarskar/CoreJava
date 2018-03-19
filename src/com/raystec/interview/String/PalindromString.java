package com.raystec.interview.String;

import java.util.Scanner;

public class PalindromString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your String");
	String s=sc.nextLine();
	StringBuffer sb=new StringBuffer(s);
	String revString=sb.reverse().toString();
	
	System.out.println(revString);
	if(s.equals(revString)){
		System.out.println("String is palindrom");
	}else{
		System.out.println("String is not palindrom");
	}
}
}
