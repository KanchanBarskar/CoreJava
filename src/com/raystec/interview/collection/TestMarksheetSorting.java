package com.raystec.interview.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheetSorting {
public static void main(String[] args) {
	Marksheet m1=new Marksheet("11", "Rahul","Barskar", 56);
	Marksheet m2=new Marksheet("14", "Rahul","Agrawal", 34);
	Marksheet m3=new Marksheet("10", "Kanchan","Sharma", 45);
	Marksheet m4=new Marksheet("9", "pooja","Verma", 67);
	Marksheet m5=new Marksheet("13", "Kumkum","Barskar", 76);
	Marksheet m6=new Marksheet("15", "Aniket","Sinha", 45);
	
	ArrayList<Marksheet> list=new ArrayList<Marksheet>();
	list.add(m1);
	list.add(m2);
	list.add(m3);
	list.add(m4);
	list.add(m5);
	list.add(m6);
	
	Collections.sort(list);
	for(Object o:list){
		System.out.println(o);
	}
	
}
}
