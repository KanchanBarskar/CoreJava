package com.raystec.interview.String;

public class VowelAndConsonantCount {
public static void main(String[] args) {
	String s="This is Java Programming and this is aw32som43";
	int vowels=0, consonant=0,digit=0;
	String s2=s.toLowerCase();
	
	for (int i = 0; i < s2.length() ; i++) {
		char ch=s2.charAt(i);
		if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' || ch=='u'){
			vowels++;
		}else{
			if(ch>='a'&& ch<='z'){
				consonant++;
			}else{
				if(ch>='0' && ch<='9'){
					digit++;
				}
			}
		}
	}
	
	System.out.println("Vowels count : "+vowels);
	System.out.println("Consonants count : "+consonant);
	System.out.println("digit count : "+digit);
}
}
