package com.java.practice.corejava;

public class OddEvenCheck {
	
	public static boolean checkOddEven(int number) {
		if(number==0)
			return false;
		
		while(number%2!=0) {
			System.out.println("OddEvenCheck.checkOddEven()");
			return false;				
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(checkOddEven(101));
		if(checkOddEven(100)) {
			System.out.println("Provided input is even");
		}else
			System.out.println("Provided input is odd");
		
	}

}
