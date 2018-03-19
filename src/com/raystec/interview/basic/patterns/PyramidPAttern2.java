package com.raystec.interview.basic.patterns;

public class PyramidPAttern2 {
public static void main(String[] args) {
	int rowCount=1;
	for(int i=7;i>=1;i--){
		for(int j=1;j<=i;j++){
			System.out.print(" ");
		}
		for(int j=1;j<=rowCount;j++){
			System.out.print(rowCount+" ");
		}
		System.out.println();
		rowCount++;
	}
}
}
