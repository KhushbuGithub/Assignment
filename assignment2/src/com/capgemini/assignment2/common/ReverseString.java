package com.capgemini.assignment2.common;

public class ReverseString {
	public static void test() {
		String input = "Khushbu kjhgfd";

		StringBuilder input1 = new StringBuilder();

		input1.append(input);

		input1 = input1.reverse();

		System.out.println(input1);
	}

	public static void main(String[] args) {
		test();
	}

}
