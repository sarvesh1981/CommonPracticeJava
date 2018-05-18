package com.java.practice.corejava.collection;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class HashMapToTreeMapConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> fruits=new HashMap();
		String tempString;
		
		fruits.put("Apple", "RED");
		fruits.put("Banana", "YELLO");
		fruits.put("Watermalen", "BLACK & GREEN");
		fruits.put("Grape", "BLACK");
		fruits.put("Blueberry", "BLUE");
		
		//different way of iteration
		Iterator<String> it=fruits.keySet().iterator();
		while(it.hasNext()) {
			 tempString=it.next();
			System.out.println("Key= "+tempString+", Value="+fruits.get(tempString));
		}
		
		System.out.println("-------------Iterating using entrySet-----------------");
		for(Map.Entry<String, String>temp:fruits.entrySet()) {
			System.out.println("Key="+ temp.getKey() +", Value="+temp.getValue());
		}
		
		TreeMap<String,String> sortFruits=new TreeMap();
		sortFruits.putAll(fruits);
		
		System.out.println("-------------Sorted by TreeMap-----------------");
		for(Map.Entry<String, String>temp:sortFruits.entrySet()) {
			System.out.println("Key="+ temp.getKey() +", Value="+temp.getValue());
		}
		
		Collections.unmodifiableMap(fruits);
		
	}

}
