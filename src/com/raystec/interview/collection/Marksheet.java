package com.raystec.interview.collection;

public class Marksheet implements Comparable<Marksheet> {

	public String rollNo;
	public String firstName;
	public String lastName;
	public int marks;
	
	public Marksheet(String rollNo,String firstName,String lastName,int marks){
		this.rollNo=rollNo;
		this.firstName=firstName;
		this.lastName=lastName;
		this.marks=marks;
	}
	
	@Override
	public int compareTo(Marksheet m) {
		if(firstName.equals(m.firstName)){
			return lastName.compareTo(m.lastName);
		}
		return firstName.compareTo(m.firstName);
	}
	
	/*public int compareTo(Marksheet m){
		
		if(marks>m.marks){
			return -1;
		}else if(marks==m.marks){
			return 0;
		}else{
		return 1;
		}
		
	}*/
	
	public String toString(){
		return rollNo+","+firstName+","+lastName+","+marks;
	}

}
