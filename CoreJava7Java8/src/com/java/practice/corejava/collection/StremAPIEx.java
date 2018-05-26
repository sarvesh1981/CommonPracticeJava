package com.java.practice.corejava.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StremAPIEx {

	public static void main(String[] args) {
		List<Integer> listOfNumber=new ArrayList<>();
		for(int i=1;i<=21;i++) {
			listOfNumber.add(i);
		}
		
		listOfNumber.forEach(i->System.out.print(i+" , "));
		
		IntStream sr=listOfNumber.stream().filter(i-> i>19).mapToInt(i->i);
		System.out.println(sr.sum());
		
		List<String> strList=new ArrayList<>();
		strList.add("Sarvesh");
		strList.add("Chandra");
		strList.add("Sarvesh");
		strList.add("sinha");
		
		Stream<String> filterName=strList.stream().filter(p -> p.startsWith("C"));
		filterName.forEach(System.out::println);
	}

}
