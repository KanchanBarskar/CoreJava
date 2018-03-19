package com.raystec.interview.basic.patterns;

public class DiamondPattern2 {
	public static void main(String[] args) {
		int rows=7;
		int midRow=rows/2;
		int rowCount=1;
		
		for(int i=midRow;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=rowCount;j++){
				System.out.print(rowCount+" ");
			}
			System.out.println();
			rowCount++;
		}
		
		for(int i=0;i<=midRow;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=rowCount;j>0;j--){
				System.out.print(rowCount+" ");
			}
			System.out.println();
			rowCount--;
		}
	}
}
