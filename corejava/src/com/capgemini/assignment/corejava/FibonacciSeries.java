package com.capgemini.assignment.corejava;

public class FibonacciSeries {
	static int i = 0, j = 1, k = 0;

	static void print(int count) {
		if (count > 0) {
			k = i + j;
			i = j;
			j = k;
			System.out.print(" " + k);
			print(count - 1);
		}
	}

	public static void main(String[] args) {
		System.out.print(i + " " + j);
		int count = 10;
		print(count - 2);
	}

}
