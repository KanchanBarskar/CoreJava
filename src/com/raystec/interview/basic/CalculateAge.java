package com.raystec.interview.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalculateAge {
	public static void main(String[] args) throws ParseException {
		String dob="22/03/1992";
		System.out.println("Date Of Birth "+dob);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date birthDate=sdf.parse(dob);
		System.out.println(sdf.format(birthDate));
		Date currentDate=new Date();
	
		System.out.println(currentDate);
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(birthDate);
		Calendar calendar2=Calendar.getInstance();
		calendar2.setTime(currentDate);
		int year=calendar2.get((Calendar.YEAR)-calendar.get(Calendar.YEAR));
		int month=calendar2.get((Calendar.MONTH)-calendar.get(Calendar.MONTH));
		int day=calendar2.get((Calendar.DATE)-calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar2.get(Calendar.DATE));
		
		if (month < 0) {
			year--;
			month = 12 + month;
		}
		if (month == 0) {
			if (day < 0) {
				year--;
				month = 11;
				day = 30 + day;
			}
		}
		if (day < 0) {
			month--;
			day = 30 + day;
		}

		System.out.println(year + " years " + month + " months " + day + " days");

	}

}
