package com.raystec.interview.String;

public class PerformanceDiffBWStringBuffer_StringBuilder {
public static void main(String[] args) {
	long startTime=System.currentTimeMillis();
	StringBuffer sb=new StringBuffer("Java");
	for (int i = 0; i < 1000; i++) {
		sb.append("is Programming language");
	}
	System.out.println("Time taken by StringBuffer is "+(System.currentTimeMillis()-startTime)+" ms");
	startTime=System.currentTimeMillis();
	StringBuilder sb2=new StringBuilder("Java");
	for (int i = 0; i < 1000; i++) {
		sb.append("is Programming Language");
	}
	System.out.println("Time taken by StringBuilder is "+(System.currentTimeMillis()-startTime)+" ms");
}
}
