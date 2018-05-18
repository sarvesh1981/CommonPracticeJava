package com.java.practice.corejava.string;

public class StringToByteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sarvesh";
		byte[] byteStr=str.getBytes();
		System.out.println(byteStr);
		
		String byteToString = new String(byteStr);
		System.out.println(byteToString);
	}

}
