package com.practice.java.string;

public class PalindromeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder checkPalindrome = new StringBuilder("ABCBA");
		StringBuilder temp=checkPalindrome.reverse();
		if(temp.equals(checkPalindrome)) {
			System.out.println("Palindrome Found");
		}else {
			System.out.println("Not a Palindrome");
		}
		
		int strLength=checkPalindrome.length();
		System.out.println(strLength/2);
		for(int i=0;i<=strLength/2;i++) {
			System.out.println(checkPalindrome.charAt(i)+", "+checkPalindrome.charAt(strLength-1-i));
			if(checkPalindrome.charAt(i)!=checkPalindrome.charAt(strLength-1-i))
				System.out.println("Palindrome Found");
			String repStr="Sarzvesz";
			System.out.println(repStr.replaceAll(Character.toString('z'), "h"));
			System.out.println(repStr.replace('z', 'h').toUpperCase());
		//	System.out.println(repStr);
			String strBuffer=new String("abchwer");
			String[] charArray=strBuffer.split("h");
			System.out.println(charArray);
			char[] helloBlankCharacter=strBuffer.toCharArray();
			
			
		}
	}

}
