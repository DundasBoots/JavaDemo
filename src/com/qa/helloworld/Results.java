package com.qa.helloworld;

public class Results {
	public static double Physics;
	public static double Chemistry;
	public static double Biology;
	public static double total;
	public static double percentage;

	public static void main(String[] args) {
		examResults(50, 60, 60);
		examPercentage();

	}

	private static void examResults(double Physics, double Chemistry, double Biology) {
		total = Physics + Chemistry + Biology;

		if (Physics >= 60) {
			System.out.println("Your Physics grade is: " + Physics);
		} else {
			System.out.println("You have failed the Physics exam");
		}
		if (Biology >= 60) {
			System.out.println("Your Biology grade is: " + Biology);
		} else {
			System.out.println("You have failed the Biology exam");
		}
		if (Chemistry >= 60) {
			System.out.println("Your Chemistry grade is: " + Chemistry);
		} else {
			System.out.println("You have failed the Chemistry exam");
		}
		if (Physics < 60 || Biology < 60 || Chemistry < 60) {
			System.out.println("Your overall grade is a fail");
		} else {
			System.out.println("Your total grade is: " + total);
		}

	}

	private static void examPercentage() {
		percentage = (total / 300) * 100;
		if (total < 300) {
			System.out.println("Your overall exam percentage is: " + percentage);
		} else {
			System.out.println("Division cannot be performed");

		}

	}
}
