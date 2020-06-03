package com.capgemini.assignment.corejava;

public class ArmstrongNumber {

	static int n = 370, i = 0, j, temp;

	static void test() {
		temp = n;
		while (n > 0) {
			j = n % 10;
			n = n / 10;
			i = i + (j * j * j);
		}
		if (temp == i) {
			System.out.println("Armstrong number " + i);
		} else {
			System.out.println("Not " + i);
		}
	}
	public static void main(String[] args) {
		test();
	}

}
