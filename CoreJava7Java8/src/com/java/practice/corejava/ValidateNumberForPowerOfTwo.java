package com.java.practice.corejava;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ValidateNumberForPowerOfTwo {
	
	public static boolean validateNumberForPowerOfTwo(int number) {
		
		if(number==0)
			return false;
		
		while(number/2!=1) {
			if(number%2!=0)
				return false;				
			
			number/=2;	
		}
		return true;
	}
	
	public static long computemultiplication(int number) {
		long multiplications=1;
		for(int i=1;i<=number;i++) {
			multiplications*=i;
		}
		return multiplications;
	}

	/*Write a program called CozaLozaWoza which prints the numbers 1 to 110, 11 numbers per line. The program shall print "Coza" in place of the numbers
	which are multiples of 3, "Loza" for multiples of 5, "Woza"*/
	public static void CozaLozaWoza(int startingNum,int endNumber) {
				
		for(int i=startingNum;i<=endNumber;i++) {
			if(i%3==0)
				System.out.print("Coza ");
			else if(i%5==0)
				System.out.print("Loza");
			else
			System.out.print(i);
			System.out.print(" ");
			if(i%11==0)
				System.out.println();
		}
	}
	
	public static void main(String[] str) {
		/*if(validateNumberForPowerOfTwo(22)) {
			System.out.println("Provided no. is power of 2");
		}else
			System.out.println("Provided no. is not power of 2");
		System.out.print("-----------computemultiplication--------------");
		System.out.println(computemultiplication(13));*/
		
		System.out.println("---------------------CozaLozaWoza--------------------------");
		CozaLozaWoza(1,45);
		
		
	}
}

