package com.raystec.interview.String;

public class BasicMethodsOfString{
	
	public static void main(String[] args) {
		String name="Kanchan Barskar";
		String fatherName="D/O Mangal Singh Barskar";
		String s1="kanchan";
		String s2="kanchan barskar";
		String s3="kanchan barskar";
		String s4="";
		String s5="My name is Kanchan Barskar";
		
		//charAt()
		System.out.println(name.charAt(5));//indexing of String char starts  from 0
		//System.out.println(name.charAt(15));//throws exception StringIndexOutOfBoundException because char.is not found on given index
		
		
		
		//compareTo()
		System.out.println(s1.compareTo(s2));//it returns -8 because s1 string is 8 char. less than s2 string
		System.out.println(s2.compareTo(s1));//it returns 8 because s2 string is 8 char greater than string s1
		System.out.println(s2.compareTo(s3));//Both string s2 and s3 are equal
		
		//concat()
		System.out.println(name.concat(fatherName));
		
		//contains()
		System.out.println(fatherName.contains("Singh"));//it returns true if char sequence is found in the string
		//otherwise return false
		
		//endsWith()
		//return true/false
		
		System.out.println(s1.endsWith("n"));
		System.out.println(s1.endsWith("a"));
		System.out.println(s2.endsWith("barskar"));
		
		//equals()
		//used to compare two strings
		System.out.println(s2.equals(s3));//return true
		System.out.println(s1.equals(s2));//return false
		
		//equalsIgnoreCase()
		
		System.out.println(name.equalsIgnoreCase(s3));//return true compare two Strings by ignoring cases
		
		/*byte[] barr=name.getBytes();
		for (int i = 0; i < barr.length; i++) {
			System.out.print(barr[i]);
			
		}*/
		
		//indexOf()
		System.out.println(name.indexOf('c'));
		System.out.println(name.indexOf("Barskar"));
		System.out.println(name.indexOf('a', 2));
		
		//isEmpty()
		System.out.println(s4.isEmpty());//return true
		System.out.println(s1.isEmpty());//return false
		
		//lastIndexOf()
		System.out.println(name.lastIndexOf('a'));
		System.out.println(fatherName.lastIndexOf("Singh"));
		
		//length()
		System.out.println(name.length());
		
		//replace()
		System.out.println(name.replace('a', 'e'));
		System.out.println(name.replace("skar", "abcd"));
		System.out.println(name.replace('a', '&'));
		
		//replaceAll()
		System.out.println(name.replaceAll("[abc]", "&"));//replaceAll() method doesn't support $ for replacement because $ is a character in regex
		
		//startsWith()
		System.out.println(name.startsWith("K"));//return true
		System.out.println(name.startsWith("b"));//return false
		
		//subString()
		System.out.println(name.substring(4));
		System.out.println(name.substring(5, 10));
		
		//toCharArray
		char[] cArr=name.toCharArray();
		for(char ch:cArr){
			System.out.print(ch+" ");
		}
		
		
		//valueOf()
		System.out.println();
		System.out.println(String.valueOf(78));
		
		//trim()
		System.out.println(name.trim());
		
		//toUpperCase()
		System.out.println(name.toUpperCase());
		
		//toLowerCase()
		System.out.println(name.toLowerCase());
	}
}
