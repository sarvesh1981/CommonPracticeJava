package com.java.practice.corejava.lamda;

import java.util.List;
import java.awt.SystemTray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ThirdEXSortBtJava8 {
	
	
	public static void displayAllEmployee(List<Employee> emp) {
		System.out.println("-----------------Display All Employee---------------");
		for(Employee temp:emp)
			System.out.println(temp.toString());
	}
	
	public static void displayCriterianEmployee(List<Employee> emp,char c) {
		System.out.println("-----------------Display Employee Name which start with ---------------"+ c);
		for(Employee temp:emp) {
			if(temp.getFirstName().startsWith(Character.toString(c)))
			System.out.println(temp.toString());
		}
	}
	
	
	public static void main(String[] str) {
		
		List<Employee> emp= Arrays.asList(
					new Employee("Sarvesh","Sinha",36),
					new Employee("Sankar","Pati", 32),
					new Employee("Trilok","saraph",37),
					new Employee("Pawan","Kulkani",33)				
				);
		
		
		
		//sort by age
		System.out.println("--------------Sort By Age using Lamda--------------");
		//SortByAgeUsingComparatorjava8 sortByAge = new SortByAgeUsingComparatorjava8();
		Collections.sort(emp, (Employee emp1,Employee emp2)->  new Integer(emp1.getAge()).toString().compareTo(new Integer(emp2.getAge()).toString()));
		for(Employee temp:emp)
			System.out.println(temp.toString());
		
		
		System.out.println("--------------Sort By First Name using Lamda--------------");
		//SortByFirstNameUsingComparatorjava8 sortByFirstName = new SortByFirstNameUsingComparatorjava8();
		Collections.sort(emp, (Employee emp1,Employee emp2)->emp1.getFirstName().compareTo(emp2.getFirstName()));
		for(Employee temp:emp)
			System.out.println(temp.toString());
		
		//display all employee
		//ThirdEXSortBtJava8.displayAllEmployee(emp);
		//emp.forEach();
		
		//display name which start with s
		ThirdEXSortBtJava8.displayCriterianEmployee(emp,'S');
		
		
		
	}

}


//commented as used Lamda for the same

/*class SortByFirstNameUsingComparatorjava8 implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getFirstName().compareTo(emp2.getFirstName());
	}
	
}

class SortByAgeUsingComparatorjava8 implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return new Integer(emp1.getAge()).toString().compareTo(new Integer(emp2.getAge()).toString());
	}
	
}*/
