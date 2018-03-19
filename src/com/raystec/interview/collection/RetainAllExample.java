package com.raystec.interview.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RetainAllExample {
public static void main(String[] args) {
	Collection<String> c=new ArrayList<String>();
	c.add("One");
	c.add("Two");
	c.add("Three");
	c.add("Four");
	c.add("Five");
	
	
	
	Collection<String> coll=new ArrayList<>();
	coll.add("One");
	coll.add("Three");
	coll.add("Five");
	
	//c.retainAll(coll);
	System.out.println(c.retainAll(coll));
	Iterator<String> it=c.iterator();
	while(it.hasNext()){
		String s=it.next();
		System.out.println(s);
	}
	
	System.out.println(c.retainAll(coll));
}
}
