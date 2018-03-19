package com.raystec.interview.String;

public class VowelRemove {
public static void main(String[] args) {
	String name="Kanchan Barskar";
	String s=name.replaceAll("[aeiouAEIOU]", "");
	System.out.println(s);
}
}

