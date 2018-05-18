package com.java.practice.corejava.lamda;

public class SecondExTypeInferenceLamda {

	public static void main(String[] args) {
		StringLentLamda strLength = (s) -> s.length();
		System.out.println(strLength.stringLength("sarvesh"));
	}

}

interface StringLentLamda{
	int stringLength(String str);
}
