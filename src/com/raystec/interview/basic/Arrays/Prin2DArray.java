package com.raystec.interview.basic.Arrays;

public class Prin2DArray {
public static void main(String[] args) {
	int[][] arr=new int[10][10];
	for(int i=0;i<10;i++){
		for(int j=0;j<10;j++){
			System.out.printf("%2d ",arr[i][j]); //%2d outputs a decimal (integer) number that fills at least 2 character spaces, padded with empty space.
		}
		 System.out.println();
	}
}
}
