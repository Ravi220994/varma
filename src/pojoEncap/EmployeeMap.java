package pojoEncap;

import java.util.*;
import java.util.Map.Entry;

public class EmployeeMap {

	public static void main(String[] args) {
	  Map<Integer,Employee> ma=new LinkedHashMap<>();
	  
	  //assign the value
	  
	  Employee e=new Employee();
	  e.setId(999);
	  e.setName("karthi");
	  e.setMobileno(98876433l);
	  
	  Employee e1=new Employee();
	  e1.setId(888);
	  e1.setName("sella");
	  e1.setMobileno(8776633l);
	  
	  //insert the value 
	  
	  ma.put(1,e);
	  ma.put(2,e1);
	  
	  //Retrieve the value
	  
	 Set<Entry<Integer,Employee>> en=ma.entrySet();
	 
	 System.out.println("Enhanced for loop");
	  
	  for(Entry<Integer,Employee> z:en) {
		  System.out.println(z.getKey());
		  System.out.println(z.getValue().getId());
		  System.out.println(z.getValue().getName());
		  System.out.println(z.getValue().getMobileNo());
		  
		  
		  
		  
	  }
	 
		  

	}

}
