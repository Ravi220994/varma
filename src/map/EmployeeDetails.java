package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeDetails {

	public static void main(String[] args) {
		Map<Integer,Details>em=new HashMap<>();
		
		Details e=new Details();
		
		e.setId(12312);
		e.setName("Ravi");
		e.setAddress("Cuddalore");
		e.setEmail("ravi220994@gmail.com");
		e.setDob("22/09/1994");
		e.setDoj("23/02/2017");
		e.setSalary(23300);
		e.setMobileNo(809052523l);
		e.setGender("male");
		
		Details e1=new Details();
		
		e.setId(1212);
		e.setName("varma");
		e.setAddress("vridhachalam");
		e.setEmail("varma220994@gmail.com");
		e.setDob("22/09/1993");
		e.setDoj("23/02/2018");
		e.setSalary(233350);
		e.setMobileNo(809032523l);
		e.setGender("male");
		
		em.put(1, e);
		em.put(2,e1);
		
			Set<Entry<Integer,Details>>en=em.entrySet();
			
			for(Entry<Integer,Details>x:en){
				
			    System.out.println(x.getKey());
				System.out.println(x.getValue().getId());
				System.out.println(x.getValue().getName());
				System.out.println(x.getValue().getSalary());
				System.out.println(x.getValue().getAddress());
				System.out.println(x.getValue().getMobileNo());
				System.out.println(x.getValue().getDob());
				System.out.println(x.getValue().getDoj());
				System.out.println(x.getValue().getGender());
				System.out.println(x.getValue().getEmail());
				
				
				
			}
		

	}

}
