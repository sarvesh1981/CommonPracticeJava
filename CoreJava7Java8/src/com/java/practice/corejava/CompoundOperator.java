package com.java.practice.corejava;

public class CompoundOperator {

	public static boolean isPowerOfTwo(int number) {
		if(number == 0  || number==1)
			return false;
		
		while(number != 1) {
			if(number%2!=0)
				return false;
			number/=2;
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int x=3;
		int y =2;
		System.out.println(x*=2+5);
		System.out.println(y*2+5);
		System.out.println(2*3-1+1);
		System.out.println(4/2);
		System.out.println(4%2);*/
		
		if (isPowerOfTwo(99))
            System.out.println("Yes");
        else
            System.out.println("No");
 
        if (isPowerOfTwo(64))
            System.out.println("Yes");
        else
            System.out.println("No");
	}

}
