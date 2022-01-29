package com.javabasic;

public class StringParsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				System.out.println(args[0]+args[1]+args[2]);

				boolean a = Boolean.parseBoolean (args[0]);
				int b = Integer.parseInt (args[1]);
				int c = Integer.parseInt(args[2]);
				
				System.out.println(a);
				System.out.println(b+c);
				
				int i = 0 ;
				//System.out.println( ++i + i++ + i++ + ++i + ++i + i++);
				System.out.println(++i + ++i + ++i + ++i + ++i);
				System.out.println(""+ ++i + ++i + ++i + ++i + ++i);
				System.out.println(++i + ++i + ++i + ++i + ++i +"");
				
	
	
	}

}
