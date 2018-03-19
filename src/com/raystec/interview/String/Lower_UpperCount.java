package com.raystec.interview.String;

public class Lower_UpperCount {
public static void main(String[] args) {
	String name="Rays Technology in Indore";
	int upperCase=0;int lowerCase=0;
	
		 char ch;
	for (int i = 0; i < name.length(); i++) {
		ch=name.charAt(i);
		int asciiValue=ch;
		if(ch>='A' && ch<='Z'){
			upperCase++;
		}else{
			if(ch>='a' && asciiValue<='z'){
				lowerCase++;
			}
		}
		
	}
	System.out.println("Uppercase count "+upperCase);
	System.out.println("Lowercase count "+lowerCase);
}
}
