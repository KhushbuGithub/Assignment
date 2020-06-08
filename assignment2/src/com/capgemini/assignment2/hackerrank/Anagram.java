package com.capgemini.assignment2.hackerrank;

import java.util.Scanner;

public class Anagram {

	static boolean isAnagram(String A, String B) {
		// Complete the function
		if (A.length() != B.length()) {
			return false;
		}

		char[] chars = A.toCharArray();

		for (char c : chars) {
			int index = B.indexOf(c);
			if (index != -1) {
				B = B.substring(0, index) + B.substring(index + 1, B.length());
			} else {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		boolean ret = isAnagram(A, B);
		if (ret)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");

	}
}
