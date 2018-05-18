package com.java.practice.corejava.designpattern;

public class SingletonEx {

	private static SingletonEx singletonInstance=null;
	
	private SingletonEx() {
		
	}
	
	public static SingletonEx getInstance() {
	if(singletonInstance == null)
		singletonInstance = new SingletonEx();
	
		return singletonInstance;
	}
}

class CallSingleton{
	public static void main(String[] str) {
	SingletonEx a=SingletonEx.getInstance();
	SingletonEx b=SingletonEx.getInstance();
	if(a==b) 
		System.out.println("same object");
		else
			System.out.println("Different Object");
	}
}
