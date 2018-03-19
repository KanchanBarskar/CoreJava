package com.raystec.interview.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee {
public static void main(String[] args) {
	
	Employee e1=new Employee("KAnchan", 10000);
	Employee e2=new Employee("Rahul", 20000);
	Employee e3=new Employee("Ritesh", 10200);
	Employee e4=new Employee("Kumkum", 5000);
	Employee e5=new Employee("Pooja", 8000);
	Employee e6=new Employee("Aniket", 12000);
	ArrayList<Employee> employees = new ArrayList<Employee>();
	employees.add(e1);
	employees.add(e2);
	employees.add(e3);
	employees.add(e4);
	employees.add(e5);
	employees.add(e6);
	
	/*OrderByName cName=new OrderByName();
	Collections.sort(employees, cName);*/
	
	OrderBySalary cSalary=new OrderBySalary();
	Collections.sort(employees, cSalary);
	
	
	for(Object o:employees){
		System.out.println(o);
	}
	
}
}
