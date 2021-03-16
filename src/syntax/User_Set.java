package syntax;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class User_Set {
public static void main(String[] args) {
	
	Pojo p=new Pojo();
	p.setEmpId(879);
	p.setMobNo(2144987498l);
	p.setName("Varma");
	
	Set<Pojo>s=new LinkedHashSet();
	s.add(p);
	
	int id = p.getEmpId();
	System.out.println(id);
	
	long no = p.getMobNo();
	System.out.println(no);
	
	String name = p.getName();
	System.out.println(name);
	
	for (Pojo x: s) {
		System.out.println(x.getEmpId());
		System.out.println(x.getMobNo());
		System.out.println(x.getName());
		
	}
}
}
