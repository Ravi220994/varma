package org.emp;

public class Employee {
	public void empName() {
		System.out.println("Employee Name:Ravi");
	}

	public static void main(String[] args) {
		Employee stat=new Employee();
		stat.empName();
		Company1 stat1=new Company1();
		stat1.companyName();
		Client stat2=new Client();
		stat2.clientName();
		Project stat3=new Project();
		stat3.projectName();

	}

}
