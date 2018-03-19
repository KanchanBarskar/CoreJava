package com.raystec.interview.collection;

import java.util.Comparator;

public class OrderByNammme implements Comparator<User> {

	@Override
	public int compare(User u1, User u2) {

		/*if(u1.firstName.equals(u2.firstName)){
			return u1.lastName.compareTo(u2.lastName);
		}
		return u1.firstName.compareTo(u2.firstName);
*/
		return  (u1.firstName+ u1.lastName).compareTo(u2.firstName+u2.lastName);
	}

}
