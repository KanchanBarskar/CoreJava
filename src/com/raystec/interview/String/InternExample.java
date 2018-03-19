package com.raystec.interview.String;

//intern() method is used to return the string from the pool memory
public class InternExample {

	public static void main(String[] args) {
		String s1="Kanchan";
		String s2="Kanchan";
		String s3="Kanchan".intern();//interning is automatic for string literals
		String s4=new String("Kanchan");//this is in heap memory
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		s4=s4.intern();//now it returns from pool memory
		System.out.println(s1==s4);
	}
}
