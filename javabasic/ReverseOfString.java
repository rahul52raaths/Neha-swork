package com.javabasic;


public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "vijay dinanath chouhan" ;
		char [] a = name.toCharArray() ;
		for (int i = a.length-1 ; i >=0 ; i--) {
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.println();
		// String name = "vijay dinanath chouhan" ;
		 String []b = name.split(" ") ;
		 
		 String x = b[0];
		 String y = b[1];
		 String z = b[2];
		 
		 char m[] = x.toCharArray() ;
		 char n[] = y.toCharArray() ;
		 char o[] = z.toCharArray() ;
		 
		 for (int i = m.length-1 ; i >=0 ; i--) {
			System.out.print(m[i]);
		}
		 System.out.print(" ");
		 for (int i = n.length-1 ; i >=0 ; i--) {
				System.out.print(n[i]);
			}
		 System.out.print(" ");
		 for (int i = o.length-1 ; i >=0 ; i--) {
				System.out.print(o[i]);
			}
		 
	}

}
