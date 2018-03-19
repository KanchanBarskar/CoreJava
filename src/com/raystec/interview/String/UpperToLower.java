package com.raystec.interview.String;

public class UpperToLower {
public static void main(String[] args) {
	String name="Kanchan Barskar";
	StringBuffer sb=new StringBuffer(name);
	for (int i = 0; i < name.length(); i++) {
		char ch=name.charAt(i);
		if(Character.isUpperCase(ch)){
			sb.setCharAt(i, Character.toLowerCase(ch));
		}
	}
	System.out.println(sb);
}
}
