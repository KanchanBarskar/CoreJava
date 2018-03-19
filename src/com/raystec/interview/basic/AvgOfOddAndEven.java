package com.raystec.interview.basic;

public class AvgOfOddAndEven {
public static void main(String[] args) {
	int sumEven=0,countEven=0,avgEven=0;
	int sumOdd=0,countOdd=0,avgOdd=0;
	for(int i=1;i<=100;i++){
		if(i%2==0){
			countEven=countEven+1;
			sumEven=sumEven+i;
			
		}else{
			countOdd=countOdd+1;
			sumOdd=sumOdd+i;
		
		}
		
	}
	avgEven=sumEven/countEven;
	System.out.println("sum of even numbers "+sumEven);
	System.out.println("count of even numbers "+countEven);
	System.out.println("average of even numbers "+avgEven);
	
	avgOdd=sumOdd/countOdd;
	System.out.println("sum of even numbers "+sumOdd);
	System.out.println("count of even numbers "+countOdd);
	System.out.println("average of even numbers "+avgOdd);
}
}
