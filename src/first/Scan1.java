package first;

import java.util.Scanner;

public class Scan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
System.out.println("enter ur name");
String name=sc.next();
System.out.println("my name is:"+name);

System.out.println("enter ur name");
String fname=sc.nextLine();
System.out.println("my name is:"+fname);
sc.close();

	}

}
