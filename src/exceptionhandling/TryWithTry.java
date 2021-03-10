package exceptionhandling;

import java.util.Scanner;

public class TryWithTry {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		try {
			int a=s.nextInt();
			int b=s.nextInt();
			try {
				System.out.println(a/b);
			}
			catch(ArithmeticException e) {
				System.out.println("inner catch");
			}
			finally {
				System.out.println("inner finally End");
			}
		}
		catch(Throwable e) {
			System.out.println("outer catch");	
		}
		finally{
	System.out.println("outer finally end");
		}
		
	}

}
