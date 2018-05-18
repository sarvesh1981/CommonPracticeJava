package com.java.practice.corejava.string;

public class StringToCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sarvesh";
		char[] strArray=str.toCharArray();
		System.out.println("strArray="+strArray.length);
		char[] subString = new char[4];
		str.getChars(0, 3, subString, 0);
		System.out.println(subString);
	}

}
