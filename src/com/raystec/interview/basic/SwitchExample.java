package com.raystec.interview.basic;

import java.util.Scanner;

public class SwitchExample {
public static void main(String[] args) {
	System.out.println("You Have to choose between 0 to 6");
	System.out.println("please enter your choice: ");
	Scanner sc=new Scanner(System.in);
	int choice=sc.nextInt();
	String day=null;
	switch(choice){
	case 0:
		day="Sunday";
		break;
	case 1:
		day="Monday";
		break;
	case 2:
		day="Tuesday";
		break;
	case 3:
		day="Wednesday";
		break;
	case 4:
		day="Thursday";
		break;
	case 5:
		day="Friday";
		break;
	case 6:
		day="Saturday";
		break;
		default:
		System.out.println("You entered a wrong choice");
		break;
	}
	System.out.println(day);
	
}
}
