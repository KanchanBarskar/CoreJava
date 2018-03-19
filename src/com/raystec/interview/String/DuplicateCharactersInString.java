package com.raystec.interview.String;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharactersInString {
  public static void main(String[] args) {
	
	  System.out.println("Enter your String : ");
	  Scanner sc=new Scanner(System.in);
	  String s=sc.nextLine();
	  
	  HashMap<Character, Integer> charCountMap=new HashMap<Character,Integer>();
	  char[] carr=s.toCharArray();
	  for(char c:carr){
		  if(charCountMap.containsKey(c)){
			  charCountMap.put(c, charCountMap.get(c)+1);
		  }else{
			  charCountMap.put(c, 1);
		  }
	  }
	  Set<Character> charsInString=charCountMap.keySet();
	  for(Character ch:charsInString){
		  if(charCountMap.get(ch)>1){
			  System.out.println(ch+" : "+charCountMap.get(ch));
		  }
		  
	  }
}
}
