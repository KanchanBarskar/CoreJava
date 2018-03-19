package com.raystec.interview.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) throws ParseException {
		String dob="26/07/1995";
		Date date=new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String formatedDate=sdf.format(date);
		System.out.println(formatedDate);
		
		System.out.println(sdf.parse(dob));
		
		long millSecond=15*60*1000;
		Date d1=new Date(millSecond);
		System.out.println(d1);
		
		Date d2=sdf.parse("1/01/2018");
		System.out.println(date.after(d2));//return true if current date is greater than argument date
		
		System.out.println(d2.before(date));//return true if given date is less than argument date
		
		System.out.println(d2.getTime());
		
		//Comparision of two dates
		
		String today="16/01/2018";
		String yesterday="15/01/2018";
		
		Date todayDate=sdf.parse(today);
		Date yesDate=sdf.parse(yesterday);
		if(todayDate.getTime()>yesDate.getTime()){
			System.out.println(todayDate);
		}
		
		if(todayDate.after(yesDate)){
			System.out.println(todayDate.after(yesDate));
		}
		
		if(yesDate.before(todayDate)){
			System.out.println(yesDate.before(todayDate));
		}
		
		if(todayDate.compareTo(yesDate)==1){
			System.out.println(todayDate.compareTo(yesDate));
		}
	}
}
