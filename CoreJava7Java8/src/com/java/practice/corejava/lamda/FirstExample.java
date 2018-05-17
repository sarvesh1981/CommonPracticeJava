package com.java.practice.corejava.lamda;

public class FirstExample {

	public static void displayMessage(Greeting greeting) {
		greeting.perform();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//using interface implementation
		GreetingImpl intimpl=new GreetingImpl();
		FirstExample.displayMessage(intimpl);
		
		//Java 8 way to implement method from Functional interface
		Greeting lamdaImpl = () -> System.out.println("Hello World!");
		lamdaImpl.perform();
		
		//old way using annonymous inner class
		Greeting grt = new Greeting() {
			public void perform() {
				System.out.println("Hello World Using Inner class");
			}
	};

	grt.perform();
}
}
interface Greeting{
	void perform();
}
