package com.raystec.interview.collection;

import java.util.Comparator;

public class OrderBySalary implements Comparator<Employee> {
//Sorting in desScending order of salary
	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.salary<e2.salary){
			return -1;
		}else if(e1.salary==e2.salary){
			return 0;
		}else{
			return 1;
			}
		
		//return e1.salary-e2.salary; //it sort marksheet in ascending order of salary
		
	}

}
