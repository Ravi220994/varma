package pojoEncap;

import java.util.*;
import java.util.Set;

public class EmployeeSet {

	public static void main(String[] args) {
		Set<Employee> se=new LinkedHashSet<>();
		//assign the value
		 Employee e=new Employee();
		 e.setId(334);
		 e.setName("Ravi");
		 e.setMobileno(24215625l);
		 
		 Employee e1=new Employee();
		 e1.setId(644);
		 e1.setName("varma");
		 e1.setMobileno(35231545l);
		 
		 //insert the value into set
		 
		 se.add(e);
		 se.add(e1);
		
		 //Retrieve the value into set
		 
		 System.out.println("Enhanced for loop");
		 
		 for(Employee y:se) {
			 System.out.println(y.getId());
			 System.out.println(y.getName());
			 System.out.println(y.getMobileNo());
		 }
		 
		

	}

}
