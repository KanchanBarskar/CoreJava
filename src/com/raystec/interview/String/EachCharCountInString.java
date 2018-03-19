package com.raystec.interview.String;

import java.util.HashMap;
import java.util.Scanner;

public class EachCharCountInString {
public static void main(String[] args) {
	System.out.println("Enter String : ");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	HashMap<Character,Integer> charCountMap=new HashMap<Character,Integer>();
	char[] ch=s.toCharArray();
	for(char c:ch){
		if(charCountMap.containsKey(c)){
			charCountMap.put(c,charCountMap.get(c)+1);
		}else{
			charCountMap.put(c, 1);
		}
	}
	System.out.println(charCountMap);
}
}
