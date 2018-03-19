package com.raystec.interview.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DQueueMethodsTest {
public static void main(String[] args) {
	Deque q=new ArrayDeque();
	q.addLast(1);
	q.addLast(2);
	q.addLast(3);
	q.addLast(4);
	q.offerLast(12);
	q.offerLast(13);
	q.offerLast(14);
	q.offerLast(15);
	q.offerFirst(9);
	q.offerFirst(10);
	q.offerFirst(11);
	q.addFirst(5);
	q.addFirst(6);
	q.addFirst(7);
	q.addFirst(8);
	
	System.out.println(q);
	System.out.println(q.removeFirst());
	System.out.println(q);
	
	System.out.println(q.pollFirst());
	System.out.println(q);
	
	System.out.println(q.removeLast());
	System.out.println(q);
	
	System.out.println(q.pollLast());
	System.out.println(q);
	
	System.out.println(q.getFirst());
	System.out.println(q);
	
	System.out.println(q.getLast());
	System.out.println(q);
	
	System.out.println(q.peekFirst());
	System.out.println(q);
	
	System.out.println(q.peekLast());
	System.out.println(q);
	
	
}
}
