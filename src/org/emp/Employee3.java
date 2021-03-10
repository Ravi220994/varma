package org.emp;

public final class Employee3 {
	final int a =10;
	public final void empId1() {
		System.out.println("before:"+a);
		//a=100;//cant assign after create final variable
		System.out.println("after:"+a);
		
		
	}
	

	public static void main(String[] args) {
		 Employee3 c=new  Employee3();
		 c.empId1();
		 
		
	}

}
