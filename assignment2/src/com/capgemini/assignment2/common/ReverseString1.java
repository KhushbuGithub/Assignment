package com.capgemini.assignment2.common;

public class ReverseString1 {
	public static String test(String str) {
		 String words[]=str.split("\\s");  
		    String reverseWord="";  
		    for(String w:words){  
		        StringBuilder sb=new StringBuilder(w);  
		        sb.reverse();  
		        reverseWord+=sb.toString()+" ";  
		    }  
		    return reverseWord.trim();  
	}

	public static void main(String[] args) {
		System.out.println(test("Hello my dear friends"));
	}
}
