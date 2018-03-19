package com.raystec.interview.OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Father extends BusinessMan {

	private String responsibility;

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
		Father father=new Father();
		father.setName("Rahul Basrakr");
		father.setAddress("Mhow");
		father.setDob(sdf.parse("01/01/1999"));
		father.setIncome(40000);
		father.setResponsibility("To take care of his family");
		
		System.out.println(father.getName());
		System.out.println(father.getAddress());
		System.out.println(sdf.format(father.getDob()));
		System.out.println(father.getIncome());
		System.out.println("Father responsibility is "+father.getResponsibility());
		
	}
	
}
