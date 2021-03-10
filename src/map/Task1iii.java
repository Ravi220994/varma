package map;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task1iii {
	
	public static void main(String[] args) {
		Map<Character,Integer>ma=new TreeMap<>();
		ma.put('!', 10);
		ma.put('@', 20);
		ma.put('£', 30);
		ma.put('$', 40);
		ma.put('%', 50);
		ma.put('^', 60);
		ma.put('&', 10);
		ma.put('*', 50);
		ma.put('(', 40);
		
		System.out.println(ma);
		
		//get the key alone
		Set<Character> s=ma.keySet();
		System.out.println(s);
		
		//get the value alone
		Collection<Integer> s1=ma.values();
		System.out.println(s1);
		
		//iterate the value
		Set<Entry<Character,Integer>>en=ma.entrySet();
		
		for(Entry<Character,Integer>y:en) {
			System.out.println(y);
		}
		

	}

}
