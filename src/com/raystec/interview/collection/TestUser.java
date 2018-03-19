package com.raystec.interview.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestUser {
public static void main(String[] args) {
	User u1=new User("Kanchan", "Barskar");
	User u2=new User("Kanchan", "Verma");
	User u3=new User("Rahul", "Yadav");
	User u4=new User("Rahul", "Sharma");
	User u5=new User("Ritesh", "Barskar");
	User u6=new User("Aniket", "Barskar");
	
	List<User> list = new ArrayList<User>();
	list.add(u1);
	list.add(u2);
	list.add(u3);
	list.add(u4);
	list.add(u5);
	list.add(u6);
	
	Collections.sort(list, new OrderByNammme());
	
	for(Object o:list){
		System.out.println(o);
	}
	/*
	Iterator<User> it=list.iterator();
	while(it.hasNext()){
		User u=it.next();
		if(u.firstName.equals("Ritesh")){
			it.remove();
		}else{
		System.out.println(u);
		}
	}*/
	
}
}
