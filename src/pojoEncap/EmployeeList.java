package pojoEncap;

import java.util.*;

public class EmployeeList {
	public static void main(String[] args) {
		List<Employee> sc=new ArrayList();
		
		//assing the value
		Employee e=new Employee();
		e.setId(33);
		e.setName("ravi");
        e.setMobileno(9000365822l);
        
        Employee e1=new Employee();
        e1.setId(443);
        e1.setName("varma");
        e1.setMobileno(195115595l);
        
        //insert the value into list
        
        sc.add(e);
        sc.add(e1);
        
        //Retrieve the value
         Employee em= sc.get(0);
         int id=em.getId();
         System.out.println(id);
         
         System.out.println("normal for loop");
         
         for(int i=0;i<sc.size();i++) {
        	 System.out.println(sc.get(i).getId());
        	 System.out.println(sc.get(i).getName());
        	 System.out.println(sc.get(i).getMobileNo());
         }
         
         System.out.println("Enhanced for loop");
         
         for(Employee x:sc) {
        	 System.out.println(x.getId());
        	 System.out.println(x.getName());
        	 System.out.println(x.getMobileNo());
        	 
         }
        	 

		}

}
