package com.raystec.interview.basic;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class SystemClassExample {
public static void main(String[] args) throws IOException {
	int[] arr1={1,2,3,4,5,6,7,8,9,0};
	int [] arr2=new int[5];
	
	System.arraycopy(arr1, 2, arr2, 0, 5);
	System.out.println(Arrays.toString(arr2));
	
	System.out.println("This is the object of PrintStream");
	System.err.println("This is the object of PrintStream and standard error output stream");
	
	System.out.println("(Object of InputStream)Enter a character: ");
	int ch=System.in.read();
	char chr=(char)ch;
	System.out.println("You entered : "+chr);
	
	long time=System.currentTimeMillis();
	Date date=new Date(time);
	System.out.println(date);
	
	//run garbage collector
	System.gc();
	System.out.println("GC executed");
	
	//map library name
	String libName=System.mapLibraryName("os.name");
	System.out.println("os.name library = "+libName);
	
	//run finalization
	System.runFinalization();
	//Terminate the currently running JVM
	System.exit(1);
	System.out.println("JVM is terminated");
	
	
}
}
