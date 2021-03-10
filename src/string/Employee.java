package string;

public class Employee {

	public static void main(String[] args) {
	String S="Ravi";
	int le = S.length();
     System.out.println(le);
  
     int ind = S.indexOf('a');
     System.out.println(ind);
    
     int ind1 = S.indexOf('i');
    System.out.println(ind1);
    
    String up = S.toUpperCase();
    System.out.println(up);
    
    String lo = S.toLowerCase();
    System.out.println(lo);
    
    boolean bo = S.isEmpty();
    System.out.println(bo);
    
    String S1="";
    
    boolean bo1 = S1.isEmpty();
    System.out.println(bo1);
    
    String S2="Ravi";
    String S3="ravi";
     
    boolean eq = S2.equals(S3);
    System.out.println(eq);
    
    boolean ing = S2.equalsIgnoreCase(S3);
    System.out.println(ing);
    
    String S4="Welcome to java class";
    
   boolean con= S4.contains("java");
   System.out.println(con);
   
   String substng = S4.substring(0, 7);
   System.out.println(substng);
   
   String substng1 = S4.substring(8);
   System.out.println( substng1);
   
   boolean sts = S4.startsWith("we");
   System.out.println(sts);
 
   boolean end = S4.endsWith("ss");
   System.out.println(end);
   
   
	}
	

}
