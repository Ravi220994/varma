package userdefinedexception;

public class Company {
	public static void main(String[] args) throws EmployeeNotFoundException {
		throw new EmployeeNotFoundException();
	}

}
