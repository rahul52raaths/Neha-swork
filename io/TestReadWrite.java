package com.io;

import java.io.File;
import java.sql.Date;

public class TestReadWrite {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\rahul\\Desktop","tt.txt");
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getTotalSpace());
		System.out.println(f.isDirectory());
		System.out.println("is file"+f.isFile());
		System.out.println(f.lastModified());
		System.out.println(f.length());
		System.out.println(new Date(f.lastModified()));
	}
}
