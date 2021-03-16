package test;

import java.nio.Buffer;

public class Test {	


	public static void main(String[] args) {
		String s=new String("Ravi");
		String s1=new String ("Ravi");
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
		String a="varma";
		String b="varma";
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		String ss = a.concat("sellam");
		System.out.println(ss);
		System.out.println(System.identityHashCode(ss));
		
		StringBuffer sb=new StringBuffer("Ravi");
		sb.append("varman");
		System.out.println(sb);
		
		StringBuilder sc =new StringBuilder("karthi");
		sc.append("muthu");
		System.out.println(sc);
		
		
		
	
	}

}
