package map;


import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task1ii {

	public static void main(String[] args) {
		Map<Integer,Integer> ma=new LinkedHashMap<>();
		ma.put(10, 10);
		ma.put(20, 20);
		ma.put(30, 30);
		ma.put(40, 40);
		ma.put(50, 50);
		ma.put(60, 60);
		ma.put(10, 10);
		ma.put(50, 50);
		ma.put(40, 40);
		
		System.out.println(ma);
		
		//get the key alone
        Set<Integer> s=ma.keySet();
        System.out.println(s);
		
        //get the value alone
		Collection<Integer> s1=ma.values();
		System.out.println(s1);
		
	
		//iterate the value
		
		Set<Entry<Integer,Integer>>en=ma.entrySet();
		
		for(Entry<Integer,Integer>x:en) {
			System.out.println(x);
			
			System.out.println(x.getKey());
			
			System.out.println(x.getValue());
		}
		
		
	}

}
