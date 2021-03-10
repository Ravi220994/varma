package variables;

public class Employee {
	
	private void empDetails() {
		int a=10;//local variable
		System.out.println(a);
		
	}
	private void emp() {
		int a=53;//local variable
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		 Employee e=new  Employee();
		 e.empDetails();
		 e.emp();

	}

}
