package com.raystec.interview.collection;

import java.util.Comparator;

public class OrderByName  implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		//return e2.name.compareTo(e1.name); //used for sorting in descending order of name 
		return e1.name.compareTo(e2.name);  //used for sorting in ascending order of name
	}
	

}
