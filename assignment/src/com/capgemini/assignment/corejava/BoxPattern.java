package com.capgemini.assignment.corejava;

public class BoxPattern {

	static void box() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		box();
	}

}
