package com.practice.java.stream;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExamle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//How to create stream
		Stream<Integer> intStream=Stream.of(new Integer[] {1,2,3,4,5,6,7});
		intStream.forEach(System.out::print);
		
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) myList.add(i);
		Stream<Integer> sequentialStream = myList.stream();
		
		//How to convert stream to list
		System.out.println();
		System.out.println("-------------------------");
		Stream<Integer> listStream=Stream.of(new Integer[] {1,2,3,4,5,6,7});
		List<Integer> list = listStream.collect(Collectors.toList());
		list.forEach(System.out::print);
		
		//How to convert Stream to map
		System.out.println();
		System.out.println("-------------------------");
		Stream<Integer> mapStream=Stream.of(new Integer[] {1,2,3,4,5,6,7});
		Map<Integer,Integer> mapData = mapStream.collect(Collectors.toMap(i->i, i->i+10));
		System.out.println("mapData="+mapData);
		
		String str=new String("hello");
		System.out.println("1-"+str+", "+str.hashCode());
		str.concat("sarvesh");
		System.out.println("2-"+str);
		str=str.concat("hi");
		System.out.println("3-"+str+", "+str.hashCode());
		//str.replaceAll(regex, replacement)
		
		String str1="xyz";
		String str2=new String("xyz");
		System.out.println("------------------------------");
		System.out.println(str1.hashCode()+", "+str2.hashCode());
		//Enumeration<E>
		
		
	}

}
