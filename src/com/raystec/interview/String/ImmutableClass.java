package com.raystec.interview.String;

public final class ImmutableClass {
	private final int id;
	private final String name;
	public ImmutableClass(int id,String name){
		this .id=id;
		this.name=name;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
public static void main(String[] args) {
	ImmutableClass im=new ImmutableClass(1, "Kanchan");
			System.out.println("id "+im.getId());
	System.out.println("name "+im.getName());
	
	//System.out.println(im.id=3);
	
}
	
}
