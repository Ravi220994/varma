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
		Collection<String> values = ma.values();
		System.out.println(values);
		Set<String> keySet = ma.keySet();
		System.out.println(keySet);
		
		Set<Entry<String, String>> entrySet = ma.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
		
	}

}
