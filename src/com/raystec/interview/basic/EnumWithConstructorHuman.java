package com.raystec.interview.basic;

public enum EnumWithConstructorHuman {
	KID(10),MAN(50),OLDMAN(70);
	private final int weight;
	EnumWithConstructorHuman(int w){
		this.weight=w;
	}
	
	public void display(){
		System.out.println("Weight = "+weight);
	}

	public static void main(String[] args) {
		EnumWithConstructorHuman human=EnumWithConstructorHuman.KID;
		System.out.println(human);
		human.display();
	}
}
