package userdefinedexception;

import java.util.Scanner;

public class TestException  {
	public static void main(String[] args)  {
		Scanner sc =new Scanner(System.in);
		int i = sc.nextInt();
		if(i==0) {
			System.out.println("done");
		}else {
		
		try {
			throw new Excep();
		} catch (Excep e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}}

}
