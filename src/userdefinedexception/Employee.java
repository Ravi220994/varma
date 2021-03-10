package userdefinedexception;

public class Employee {
	private void verify() {
		String empId="A234";
		if(empId.startsWith("1A"))
		{
			System.out.println("Welcome");
		}
		else {
			try {
				throw new EmployeeNotFoundException();
				}
			catch(EmployeeNotFoundException e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		Employee s=new Employee();
		s.verify();

	}

}
