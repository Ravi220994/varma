package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task1 {

	public static void main(String[] args) {
		Map<Integer,String>ma=new HashMap<>();
		//Insert
		ma.put(10,"java");
		ma.put(20,"sql");
		ma.put(30,"oops");
		ma.put(40,"sql");
		ma.put(50,"oracle");
		ma.put(60,"DB");
		ma.put(10,"selanium");
		ma.put(50,"psql");
		ma.put(40,"Hadoop");
		
		System.out.println(ma);
		
		Set<Integer> s=ma.keySet();
		System.out.println( s);
		
		Collection<String> s1= ma.values();
		System.out.println(s1);
		
		Set<Entry<Integer,String>>en=ma.entrySet();
		
	for(Entry<Integer,String>x:en) {
           
		System.out.println(x.getKey());
		
		System.out.println(x.getValue());
		
		
	
		
		
	}
		
	
		
		
	}

}
