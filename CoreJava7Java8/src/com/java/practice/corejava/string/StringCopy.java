package com.java.practice.corejava.string;

public class StringCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Sarvesh";
		String strCopy=str;
		String strCopy2=String.valueOf(str.toCharArray());
		str="sinha";
		//strCopy=str;
		System.out.println("str="+str);
		System.out.println("strCopy="+strCopy);
		System.out.println("strCopy2="+strCopy2);
		
		char[] ch = {'A','B','C'};
		 String str1 = String.valueOf(ch);
		 System.out.println(str1);
		 
		 char i=65;
		 String intStr = String.valueOf(i);
		 System.out.println(intStr);
	}

}

