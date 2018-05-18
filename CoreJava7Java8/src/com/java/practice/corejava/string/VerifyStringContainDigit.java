package com.java.practice.corejava.string;

import java.util.ArrayList;
import java.util.List;

public class VerifyStringContainDigit {
	
	public static void main(String[] str1) {
	
		System.out.println("VerifyStringContainDigit.enclosing_method()");
		List<Integer> noInString= new ArrayList();
		boolean isNumber=false;
	String str="sarvesh1";
	Character[] alphabetList= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	for(int i=0;i<str.length();i++) {
		for(int j=0;j<alphabetList.length;j++) {
			if(Character.toString(str.charAt(i)).equalsIgnoreCase(alphabetList[j].toString())){
				//noInString.add(e)
			}
		}
	}
	
	}
}
