package com.raystec.interview.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReverseList {
	public static void main(String[] args) {
		
		
		ArrayList fromlist=new ArrayList();

		fromlist.add("fd");
		fromlist.add("zds");
		fromlist.add("dsf");
		fromlist.add("dxvd");
		
		ArrayList tolist=new ArrayList();
		tolist.add("dv");
		
		Collections.copy(tolist,fromlist);
		
		System.out.println(tolist.size());
		
		Iterator it = tolist.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
			
			
		}
	}
}
