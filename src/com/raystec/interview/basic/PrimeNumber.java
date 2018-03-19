
package com.raystec.interview.basic;

public class PrimeNumber {
public static void main(String[] args) {
	int n=61;
	int i=2;
	while(i<=n){
		if(n%i==0){
			if(i==n){
				System.out.println("number is prime");
			}else{
			System.out.println("number is not prime");
			break;
			}
		}
	i++;
		
}
}
}
