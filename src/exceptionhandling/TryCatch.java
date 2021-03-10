package exceptionhandling;

public class TryCatch {

	public static void main(String[] args) {
	System.out.println(1);
	System.out.println(2);
	try {
		System.out.println(3/0);
	}
	catch(ArithmeticException e){
		System.out.println("we cant divide a num by zero");
	}
	
	System.out.println(4);
	System.out.println(5);


	}

}
