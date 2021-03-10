package org.emp;
//without final modifier
public class Employee2 {
	int a=10;
	public void empId() {
		System.out.println("before :"+a);
		a=100;
		System.out.println("after:"+a);
	}

	public static void main(String[] args) {
		 Employee2 e=new  Employee2();
		 e.empId();
		
		
	}

}
