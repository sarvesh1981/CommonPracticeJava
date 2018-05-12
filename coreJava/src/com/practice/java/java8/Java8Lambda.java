package com.practice.java.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import java.util.Collections;

public class Java8Lambda {

	@SuppressWarnings("unchecked")
	public static void main(String[] str) {
		List<Person> employee= Arrays.asList(
					new Person("Vivaan","Sinha",1),
					new Person("Swati","Sinha",32),
					new Person("Sarvesh","Sinha",36)
				);
		
		employee.stream().forEach(System.out::println);
		employee.parallelStream();
		

		//printing unsorted data
		for(Person temp:employee) {
			System.out.println(temp);
		}
		
		System.out.println("---------------------------");
		//SortByLastNameUsingComparator slc=new SortByLastNameUsingComparator();
		//Collections.sort(employee,slc);
		//sorting data here
		Collections.sort(employee, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});
		
		//printing sorting data
		for(Person temp:employee) {
			System.out.println(temp);
		}
		System.out.println("---------------------------");
		//Print name that start with V
		for(Person temp:employee) {
			if(temp.getFirstName().startsWith("V"))
			System.out.println(temp);
		}
	}
   
	
	
}
