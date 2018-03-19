package com.raystec.interview.String;

public class StringBufferReverse {
public static void main(String[] args) {
	String name="Kanchan Barskar";
	StringBuffer sb=new StringBuffer(name);
	String revString=sb.reverse().toString();
	System.out.println(revString);
}
}
