package collection;

import java.util.ArrayList;
import java.util.List;


public class Generics {

	public static void main(String[] args) {
		
			List<Integer> sc=new ArrayList();
			//up casting
			sc.add(98);
			sc.add(12);
			sc.add(97);
			sc.add(97);
			sc.add(98);
			System.out.println(sc);
			
			int s = sc.size();
			System.out.println(s);
			
			int in = sc.indexOf(12);
			System.out.println(in);
			
			int la = sc.lastIndexOf(97);
			System.out.println(la);
			
			boolean em = sc.isEmpty();
			System.out.println(em);
			
			boolean co = sc.contains(88);
			System.out.println(co);
			
			Integer i = sc.get(3);
			System.out.println(i);
			
			sc.add(333);
			System.out.println(sc);
			
			sc.add(3,33);//to add
			System.out.println(sc);
			
			sc.set(1,44 );//tp replace
			System.out.println(sc);
			
			sc.remove(4);
			System.out.println(sc);
			
		//	sc.clear();
			//System.out.println(sc);
			
			
			
			
			

	}

}
