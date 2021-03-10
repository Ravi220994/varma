package exceptionhandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			String s="Ravi";
			System.out.println(s.charAt(5));
			System.out.println("hello");
		}
		catch(Throwable e){
			System.out.println(e);
		}
		finally{
			System.out.println("end");
		}
		
		System.out.println(4);
		System.out.println(5);

	}

}
