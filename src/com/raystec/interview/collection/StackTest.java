package com.raystec.interview.collection;

import java.util.Iterator;
import java.util.Stack;

public class StackTest {
public static void main(String[] args) {
	Stack s=new Stack();
	Stack s1=new Stack();
	s.push(2);
	s.push(1);
	s.push(3);
	s.push(6);
	s.push(0);
	s.push(9);
	s.push(7);
	s.push(8);
	
	System.out.println(s.size());
	System.out.println(s);
	int n=1;
	while(n<=s.size()){
		
		s1.push(s.pop());
	}
	
	//System.out.println(s.pop());
	System.out.println(s);
	System.out.println(s.size());
	System.out.println(s1);
	
Iterator it=s.iterator();
while(it.hasNext()){
	Object o=it.next();
	System.out.println(o);
}
}
}
