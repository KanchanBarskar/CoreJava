package com.raystec.interview.basic.patterns;

public class Pattern3 {
public static void main(String[] args) {
	int rows=7;
	//Printing upper half of the pattern
	for(int i=1;i<=rows;i++){
		for(int j=1;j<=i;j++){
			System.out.print(j+" ");
		}
		System.out.println();
	}
	//Printing lower half of the pattern
	for(int i=rows-1;i>=1;i--){
		for(int j=1;j<=i;j++){
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
	
}
}
