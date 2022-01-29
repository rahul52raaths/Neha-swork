package com.javabasic;

import java.io.IOException;

public class StringMethods {
	public static void main(String args[]) throws IOException {
		/*
		String s="Vijay Dinannath Chouhan";
		System.out.println(s.charAt(1));
		System.out.println(s.endsWith("han"));
		System.out.println(s.startsWith("n", 11));
		System.out.println(s.length());
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.substring(8));
		System.out.println(s.substring(2, 5));
	   
		String hold[]=s.split(" ");
	    for(String res:hold) {
	    	System.out.println(res);
	    }
	    System.out.println(s.replace("j", "nay"));
	    System.out.println("replaceall = "+s.replaceAll("[A-Z]","kesu"));
	    System.out.println("replaceall = "+s.replaceAll("[d-n]","jay"));
	    
		
		
		String s1 = new String("rahul rathor");
		System.out.println(s1);
		s1="Neha Chouhan";
		System.out.println(s1);
		s="ram";
		System.out.println(s);
		*/
		
		String sb = new String("Rays Institude");
		System.out.println("enter the character to find count");
		int c = System.in.read();
		char c1 = (char)c;
		System.out.println(c1);
		int count =0;
		char cc[]= sb.toCharArray();
		for(char res:cc)
		{
		  if(c1==res)	{
			  count++;
		  }
			
		}
		System.out.println(count);
		
		
		
	}

}
