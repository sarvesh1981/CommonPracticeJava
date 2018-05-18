package com.java.practice.corejava.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThirdEXSortBtJava7 {
	
	
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
	
	Condition condition = new Condition() {

		@Override
		public boolean test(Employee emp) {
			// TODO Auto-generated method stub
			return false;
		}
		
	};
	
	
	
	public static void main(String[] str) {
		
		List<Employee> emp= Arrays.asList(
					new Employee("Sarvesh","Sinha",36),
					new Employee("Sankar","Pati", 32),
					new Employee("Trilok","saraph",37),
					new Employee("Pawan","Kulkani",33)				
				);
		
		
		
		//sort by age
		System.out.println("--------------Sort By Age--------------");
		SortByAgeUsingComparator sortByAge = new SortByAgeUsingComparator();
		Collections.sort(emp, sortByAge);
		for(Employee temp:emp)
			System.out.println(temp.toString());
		
		
		System.out.println("--------------Sort By First Name--------------");
		SortByFirstNameUsingComparator sortByFirstName = new SortByFirstNameUsingComparator();
		Collections.sort(emp, sortByFirstName);
		for(Employee temp:emp)
			System.out.println(temp.toString());
		
		//display all employee
		ThirdEXSortBtJava7.displayAllEmployee(emp);
		
		
		//display name which start with s
		ThirdEXSortBtJava7.displayCriterianEmployee(emp,'S');
		
		displayConditionally(emp,new Condition() {

			@Override
			public boolean test(Employee emp) {
				if(emp.getFirstName().startsWith(Character.toString('S')))
				return true;
				else
					return false;
			}
			
		});
		
		
		
		
	}

	

	private static void displayConditionally(List<Employee> emp, Condition condition) {
		System.out.println("--------------Sort By First Name using interface--------------");
		for(Employee temp:emp) {
			if(condition.test(temp)) {
				System.out.println(temp.toString());
			}
		}
	}
	
	


}

interface Condition{
	boolean test(Employee emp);
}

 
class SortByFirstNameUsingComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getFirstName().compareTo(emp2.getFirstName());
	}
	
}

class SortByAgeUsingComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return new Integer(emp1.getAge()).toString().compareTo(new Integer(emp2.getAge()).toString());
	}
	
}
