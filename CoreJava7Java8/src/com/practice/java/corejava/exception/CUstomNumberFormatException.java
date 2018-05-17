package com.practice.java.corejava.exception;

public class CUstomNumberFormatException extends Exception {

	String number;
	
	public CUstomNumberFormatException() {
		System.out.println("CUstomNumberFormatException.CUstomNumberFormatException()");
	}
	
	public String toString() {
		return "incorect data";
	}
}
