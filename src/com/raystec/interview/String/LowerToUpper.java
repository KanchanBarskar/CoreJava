package com.raystec.interview.String;

public class LowerToUpper {
public static void main(String[] args) {
	String name="Kanchan Barskar";
	StringBuffer sb=new StringBuffer(name);
	for (int i = 0; i < name.length(); i++) {
		char ch=name.charAt(i);
		if(Character.isLowerCase(ch)){
			sb.setCharAt(i, Character.toUpperCase(ch));
		}
	}
	System.out.println(sb);
}
}
