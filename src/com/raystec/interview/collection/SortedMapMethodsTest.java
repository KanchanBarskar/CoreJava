package com.raystec.interview.collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapMethodsTest {
public static void main(String[] args) {
	SortedMap map=new TreeMap();
	map.put('d', 1);
	map.put('s', 3);
	map.put('a', 5);
	map.put('c', 7);
	map.put('k', 4);
	map.put('f', 2);
	map.put('d', 1);
	map.put('h', 6);
	
	System.out.println(map);
	System.out.println(map.firstKey());
	System.out.println(map.lastKey());
	System.out.println(map.headMap('e')); //here given key is exclusive
	System.out.println(map.tailMap('h')); //here given key is inclusive
	System.out.println(map.subMap('a', 's'));//here a is inclusive and s is exclusive
	
	System.out.println(map.comparator()); //it returns null if it uses the natural ordering of its key
	//if we use comparator than it returns comparator
}
}
