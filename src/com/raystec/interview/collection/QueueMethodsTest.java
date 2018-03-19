package com.raystec.interview.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMethodsTest {
public static void main(String[] args) {
	Queue q=new PriorityQueue();
	q.add(1);
	q.add(2);
	q.add(3);
	q.offer(4);
	q.offer(5);
	q.offer(6);
	q.offer(7);
	System.out.println(q);
	//q.remove(4);
	System.out.println(q.remove());
	System.out.println(q);
	
	System.out.println(q.poll());
	System.out.println(q);
	
	System.out.println(q.element());
	System.out.println(q);
	
	System.out.println(q.peek());
	
	System.out.println(q);
}
}
