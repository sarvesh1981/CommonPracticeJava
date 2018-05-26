package com.java.practice.corejava.string;

public class StringReverseTest {
	
	public static String reverseStringusingStringBuffer(String str) {
		String revStringVal;
		StringBuffer strBuff=new StringBuffer(str);
		revStringVal=new String(strBuff.reverse());
		return revStringVal;
	}
	
	public static String reverseStringLogically(String str) {
		String revStringVal=null;
		int inputLength=str.length();
		char[] revData=new char[inputLength];
		for(int i=inputLength-1,j=0;i>=0;i--,j++) {
			revData[j]=str.charAt(i);
		}		
		return revStringVal=new String(revData);
	}
	
	public static boolean checkPalindrome(String str) {
		
		if(str.length()==0)
			return false;
		//char[] input=new char[str.length()];
		for(int i=0;i<=str.length()/2;i++) {
			if(str.charAt(i)==str.charAt(str.length()-1-i)){
				
			}else
				return false;
		}
		
		
		return true;
	}
	
	public static boolean checkPalindromeUsingString(String str) {
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--) {
			reverse+=str.charAt(i);
		}
		if(str.equalsIgnoreCase(reverse))
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String input="Sarvesh";
		String revStr=reverseStringusingStringBuffer(input);
		System.out.println("the reverse of input data "+input+" is "+revStr);
		System.out.println("the reverse of input data "+input+" is "+reverseStringLogically("Sarvesh"));*/
		//System.out.println(checkPalindrome("1234321"));
		System.out.println(checkPalindromeUsingString("sarvesh"));
	}

}
