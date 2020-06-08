package com.capgemini.assignment2.hackerrank;

import java.util.Scanner;

public class InputOutput {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int i = Integer.parseInt(scan.nextLine());
	        Double d = Double.parseDouble(scan.nextLine());
	        String s = scan.nextLine();

	        scan.close();

	        System.out.println("Integer :"+i);
	        System.out.println("String :"+s);
	       System.out.println("Double :"+d);
	    }

}
