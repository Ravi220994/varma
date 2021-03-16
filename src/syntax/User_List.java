package syntax;

import java.util.ArrayList;
import java.util.List;

public class User_List {
	public static void main(String[] args) {
		List<Pojo>li=new ArrayList();
		
		Pojo p=new Pojo();
		p.setEmpId(8545);
		p.setName("Ravi");
		p.setMobNo(9003652988l);
		
		li.add(p);
		
		Pojo pp = li.get(0);
		int i = pp.getEmpId();
		System.out.println(i);
		
		Pojo pp1 = li.get(0);
		String name = pp1.getName();
		System.out.println(name);
		
		Pojo pp2 = li.get(0);
		long mobNo = pp2.getMobNo();
		System.out.println(mobNo);
		
		System.out.println("Normal for Loop");
		for (int j = 0; j<li.size(); j++) {
			System.out.println(li.get(j).getEmpId());
			System.out.println(li.get(j).getName());
			System.out.println(li.get(j).getMobNo());
			
		}
		
		
		}

}
