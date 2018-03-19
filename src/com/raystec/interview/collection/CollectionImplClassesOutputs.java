package com.raystec.interview.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionImplClassesOutputs {

	public static void main(String[] args) {
		//List list = new ArrayList();
		List list = new LinkedList();
		
		list.add(1);
		list.add(null);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(5);
		list.add(null);
		System.out.println(list);
		Iterator i=list.iterator();
		while(i.hasNext()){
			Object o=i.next();
			System.out.println(o);
		}
		System.out.println("*************");
		//Set set=new HashSet();  //it does not maintain any order
		//Set set=new LinkedHashSet(); //it maintains the insertion order
		Set set=new TreeSet();   //it sorts an elements in ascending order  //not allow null elements it returns NullPointerException
		set.add(1);
		set.add(5);
		set.add(3);
		//set.add(null);  //not allow null elements it returns NullPointerException
		//set.add(null);
		set.add(1);
		set.add(4);
		set.add(6);
		
		Iterator it=set.iterator();
		while(it.hasNext()){
			Object o=it.next();
			System.out.println(o);
		}
		
		System.out.println(set);
		
		System.out.println("*************");
		
		Queue q=new PriorityQueue();
		q.add(1);
		q.add(2);
		q.add(4);
		q.add(3);
		//q.add(null);  it does not permit null values it throws an exception NullPointerException
		q.add(1);
		q.add(7);
		//q.add("Kanchan"); //not permit the insertion of non comparable objects throws ClassCastException
		
		System.out.println(q);
		
		System.out.println("***************");
		//Map m=new HashMap(); //it permits null key and null value
		//it  does not maintain the insertion order
		//it does not allow duplicate keys
		Map m=new Hashtable(); //not allow null key and value
		//Map m=new TreeMap(); //not allow null key it returns NullPointerException
		m.put("a", 1);
		m.put("b", 5);
		m.put("a", 3);
		//m.put(null, 3);
		m.put("e", 5);
		m.put("u", 8);
		m.put("g", 7);
		//m.put("h", null);
		
		System.out.println(m);
		
		
		
		
		
	}
}
