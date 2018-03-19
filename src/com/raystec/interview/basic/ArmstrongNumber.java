
package com.raystec.interview.basic;

public class ArmstrongNumber {
public static void main(String[] args) {
	int n=153,sum=0,digit=0,temp=153;
	while(n>0){
		digit=n%10;
		sum=sum+(digit*digit*digit);
		n=n/10;
	}
	System.out.println(sum);
	if(temp==sum){
		System.out.println("number is armstrong");
	}else{
		System.out.println("Number is not armstrong");
	}
}
}
