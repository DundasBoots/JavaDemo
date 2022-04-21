package com.qa.helloworld;

public class Arrays {

	public static int[] someArray = new int[10];

	public static void main(String[] args) {

		for (int i : someArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }) {
			System.out.println(i);

		}
		for (int i : someArray) {
			System.out.println(i * 10);

		}
	}
}
