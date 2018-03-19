package com.raystec.interview.collection;

import java.util.Enumeration;
import java.util.Vector;
//it provides ordering
public class TestVector {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add(1);
	v.add(2);
	v.add(2);
	v.add(3);
	v.add(4);
	v.add(5);
	v.add(null);
	
	System.out.println(v);
	
	Enumeration e=v.elements();
	while (e.hasMoreElements()) {
		Object object = e.nextElement();
		if(v.get(2).equals(2)){
			v.remove(object);
		}
		System.out.println(object);
		
	}
}
}
