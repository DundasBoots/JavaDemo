package com.qa.helloworld;

public class EnhancedForLoops {
	public static String[] stringArray = { "hi", "hello", "good morning", "sup" };
	public static int[] eArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

	public static void main(String[] args) {
		
		for (String i : stringArray) {
			System.out.println(i);
		}
		System.out.println("");
		System.out.println("--New Array--");
		System.out.println("");

		for (int i : eArray) {
			System.out.println(i);
		}

	}

}
