package string;

public class Mutable {

	public static void main(String[] args) {
    System.out.println("immutable String");
    
    String s="java";
    System.out.println("before conact:"+s);
    
    String co=s.concat("selenium");
    System.out.println("after concat:"+s);
    System.out.println("modified value:"+co);
    
    System.out.println("Mutable String");
    
    StringBuffer s1=new StringBuffer("java");
   
    System.out.println("before concat:"+s1);
    
    s1.append("selenium");
    System.out.println("atfer concat:"+s1);
    

	}

}
