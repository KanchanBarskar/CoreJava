package com.raystec.interview.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListMethodsTest {
public static void main(String[] args) {
	List l=new ArrayList();
	l.add(0, 1);
	l.add(1, 2);
	l.add(2, 3);
	l.add(3, 4);
	l.add(4, 5);
	l.add(5, 6);
	l.add(6, 7);
	l.add(7, 8);
	l.add(8, 9);
	l.add(9, 0);
	l.add(10, 10);
	l.add(11, 0);
	
	System.out.println(l.get(10));
	//l.remove(5);
	l.set(5, 23);
	for(Object o:l){
		System.out.println(o);
	}
	
	System.out.println("+++++++++++");
	System.out.println(l.subList(4, 9).toString());
	System.out.println(l.indexOf(5));
	System.out.println(l.lastIndexOf(0));
	System.out.println("***************");
	List list=new ArrayList();
	list.add(0, 78);
	list.add(1,34);
	
	list.addAll(2, l);
	/*for(Object o:list){
		System.out.println(o);
	}*/
	
	ListIterator it=list.listIterator();
	while(it.hasNext()){
		Object o=it.next();
		System.out.println(o);
	}
}
}
