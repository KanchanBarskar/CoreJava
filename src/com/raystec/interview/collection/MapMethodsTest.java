package com.raystec.interview.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodsTest {
public static void main(String[] args) {
	Map m=new HashMap();
	m.put('a', 1);
	m.put('b', 2);
	m.put('c', 3);
	m.put('d', 4);
	m.put('e', 5);
	m.put('f', 6);
	m.put('g', 7);
	m.put('h', 8);
	m.put('i', 9);
	m.put('j', 10);
	
	System.out.println(m);
	System.out.println(m.containsKey('b'));
	System.out.println(m.containsValue(5));
	
	Set set=m.entrySet();
	System.out.println(set);
	
	System.out.println(m.get('f'));
	System.out.println(m.isEmpty());
	
	Set keys=m.keySet();
	System.out.println(keys);
	
	m.remove('c');
	System.out.println(m);
	
	System.out.println(m.size());
	
	Collection c=m.values();
	System.out.println(c);
	
	m.clear();
	System.out.println(m);
	

}
}


