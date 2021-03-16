package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Example {
	public static void main(String[] args) {
		List  l=new LinkedList();
		l.add(10);
		l.add("DUDE");
		//System.out.println(l);
		for (int i = 0; i < l.size(); i++) {
			 Object o= l.get(i);
			 System.out.println(o);
			
		}
		 
		
	}
	

}
