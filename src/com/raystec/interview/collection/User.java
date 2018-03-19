package com.raystec.interview.collection;

public class User {
public String firstName;
public String lastName;

public User(String firstName, String lastName){
	this.firstName=firstName;
	this.lastName=lastName;
}

public String toString(){
	return firstName+","+lastName;
	
}

}
