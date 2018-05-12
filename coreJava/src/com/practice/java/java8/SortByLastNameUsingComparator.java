package com.practice.java.java8;

import java.util.Comparator;

public class SortByLastNameUsingComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		return p1.getFirstName().compareTo(p2.getFirstName());
	}

}
