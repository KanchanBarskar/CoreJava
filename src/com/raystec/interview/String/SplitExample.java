package com.raystec.interview.String;

public class SplitExample {
public static void main(String[] args) {
	String s="My name is Kanchan Barskar";
	//String[] sarr=s.split("\\s");
	//String[] sarr=s.split("\\s",0);
	//String[] sarr=s.split("\\s",1);
	//String[] sarr=s.split("\\s",2);
	String[] sarr=s.split("\\s",3);
	for(String words:sarr){
		System.out.println(words);
	}
}
}
