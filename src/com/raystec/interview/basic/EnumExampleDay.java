package com.raystec.interview.basic;

import java.util.Arrays;

public enum EnumExampleDay {
//constant name
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	
	public int getWeekDay(){
		switch(this){
		case SUNDAY:
			return 0;
		case MONDAY:
			return 1;
		case TUESDAY:
			return 2;
		case WEDNESDAY:
			return 3;
		case THURSDAY:
			return 4;
		case FRIDAY:
			return 5;
		case SATURDAY:
			return 6;
			default:
				System.out.println("This is default");
				break;
			
			
		}
		return 0;
	}
	public static void main(String[] args) {
		EnumExampleDay day=EnumExampleDay.MONDAY;
		System.out.println(day);
		System.out.println(day.getWeekDay());
		EnumExampleDay[] dayArr=day.values();
		System.out.println(Arrays.toString(dayArr));
	}
}
