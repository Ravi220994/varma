package exceptionhandling;

public class MulitCatch {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			String s="Ravi";
			System.out.println(s.charAt(7));
			System.out.println("Hello");
	
		}
		catch(ArithmeticException e){
			System.out.println("we cant divide a num by zero");
		}
		catch(Throwable c) //we use any parent class like runtime,exception
		{
			System.out.println(c);
		}
		
		System.out.println(4);
		System.out.println(5);

	}

}
