package string;

public class Literal {

	public static void main(String[] args) {
		System.out.println("Literal String");
		
		String s="j"
				+ "ava";
		String s1="java";
		
		int id1=System.identityHashCode(s);
		int id2=System.identityHashCode(s1);
		
		System.out.println(id1);
		System.out.println(id2);
		
		String s2=new String("java");
		String s3=new String("java");
		
		int id3=System.identityHashCode(s2);
		int id4=System.identityHashCode(s3);
		
		System.out.println(id3);
		System.out.println(id4);
		
		
		
	}

}
