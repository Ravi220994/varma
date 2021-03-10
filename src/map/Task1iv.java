package map;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task1iv {
public static void main(String[] args) {
		Map<String,String>ma=new Hashtable<>();
		ma.put("vel", " Selenium");
		ma.put("Ganesh", "framework");
		ma.put("Dinesh", "oracle");
		ma.put("Vengat", "corejava");
		ma.put("subash","jira");
		
		System.out.println(ma);
		
		//get the key alone
		Set<String> s=ma.keySet();
		System.out.println(s);
		
		//get the value alone
		Collection<String>s1=ma.values();
		System.out.println(s1);
		
		//iterate the value
		Set<Entry<String,String>>en=ma.entrySet();
		
		for(Entry<String,String>z:en) {
			System.out.println(z);
		}
		
		
		
	}

}
