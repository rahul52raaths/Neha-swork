package com.javabasic;

public class RunTimeArgu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length == 0) {
			System.out.println("please enter some parameters");
		}else {
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		}
	}

}
