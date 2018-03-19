package com.raystec.interview.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CheckPrimitiveInCollection {
public static void main(String[] args) {
	int i=1;
	int a=4;
	float b=2.0f;
	char c='c';
	boolean d=true;
	short s=2;
	byte e=1;
	long l=123L;
	double f=34.5;
	
	Collection col=new ArrayList();
	col.add(i);
	col.add(a);
	col.add(b);
	col.add(c);
	col.add(d);
	col.add(s);
	col.add(e);
	col.add(l);
	col.add(f);
	
	for(Object o:col){
		System.out.println(o);
	}
	
	
	//Collection<int> coll=new ArrayList<int>();
	
	
}
}
