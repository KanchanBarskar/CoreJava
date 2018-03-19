package com.raystec.interview.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class Test1 {
	public static void main(String[] args){

	    Set hashSet = new HashSet();

	hashSet.add(1);

	hashSet.add("1");

	hashSet.add(null);

	hashSet.add("null");

	System.out.println(hashSet);
	
	Vector v=new Vector();
System.out.println(v.capacity());

	}
}
