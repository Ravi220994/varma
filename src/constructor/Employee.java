package constructor;
//non agrument 
public class Employee {
	//method
	public void empId() {
		System.out.println("Method");
	
	}
	//constructor
	public Employee() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		Employee e =new Employee();
		e.empId(); 
		

	}

}
