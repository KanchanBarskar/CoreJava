package com.raystec.interview.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
public static void main(String[] args) {
	List list=new ArrayList();
	list.add("Rose");
	list.add("Lotous");
	list.add("Lily");
	list.add("Merigold");
	/*list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);*/
	
	ListIterator it=list.listIterator();
	
	System.out.println("Forward direction iteration");
	while(it.hasNext()){
		System.out.println(it.next());
	}
	
	System.out.println("Backward direction iteration");
	while(it.hasPrevious()){
		System.out.println(it.previous());
	}
}
}
