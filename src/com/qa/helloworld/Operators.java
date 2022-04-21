package com.qa.helloworld;

public class Operators {
	
	public static void main(String[] args) {
		myAddition();
		myMultiplication();
		myDivision();
		
	}
	
	private static double num1 = 9;
	private static double num2 = 4;
	
	public static void myAddition() {
		double result = num1 + num2;
		System.out.println(result);
	}
	
	public static void myMultiplication() {
		double result = num1 * num2;
		System.out.println(result);
		
	}
	
	public static void myDivision() {
		double result = num1 / num2;
		System.out.println(result);
	}

	

}
