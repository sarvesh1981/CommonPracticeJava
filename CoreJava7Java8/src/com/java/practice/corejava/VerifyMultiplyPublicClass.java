package com.java.practice.corejava;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class VerifyMultiplyPublicClass {
/*private int j;
	VerifyMultiplyPublicClass(int i){
		this.j=i;
	}*/
	public int a=4;
	protected int b=3;
	int c=2;
	private int d=1;

	static {
		System.out.println("VerifyMultiplyPublicClass.enclosing_method()");
	}
}

class TestClass extends VerifyMultiplyPublicClass {
	void checkaccess() throws FileNotFoundException,IOException,SQLException{
		int i=1;
		try {
			System.out.println(a + ", " + b + ", " + c);
			if(i==2)
			throw new IOException();
			else
				throw new SQLException();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}catch(IOException e) {
			
		}catch(SQLException e) {
			
		}catch(Exception e) {
			
		}
	}
	
	static {
		System.out.println("TestClass.enclosing_method()");
	}
	public static void main(String[] args) {
		TestClass tc=new TestClass();
		
			try {
				tc.checkaccess();
			} catch (IOException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
}