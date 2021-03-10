package variables;
//static variable
public class Employee2 {
	public static int  a;
	public static void empDetails() {
		a=3335;
		System.out.println("method call:"+a);
	}

	public static void main(String[] args) {
		System.out.println("before method call:"+a);
		Employee2.empDetails();
		System.out.println("after method call:"+a);
		
		

	}

}
