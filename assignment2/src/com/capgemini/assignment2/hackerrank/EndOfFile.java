package com.capgemini.assignment2.hackerrank;

import java.util.Scanner;

public class EndOfFile {

	public static void test() {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while (sc.hasNext()) {
			String s = sc.nextLine();
			System.out.println(i + " " + s);
			i++;
		}
	}

	public static void main(String[] args) {
		test();
	}

}
