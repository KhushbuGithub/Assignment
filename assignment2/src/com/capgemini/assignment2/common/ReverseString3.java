package com.capgemini.assignment2.common;

public class ReverseString3 {
	static void count(String str) 
    { 
        char[] ch = str.toCharArray(); 
        for (int i = 0; i < ch.length; i++) { 
  
            String s = ""; 
  
            while (i < ch.length && ch[i] != ' ') { 
  
                s = s + ch[i]; 
                i++; 
            } 
  
            if (s.length() > 0)  
                System.out.print(s + s.length()+" ");             
        } 
    } 
    public static void main(String[] args) 
    { 
        String str = "How are you doing"; 
        count(str); 
    } 
} 


