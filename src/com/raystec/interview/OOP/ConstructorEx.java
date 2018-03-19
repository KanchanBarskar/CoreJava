package com.raystec.interview.OOP;

public class ConstructorEx {

	private int id;
	private String name;
	private String address;
	
	
	public ConstructorEx(){
		System.out.println("This is dafault Constructor");
	}
	public ConstructorEx(int  id,String name){
		this();
		System.out.println("This is patameteraized Constructor");
		this.id=id;
		this.name=name;
	}
	
	public ConstructorEx(int id,String name,String address){
		this(id,name);
		System.out.println("This is three parameterized constructo");
		this.id=id;
		this.name=name;
		this.address=address;
	}

	public String getAddress(){
		return address;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
	
}
