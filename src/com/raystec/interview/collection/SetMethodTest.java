package com.raystec.interview.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethodTest {
	// Set interface does not contains any additional methods
	//it has the methods of collection interface
	//Set interface does not maintain order
public static void main(String[] args) {
	
	Set set=new HashSet();
	set.add("ONE");
	set.add("TWO");
	set.add("THREE");
	set.add("FOUR");
	set.add("FIVE");
	set.remove("FOUR");
	System.out.println(set);
	System.out.println(set.contains("ONE"));
	System.out.println(set.isEmpty());
	System.out.println(set.size());
	/*Iterator it=set.iterator();
	while(it.hasNext()){
		Object o=it.next();
		System.out.println(o);
	}*/
	
	Set set1=new HashSet();
	set1.addAll(set);
	set1.clear();
	System.out.println(set1);
	
}
}
