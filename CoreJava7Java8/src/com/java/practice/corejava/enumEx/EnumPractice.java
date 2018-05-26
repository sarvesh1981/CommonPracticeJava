package com.java.practice.corejava.enumEx;

enum CoffeeSize{
	SMALL(10),MEDIUM(20),LARGE(30);
	
	private CoffeeSize(int s) {
	this.size=s;	
	}
	
	int size;
	
	public int getSize() {
		return size;
	}
	
}
public class EnumPractice {

	enum SeasonalFruits{
		APPLE,ORANGE,BANANA;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CoffeeSize.SMALL);
		System.out.println(SeasonalFruits.APPLE);
		System.out.println(CoffeeSize.SMALL.getSize());
		
	}

}
