package com.capgemini.assignment.corejava;

public class SwapNumber {

	static int i = 20;
	static int j = 40;

	public static void swap() {
		i = i + j;
		j = i - j;
		i = i - j;
		System.out.println(i);
		System.out.println(j);
	}

	public static void main(String[] args) {
		swap();
	}
}
