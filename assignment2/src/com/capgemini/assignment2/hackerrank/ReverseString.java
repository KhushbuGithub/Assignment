package com.capgemini.assignment2.hackerrank;

import java.util.Scanner;

public class ReverseString {
	public static void test() {
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        
	        
	        boolean palindrome = true;
	        
	        for(int i = 0; i<A.length()/2;i++)
	        {
	            if(!A.substring(i,i+1).equals(A.substring(A.length()-i-1,A.length()-i)))
	            {
	                palindrome = false;
	            }
	        }
	        if(palindrome){System.out.println("Yes");}
	        else{System.out.println("No");}
	        
	}
	public static void main(String[] args) {
		test();
	}

}
