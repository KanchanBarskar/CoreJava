package com.raystec.interview.String;

import java.util.Scanner;

public class CountTheWords {
public static void main(String[] args) {
	System.out.println("Enter the String : ");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String[] words=s.trim().split("\\s");
	System.out.println("Number of words "+words.length);
}
}
