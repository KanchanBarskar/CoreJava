package com.raystec.interview.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class DynamicArrayUsingArrayList {
public static void main(String[] args) {
	ArrayList list=new ArrayList();
	list.add("KAnchan");
	list.add("Rahul");
	list.add("Ritesh");
	
	list.add(5);//auto boxing
	System.out.println(list.get(3));//auto unboxing
	for(Object o:list){
		System.out.println(o);
	}
	
	Iterator it=list.iterator();
	while(it.hasNext()){
		Object o=it.next();
		System.out.println("From iterator "+o);
	}
}
}
