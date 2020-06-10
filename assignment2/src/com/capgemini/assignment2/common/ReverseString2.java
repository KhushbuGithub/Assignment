package com.capgemini.assignment2.common;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ReverseString2 {
	public static void main(String []args){



		  String str = "Hello friends here helloo ";
	        String[] split = str.split(" ");
	        String middle = null;
	        StringBuilder output = new StringBuilder();

	        for (String s : split) {
	            middle = s.substring(1, s.length()-1 );
	            s = s.replace(middle,random(5, middle));
	            output.append(s + " ");
	        }

	        System.out.println(output.toString());
	    }

	    static String random(int i, String s) {
	        char[] ca = s.toCharArray();
	        List<Character> list = new ArrayList<Character>();
	        for(char c : ca) list.add(c);
	        Collections.shuffle(list);
	        StringBuilder sb = new StringBuilder();
	        for(Character ch : list) sb.append(ch);
	        return sb.toString();
	    }
    }



