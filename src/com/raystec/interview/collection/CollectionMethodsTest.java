package com.raystec.interview.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethodsTest {

	public static void main(String[] args) {
		
		
		Collection<String> c=new ArrayList<String>();
		
		c.add("One");
		c.add("Two");
		c.add("Three");
		c.add("Four");
		c.add("Five");
		c.add("Six");
		c.add("Seven");
		c.add("Eight");
		c.add("Nine");
		c.add("Ten");
		c.add("One");
		c.add(null);
		//c.remove("Three");
		Iterator<String> it=c.iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
		}
		
		System.out.println(c.size());
		System.out.println(c.contains("Four"));
		
		Collection<String> col=new ArrayList<String>();
		col.addAll(c);
		col.add("Eleven");
		col.add("Twelve");
		//col.clear();
		//col.removeAll(c);
		System.out.println(col.isEmpty());
		for(Object o:col){
			
			System.out.println(o);
		}
	
		System.out.println(col.containsAll(c));
	}
}
