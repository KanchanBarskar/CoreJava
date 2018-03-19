package com.raystec.interview.collection;

import java.awt.HeadlessException;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetMethodsTest {
public static void main(String[] args) {
	SortedSet set=new TreeSet();
	set.add("One");
	set.add("Two");
	set.add("Three");
	set.add("Four");
	set.add("Five");
	
	SortedSet set1=new TreeSet();
	set1.add(1);
	set1.add(2);
	set1.add(3);
	set1.add(4);
	set1.add(5);
	set1.add(6);
	set1.add(7);
	set1.add(8);
	System.out.println(set1);
	System.out.println(set);
	System.out.println(set.first());
	System.out.println(set.last());
	System.out.println(set.headSet("One"));
	System.out.println(set.tailSet("One"));
	System.out.println(set.subSet("Five", "One"));
}
}
