package com.qa.helloworld;

public class Flowchart {

	public static int A = 0;
	public static boolean boolie = true;

	public static void main(String[] args) {
			tenAlt();

	}

	private static void AChart1() {
		while (boolie) {
			if (A <= 200) {
				System.out.println("A");
				A++;
			} else {
				boolie = false;
				System.out.println("End");
			}
		}
	}

	private static void AChart2() {
		while (boolie) {
			if ((A / 2) == 0) {
				System.out.println(A + " -");
				A++;
			} else {
				boolie = false;
				System.out.println(A + " *");
				A++;

				if (A <= 200) {
					boolie = true;
				} else {
					if (A > 200) {
						boolie = false;
						System.out.println("End");
					}
				}
			}
		}
	}

	private static void questionThree() {
		for (int i = 1; i < 11; i++) {
			for (int n = 1; n < 11; n++) {
				System.out.println(n);

			}

		}
	}

	private static void questionFour(int tot) {
		for (int i = 0; i < tot; i++) {
			System.out.println(tot);
		}
	}

	private static void tenAlt() {
		for (int i = 0; i < 10; i++) {
			questionFour(i + 1);
		}
	}
}
