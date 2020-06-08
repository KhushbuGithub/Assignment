package com.capgemini.assignment2.hackerrank;

import java.util.Scanner;

public class Multiple {
	public static void test() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(N + " x " + i + " = " + N * i);

		}
	}

	public static void main(String[] args) {
		test();
	}

}
