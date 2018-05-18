package com.java.practice.corejava.string;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Sarvesh";
		String str2="Chandra";
		String str3="Sarvesh";
		
		System.out.println(str1.compareTo(str2));//+
		System.out.println(str2.compareTo(str3));//-
		System.out.println(str1.compareTo(str3));//0
	}

}
