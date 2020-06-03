package com.capgemini.assignment2.corejava;

public class Duplicate {
	static int[] arr = new int[] { 1, 7, 3, 4, 1, 7, 8, 8, 3 };

	public static void test() {
		System.out.println("Duplicate elements in given array: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
	}

	public static void main(String[] args) {
		test();
	}
}
