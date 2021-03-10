package first;

public class Single extends Inheri {
	private void empID() {
		System.out.println("Employee Id is 234");
		
	}
	private void empName() {
		System.out.println("Employee Name is Ravi");
	}

	public static void main(String[] args) {
		Single a=new Single();
	
		a.empID();
		a.empName();
}

}
