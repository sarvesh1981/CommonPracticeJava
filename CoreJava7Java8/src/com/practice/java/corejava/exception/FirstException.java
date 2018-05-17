package com.practice.java.corejava.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FirstException {

	public void exceptionMethod1() {
		try{
			exceptionMethod2(2);
			throw new CUstomNumberFormatException();
		}catch(NullPointerException ex){
			System.out.println("Catching only NullPointerException");
		}catch(CUstomNumberFormatException ex) {
			System.out.println(ex.toString());
		}
		/*}catch(FileNotFoundException ex){// this is checked Exception and can not be declared here untill it is thrown from calling method as shown below
			System.out.println("Catching only StringIndexOutOfBoundsException");*/
	}
	
	public void exceptionMethod2(int i) throws CUstomNumberFormatException {  //throws FileNotFoundException  {
		try{
			exceptionMethod3(i);
		}catch(StringIndexOutOfBoundsException ex){
			System.out.println("Catching only StringIndexOutOfBoundsException");
		}catch(IOException ex){
			System.out.println("Catching only IOException");
		}
		}
	
	public void exceptionMethod3(int i) throws IOException {//throws StringIndexOutOfBoundsException{
		try {
			if(i==1)
			throw new StringIndexOutOfBoundsException();
			else
				throw new IOException();
		}catch(ArrayIndexOutOfBoundsException ex) {			
			System.out.println(" Catching only ArrayIndexOutOfBoundsException");
			throw ex;
		}catch(IOException ex) {
			throw ex;
		}
	}
	public static void main(String[] args) {
		// This file is about handling few exception by a method and rest passed that to calling function
		
		FirstException firstEx= new FirstException();
		firstEx.exceptionMethod1();

	}

}
