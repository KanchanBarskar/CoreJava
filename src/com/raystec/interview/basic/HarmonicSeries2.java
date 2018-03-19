package com.raystec.interview.basic;

public class HarmonicSeries2 {
	public static void main(String[] args) {
		int n=6;
		float a=1;
		String b="1";
		for(int i=1;i<=n;i++){
			a=a+((float)1/i);
			b=b+"+"+"(1/"+ i +")";
		}
		System.out.println(b+"="+a);
		//System.out.println(a);
	}
}
