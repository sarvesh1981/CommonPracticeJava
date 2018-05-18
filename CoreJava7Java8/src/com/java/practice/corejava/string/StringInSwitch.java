package com.java.practice.corejava.string;

public class StringInSwitch {
	
	private static void useSwitch(String str) {
		switch(str) {
		case "RED":
			System.out.println("here is the RED ROSE");
			break;
		case "BRIGHT":
			System.out.println("here is the sunny day");
			break;
		default:
			System.out.println("No String attached");
		}	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringInSwitch.useSwitch("RED");
	}

}
