package com.raystec.interview.String;

public class CheckRotationOfString {
public static void main(String[] args) {
	String s1="12345";
	String s2="34512";
	if(s1.length()!=s2.length()){
		System.out.println("String is not in rotated version");
	}else{
		String s3=s1+s1;
		if(s3.contains(s2)){
			System.out.println("String is in rotated version");
		}else{
			System.out.println("String is not in rotated version");
		}
	}
}
}
