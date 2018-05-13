package com.practice.java.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.print.attribute.UnmodifiableSetException;
public class IteratorExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> country=new HashMap();
		country.put("US", "United State");
		country.put("CA", "Canada");
		country.put("IT", "Italy");
		for(Map.Entry<String, String> temp:country.entrySet()) {
			System.out.println(temp.getKey()+", "+temp.getValue());
		}
		Collections.unmodifiableMap(country);
		Collections.synchronizedMap(country);
		
	Iterator<String> cntList=country.keySet().iterator();
	
		List<String> lst=new ArrayList<>();
		lst.add("sarvesh");
		lst.add("chandra");
		lst.add("sinha");
		lst.add("vivaan");
		lst.add("preeti");
		Iterator<String> cntry=lst.iterator();
		
			while(cntry.hasNext()) {
				String temp=cntry.next();
				System.out.println(temp);
				if(temp.equalsIgnoreCase("chandra")) {
					System.out.println("temp="+temp);
					lst.remove("preeti");
					
				}
			}
			
		System.out.println(">>>>"+lst);
		//UnmodifiableMa
		Collections.unmodifiableList(lst);
		
		/*List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        
        // get the iterator
        Iterator<String> it = list.iterator();
        
        //manipulate list while iterating
        while(it.hasNext()){
            System.out.println("list is:"+list);
            String str = it.next();
            System.out.println(str);
            if(str.equals("2"))list.remove("5");
           // if(str.equals("3"))list.add("3 found");
            //below code don't throw ConcurrentModificationException
            //because it doesn't change modCount variable of list
          //  if(str.equals("4")) list.set(1, "4");
        }*/
	}

}
