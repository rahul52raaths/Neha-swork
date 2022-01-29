package com.collectinexcercise;

import java.util.Comparator;

public class Marksheet implements Comparator<Marksheet> {

	String rollno;
	String fname;
	String lname;
	int phy;
	int che;
	int math;
	public Marksheet() {}
	public Marksheet(String rollno, String fname , String lname, int phy , int che , int math){
		this.rollno = rollno;
		this.fname = fname;
		this.lname = lname;
		this.phy = phy;
		this.che = che;
		this.math = math;
	}
	public String toString() {
		return rollno+" "+fname+" "+lname+" "+phy+" "+che+" "+math;
		}
	public int compare(Marksheet o1, Marksheet o2) {
		return o1.fname.compareTo(o2.fname);
	}
	public int compare1(Marksheet o1, Marksheet o2) {
		return o1.lname.compareTo(o2.lname);
	}
	
//	public int compareTo(Marksheet o) {
//		return rollno.compareTo(o.rollno);
//	}
	
}
