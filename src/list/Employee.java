package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Employee {

	public static void main(String[] args) {
	 List <Integer> l=new ArrayList();
	 l.add(10);
	 l.add(10);
	 l.add(20);
	 l.add(30);
	 l.add(50);
	 l.add(10);
	 
	 System.out.println(l);
	
	 for(int i=0;i<l.size();i++) 
	 {
		 if(l.get(i)==10)
		 {
			 System.out.println(i);
			l.set(i,100);
			
		 }
	 }
	 
	 System.out.println(l);
	 
	}

}
