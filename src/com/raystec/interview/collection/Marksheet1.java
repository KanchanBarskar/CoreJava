package com.raystec.interview.collection;

public class Marksheet1 {
	public String rollNo;
	public String name;
	public int marks;
	
	public Marksheet1(String rollNo,String name,int marks){
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	
	/*public boolean equals(Object o){
		if(o==null){
			return false;
		}
		if(!(o instanceof Marksheet1)){
			return false;
		}
		Marksheet1 m=(Marksheet1)o;
		return this.rollNo.equals(m.rollNo);
	}
	
	public int hashCode(){
		return rollNo.hashCode();
	}*/
}
