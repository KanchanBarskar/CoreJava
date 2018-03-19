package com.raystec.interview.basic;

public class HarmonicSeries {
	public static void main(String args[]){
		int num = 5;
		double n=0.0;
		double result = 0.0;
		while(num > 0){
			n = (double) 1 / num;
			System.out.print(result+"+");
			result=result+n;
			num--;
		}
		System.out.println("Output of Harmonic Series is "+result);
	}
}
