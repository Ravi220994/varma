package collection;

import java.util.ArrayList;
import java.util.List;

public class Generics1 {

	public static void main(String[] args) {
		List<Integer> sc=new ArrayList();
		//up casting
		sc.add(98);
		sc.add(12);
		sc.add(97);
		sc.add(97);
		sc.add(98);
		System.out.println(sc);
		
		List<Integer> l2=new ArrayList();
		l2.addAll(sc);
		l2.add(35);
		l2.add(55);
		
		System.out.println(l2);
		
		l2.retainAll(sc);
		System.out.println(l2);
		
		sc.retainAll(l2);
		System.out.println(sc);
		
		sc.removeAll(l2);
		System.out.println(sc);
		
		l2.removeAll(sc);
		System.out.println(l2);
		
		

	}

}
