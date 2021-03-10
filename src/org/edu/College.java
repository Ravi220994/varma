package org.edu;

public class College extends University {
	public void ug() {
		System.out.println("undergraduate Percentage");
	}
	public void pg() {
		System.out.println("postgraduate percentage ");
	}

	public static void main(String[] args) {
		College f=new College();
		f.ug();
		f.pg();
		

	}

}
