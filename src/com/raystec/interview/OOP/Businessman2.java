package com.raystec.interview.OOP;

public class Businessman2 implements Richman,SocialWorker {

	private String name;
	private String address;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void toHelpOthers() {
		System.out.println("Businessman will help others");
		
	}

	public void earnMoney() {
		System.out.println("Business earn money");
		
	}

	@Override
	public void donation() {
		System.out.println("Businessman donate money");
		
	}

	@Override
	public void party() {
		System.out.println("Businessman will do party");
		
	}
	
	public static void main(String[] args) {
		Businessman2 man=new Businessman2();
		man.setName("Rahul");
		man.setAddress("Mhow");
		
		System.out.println(man.getName());
		System.out.println(man.getAddress());
		man.earnMoney();
		man.donation();
		man.party();
		man.toHelpOthers();
		Richman.earnMoney();
	}

}
