package com.raystec.interview.OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;

//Single inheritance Example

public class BusinessMan extends Person {
private double income;

public double getIncome() {
	return income;
}

public void setIncome(double income) {
	this.income = income;
}

public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
	BusinessMan man=new BusinessMan();
	man.setName("Rahul Basrakr");
	man.setAddress("Mhow");
	man.setDob(sdf.parse("01/01/1999"));
	man.setIncome(40000);
	
	System.out.println(man.getName());
	System.out.println(man.getAddress());
	System.out.println(sdf.format(man.getDob()));
	System.out.println(man.getIncome());
}
}
